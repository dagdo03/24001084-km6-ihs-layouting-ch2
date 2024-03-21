package com.example.challenge2.data.datasource
import com.example.challenge2.R
import com.example.challenge2.data.model.Catalog
interface CatalogData {
    fun getCatalogData(): List<Catalog>
}

class CatalogDataImpl : CatalogData {
    override fun getCatalogData(): List<Catalog> {
        return mutableListOf(
            Catalog(
                image = R.drawable.img_burger,
                name = "Burger",
                price = 70000.00,
                description = "This burger is a normal burger",
                location = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
                locationURL = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"),
            Catalog(
                image = R.drawable.img_wagyu,
                name = "Wagyu Steak",
                price = 80000.00,
                description = "This steak is made from premium wagyu",
                location = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
                locationURL = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"),
            Catalog(
                image = R.drawable.img_fruit_salad,
                name = "Fruit Salad",
                price = 70000.00,
                description = "This fruit salad is made from fresh fruits",
                location = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
                locationURL = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"),
            Catalog(
                image = R.drawable.img_salad,
                name = "Salad",
                price = 50000.00,
                description = "This salad is made from fresh vegetables",
                location = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
                locationURL = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"),
            Catalog(
                image = R.drawable.img_sushi_roll,
                name = "Sushi Roll",
                price = 100000.00,
                description = "This sushi is made from fresh ingredients",
                location = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
                locationURL = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"),
            Catalog(
                image = R.drawable.img_burger_double_beef,
                name = "Burger Double Beef",
                price = 90000.00,
                description = "This burger has double beef slice",
                location = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
                locationURL = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"),
            Catalog(
                image = R.drawable.img_burger_double_cheese,
                name = "Burger Double Cheese",
                price = 75000.00,
                description = "This burger has double cheese slice",
                location = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
                locationURL = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"),
            Catalog(
                image = R.drawable.img_strawberry_cake,
                name = "Strawberry Cake",
                price = 60000.00,
                description = "This cake is made from fresh strawberry",
                location = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
                locationURL = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"),
            Catalog(
                image = R.drawable.img_chocolate_cake,
                name = "Chocolate Cake",
                price = 70000.00,
                description = "This cake is made from premium chocolate",
                location = "Jl. BSD Green Office Park Jl. BSD Grand Boulevard, Sampora, BSD, Kabupaten Tangerang, Banten 15345",
                locationURL = "https://maps.app.goo.gl/h4wQKqaBuXzftGK77"),
        )
    }
}
