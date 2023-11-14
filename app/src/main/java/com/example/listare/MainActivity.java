package com.example.listare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Produto p1 = new Produto(1,"Produto 1",100,R.drawable.ic_launcher_foreground);
        Produto p2 = new Produto(1,"Produto 1",100,R.drawable.ic_launcher_foreground);
        Produto p3 = new Produto(1,"Produto 1",100,R.drawable.ic_launcher_foreground);
        Produto p4 = new Produto(1,"Produto 1",100,R.drawable.ic_launcher_foreground);

        List<Produto> produtos = new ArrayList<>();

        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);
        produtos.add(p4);

        ProdutoAdapter produtoAdapter = new ProdutoAdapter(produtos);
        //inicia o recycler
        RecyclerView recyclerView = findViewById(R.id.reciclerView);
        //indica qual tipo de layout sera usado
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //passa o adapter para poder montar a lista
        recyclerView.setAdapter(produtoAdapter);
    }
}