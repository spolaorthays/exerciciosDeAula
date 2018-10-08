package com.example.elisios.comunicacaoentreactivitysapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReceptorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receptor);

        Intent intencao = getIntent();
        Bundle pacote = intencao.getExtras();
        String textoDigitado = pacote.getString(SenderActivity.CHAVE_MENSAGEM);

        TextView textoDoSender = findViewById(R.id.texto_anterior);
        textoDoSender.setText(textoDigitado);
    }
}
