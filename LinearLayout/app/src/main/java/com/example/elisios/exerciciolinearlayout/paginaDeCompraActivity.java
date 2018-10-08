package com.example.elisios.exerciciolinearlayout;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class paginaDeCompraActivity extends AppCompatActivity {

    private TextView texto2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_de_compra);

        texto2 = findViewById(R.id.text_view_id); //encontrar o texto
    }

    public void botaoParaAceitar(View view){
        Context contexto = getApplicationContext();
        String texto1 = "botão clicado";
        int duracao = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(contexto,texto1,duracao);
        toast.setGravity(Gravity.CENTER|Gravity.CENTER,0,0);
        toast.show();

        texto2.setText("Compra realizada, aguarde a entrega. =]");
    }

    public void botaoParaRecusar(View view){
        Context contexto = getApplicationContext();
        String texto1 = "botão clicado";
        int duracao = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(contexto,texto1,duracao);
        toast.setGravity(Gravity.CENTER|Gravity.CENTER,0,0);
        toast.show();

        texto2.setText("Compra cancelada, o produto voltou aos nossos estoques. Esperamos que tenha " +
                "melhor experiência na próxima compra.");
    }
}
