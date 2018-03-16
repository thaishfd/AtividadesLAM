package com.example.alunos.randomactivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Raking extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raking);
    }

    public void recuperar(){
        SharedPreferences sharedPref = getPreferences(Context.MODE_PRIVATE);
        //int defaultValue = getResources().getInteger(R.string.saved_high_score_default);
        //long highScore = sharedPref.getInt(getString(R.string.saved_high_score), defaultValue);
    }
}
