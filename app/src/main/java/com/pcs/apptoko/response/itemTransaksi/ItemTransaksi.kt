package com.pcs.apptoko.response.itemTransaksi

data class ItemTransaksi(
    val harga_saat_transaksi:String,
    val  id:String,
    val produk_id:String,
    val qty:String,
    val sub_total:String,
    val transaksi_id:String
)
