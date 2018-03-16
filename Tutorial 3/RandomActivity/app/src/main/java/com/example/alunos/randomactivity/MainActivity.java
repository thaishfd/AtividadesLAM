package com.example.alunos.randomactivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView numero;
    TextView botao;

    public int x, tentativas;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numero = findViewById(R.id.numero);
    }

    public void random(){
        int tentativas = 0;
        Random ran = new Random();
        x = ran.nextInt(101);
    }

    public void jogo(View args) {
        int y = Integer.parseInt(numero.getText().toString());
        tentativas ++;

        if (x != y) {
            if (x > y) {
                Toast.makeText(getApplicationContext(), "Você errou! O número é maior", Toast.LENGTH_SHORT).show();
            } else if (x < y) {
                Toast.makeText(getApplicationContext(), "Você errou! O número é menor", Toast.LENGTH_SHORT).show();
            }
        }else {
            this.notificacao("Você Ganhou!", String.format("Número de tentativas: %d. Deseja jogar novamente?", tentativas));
            salvar(tentativas, y);
        }
    }

    public void notificacao(String title, String msg){
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

        builder.setTitle(title);
        builder.setMessage(msg);

        builder.setPositiveButton("SIM", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                random();
            }
        });
        builder.setNegativeButton("NÃO", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                finish();
                System.exit(0);
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }

    public void salvar(int Tentativas, int y){
        SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putInt("Jogada", tentativas);
        editor.putInt("Número", y);
        editor.commit();
    }

}
