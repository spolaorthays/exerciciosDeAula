package com.me.techfy.loginregisterfragments;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ViewFlipper;

import com.me.techfy.loginregisterfragments.fragments.FragmentFormulario;
import com.me.techfy.loginregisterfragments.fragments.WelcomeFragment;

public class WelcomeActivity extends AppCompatActivity implements FragmentPActivityWelcome{

    private EditText username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        //todo Creio que aqui está carregado o welcomeFrag p/ o welcomeActivity
        WelcomeFragment welcome = new WelcomeFragment();
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container_welcome_id,welcome);
        transaction.commit();

        username = findViewById(R.id.edit_text_welcome_id);

        exibirWelcome(username);
    }

    public void exibirUsuario(){
        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();

        username.setText(bundle.getString(MainActivity.CHAVE_USERNAME));
    }


    @Override
    public void exibirWelcome(View view) {
        WelcomeFragment welcome = new WelcomeFragment();

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container_welcome_id, welcome);
        transaction.commit();
    }


}
