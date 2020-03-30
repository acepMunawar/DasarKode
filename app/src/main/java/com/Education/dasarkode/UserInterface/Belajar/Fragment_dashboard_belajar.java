package com.Education.dasarkode.UserInterface.Belajar;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.Education.dasarkode.R;


public class Fragment_dashboard_belajar extends Fragment {


    public Fragment_dashboard_belajar(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dashboard_belajar, container, false);
        return view;
    }
}
