package com.example.elisios.concatenadorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class PrincipalActivity extends AppCompatActivity {

    private EditText textoEditavel;

    private EditText textoEditavel2;

    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        textoEditavel=findViewById(R.id.texto_digitado_id);
        textoEditavel2=findViewById(R.id.texto_digitado_id2);
        texto = findViewById(R.id.text_view_id);
        texto.setText("");
    }

    public void concatene (View view){

        String somarTexto = textoEditavel.getText().toString() + textoEditavel2.getText().toString();

        texto.setText(somarTexto);

    }
}
