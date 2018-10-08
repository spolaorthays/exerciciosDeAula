package com.example.elisios.comunicacaoentreactivitysapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SenderActivity extends AppCompatActivity {

    public static final String CHAVE_MENSAGEM = "texto_digitado";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sender);
    }

    public void pressionarBotao(View view) {

        EditText textoEditavel = findViewById(R.id.texto_editavel);

        Bundle pacote = new Bundle();
        pacote.putString(CHAVE_MENSAGEM, textoEditavel.getText().toString());

        Intent intencao = new Intent(this, ReceptorActivity.class);
        intencao.putExtras(pacote);
        startActivity(intencao);

        Toast.makeText(this,"Botão pressionado",Toast.LENGTH_SHORT).show();
    }
}
