package com.example.elisios.digitalhouseapp;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class RegistroActivity extends AppCompatActivity {

    public static final String CHAVE_NAME = "chave_name";

    public static final String CHAVE_EMAIL = "chave_email";

    public static final String CHAVE_PASSWORD = "chave_password";

    public static final String CHAVE_REPEAT_PASSWORD = "chave_repeat_password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

    }

    public void registroFeito(View view) {

        Intent intent = new Intent(this,LoginActivity.class);

        TextInputEditText nameDigitado = findViewById(R.id.edit_registro_name_id);
        TextInputEditText emailDigitado = findViewById(R.id.edit_registro_email_id);
        TextInputEditText passwordDigitado = findViewById(R.id.edit_registro_password_id);
        TextInputEditText repeatPassword = findViewById(R.id.repeat_registro_password_id);

        Bundle pacote = new Bundle();
        pacote.putString(CHAVE_NAME,nameDigitado.getText().toString());
        pacote.putString(CHAVE_EMAIL,emailDigitado.getText().toString());
        pacote.putString(CHAVE_PASSWORD,passwordDigitado.getText().toString());
        pacote.putString(CHAVE_REPEAT_PASSWORD,repeatPassword.getText().toString());

        intent.putExtras(pacote);

        if(passwordDigitado.getText().toString().equals(repeatPassword.getText().toString())){
            startActivity(intent);
        }else {
            Toast.makeText(this,"Passwords diferentes",Toast.LENGTH_SHORT).show();
        }




        //criar o intent com bundle

    }
}
