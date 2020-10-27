package com.education.dasarkode.UserInterface.profile;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.education.dasarkode.EditProfile;
import com.education.dasarkode.LayoutEditProfile;
import com.education.dasarkode.MainLogin;
import com.education.dasarkode.R;
import com.education.dasarkode.commons.Constants;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.lang.reflect.Type;


public class Fragment_dashboard_profile extends Fragment {

    private FirebaseAuth firebaseAuth;
    private Button buttonUpdate;
    private Button buttonLogout;
    private TextView textViewName;
    private TextView textViewEmail;
    private TextView textViewHobby;
    private TextView TextViewNameLabel;
    private TextView TextViewEmailLabel;
    private TextView TextViewPasswordLabel;
    private TextView TextViewHobbyLabel;
    private Button FontButtonUpdate;
    private Button FontButtonLogout;
    private SharedPreferences sharedPreferences;

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
        View view = inflater.inflate(R.layout.fragment_dashboard_profile, container, false);
        initializeView(view);
        onCreateFontText(view);
        return view;
    }

    private void loadData() {
        FirebaseUser user = firebaseAuth.getCurrentUser();
        if (user != null) {
            textViewName.setText(sharedPreferences.getString(Constants.SP_NAME_KEY, ""));
            textViewEmail.setText(user.getEmail());
            textViewHobby.setText(sharedPreferences.getString(Constants.SP_HOBBY_KEY, ""));
        }
    }

    public void onCreateFontText(View view){
        TextViewEmailLabel = view.findViewById(R.id.textViewEmailLabel);
        TextViewNameLabel = view.findViewById(R.id.textViewNameLabel);
        TextViewHobbyLabel = view.findViewById(R.id.textViewHobbyLabel);
        TextViewPasswordLabel = view.findViewById(R.id.textViewPasswordLabel);
        textViewEmail = view.findViewById(R.id.textViewEmail);
        textViewName = view.findViewById(R.id.textViewName);
        textViewHobby = view.findViewById(R.id.textViewHobby);
        FontButtonUpdate = view.findViewById(R.id.buttonUpdate);
        FontButtonLogout = view.findViewById(R.id.buttonLogout);
            Typeface customfont = Typeface.createFromAsset(getActivity().getAssets(),"font/timenewroman.otf");
                TextViewEmailLabel.setTypeface(customfont);
                TextViewNameLabel.setTypeface(customfont);
                TextViewHobbyLabel.setTypeface(customfont);
                TextViewHobbyLabel.setTypeface(customfont);
                TextViewPasswordLabel.setTypeface(customfont);
                textViewEmail.setTypeface(customfont);
                textViewName.setTypeface(customfont);
                textViewHobby.setTypeface(customfont);
                FontButtonUpdate.setTypeface(customfont);
                FontButtonLogout.setTypeface(customfont);

    }

    private void initializeView(View view) {
       buttonUpdate = view.findViewById(R.id.buttonUpdate);
       buttonLogout = view.findViewById(R.id.buttonLogout);
       textViewEmail = view.findViewById(R.id.textViewEmail);
       textViewName = view.findViewById(R.id.textViewName);
       textViewHobby = view.findViewById(R.id.textViewHobby);
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
        getActivity()
                .getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentDashboardBelajar, new EditProfile())
                .commit();
    }
}
