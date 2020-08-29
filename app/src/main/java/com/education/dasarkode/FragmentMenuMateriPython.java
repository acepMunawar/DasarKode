package com.education.dasarkode;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.education.dasarkode.UserInterface.Belajar.Fragment_dashboard_belajar;
import com.education.dasarkode.UserInterface.Belajar.python.menuBelajarPython;


public class FragmentMenuMateriPython extends Fragment {
    Button btnFirstMateri,btnSecondMateri,btnThirdMateri,btnFourthMateri,btnFifthMateri,btnSixthMateri;
    Button btnSeventhMateri,btnEightMateri,btnNineMateri,btnTenthMateri,btnEleventhMateri;
    Button btnTwelfthMateri,btnThirtennthMateri,btnFourteenthMateri,btnFifteenthMateri;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_menu_materi_python, container, false);

        btnFirstMateri = (Button) view.findViewById(R.id.button_first_materi);
        btnSecondMateri = (Button) view.findViewById(R.id.button_second_materi);
        btnThirdMateri = (Button) view.findViewById(R.id.button_third_materi);
        btnFourthMateri = (Button) view.findViewById(R.id.button_fourth_materi);
        btnFifthMateri = (Button) view.findViewById(R.id.button_fifth_materi);
        btnSixthMateri = (Button) view.findViewById(R.id.button_sixth_materi);
        btnSeventhMateri = (Button) view.findViewById(R.id.button_seventh_materi);
        btnEightMateri = (Button) view.findViewById(R.id.button_eighth_materi);
        btnNineMateri = (Button) view.findViewById(R.id.button_nineth_materi);
        btnTenthMateri = (Button) view.findViewById(R.id.button_tenth_materi);
        btnEleventhMateri = (Button) view.findViewById(R.id.button_eleventh_materi);
        btnTwelfthMateri = (Button) view.findViewById(R.id.button_twelfth_materi);
        ImageButton imgBtn = (ImageButton) view.findViewById(R.id.back);

        btnFirstMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PyMateri1 fragmentFirstMateri = new PyMateri1();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragmentLayoutBelajarPython,fragmentFirstMateri);
                fragmentTransaction.commit();
            }
        });

        btnSecondMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PyMateri2 fragmentSecondMateri = new PyMateri2();
                FragmentTransaction fragmentTransactionSecond = getFragmentManager().beginTransaction();
                fragmentTransactionSecond.replace(R.id.fragmentLayoutBelajarPython,fragmentSecondMateri);
                fragmentTransactionSecond.commit();
            }
        });

        btnThirdMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PyMateri3 fragmentThirdMateri = new PyMateri3();
                FragmentTransaction fragmentTransactionThird = getFragmentManager().beginTransaction();
                fragmentTransactionThird.replace(R.id.fragmentLayoutBelajarPython,fragmentThirdMateri);
                fragmentTransactionThird.commit();
            }
        });

        btnFourthMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PyMateri4 fragmentFourthMateri = new PyMateri4();
                FragmentTransaction fragmentTransactionFourth = getFragmentManager().beginTransaction();
                fragmentTransactionFourth.replace(R.id.fragmentLayoutBelajarPython,fragmentFourthMateri);
                fragmentTransactionFourth.commit();
            }
        });

        btnFifthMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PyMateri5 fragmentFifthMateri = new PyMateri5();
                FragmentTransaction fragmentTransactionFifth = getFragmentManager().beginTransaction();
                fragmentTransactionFifth.replace(R.id.fragmentLayoutBelajarPython,fragmentFifthMateri);
                fragmentTransactionFifth.commit();
            }
        });

        btnSixthMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PyMateri6 fragmentSixthMateri = new PyMateri6();
                FragmentTransaction fragmentTransactionSixth = getFragmentManager().beginTransaction();
                fragmentTransactionSixth.replace(R.id.fragmentLayoutBelajarPython,fragmentSixthMateri);
                fragmentTransactionSixth.commit();
            }
        });

        btnSeventhMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PyMateri7 fragmentSeventhMateri = new PyMateri7();
                FragmentTransaction fragmentTransactionSeventh = getFragmentManager().beginTransaction();
                fragmentTransactionSeventh.replace(R.id.fragmentLayoutBelajarPython,fragmentSeventhMateri);
                fragmentTransactionSeventh.commit();
            }
        });

        btnEightMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PyMateri8 fragmentEigthMateri = new PyMateri8();
                FragmentTransaction fragmentTransactionEigth = getFragmentManager().beginTransaction();
                fragmentTransactionEigth.replace(R.id.fragmentLayoutBelajarPython,fragmentEigthMateri);
                fragmentTransactionEigth.commit();
            }
        });

        btnNineMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PyMateri9 fragmentNineMateri = new PyMateri9();
                FragmentTransaction fragmentTransactionTree = getFragmentManager().beginTransaction();
                fragmentTransactionTree.replace(R.id.fragmentLayoutBelajarPython,fragmentNineMateri);
                fragmentTransactionTree.commit();
            }
        });

        btnTenthMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PyMateri10 fragmentTenMateri = new PyMateri10();
                FragmentTransaction fragmentTransactionTree = getFragmentManager().beginTransaction();
                fragmentTransactionTree.replace(R.id.fragmentLayoutBelajarPython,fragmentTenMateri);
                fragmentTransactionTree.commit();
            }
        });

        btnEleventhMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PyMateri11 fragmentTreeMateri = new PyMateri11();
                FragmentTransaction fragmentTransactionTree = getFragmentManager().beginTransaction();
                fragmentTransactionTree.replace(R.id.fragmentLayoutBelajarPython,fragmentTreeMateri);
                fragmentTransactionTree.commit();
            }
        });

        btnTwelfthMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PyMateri12 fragmentTreeMateri = new PyMateri12();
                FragmentTransaction fragmentTransactionTree = getFragmentManager().beginTransaction();
                fragmentTransactionTree.replace(R.id.fragmentLayoutBelajarPython,fragmentTreeMateri);
                fragmentTransactionTree.commit();
            }
        });

        imgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), MainActivity.class);
                startActivity(i);
                ((Activity) getActivity()).overridePendingTransition(0, 0);
            }
        });

        return view;
    }



}
