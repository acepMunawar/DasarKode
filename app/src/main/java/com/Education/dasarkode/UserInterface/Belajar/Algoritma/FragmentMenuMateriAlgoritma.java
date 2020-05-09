package com.Education.dasarkode.UserInterface.Belajar.Algoritma;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Switch;

import com.Education.dasarkode.R;

public class FragmentMenuMateriAlgoritma extends Fragment {
    Button btnFirstMateri,btnSecondMateri,btnThirdMateri;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_menu_materi_algoritma, container, false);

        btnFirstMateri = (Button) view.findViewById(R.id.button_first_materi);
        btnSecondMateri = (Button) view.findViewById(R.id.button_second_materi);
        btnThirdMateri = (Button) view.findViewById(R.id.button_third_materi);

        btnFirstMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentAlgoritmaMateri1 fragmentFirstMateri = new FragmentAlgoritmaMateri1();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragmentLayoutBelajarAlgoritma,fragmentFirstMateri);
                fragmentTransaction.commit();
            }
        });

        btnSecondMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentAlgoritmaMateri2 fragmentSecondMateri = new FragmentAlgoritmaMateri2();
                FragmentTransaction fragmentTransactionSecond = getFragmentManager().beginTransaction();
                fragmentTransactionSecond.replace(R.id.fragmentLayoutBelajarAlgoritma,fragmentSecondMateri);
                fragmentTransactionSecond.commit();
            }
        });

        btnThirdMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentAlgoritmaMateri3 fragmentThirdMateri = new FragmentAlgoritmaMateri3();
                FragmentTransaction fragmentTransactionThird = getFragmentManager().beginTransaction();
                fragmentTransactionThird.replace(R.id.fragmentLayoutBelajarAlgoritma,fragmentThirdMateri);
                fragmentTransactionThird.commit();
            }
        });



    return view;
    }


}
