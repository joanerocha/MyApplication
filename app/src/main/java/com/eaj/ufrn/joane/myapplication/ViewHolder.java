package com.eaj.ufrn.joane.myapplication;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Aluno on 19/09/2016.
 */
public class ViewHolder extends RecyclerView.ViewHolder {

    final TextView textViewTitulo;
    final TextView textViewAutor;
    final TextView textViewQtd;
    final ImageView img;
    //private Context context;

    public ViewHolder(View v){
        super(v);

        textViewTitulo = (TextView) v.findViewById(R.id.titulo);
        textViewAutor = (TextView) v.findViewById(R.id.autor);
        textViewQtd = (TextView) v.findViewById(R.id.quantidade);
        img = (ImageView) v.findViewById(R.id.img);
    }
}

