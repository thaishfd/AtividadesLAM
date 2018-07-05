package com.example.alunos.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void salvar(View v){
        SharedPreferences arquivo = getPreferences(Context.MODE_PRIVATE);
        EditText valor = findViewById(R.id.textValor);
        String oValor = valor.getText().toString();
        if(oValor.matches("")) {
            Toast toast = Toast.makeText(MainActivity.this,
                    "Digite algo...", Toast.LENGTH_SHORT);
            toast.show();
            return;
        }
        SharedPreferences.Editor editor = arquivo.edit();
        editor.putString("valor", oValor);
        editor.commit();
    }

    public void carregar(View v){
        SharedPreferences arquivo = getPreferences(Context.MODE_PRIVATE);
        EditText valor = findViewById(R.id.textValor);
        String oValor = arquivo.getString("valor", "Nada...");
        valor.setText(oValor);
        Log.i("oValor", oValor);
    }
}
