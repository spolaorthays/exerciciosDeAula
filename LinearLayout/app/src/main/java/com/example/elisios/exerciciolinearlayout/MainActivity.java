package com.example.elisios.exerciciolinearlayout;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private EditText textoEditavel;

    private TextView texto2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoEditavel = findViewById(R.id.texto_digitado_id);
        texto2= findViewById(R.id.text_view_id);

    }

    public void botaoClicado(View view){
        Context contexto = getApplicationContext();
        String texto1 = "botão clicado";
        int duracao = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(contexto,texto1,duracao);
        toast.setGravity(Gravity.CENTER|Gravity.CENTER,0,0);
        toast.show();

        texto2.setText("Bem-vindo(a): "+textoEditavel.getText());

        Intent compraIntent = new Intent(getApplicationContext(),paginaDeCompraActivity.class);
        startActivity(compraIntent);
        finish();
    }



}
