package com.example.challenge2.presentation.fragment.cataloglist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.challenge2.R
import com.example.challenge2.adapter.CatalogAdapter
import com.example.challenge2.adapter.CategoryAdapter
import com.example.challenge2.adapter.OnItemClickedListener
import com.example.challenge2.data.datasource.CatalogData
import com.example.challenge2.data.datasource.CatalogDataImpl
import com.example.challenge2.data.datasource.categoriesData
import com.example.challenge2.data.model.Catalog
import com.example.challenge2.databinding.FragmentCatalogListBinding
import com.example.challenge2.presentation.detail.DetailActivity


class CatalogListFragment : Fragment() {
    private lateinit var binding: FragmentCatalogListBinding
    private var catalogAdapter: CatalogAdapter? = null
    private var isUsingGridMode: Boolean = true
    private val dataSource: CatalogData by lazy {
        CatalogDataImpl()
    }
    private val categoryAdapter = CategoryAdapter()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentCatalogListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bindFoodList(true)
        setListCategory()
        setClickAction()
    }

    private fun setListCategory() {
        binding.rvCategory.apply {
            adapter = this@CatalogListFragment.categoryAdapter
        }
        categoryAdapter.submitData(categoriesData)
    }

    private fun setClickAction() {
        binding.ivIconList.setOnClickListener {
            isUsingGridMode = !isUsingGridMode
            changeBtnIcon()
            bindFoodList(isUsingGridMode)
        }
    }

    private fun changeBtnIcon() {
        binding.ivIconList.setImageResource(if (isUsingGridMode) R.drawable.ic_listview else R.drawable.ic_gridview)
    }

    private fun bindFoodList(isUsingGrid: Boolean) {
        val listMode = if (isUsingGrid) CatalogAdapter.MODE_GRID else CatalogAdapter.MODE_LIST
        catalogAdapter =
            CatalogAdapter(
                listMode = listMode,
                listener = object : OnItemClickedListener<Catalog> {
                    override fun onItemClicked(item: Catalog) {
                        navigateToDetail(item)
                    }
                },
            )
        binding.rvCatalog.apply {
            adapter = this@CatalogListFragment.catalogAdapter
            layoutManager = GridLayoutManager(requireContext(), if (isUsingGrid) 2 else 1)
        }
        catalogAdapter?.submitData(dataSource.getCatalogData())
    }

    private fun navigateToDetail(item: Catalog) {
        val navController = findNavController()
        val bundle = bundleOf(Pair(DetailActivity.EXTRAS_DETAIL_DATA, item))
        navController.navigate(R.id.action_catalogListFragment2_to_detailActivity, bundle)
    }

}