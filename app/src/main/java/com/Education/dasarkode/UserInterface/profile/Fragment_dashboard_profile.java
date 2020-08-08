package com.Education.dasarkode.UserInterface.profile;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.Education.dasarkode.EditProfile;
import com.Education.dasarkode.LayoutEditProfile;
import com.Education.dasarkode.R;


public class Fragment_dashboard_profile extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dashboard_profile, container, false);

        Button BtnEditProfile = (Button) view.findViewById(R.id.BtnEditProfile);

        BtnEditProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentLayoutEditProf = new Intent(getActivity(), LayoutEditProfile.class);
                startActivity(intentLayoutEditProf);
                getActivity().overridePendingTransition(0,0);
            }
        });

        return view;
    }
}
