package com.me.techfy.loginregisterfragments.fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.me.techfy.loginregisterfragments.FragmentPActivity;
import com.me.techfy.loginregisterfragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentFormulario extends Fragment implements FragmentPActivity {

    public static final String USER = "user";

    private FragmentPActivity fragmentPActivity;

    private TextInputEditText userEditavel;
    private TextInputEditText passwordEditavel;

    public FragmentFormulario() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        fragmentPActivity = (FragmentPActivity) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_formulario, container, false);

        userEditavel = view.findViewById(R.id.edit_text_username_id);
        passwordEditavel = view.findViewById(R.id.edit_text_password_id);

        Button button = view.findViewById(R.id.button_login_id);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String user = userEditavel.getText().toString();
               fragmentPActivity.exibirFormulario(user);

            }
        });
        return view;
    }
    public void exibirFormulario (String user){

        WelcomeFragment welcomeFragment = new WelcomeFragment();

        Bundle bundle = new Bundle();
        bundle.putString(USER,user);
        welcomeFragment.setArguments(bundle);

        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.edit_text_welcome_id,welcomeFragment);
        transaction.commit();
    }
    }


