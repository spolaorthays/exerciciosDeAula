package com.house.digital.comunicacaoentrefragments.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.house.digital.comunicacaoentrefragments.R;
import com.house.digital.comunicacaoentrefragments.interfaces.ReceptorDaMensagem;

/**
 * A simple {@link Fragment} subclass.
 */
public class MensagemFragment extends Fragment {

    private ReceptorDaMensagem receptorDaMensagem;//esse é o atributo que será colocado no onAttach

    private EditText mensagemEdit;

    public MensagemFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        receptorDaMensagem = (ReceptorDaMensagem) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_mensagem, container, false);

        //Armazenar o return em View para poder chamar o findViewById, pois só um view conseguirá
        // chamar ele para fazer a ligação do java com o xml.
        mensagemEdit = view.findViewById(R.id.text_mensagem_id); //pega a mensagem digitada no campo

        Button button = view.findViewById(R.id.bt_enviar); //encontra o botão e aguarda uma função para ele.

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //dando função para o botão
                String mensagem = mensagemEdit.getText().toString();
                receptorDaMensagem.receberMensagem(mensagem);
            }
        });

        return view;
    }

}
