package com.Education.dasarkode.UserInterface.Belajar.Algoritma;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.Education.dasarkode.R;

public class FragmentMenuMateriAlgoritma extends Fragment {
    Button btnFirstMateri,btnSecondMateri,btnThirdMateri,btnFourthMateri,btnFifthMateri,btnSixthMateri;
    Button btnSeventhMateri,btnEightMateri,btnNineMateri,btnTenthMateri,btnEleventhMateri;
    Button btnTwelfth,btnThirtennthMateri,btnFourteenthMateri,btnFifteenthMateri;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_menu_materi_algoritma, container, false);

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
        btnThirtennthMateri = (Button) view.findViewById(R.id.button_thirteenth_materi);
        btnFourteenthMateri = (Button) view.findViewById(R.id.button_fourteenth_materi);
        btnFifteenthMateri = (Button) view.findViewById(R.id.button_fifteenth_materi);

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

        btnFourthMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentAlgoritmaMateri4 fragmentFourthMateri = new FragmentAlgoritmaMateri4();
                FragmentTransaction fragmentTransactionFourth = getFragmentManager().beginTransaction();
                fragmentTransactionFourth.replace(R.id.fragmentLayoutBelajarAlgoritma,fragmentFourthMateri);
                fragmentTransactionFourth.commit();
            }
        });

        btnFifthMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentAlgoritmaMateri5 fragmentFifthMateri = new FragmentAlgoritmaMateri5();
                FragmentTransaction fragmentTransactionFifth = getFragmentManager().beginTransaction();
                fragmentTransactionFifth.replace(R.id.fragmentLayoutBelajarAlgoritma,fragmentFifthMateri);
                fragmentTransactionFifth.commit();
            }
        });

        btnSixthMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentAlgoritmaMateri6 fragmentSixthMateri = new FragmentAlgoritmaMateri6();
                FragmentTransaction fragmentTransactionSixth = getFragmentManager().beginTransaction();
                fragmentTransactionSixth.replace(R.id.fragmentLayoutBelajarAlgoritma,fragmentSixthMateri);
                fragmentTransactionSixth.commit();
            }
        });

        btnSeventhMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentAlgoritmaMateri7 fragmentSeventhMateri = new FragmentAlgoritmaMateri7();
                FragmentTransaction fragmentTransactionSeventh = getFragmentManager().beginTransaction();
                fragmentTransactionSeventh.replace(R.id.fragmentLayoutBelajarAlgoritma,fragmentSeventhMateri);
                fragmentTransactionSeventh.commit();
            }
        });

        btnEightMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentAlgoritmaQueueMater8 fragmentEigthMateri = new FragmentAlgoritmaQueueMater8();
                FragmentTransaction fragmentTransactionEigth = getFragmentManager().beginTransaction();
                fragmentTransactionEigth.replace(R.id.fragmentLayoutBelajarAlgoritma,fragmentEigthMateri);
                fragmentTransactionEigth.commit();
            }
        });

        btnNineMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentAlgoritmaTreeMateri9 fragmentTreeMateri = new FragmentAlgoritmaTreeMateri9();
                FragmentTransaction fragmentTransactionTree = getFragmentManager().beginTransaction();
                fragmentTransactionTree.replace(R.id.fragmentLayoutBelajarAlgoritma,fragmentTreeMateri);
                fragmentTransactionTree.commit();
            }
        });

        btnTenthMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentAlgoritmaTreeMateri9 fragmentTenthMateri = new FragmentAlgoritmaTreeMateri9();
                FragmentTransaction fragmentTransactionGraph = getFragmentManager().beginTransaction();
                fragmentTransactionGraph.replace(R.id.fragmentLayoutBelajarAlgoritma,fragmentTenthMateri);
                fragmentTransactionGraph.commit();
            }
        });

        btnEleventhMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentAlgoritmaStudiKasusSederhanaMater11 fragmentSKSMateri = new FragmentAlgoritmaStudiKasusSederhanaMater11();
                FragmentTransaction fragmentTransactionSKS = getFragmentManager().beginTransaction();
                fragmentTransactionSKS.replace(R.id.fragmentLayoutBelajarAlgoritma,fragmentSKSMateri);
                fragmentTransactionSKS.commit();
            }
        });

        btnTwelfth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentAlgoritmaStudiKasusPerbandinganMateri12 fragmentSKP = new FragmentAlgoritmaStudiKasusPerbandinganMateri12();
                FragmentTransaction fragmentTransactionSKP = getFragmentManager().beginTransaction();
                fragmentTransactionSKP.replace(R.id.fragmentLayoutBelajarAlgoritma,fragmentSKP);
                fragmentTransactionSKP.commit();
            }
        });

        btnThirtennthMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentAlgoritmaStudiKasusPercbDanPerulangMateri13 fragmentSKPDP = new FragmentAlgoritmaStudiKasusPercbDanPerulangMateri13();
                FragmentTransaction fragmentTransactionSKPDP = getFragmentManager().beginTransaction();
                fragmentTransactionSKPDP.replace(R.id.fragmentLayoutBelajarAlgoritma,fragmentSKPDP);
                fragmentTransactionSKPDP.commit();
            }
        });

        btnFourteenthMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentAlgoritmaSKKonversiBilanganMateri14 fragmentSKKBM = new FragmentAlgoritmaSKKonversiBilanganMateri14();
                FragmentTransaction fragmentTransactionSKKBM = getFragmentManager().beginTransaction();
                fragmentTransactionSKKBM.replace(R.id.fragmentLayoutBelajarAlgoritma,fragmentSKKBM);
                fragmentTransactionSKKBM.commit();
            }
        });

        btnFifteenthMateri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentAlgoritmaKasusTumpukanMateri15 fragmentAKTM = new FragmentAlgoritmaKasusTumpukanMateri15();
                FragmentTransaction fragmentTransactionAKTM = getFragmentManager().beginTransaction();
                fragmentTransactionAKTM.replace(R.id.fragmentLayoutBelajarAlgoritma,fragmentAKTM);
                fragmentTransactionAKTM.commit();
            }
        });



        return view;
    }


}
