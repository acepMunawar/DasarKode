package com.education.dasarkode.UserInterface.profile;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.education.dasarkode.LayoutEditProfile;
import com.education.dasarkode.MainLogin;
import com.education.dasarkode.R;
import com.google.firebase.auth.FirebaseAuth;


public class Fragment_dashboard_profile extends Fragment {

    private FirebaseAuth firebaseAuth;
    private Button buttonUpdate;
    private Button buttonLogout;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        firebaseAuth = FirebaseAuth.getInstance();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        bindViewEvents();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dashboard_profile, container, false);
        initializeView(view);
        return view;
    }

    private void initializeView(View view) {
       buttonUpdate = view.findViewById(R.id.buttonUpdate);
       buttonLogout = view.findViewById(R.id.buttonLogout);
    }

    private void bindViewEvents() {
        buttonLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { onLogout(); }
        });

        buttonUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { onUpdate(); }
        });
    }

    private void onLogout() {
        firebaseAuth.signOut();
        Intent intent = new Intent(getActivity(), MainLogin.class);
        startActivity(intent);
        getActivity().finish();
    }

    private void onUpdate() {
        Intent intentLayoutEditProf = new Intent(getActivity(), LayoutEditProfile.class);
        startActivity(intentLayoutEditProf);
    }
}
