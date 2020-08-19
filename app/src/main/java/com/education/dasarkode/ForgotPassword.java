package com.education.dasarkode;

import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class ForgotPassword extends Fragment {

    private FirebaseAuth firebaseAuth;
    private EditText editTextEmail;
    private Button buttonSubmit;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        firebaseAuth = FirebaseAuth.getInstance();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_forgot_password, container, false);
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
        buttonSubmit = view.findViewById(R.id.buttonSubmit);
    }

    private void bindViewEvents() {
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { onSubmit(); }
        });
    }

    private void onSubmit() {
        String email = editTextEmail.getText().toString();
        firebaseAuth.sendPasswordResetEmail(email)
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful()) {
                            Toast.makeText(getActivity(), "Email reset password sudah terkirim!", Toast.LENGTH_SHORT).show();
                            Login fragmentLogin = new Login();
                            FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                            fragmentTransaction.replace(R.id.fragmentLogin, fragmentLogin);
                            fragmentTransaction.commit();
                            return;
                        }

                        Toast.makeText(getActivity(), "Gagal mengirim email reset password.", Toast.LENGTH_SHORT).show();
                    }
                });
    }
}
