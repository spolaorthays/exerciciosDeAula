package com.me.techfy.loginregisterfragments;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.me.techfy.loginregisterfragments.fragments.FragmentFormulario;

public class MainActivity extends AppCompatActivity{

    public static final String CHAVE_USERNAME = "username";
    public static final String CHAVE_PASSWORD = "email";

    //TODO não sei o que fazer '-'

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Aqui eu carreguei o fragmentFormulario na Main
        FragmentFormulario formulario = new FragmentFormulario();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        Bundle bundle = new Bundle();
        formulario.setArguments(bundle);

        transaction.replace(R.id.container_id,formulario);
        transaction.commit();

        Button buttonLogin = findViewById(R.id.button_login_id);

    }


    public void informacoes (){
        final TextInputEditText usernameDigitado = findViewById(R.id.edit_text_username_id);
        final TextInputEditText passwordDigitado = findViewById(R.id.edit_text_password_id);

        Bundle bundle = new Bundle();
        bundle.putString(CHAVE_USERNAME, usernameDigitado.getText().toString());
        bundle.putString(CHAVE_PASSWORD, passwordDigitado.getText().toString());

        Intent intent = new Intent(this, WelcomeActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);

    }

}
