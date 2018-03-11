package com.sdkpalestra.votainformadope.distrito;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.sdkpalestra.votainformadope.R;

/**
 * Created by Paul on 11/03/2018.
 */

public class DistritoViewHolder extends RecyclerView.ViewHolder {

    protected TextView txtDistrito;

    public DistritoViewHolder(View itemView) {
        super(itemView);
        this.txtDistrito = itemView.findViewById(R.id.txtDistrito);
    }
}
