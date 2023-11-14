package com.example.listare;

import androidx.annotation.NonNull;

public class Produto {
    int codigo;
    String nome;
    double preco;
    int foto;// Pois a foto ficara na pasta res drawable, e vira um ID do tipo int pra acessar

    public Produto(int codigo, String nome, double preco, int foto) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.foto = foto;
    }

}