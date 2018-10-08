package com.example.elisios.registroalunosdh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText textoEditavel;

    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    textoEditavel = findViewById(R.id.texto_digitado_id);
    textoEditavel = findViewById(R.id.texto_digitado_id2);
    textoEditavel = findViewById(R.id.texto_digitado_id3);

        Aluno aluno = new Aluno();
        aluno.setNome("Marcos");
        aluno.setSobrenome("Rodrigues");
        aluno.setRg("34.133.243");
        aluno.setCodigo(12);

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Juliano");
        aluno2.setSobrenome("Gomes");
        aluno2.setRg("35.174.392");
        aluno2.setCodigo(13);

        Aluno aluno3 = new Aluno();
        aluno3.setNome("Augusta");
        aluno3.setSobrenome("Garcia");
        aluno3.setRg("32.431.342");
        aluno3.setCodigo(14);
    }



}
