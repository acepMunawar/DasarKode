package com.Education.dasarkode;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


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

        btnFirstMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                JavaMateri1 fragmentFirstMateri = new JavaMateri1();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragmentLayoutBelajarPython,fragmentFirstMateri);
                fragmentTransaction.commit();
            }
        });

        btnSecondMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                JavaMateri2 fragmentSecondMateri = new JavaMateri2();
                FragmentTransaction fragmentTransactionSecond = getFragmentManager().beginTransaction();
                fragmentTransactionSecond.replace(R.id.fragmentLayoutBelajarPython,fragmentSecondMateri);
                fragmentTransactionSecond.commit();
            }
        });

        btnThirdMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                JavaMateri3 fragmentThirdMateri = new JavaMateri3();
                FragmentTransaction fragmentTransactionThird = getFragmentManager().beginTransaction();
                fragmentTransactionThird.replace(R.id.fragmentLayoutBelajarPython,fragmentThirdMateri);
                fragmentTransactionThird.commit();
            }
        });

        btnFourthMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                JavaMateri4 fragmentFourthMateri = new JavaMateri4();
                FragmentTransaction fragmentTransactionFourth = getFragmentManager().beginTransaction();
                fragmentTransactionFourth.replace(R.id.fragmentLayoutBelajarPython,fragmentFourthMateri);
                fragmentTransactionFourth.commit();
            }
        });

        btnFifthMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                JavaMateri5 fragmentFifthMateri = new JavaMateri5();
                FragmentTransaction fragmentTransactionFifth = getFragmentManager().beginTransaction();
                fragmentTransactionFifth.replace(R.id.fragmentLayoutBelajarPython,fragmentFifthMateri);
                fragmentTransactionFifth.commit();
            }
        });

        btnSixthMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                JavaMateri6 fragmentSixthMateri = new JavaMateri6();
                FragmentTransaction fragmentTransactionSixth = getFragmentManager().beginTransaction();
                fragmentTransactionSixth.replace(R.id.fragmentLayoutBelajarPython,fragmentSixthMateri);
                fragmentTransactionSixth.commit();
            }
        });

        btnSeventhMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                JavaMateri7 fragmentSeventhMateri = new JavaMateri7();
                FragmentTransaction fragmentTransactionSeventh = getFragmentManager().beginTransaction();
                fragmentTransactionSeventh.replace(R.id.fragmentLayoutBelajarPython,fragmentSeventhMateri);
                fragmentTransactionSeventh.commit();
            }
        });

        btnEightMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                JavaMateri8 fragmentEigthMateri = new JavaMateri8();
                FragmentTransaction fragmentTransactionEigth = getFragmentManager().beginTransaction();
                fragmentTransactionEigth.replace(R.id.fragmentLayoutBelajarPython,fragmentEigthMateri);
                fragmentTransactionEigth.commit();
            }
        });

        btnNineMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                JavaMateri9 fragmentNineMateri = new JavaMateri9();
                FragmentTransaction fragmentTransactionTree = getFragmentManager().beginTransaction();
                fragmentTransactionTree.replace(R.id.fragmentLayoutBelajarPython,fragmentNineMateri);
                fragmentTransactionTree.commit();
            }
        });

        btnTenthMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                JavaMateri10 fragmentTenMateri = new JavaMateri10();
                FragmentTransaction fragmentTransactionTree = getFragmentManager().beginTransaction();
                fragmentTransactionTree.replace(R.id.fragmentLayoutBelajarPython,fragmentTenMateri);
                fragmentTransactionTree.commit();
            }
        });

        btnEleventhMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                JavaMateri11 fragmentTreeMateri = new JavaMateri11();
                FragmentTransaction fragmentTransactionTree = getFragmentManager().beginTransaction();
                fragmentTransactionTree.replace(R.id.fragmentLayoutBelajarPython,fragmentTreeMateri);
                fragmentTransactionTree.commit();
            }
        });

        btnTwelfthMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                JavaMateri12 fragmentTreeMateri = new JavaMateri12();
                FragmentTransaction fragmentTransactionTree = getFragmentManager().beginTransaction();
                fragmentTransactionTree.replace(R.id.fragmentLayoutBelajarPython,fragmentTreeMateri);
                fragmentTransactionTree.commit();
            }
        });




        return view;

    }
}