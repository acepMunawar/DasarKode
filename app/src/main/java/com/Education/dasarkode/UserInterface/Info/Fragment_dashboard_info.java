package com.Education.dasarkode.UserInterface.Info;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.Education.dasarkode.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_dashboard_info extends Fragment {

    public Fragment_dashboard_info() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dashboard_info, container, false);
        return view;
    }
}
