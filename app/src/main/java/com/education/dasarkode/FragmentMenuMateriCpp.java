package com.education.dasarkode;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class FragmentMenuMateriCpp extends Fragment {
    Button btnFirstMateri,btnSecondMateri,btnThirdMateri,btnFourthMateri,btnFifthMateri,btnSixthMateri;
    Button btnSeventhMateri,btnEightMateri,btnNineMateri,btnTenthMateri,btnEleventhMateri;
    Button btnTwelfthMateri,btnThirtennthMateri,btnFourteenthMateri,btnFifteenthMateri;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_menu_materi_cpp, container, false);

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
                CppMateri1 fragmentFirstMateri = new CppMateri1();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragmentLayoutBelajarCpp,fragmentFirstMateri);
                fragmentTransaction.commit();
            }
        });

        btnSecondMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CppMateri2 fragmentSecondMateri = new CppMateri2();
                FragmentTransaction fragmentTransactionSecond = getFragmentManager().beginTransaction();
                fragmentTransactionSecond.replace(R.id.fragmentLayoutBelajarCpp,fragmentSecondMateri);
                fragmentTransactionSecond.commit();
            }
        });

        btnThirdMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CppMateri3 fragmentThirdMateri = new CppMateri3();
                FragmentTransaction fragmentTransactionThird = getFragmentManager().beginTransaction();
                fragmentTransactionThird.replace(R.id.fragmentLayoutBelajarCpp,fragmentThirdMateri);
                fragmentTransactionThird.commit();
            }
        });

        btnFourthMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CppMateri4 fragmentFourthMateri = new CppMateri4();
                FragmentTransaction fragmentTransactionFourth = getFragmentManager().beginTransaction();
                fragmentTransactionFourth.replace(R.id.fragmentLayoutBelajarCpp,fragmentFourthMateri);
                fragmentTransactionFourth.commit();
            }
        });

        btnFifthMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CppMateri5 fragmentFifthMateri = new CppMateri5();
                FragmentTransaction fragmentTransactionFifth = getFragmentManager().beginTransaction();
                fragmentTransactionFifth.replace(R.id.fragmentLayoutBelajarCpp,fragmentFifthMateri);
                fragmentTransactionFifth.commit();
            }
        });

        btnSixthMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CppMateri6 fragmentSixthMateri = new CppMateri6();
                FragmentTransaction fragmentTransactionSixth = getFragmentManager().beginTransaction();
                fragmentTransactionSixth.replace(R.id.fragmentLayoutBelajarCpp,fragmentSixthMateri);
                fragmentTransactionSixth.commit();
            }
        });

        btnSeventhMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CppMateri7 fragmentSeventhMateri = new CppMateri7();
                FragmentTransaction fragmentTransactionSeventh = getFragmentManager().beginTransaction();
                fragmentTransactionSeventh.replace(R.id.fragmentLayoutBelajarCpp,fragmentSeventhMateri);
                fragmentTransactionSeventh.commit();
            }
        });

        btnEightMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CppMateri8 fragmentEigthMateri = new CppMateri8();
                FragmentTransaction fragmentTransactionEigth = getFragmentManager().beginTransaction();
                fragmentTransactionEigth.replace(R.id.fragmentLayoutBelajarCpp,fragmentEigthMateri);
                fragmentTransactionEigth.commit();
            }
        });

        btnNineMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CppMateri9 fragmentNineMateri = new CppMateri9();
                FragmentTransaction fragmentTransactionTree = getFragmentManager().beginTransaction();
                fragmentTransactionTree.replace(R.id.fragmentLayoutBelajarCpp,fragmentNineMateri);
                fragmentTransactionTree.commit();
            }
        });

        btnTenthMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CppMateri10 fragmentTenMateri = new CppMateri10();
                FragmentTransaction fragmentTransactionTree = getFragmentManager().beginTransaction();
                fragmentTransactionTree.replace(R.id.fragmentLayoutBelajarCpp,fragmentTenMateri);
                fragmentTransactionTree.commit();
            }
        });

        btnEleventhMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CppMateri11 fragmentTreeMateri = new CppMateri11();
                FragmentTransaction fragmentTransactionTree = getFragmentManager().beginTransaction();
                fragmentTransactionTree.replace(R.id.fragmentLayoutBelajarCpp,fragmentTreeMateri);
                fragmentTransactionTree.commit();
            }
        });

        btnTwelfthMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CppMateri12 fragmentTreeMateri = new CppMateri12();
                FragmentTransaction fragmentTransactionTree = getFragmentManager().beginTransaction();
                fragmentTransactionTree.replace(R.id.fragmentLayoutBelajarCpp,fragmentTreeMateri);
                fragmentTransactionTree.commit();
            }
        });




        return view;
    }
}
