package com.example.usuariopc.app2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.Arrays;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        RecyclerView rv= (RecyclerView) findViewById(R.id.lista);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        List<Usuario> listaUsuarios= Arrays.asList(new Usuario(R.mipmap.ic_launcher,"Vic"),
                                                   new Usuario(R.mipmap.ic_launcher,"Emi"),
                                                   new Usuario(R.mipmap.ic_launcher,"Jho"),
                                                   new Usuario(R.mipmap.ic_launcher,"Hor"));
        Adaptador adapter = new Adaptador(listaUsuarios);
        rv.setAdapter(adapter);
    }
}
