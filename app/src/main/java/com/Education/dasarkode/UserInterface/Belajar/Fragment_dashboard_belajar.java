package com.Education.dasarkode.UserInterface.Belajar;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.Education.dasarkode.R;
import com.Education.dasarkode.UserInterface.Belajar.Algoritma.menuBelajarAlgoritma;
import com.Education.dasarkode.UserInterface.Belajar.Java.menuBelajarJava;
import com.Education.dasarkode.UserInterface.Belajar.cpp.menuBelajarCpp;
import com.Education.dasarkode.UserInterface.Belajar.mysql.menuBelajarMysql;
import com.Education.dasarkode.UserInterface.Belajar.python.menuBelajarPython;
import com.Education.dasarkode.UserInterface.Belajar.js.menuBelajarJs;

public class Fragment_dashboard_belajar extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_dashboard_belajar, container, false);

           ImageButton btnAlgoritma = (ImageButton) view.findViewById(R.id.algoritma);
            btnAlgoritma.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intentAlgoritma = new Intent(getActivity(), menuBelajarAlgoritma.class);
                    startActivity(intentAlgoritma);
                    getActivity().overridePendingTransition(0,0);
                }
            });

            ImageButton btnJava = (ImageButton) view.findViewById(R.id.java);
            btnJava.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intentJava = new Intent(getActivity(), menuBelajarJava.class);
                    startActivity(intentJava);
                    getActivity().overridePendingTransition(0,0);
                }
            });

            ImageButton btnCpp = (ImageButton) view.findViewById(R.id.cpp);
            btnCpp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intentCpp = new Intent(getActivity(),menuBelajarCpp.class);
                    startActivity(intentCpp);
                    getActivity().overridePendingTransition(0,0);
                }
            });

            ImageButton btnPython = (ImageButton) view.findViewById(R.id.python);
            btnPython.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intentPython = new Intent(getActivity(), menuBelajarPython.class);
                    startActivity(intentPython);
                    getActivity().overridePendingTransition(0,0);
                }
            });

            ImageButton btnJs = (ImageButton) view.findViewById(R.id.js);
            btnJs.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intentRuby = new Intent(getActivity(), menuBelajarJs.class);
                    startActivity(intentRuby);
                    getActivity().overridePendingTransition(0,0);
                }
            });

            ImageButton btnMysql = (ImageButton) view.findViewById(R.id.mysql);
            btnMysql.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intentMysql = new Intent(getActivity(), menuBelajarMysql.class);
                    startActivity(intentMysql);
                    getActivity().overridePendingTransition(0,0);
                }
            });

        return view;
    }

}
