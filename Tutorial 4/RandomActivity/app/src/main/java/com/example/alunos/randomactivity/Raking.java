package com.example.alunos.randomactivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class Raking extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raking);
        recuperar();
    }

    public void recuperar(){
        Intent intencao = getIntent();
        Bundle pacote = intencao.getExtras();

        int t = pacote.getInt("tentativas");
        int y = pacote.getInt("numero");
        String tentativas = Integer.toString(t);
        String numero = Integer.toString(y);

        ListView lista = findViewById(R.id.listView);
        ArrayList<HashMap<String, String>> valores = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            HashMap<String, String> item = new HashMap<>();
            item.put("tentativas", tentativas);
            item.put("numero", numero);
            valores.add(item);
        }
        String[] chaves = {"tentativas", "numero"};
        int[] labels = {R.id.lblpri, R.id.lblsec};
        SimpleAdapter adapter = new SimpleAdapter(getApplicationContext(),valores, R.layout.item_lista, chaves, labels);
        lista.setAdapter(adapter);
    }
}
