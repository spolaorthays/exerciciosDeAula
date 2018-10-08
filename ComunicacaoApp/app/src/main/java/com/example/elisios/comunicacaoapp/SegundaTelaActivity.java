package com.example.elisios.comunicacaoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SegundaTelaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_tela);

        Intent intencao = getIntent();
        Bundle pacote = intencao.getExtras();
        String textoDigitado = pacote.getString(PrimeiraActivity.CHAVE_MENSAGEM);

        TextView segundoTexto = findViewById(R.id.texto_segunda);
        segundoTexto.setText(textoDigitado); //define qual texto que é para aparecer na segunda tela,
                                            //no caso foi o texto da primeira tela que vai para a segunda.
    }
}
