package com.pcs.apptoko.response.transaksi

import com.pcs.apptoko.response.produk.Data

data class TransaksiResponse(
    val `data`: Data,
    val message:String,
    val  success:Boolean
)
