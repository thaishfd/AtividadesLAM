package com.example.alunos.randomactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText userInput;
    TextView etiqueta;
    TextView numero;
    TextView botao;

    Random ran = new Random();
    int x;
    int tentativas = 3;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userInput = findViewById(R.id.editText);
        etiqueta  = findViewById(R.id.textView);
        botao  = findViewById(R.id.button);
        numero = (TextView) findViewById(R.id.textView2);
        x = ran.nextInt(11);
    }


    public void jogo(View args) {
        String y = userInput.getText().toString();
        int n = 0;
        if(y.matches("")){
            tentativas = -1;
        } else {
            n = Integer.parseInt(y);
        }
        String num = Integer.toString(x);


        tentativas--;
        if (x == n) {
            etiqueta.setText(getResources().getString(R.string.lblAcertou));
            numero.setText(getResources().getString(R.string.lblNumero,num));
            botao.setText(getResources().getString(R.string.lblNovo));
            tentativas = -1;
        } else if(tentativas==0){
            etiqueta.setText(getResources().getString(R.string.lblFim));
            numero.setText(num);
            botao.setText(getResources().getString(R.string.lblNovo));
            tentativas--;
        } else if(tentativas<0){
            x = ran.nextInt(11);
            tentativas = 3;
            botao.setText(getResources().getString(R.string.lblEnviar));
            etiqueta.setText(getResources().getString(R.string.lblTente));
            numero.setText(getResources().getString(R.string.lblNum));

        } else {
            etiqueta.setText(getResources().getString(R.string.lblErrou));
        }
        userInput.setText(getResources().getString(R.string.lblVazia));
    }
}
