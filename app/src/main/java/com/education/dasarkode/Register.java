package com.education.dasarkode;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.education.dasarkode.commons.Constants;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Register extends Fragment {

    private FirebaseAuth firebaseAuth;
    private EditText editTextEmail;
    private EditText editTextPassword;
    private EditText editTextName;
    private EditText editTextHobby;
    private Button buttonRegister;

    private SharedPreferences sharedPreferences;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        firebaseAuth = FirebaseAuth.getInstance();
        sharedPreferences = getActivity().getSharedPreferences(Constants.SHARED_PREFERENCES_KEY, Context.MODE_PRIVATE);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_register, container, false);
        initializeView(view);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        bindViewEvents();
    }

    private void initializeView(View view) {
        editTextEmail = view.findViewById(R.id.email);
        editTextName = view.findViewById(R.id.nama);
        editTextPassword = view.findViewById(R.id.password);
        editTextHobby = view.findViewById(R.id.hoby);
        buttonRegister = view.findViewById(R.id.buttonRegister);
    }

    private void bindViewEvents() {

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { onRegister(); }
        });
    }

    private void onRegister() {
        String email = editTextEmail.getText().toString();
        String password = editTextPassword.getText().toString();

        firebaseAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            String name = editTextName.getText().toString();
                            String hobby = editTextHobby.getText().toString();
                            sharedPreferences
                                    .edit()
                                    .putString(Constants.SP_NAME_KEY, name)
                                    .putString(Constants.SP_HOBBY_KEY, hobby)
                                    .apply();

                            Intent intentHome = new Intent(getActivity(), MainActivity.class);
                            startActivity(intentHome);
                            getActivity().finish();
                            return;
                        }

                        Toast.makeText(getActivity(), "Register Gagal!", Toast.LENGTH_SHORT).show();
                    }
                });
    }
}
