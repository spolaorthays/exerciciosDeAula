package com.house.digital.comunicacaoentrefragments;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.house.digital.comunicacaoentrefragments.fragments.ExibirFragment;
import com.house.digital.comunicacaoentrefragments.fragments.MensagemFragment;
import com.house.digital.comunicacaoentrefragments.interfaces.ReceptorDaMensagem;

public class MainActivity extends AppCompatActivity implements ReceptorDaMensagem {

    public static final String MENSAGEM = "mensagem";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Criando o primeiro fragment e coletando a mensagem digitada nele("enviar_mensagem"
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.enviar_mensagem,new MensagemFragment());
        transaction.commit();
    }

    @Override
    public void receberMensagem(String mensagem) {
        //Toast.makeText(this,mensagem,Toast.LENGTH_SHORT).show();

        ExibirFragment exibirFragment = new ExibirFragment(); //tem que criar novo objeto para armazenar o bundle

        Bundle bundle = new Bundle();
        bundle.putString(MENSAGEM,mensagem);
        exibirFragment.setArguments(bundle);  //passando informação do Activity p/ Fragment

        //Criando o segundo fragment da main e recebendo a mensagem que fora armazena no bundle (receber_mensagem)
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.receber_mensagem, exibirFragment);
        transaction.commit();
    }
}
