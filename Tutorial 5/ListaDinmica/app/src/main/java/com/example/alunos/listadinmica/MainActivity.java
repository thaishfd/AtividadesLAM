package com.example.alunos.listadinmica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.alunos.listadinmica.model.Pessoa;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Pessoa> lista = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista.add(new Pessoa("Maria de Oliveira", "999836265", R.mipmap.ic_launcher_round));
        lista.add(new Pessoa("Pedro da Silveira", "3831-9658", R.mipmap.ic_launcher_round));
        lista.add(new Pessoa("João de Souza Luz", "3221-6598", R.mipmap.ic_launcher_round));
    }

    public void mostrarLista(View v) {
        Intent it = new Intent(this, mostraListaDinamica.class);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("contatos", lista);
        it.putExtras(bundle);
        startActivity(it);
    }
}
