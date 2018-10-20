package com.example.elisios.digitalhouseapp.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.elisios.digitalhouseapp.R;
import com.example.elisios.digitalhouseapp.model.Post;

import java.util.List;

public class RecycleViewPostAdapter extends RecyclerView.Adapter<RecycleViewPostAdapter.ViewHolder> {

    private List<Post> postList;

    //Construtor do RecycleAdapter
    public RecycleViewPostAdapter (List<Post> postList){
        this.postList = postList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.content_post_item, viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        Post post = postList.get(position);
        viewHolder.bind(post);
    }

    @Override
    public int getItemCount() {
        //aqui você coloca o tamanho da lista
        return postList.size();
    }

    //essa é uma classe interna do RecycleView
    class ViewHolder extends RecyclerView.ViewHolder{

        private TextView titulo;
        private TextView descricao;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            titulo = itemView.findViewById(R.id.text_view_title_id);
            descricao = itemView.findViewById(R.id.text_view_description_id);
        }

        public void bind (Post post){
            titulo.setText(post.getTitulo());
            descricao.setText(post.getDescricao());

        }
    }
}
