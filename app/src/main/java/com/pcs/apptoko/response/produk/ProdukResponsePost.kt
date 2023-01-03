package com.pcs.apptoko.response.produk

data class ProdukResponsePost(
    val `data`: DataProduk,
    val message:String,
    val  success:String
)
data class DataProduk(
    val `produk`: Produk
)
