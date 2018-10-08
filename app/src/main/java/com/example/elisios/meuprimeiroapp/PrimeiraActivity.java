package com.example.elisios.meuprimeiroapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PrimeiraActivity extends AppCompatActivity {

    private EditText textoEditavel;

    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira);

        textoEditavel = findViewById(R.id.texto_digitado_id);
        texto = findViewById(R.id.text_view_id);

    }

    public void botaoClicado(View view){
        Context contexto = getApplicationContext();
        String textox = "botão clicado";
        int duracao = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(contexto, textox, duracao);
        toast.setGravity(Gravity.CENTER|Gravity.CENTER,0,0);
        toast.show();
        texto.setText("Bem-vindo: "+textoEditavel.getText());
    }
}
