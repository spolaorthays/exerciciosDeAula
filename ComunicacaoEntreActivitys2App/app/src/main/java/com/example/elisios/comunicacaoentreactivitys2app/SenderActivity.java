package com.example.elisios.comunicacaoentreactivitys2app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SenderActivity extends AppCompatActivity {

    public static final String CHAVE_MENSAGEM_NOME = "texto_digitado_nome";
    public static final String CHAVE_MENSAGEM_SOBRENOME = "texto_digitado_sobrenome";
    public static final String CHAVE_MENSAGEM_IDADE = "texto_digitado_idade";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sender);

    }

    public void botaoClicado (View view){

        Toast.makeText(this,"Botão pressionado",Toast.LENGTH_SHORT);

        EditText textoNome = findViewById(R.id.texto_nome_editavel);
        EditText textoSobrenome = findViewById(R.id.texto_sobrenome_editavel);
        EditText textoIdade = findViewById(R.id.texto_idade_editavel);

        Bundle pacoteDeInformacoes = new Bundle();
        pacoteDeInformacoes.putString(CHAVE_MENSAGEM_NOME,textoNome.getText().toString());
        pacoteDeInformacoes.putString(CHAVE_MENSAGEM_SOBRENOME,textoSobrenome.getText().toString());
        pacoteDeInformacoes.putString(CHAVE_MENSAGEM_IDADE,textoIdade.getText().toString());

        Intent mudarTela = new Intent(this,ReceptorActivity.class);
        mudarTela.putExtras(pacoteDeInformacoes);
        startActivity(mudarTela);
    }
}
