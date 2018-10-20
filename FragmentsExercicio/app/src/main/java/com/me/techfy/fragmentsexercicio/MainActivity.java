package com.me.techfy.fragmentsexercicio;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.me.techfy.fragmentsexercicio.fragments.FragmentFundoVerde;
import com.me.techfy.fragmentsexercicio.fragments.FragmentFundoVermelho;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void exibirTelaVermelha(View view) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container_id, new FragmentFundoVermelho());
        transaction.commit();
    }

    public void exibirTelaVerde(View view) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container_id, new FragmentFundoVerde());
        transaction.commit();
    }


}
