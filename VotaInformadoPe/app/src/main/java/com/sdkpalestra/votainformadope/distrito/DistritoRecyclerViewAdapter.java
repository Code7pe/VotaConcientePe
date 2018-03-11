package com.sdkpalestra.votainformadope.distrito;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sdkpalestra.votainformadope.R;

import java.util.List;

/**
 * Created by Paul on 11/03/2018.
 */

public class DistritoRecyclerViewAdapter extends RecyclerView.Adapter<DistritoViewHolder> {

    private Context mContext;
    private List<Distrito> mDistritos;

    public DistritoRecyclerViewAdapter(Context context, List<Distrito> distritos) {
        mContext = context;
        mDistritos = distritos;
    }

    @Override
    public DistritoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Cuando crea, elegir cual será el layout a utilizar
        View view = LayoutInflater.from(mContext).inflate(R.layout.row_distrito, parent, false);
        DistritoViewHolder distritoViewHolder = new DistritoViewHolder(view);

        return distritoViewHolder;
    }

    @Override
    public void onBindViewHolder(DistritoViewHolder holder, int i) {
        // Al ir desplazando la pantalla con el celular y aparesca uno nuevo,
        // se ejecuta el onBindViewHolder para llenar el nuevo elemento
        Distrito distrito = mDistritos.get(i);
        holder.txtDistrito.setText(distrito.getNombreDistrito());

    }

    @Override
    public int getItemCount() {
        // Obtener el total de elementos
        return (null != mDistritos ? mDistritos.size() : 0);
    }

    public void loadData(List<Distrito> distritos) {
        // Se utiliza para actualizar toda la data del recycler view
        mDistritos = distritos;
        notifyDataSetChanged();
    }

    public Distrito getDistrito(int i) {
        return (null != mDistritos ? mDistritos.get(i) : null);
    }


}
