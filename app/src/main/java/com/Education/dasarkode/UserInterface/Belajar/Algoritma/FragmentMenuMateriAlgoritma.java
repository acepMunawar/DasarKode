package com.Education.dasarkode.UserInterface.Belajar.Algoritma;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.Education.dasarkode.R;
import com.Education.dasarkode.UserInterface.Belajar.Algoritma.FragmentAlgoritmaMateri1;

public class FragmentMenuMateriAlgoritma extends Fragment {
    Button btnFirstMateri;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_menu_materi_algoritma, container, false);
        btnFirstMateri = (Button) view.findViewById(R.id.button_first_materi);
        btnFirstMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentAlgoritmaMateri1 fragmentFirstMateri = new FragmentAlgoritmaMateri1();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragmentLayoutBelajarAlgoritma,fragmentFirstMateri);
                fragmentTransaction.commit();
            }
        });

    return view;
    }


}
