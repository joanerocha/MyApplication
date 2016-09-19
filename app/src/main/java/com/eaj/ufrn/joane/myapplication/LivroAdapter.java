package com.eaj.ufrn.joane.myapplication;



import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Aluno on 19/09/2016.
 */
public class LivroAdapter extends RecyclerView.Adapter{

    List<Livro> listaLivro;
    Context context;

    public LivroAdapter (List<Livro> listaLivro, Context context){
        this.listaLivro = listaLivro;
        this.context = context;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(context).inflate(R.layout.livro_item_inflater, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position){
        ViewHolder holder = (ViewHolder) viewHolder;

        Livro livroescolhido = listaLivro.get(position);
        holder.textViewTitulo.setText(livroescolhido.getTitulo());
        holder.textViewAutor.setText(livroescolhido.getAutor());
        holder.textViewQtd.setText(""+livroescolhido.getQuantidade());
        //holder.textViewQtd.setText(livroescolhido.getQuantidade());
        if (livroescolhido.getLido()== true){
            holder.img.setImageResource(R.drawable.open);
        }else{
            holder.img.setImageResource(R.drawable.flat);
        }
    }
    @Override
    public int getItemCount(){
        return listaLivro.size();
    }
}
