package com.house.digital.comunicacaoentrefragments.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.house.digital.comunicacaoentrefragments.MainActivity;
import com.house.digital.comunicacaoentrefragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ExibirFragment extends Fragment {


    public ExibirFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_exibir, container, false);

        TextView textMensagem = view.findViewById(R.id.text_view_id); //Local onde será exibido o texto armazenado

        //Com o comando abaixo eu defino qual a mensagem que será exibida, no caso é a mensagem que foi
        //armazenada pelo setArguments
        textMensagem.setText(getArguments().getString(MainActivity.MENSAGEM));

        return view;
    }

}
