package com.example.elisios.comunicacaoentreactivitys2app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReceptorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receptor);

        Intent mudancaDeTela = getIntent();

        Bundle pacote = mudancaDeTela.getExtras();
        String textoDigitado = pacote.getString(SenderActivity.CHAVE_MENSAGEM_NOME);
        String textoDigitadoSobrenome = pacote.getString(SenderActivity.CHAVE_MENSAGEM_SOBRENOME);
        String textoDigitadoIdade = pacote.getString(SenderActivity.CHAVE_MENSAGEM_IDADE);

        TextView textoDoNome = findViewById(R.id.texto_anterior_nome);
        textoDoNome.setText(textoDigitado);

        TextView textoDoSobrenome = findViewById(R.id.texto_anterior_sobrenome);
        textoDoSobrenome.setText(textoDigitadoSobrenome);

        TextView textoDaIdade = findViewById(R.id.texto_anterior_idade);
        textoDaIdade.setText(textoDigitadoIdade);


        //
    }
}
