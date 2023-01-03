package com.pcs.apptoko.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.pcs.apptoko.R
import com.pcs.apptoko.response.transaksi.Transaksi
import java.text.NumberFormat
import java.util.Locale

class LaporanAdapter(val listTransaksi:List<Transaksi>):RecyclerView.Adapter<LaporanAdapter.ViewHolder>() {
    override fun  onCreateViewHolder(parent:ViewGroup,viewType:Int):ViewHolder{
        val  view = LayoutInflater.from(parent.context).inflate(R.layout.item_laporan,parent,false)
        return LaporanAdapter.ViewHolder(view)
    }
    override fun onBindViewHolder(holder:ViewHolder,positiom : Int){
        val transaksi :listTransaks[position]
        holder.txtTglTransaksi.text = transaksi.tanggal
        holder.txtNoNota.text ="#0000"+transaksi.iD

        val localeID = Locale("in","ID")
        val numberFormat = NumberFormat.getCurrencyInstance(localeID)

        holder.txtItemTotalTrans.text = numberFormat.format(transaksi.total.toDouble()).toString()
    }
    override fun geiItemCount():Int{
        return listTransaksi.size
    }
    class ViewHolder(itemViem : View):RecyclerView.ViewHolder(itemViem){
        val  txtTglTransaksi = itemViem.findViewById(R.id.txtTglTransaksi) as   TextView
        val  txtNoNota = itemViem.findViewById(R.id.txtNoNota) as   TextView
        val  txtTtemTotalTrans = itemViem.findViewById(R.id.txtTtemTotalTrans) as   TextView
    }
}