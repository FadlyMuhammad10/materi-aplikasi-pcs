package com.pcs.apptoko.response.transaksi

import com.pcs.apptoko.response.produk.DataProduk

data class TransaksiResponsePost(
    val `data`: TransaksiData,
    val message:String,
    val  success:String
)
data class TransaksiData(
    val `transaksi`:Transaksi
)