package com.example.elisios.digitalhouseapp;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    public static final String CHAVE_EMAIL = "chave_email";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        /*Intent posRegistro = getIntent();

        Bundle pacote = posRegistro.getExtras();
        String emailDigitado = pacote.getString(RegistroActivity.CHAVE_EMAIL);
        String senhaDigitada = pacote.getString(RegistroActivity.CHAVE_PASSWORD);

        TextInputEditText textoEmail = findViewById(R.id.edit_registro_email_id);
        textoEmail.setText(emailDigitado);

        TextInputEditText textoSenha = findViewById(R.id.edit_registro_password_id);
        textoSenha.setText(senhaDigitada);*/
    }

    public void loginClicado (View view){
        Intent intent = new Intent(this,HomeActivity.class);

        final TextInputEditText emailDigitado = findViewById(R.id.edit_text_email_digitado);
        final TextInputEditText senhaDigitada = findViewById(R.id.edit_text_password_id);

        Bundle bundle = new Bundle();
        bundle.putString(CHAVE_EMAIL,emailDigitado.getText().toString());

        Button buttonLogin = findViewById(R.id.button_login_id);

        if(emailDigitado.getText().toString().equals(senhaDigitada.getText().toString())){
            bundle.putString(CHAVE_EMAIL,emailDigitado.getText().toString());
            intent.putExtras(bundle);
            startActivity(intent);
        }else{
            Snackbar.make(buttonLogin,"E-mail e/ou senha incorreto(s)",Snackbar.LENGTH_INDEFINITE)
                    .setAction("Ok, entendi", new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //Quando se digita errado, fica na cor vermelha
                            emailDigitado.setTextColor(getResources().getColor(R.color.error));
                            senhaDigitada.setTextColor(getResources().getColor(R.color.error));

                            //Apaga o que havia sido digitado
                            //emailDigitado.setText("");
                            //senhaDigitada.setText("");
                        }
                    })
                    .show();
            //Toast.makeText(this,"E-mail e/ou senha incorreto(s)",Toast.LENGTH_SHORT).show();
        }

        //intent.putExtras(bundle);
        //startActivity(intent);

    }

    public void registrando(View view) {

        Intent intent = new Intent(this,RegistroActivity.class);
        startActivity(intent);
    }
}
