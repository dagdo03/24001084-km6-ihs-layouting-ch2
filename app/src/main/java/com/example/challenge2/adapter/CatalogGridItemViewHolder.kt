package com.example.challenge2.adapter

import androidx.recyclerview.widget.RecyclerView
import com.example.challenge2.base.ViewHolderBinder
import com.example.challenge2.data.model.Catalog
import com.example.challenge2.databinding.ItemCatalogLayoutBinding
import com.example.challenge2.util.toIndonesianFormat

class CatalogGridItemViewHolder(
    private val binding: ItemCatalogLayoutBinding,
    private val listener: OnItemClickedListener<Catalog>,
) : RecyclerView.ViewHolder(binding.root), ViewHolderBinder<Catalog> {
    override fun bind(item: Catalog) {
        item.let {
            binding.ivCatalogImage.setImageResource(it.image)
            binding.tvCatalogName.text = it.name
            binding.tvCatalogPrice.text = it.price.toIndonesianFormat()
            itemView.setOnClickListener {
                listener.onItemClicked(item)
            }

        }
    }
}