package com.example.alunos.jogoadivinha2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

class Placar extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.placar);

        Intent intencao = getIntent();
        Bundle pacote = intencao.getExtras();

        String tentativas = pacote.getString("oValor");
        TextView placar = (TextView) findViewById(R.id.placar);
        placar.setText(tentativas);

    }
    public void voltar(){

        this.finish();
    }
}
