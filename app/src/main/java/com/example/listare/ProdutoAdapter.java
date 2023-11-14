package com.example.listare;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProdutoAdapter extends RecyclerView.Adapter<ProdutoViewHolder> {
    List<Produto> produtos;

    public ProdutoAdapter(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @NonNull
    @Override
    public ProdutoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //carregar o arquivo XML do layout card
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_card, parent, false);

        //passar o xml para a classe do RecyclerView.ViewHolder poder iniciar os IDs
        return new ProdutoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProdutoViewHolder holder, @SuppressLint("RecyclerView") int position) {
        //Acessar cada componente da tela que esta no HOLDER
        holder.itemFoto.setImageResource(produtos.get(position).foto);
        holder.itemNome.setText(produtos.get(position).nome);
        holder.itemPreco.setText("R$ " + produtos.get(position).preco);
        holder.itemRemover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                produtos.remove(position);
                notifyDataSetChanged();//atualiza a lista da tela
            }
        });

    }

    @Override
    public int getItemCount() {
        return produtos.size();
    }
}
