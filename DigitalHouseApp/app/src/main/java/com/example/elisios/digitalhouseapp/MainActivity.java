package com.example.elisios.digitalhouseapp;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.elisios.digitalhouseapp.fragments.EventosFragment;
import com.example.elisios.digitalhouseapp.fragments.PeopleFragment;
import com.example.elisios.digitalhouseapp.fragments.PostDetailFragment;
import com.example.elisios.digitalhouseapp.fragments.PostsFragment;
import com.example.elisios.digitalhouseapp.model.Post;

public class MainActivity extends AppCompatActivity implements PostsFragment.PostClicado {

    public static final String POST_TITLE = "POST_TITLE";
    public static final String POST_DESCRICAO = "POST_DESCRIÇÃO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView texto = findViewById(R.id.text_principal);

        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();

        String emailDigitado = bundle.getString(LoginActivity.CHAVE_EMAIL);

        texto.setText(emailDigitado);
    }

    public void exibirPosts() {
        //Colocando Fragments no Layout após clicar em um botão
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container_id,new PostsFragment());
        transaction.commit();
    }

    public void exibirPessoas() {

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container_id,new PeopleFragment()); //Aqui troca um id por um novo PeopleFragment
        transaction.commit();
    }

    public void exibirEventos() {

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container_id,new EventosFragment());
        transaction.commit();

    }

    @Override
    public void onButtonClick(Post post) {
        Toast.makeText(this,POST_TITLE,Toast.LENGTH_SHORT).show();

        //Criando um pacote/bundle
        Bundle bundle = new Bundle();

        //Colocando o título numa chave chamada Post_Title
        bundle.putString(POST_TITLE, post.getTitulo());
        bundle.putString(POST_DESCRICAO,post.getDescricao());

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();

        PostDetailFragment detailFragment = new PostDetailFragment();
        detailFragment.setArguments(bundle);

        transaction.replace(R.id.container_id, detailFragment);
        transaction.commit();
    }
}
