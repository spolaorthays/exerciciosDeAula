package com.example.elisios.comunicacaoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class PrimeiraActivity extends AppCompatActivity {

    public static final String CHAVE_MENSAGEM = "texto_digitado"; // variavel que armazena a mensagem de forma estatica,
                                                                  // se usa quando não se quer errar o texto digitado.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira);
    }

    public void textoClicado (View view){

        EditText textoEditavel = findViewById(R.id.primeiro_texto);

        Bundle pacote = new Bundle();
        pacote.putString(CHAVE_MENSAGEM,textoEditavel.getText().toString()); //pega o texto digitado

        Intent intencao = new Intent (this, SegundaTelaActivity.class);
        intencao.putExtras(pacote);
        startActivity(intencao);

    }
}
