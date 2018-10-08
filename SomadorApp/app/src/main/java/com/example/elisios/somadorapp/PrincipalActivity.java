package com.example.elisios.somadorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class PrincipalActivity extends AppCompatActivity {

    private TextView texto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        texto = findViewById(R.id.valor_inicial);
        texto.setText("0");

    }

    public void somar (View view){
        Float valor = 1F;
        Float valorFinal = Float.parseFloat(texto.getText().toString())+valor;
        texto.setText(valorFinal+"");
    }

    public void subtrair (View view){
        Float valor = 1F;
        Float valorFinal = Float.parseFloat(texto.getText().toString())-valor;
        texto.setText(valorFinal+"");

        //assim transforma numero em strig
        //primeiro transformei em float, depois em string com o: (+ "" )
    }
}
