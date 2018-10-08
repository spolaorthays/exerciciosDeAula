package com.example.elisios.ciclodevidaapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Context contexto = getApplicationContext();
        String texto = "onCreate";
        int duracao = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(contexto, texto, duracao);
        toast.setGravity(Gravity.CENTER|Gravity.CENTER,0,0);
        toast.show();
    }

    @Override
    protected void onStart() {
        super.onStart();

        Context contexto = getApplicationContext();
        String texto = "onStart";
        int duracao = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(contexto, texto, duracao);
        toast.setGravity(Gravity.CENTER|Gravity.CENTER,0,0);
        toast.show();

    }

    @Override
    protected void onResume() {
        super.onResume();

        Context contexto = getApplicationContext();
        String texto = "onResume";
        int duracao = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(contexto, texto, duracao);
        toast.setGravity(Gravity.CENTER|Gravity.CENTER,0,0);
        toast.show();

    }

    @Override
    protected void onPause() {
        super.onPause();

        Context contexto = getApplicationContext();
        String texto = "onPause";
        int duracao = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(contexto, texto, duracao);
        toast.setGravity(Gravity.CENTER|Gravity.CENTER,0,0);
        toast.show();
    }

    @Override
    protected void onStop(){
        super.onStop();

        Context contexto = getApplicationContext();
        String texto = "onStop";
        int duracao = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(contexto, texto, duracao);
        toast.setGravity(Gravity.CENTER|Gravity.CENTER,0,0);
        toast.show();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();

        Context contexto = getApplicationContext();
        String texto = "onDestroy";
        int duracao = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(contexto, texto, duracao);
        toast.setGravity(Gravity.CENTER|Gravity.CENTER,0,0);
        toast.show();
    }


}
