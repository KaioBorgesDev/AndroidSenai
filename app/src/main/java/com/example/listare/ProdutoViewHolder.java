package com.example.listare;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProdutoViewHolder extends RecyclerView.ViewHolder {
    ImageView itemFoto;
    TextView itemNome, itemPreco;
    ImageButton itemRemover;
    public ProdutoViewHolder(@NonNull View itemView) {
        super(itemView);
        itemFoto = itemView.findViewById(R.id.itemFoto);
        itemNome = itemView.findViewById(R.id.itemNome);
        itemPreco = itemView.findViewById(R.id.itemPreco);
        itemRemover = itemView.findViewById(R.id.itemRemover);
    }
}
