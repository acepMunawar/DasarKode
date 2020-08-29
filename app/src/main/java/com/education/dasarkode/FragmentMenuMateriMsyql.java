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


public class FragmentMenuMateriMsyql extends Fragment {
    Button btnFirstMateri,btnSecondMateri,btnThirdMateri,btnFourthMateri,btnFifthMateri,btnSixthMateri;
    Button btnSeventhMateri,btnEightMateri,btnNineMateri,btnTenthMateri,btnEleventhMateri;
    Button btnTwelfthMateri;
    ImageButton imgBtnBack;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_menu_materi_msyql, container, false);

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
        imgBtnBack = (ImageButton) view.findViewById(R.id.back);
        btnFirstMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MysqlMateri1 fragmentFirstMateri = new MysqlMateri1();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragmentLayoutBelajarMysql,fragmentFirstMateri);
                fragmentTransaction.commit();
            }
        });

        btnSecondMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MysqlMateri2 fragmentSecondMateri = new MysqlMateri2();
                FragmentTransaction fragmentTransactionSecond = getFragmentManager().beginTransaction();
                fragmentTransactionSecond.replace(R.id.fragmentLayoutBelajarMysql,fragmentSecondMateri);
                fragmentTransactionSecond.commit();
            }
        });

        btnThirdMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MysqlMateri3 fragmentThirdMateri = new MysqlMateri3();
                FragmentTransaction fragmentTransactionThird = getFragmentManager().beginTransaction();
                fragmentTransactionThird.replace(R.id.fragmentLayoutBelajarMysql,fragmentThirdMateri);
                fragmentTransactionThird.commit();
            }
        });

        btnFourthMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MysqlMateri4 fragmentFourthMateri = new MysqlMateri4();
                FragmentTransaction fragmentTransactionFourth = getFragmentManager().beginTransaction();
                fragmentTransactionFourth.replace(R.id.fragmentLayoutBelajarMysql,fragmentFourthMateri);
                fragmentTransactionFourth.commit();
            }
        });

        btnFifthMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MysqlMateri5 fragmentFifthMateri = new MysqlMateri5();
                FragmentTransaction fragmentTransactionFifth = getFragmentManager().beginTransaction();
                fragmentTransactionFifth.replace(R.id.fragmentLayoutBelajarMysql,fragmentFifthMateri);
                fragmentTransactionFifth.commit();
            }
        });

        btnSixthMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MysqlMateri6 fragmentSixthMateri = new MysqlMateri6();
                FragmentTransaction fragmentTransactionSixth = getFragmentManager().beginTransaction();
                fragmentTransactionSixth.replace(R.id.fragmentLayoutBelajarMysql,fragmentSixthMateri);
                fragmentTransactionSixth.commit();
            }
        });

        btnSeventhMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MysqlMateri7 fragmentSeventhMateri = new MysqlMateri7();
                FragmentTransaction fragmentTransactionSeventh = getFragmentManager().beginTransaction();
                fragmentTransactionSeventh.replace(R.id.fragmentLayoutBelajarMysql,fragmentSeventhMateri);
                fragmentTransactionSeventh.commit();
            }
        });

        btnEightMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MysqlMateri8 fragmentEigthMateri = new MysqlMateri8();
                FragmentTransaction fragmentTransactionEigth = getFragmentManager().beginTransaction();
                fragmentTransactionEigth.replace(R.id.fragmentLayoutBelajarMysql,fragmentEigthMateri);
                fragmentTransactionEigth.commit();
            }
        });

        btnNineMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MysqlMateri9 fragmentNineMateri = new MysqlMateri9();
                FragmentTransaction fragmentTransactionTree = getFragmentManager().beginTransaction();
                fragmentTransactionTree.replace(R.id.fragmentLayoutBelajarMysql,fragmentNineMateri);
                fragmentTransactionTree.commit();
            }
        });

        btnTenthMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MysqlMateri12 fragmentTenMateri = new MysqlMateri12();
                FragmentTransaction fragmentTransactionTree = getFragmentManager().beginTransaction();
                fragmentTransactionTree.replace(R.id.fragmentLayoutBelajarMysql,fragmentTenMateri);
                fragmentTransactionTree.commit();
            }
        });

        btnEleventhMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MysqlMateri12 fragmentTreeMateri = new MysqlMateri12();
                FragmentTransaction fragmentTransactionTree = getFragmentManager().beginTransaction();
                fragmentTransactionTree.replace(R.id.fragmentLayoutBelajarMysql,fragmentTreeMateri);
                fragmentTransactionTree.commit();
            }
        });

        btnTwelfthMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MysqlMateri12 fragmentTreeMateri = new MysqlMateri12();
                FragmentTransaction fragmentTransactionTree = getFragmentManager().beginTransaction();
                fragmentTransactionTree.replace(R.id.fragmentLayoutBelajarMysql,fragmentTreeMateri);
                fragmentTransactionTree.commit();
            }
        });

        imgBtnBack.setOnClickListener(new View.OnClickListener() {
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
