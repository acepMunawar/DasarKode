package com.Education.dasarkode;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


public class MainKuis extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_main_kuis, container, false);

        ImageButton startKuis = (ImageButton) view.findViewById(R.id.StartKuis);
        startKuis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentStartKuis = new Intent(getActivity(), MainLayoutStartKuis.class);
                startActivity(intentStartKuis);
                getActivity().overridePendingTransition(0,0);
            }
        });


        return view;
    }
}