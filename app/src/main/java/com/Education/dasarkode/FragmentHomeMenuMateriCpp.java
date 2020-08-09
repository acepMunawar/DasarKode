package com.Education.dasarkode;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class FragmentHomeMenuMateriCpp extends Fragment {
    Button btnFirstMateri,btnSecondMateri,btnThirdMateri,btnFourthMateri,btnFifthMateri,btnSixthMateri;
    Button btnSeventhMateri,btnEightMateri,btnNineMateri,btnTenthMateri,btnEleventhMateri;
    Button btnTwelfth,btnThirtennthMateri,btnFourteenthMateri,btnFifteenthMateri;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_home_menu_materi_cpp, container, false);
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
        btnTwelfth = (Button) view.findViewById(R.id.button_twelfth_materi);

        btnFirstMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CppMateri1 fragmentFirstMateri = new CppMateri1();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragmentLayoutBelajarAlgoritma,fragmentFirstMateri);
                fragmentTransaction.commit();
            }
        });

        btnSecondMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CppMateri2 fragmentSecondMateri = new CppMateri2();
                FragmentTransaction fragmentTransactionSecond = getFragmentManager().beginTransaction();
                fragmentTransactionSecond.replace(R.id.fragmentLayoutBelajarAlgoritma,fragmentSecondMateri);
                fragmentTransactionSecond.commit();
            }
        });

        btnThirdMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CppMateri3 fragmentThirdMateri = new CppMateri3();
                FragmentTransaction fragmentTransactionThird = getFragmentManager().beginTransaction();
                fragmentTransactionThird.replace(R.id.fragmentLayoutBelajarAlgoritma,fragmentThirdMateri);
                fragmentTransactionThird.commit();
            }
        });



        return view;
    }
}