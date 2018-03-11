package com.sdkpalestra.votainformadope.distrito

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.sdkpalestra.votainformadope.test.R.id.parent
import android.view.LayoutInflater



/**
 * Created by Paul on 25/02/2018.
 */
class DistritoRecyclerViewAdapter :RecyclerView.Adapter<DistritoViewHolder>()  {

    private val TAG = "PLSTR"
    private val mdistritos: List<Distrito>? = null
    private val mContext: Context? = null

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): DistritoViewHolder {
        val view = LayoutInflater.from(mContext).inflate(R.layout.row_cliente, parent, false)

        return DistritoViewHolder(view)
    }

    override fun getItemCount(): Int {
        val distritos = mdistritos.get(i)
        holder.txtRuc.setText(cliente.Ruc())
        holder.txtRazonSocial.setText(cliente.RazonSocial())
        holder.txtDireccion.setText(cliente.Direccion())
    }

    override fun onBindViewHolder(holder: DistritoViewHolder?, position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
