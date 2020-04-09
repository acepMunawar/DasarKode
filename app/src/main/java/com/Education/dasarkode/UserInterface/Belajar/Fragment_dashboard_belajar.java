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
import com.Education.dasarkode.UserInterface.Belajar.ruby.menuBelajarRuby;

public class Fragment_dashboard_belajar extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dashboard_belajar, container, false);

           ImageButton btnAlgoritma = (ImageButton) view.findViewById(R.id.algoritma);
            btnAlgoritma.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intentAlgoritma = new Intent(getActivity(), menuBelajarAlgoritma.class);
                    startActivity(intentAlgoritma);
                }
            });

            ImageButton btnJava = (ImageButton) view.findViewById(R.id.java);
            btnJava.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intentJava = new Intent(getActivity(), menuBelajarJava.class);
                    startActivity(intentJava);
                }
            });

            ImageButton btnCpp = (ImageButton) view.findViewById(R.id.cpp);
            btnCpp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intentCpp = new Intent(getActivity(),menuBelajarCpp.class);
                    startActivity(intentCpp);
                }
            });

            ImageButton btnPython = (ImageButton) view.findViewById(R.id.python);
            btnPython.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intentPython = new Intent(getActivity(), menuBelajarPython.class);
                    startActivity(intentPython);
                }
            });

            ImageButton btnRuby = (ImageButton) view.findViewById(R.id.ruby);
            btnRuby.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intentRuby = new Intent(getActivity(), menuBelajarRuby.class);
                    startActivity(intentRuby);
                }
            });

            ImageButton btnMysql = (ImageButton) view.findViewById(R.id.mysql);
            btnMysql.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intentMysql = new Intent(getActivity(), menuBelajarMysql.class);
                    startActivity(intentMysql);
                }
            });

        return view;
    }

}
