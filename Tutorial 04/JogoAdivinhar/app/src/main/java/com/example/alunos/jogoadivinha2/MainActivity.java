package com.example.alunos.jogoadivinha2;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import java.util.*;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private int cont;
    private Random gerador = new Random();
    private int numero = gerador.nextInt(1000)+1;
    private TextView tentativas;



    public void Confere(View v) {

        EditText userInput = findViewById(R.id.editText);
        String str = userInput.getText().toString();
        SharedPreferences arquivo = getPreferences(Context.MODE_PRIVATE);

        int num = Integer.parseInt(str);
        if (num == numero) {
            TextView etiqueta = (TextView) findViewById(R.id.etiqueta);
            etiqueta.setText(getResources().getString(R.string.lblHello));
            tentativas = (TextView) findViewById(R.id.tentativas);
            tentativas.setText(Integer.toString(cont));
            String oValor = tentativas.getText().toString();
            SharedPreferences.Editor editor = arquivo.edit();
            editor.putString("tentativas", oValor);
            editor.commit();
            cont = 0;
            numero = gerador.nextInt(1000)+1;;
        } else {
            cont++;
            TextView etiqueta = (TextView) findViewById(R.id.etiqueta);
            etiqueta.setText(getResources().getString(R.string.lblHello2));
            TextView tentativas = (TextView) findViewById(R.id.tentativas);
            tentativas.setText(Integer.toString(cont));

            if (num > numero) {
                TextView palpite = (TextView) findViewById(R.id.palpite);
                palpite.setText("TENTE UM NÚMERO MENOR");
            } else {
                TextView palpite = (TextView) findViewById(R.id.palpite);
                palpite.setText("TENTE UM NÚMERO MAIOR");
            }
        }
    }
    public void placar(){
        Intent i = new Intent(getApplicationContext(), Placar.class);

        String oValor = tentativas.getText().toString();
        Log.i("oValor: ", oValor);

        Bundle bundle = new Bundle();
        bundle.putString("oValor", oValor);
        i.putExtras(bundle);
        startActivity(i);
    }

}
