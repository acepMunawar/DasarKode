package com.education.dasarkode;

import android.content.Context;
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

import com.education.dasarkode.UserInterface.profile.Fragment_dashboard_profile;
import com.education.dasarkode.commons.Constants;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class EditProfile extends Fragment {

    private FirebaseAuth firebaseAuth;
    private SharedPreferences sharedPreferences;
    private EditText editTextEmail;
    private EditText editTextName;
    private EditText editTextPassword;
    private EditText editTextHobby;
    private Button buttonUpdate;
    
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        firebaseAuth = FirebaseAuth.getInstance();
        sharedPreferences = getActivity().getSharedPreferences(Constants.SHARED_PREFERENCES_KEY, Context.MODE_PRIVATE);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        bindViewEvents();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_edit_profile, container, false);
        initializeView(view);
        return view;
    }
    
    private void initializeView(View view) {
        editTextEmail = view.findViewById(R.id.editTextEmail);
        editTextName = view.findViewById(R.id.editTextName);
        editTextPassword = view.findViewById(R.id.editTextPassword);
        editTextHobby = view.findViewById(R.id.editTextHobby);
        buttonUpdate = view.findViewById(R.id.buttonUpdate);
    }
    
    private void bindViewEvents() {
        buttonUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { onUpdate(); }
        });
    }

    private void loadData() {
        FirebaseUser user = firebaseAuth.getCurrentUser();
        if (user != null) {
            editTextName.setText(sharedPreferences.getString(Constants.SP_NAME_KEY, ""));
            editTextEmail.setText(user.getEmail());
            editTextHobby.setText(sharedPreferences.getString(Constants.SP_HOBBY_KEY, ""));
        }
    }
    
    private void onUpdate() {
        String name = editTextName.getText().toString();
        String hobby = editTextHobby.getText().toString();
        String email = editTextEmail.getText().toString();
        String password = editTextPassword.getText().toString();

        sharedPreferences.edit()
                .putString(Constants.SP_NAME_KEY, name)
                .putString(Constants.SP_HOBBY_KEY, hobby)
                .apply();

        FirebaseUser user = firebaseAuth.getCurrentUser();
        user.updateEmail(email)
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                       if (!task.isSuccessful()) {
                           Toast.makeText(getActivity(), "Ubah email gagal!", Toast.LENGTH_SHORT).show();
                       }
                    }
                });

        if (!password.isEmpty()) {
            user.updatePassword(password)
                    .addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if (!task.isSuccessful()) {
                                Toast.makeText(getActivity(), "Ubah password gagal!", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
        }

        getActivity()
                .getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentDashboardBelajar, new Fragment_dashboard_profile())
                .commit();
    }
}
