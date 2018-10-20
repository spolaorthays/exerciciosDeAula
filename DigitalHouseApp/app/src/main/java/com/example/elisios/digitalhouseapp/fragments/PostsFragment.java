package com.example.elisios.digitalhouseapp.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.elisios.digitalhouseapp.R;
import com.example.elisios.digitalhouseapp.model.Post;
import com.example.elisios.digitalhouseapp.adapter.RecycleViewPostAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class PostsFragment extends Fragment {

    //atributo da interface que havia sido criada, desse modo não precisa ter uma interface separada
    public interface PostClicado {

        void onButtonClick(Post texto);

    }

    private PostClicado listener;

    public PostsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) { //context == activity que contem o fragment
        super.onAttach(context);

        // Aqui estou crashando propositalmente se o contexto não for do PostClicado
        //RunTimeException é um erro generico, então se não souber o erro que vai dar, usar ele.
        if (context instanceof PostClicado) {
            listener = (PostClicado) context;
        } else {
            throw new ClassCastException("A activity não é uma instancia de Post Clicado");
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_posts, container, false);

        //Button botaoDetalhe = view.findViewById(R.id.botao_post_detalhe_id);

        //o argumento desse set se chama implementação anônima, por isso tem essa sintaxe
       /* botaoDetalhe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Post post = new Post();
                post.setTitulo("Titulo do post");
                post.setDescricao("Descrição do post");
                post.setAutor("Autor 1");
                post.setDataCriacao(new Date());
                post.setImagemUrl("www.google.com/imageX");

                listener.onButtonClick(post);
            }
        });  */


        FloatingActionButton fab = view.findViewById(R.id.fab_plus_id);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(view, "Novo post", Snackbar.LENGTH_INDEFINITE).show();
            }
        });

        setupRecyclerView(view);

        return view;
    }

    private void setupRecyclerView(View view) {
        RecyclerView recyclerView = view.findViewById(R.id.recycleview_post_id);

        //Criar e definir adapter
        RecycleViewPostAdapter adapter = new RecycleViewPostAdapter(createPostList());
        recyclerView.setAdapter(adapter);
        //Definir layout manager
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
    }

    private List<Post> createPostList() {
        List<Post> postList = new ArrayList<>();

        Post post = new Post();
        post.setTitulo("Nova turma iniciada");
        post.setDescricao("Em outubro iniciou nova turma de Marketing");
        postList.add(post);

        Post post1 = new Post();
        post1.setTitulo("Estreia do novo cardapio");
        post1.setDescricao("A cafeteria tem um novo cardápio de almoço");
        postList.add(post1);

        Post post2 = new Post();
        post2.setTitulo("Inscrevam-se na aula de mentoria");
        post2.setDescricao("Através do email mentoria@digitalhouse.com");
        postList.add(post2);

        Post post3 = new Post();
        post3.setTitulo("Lembrar de estudar RecycleView");
        post3.setDescricao("É uma matéria dificil");
        postList.add(post3);

        return postList;
    }

}
