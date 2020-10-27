package com.education.dasarkode;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class Fragment_dashboard_kuis extends Fragment {

    private ImageView imageViewJava;
    private ImageView imageViewCpp;
    private ImageView imageViewAlgorithm;
    private ImageView imageViewMySQL;
    private ImageView imageViewPython;
    private ImageView imageViewJavaScript;
    private TextView timeNewRoman;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dashboard_kuis, container, false);
        initializeView(view);
        FontTMR(view);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        bindViewEvents();
    }

    private void FontTMR(View view){
        timeNewRoman = view.findViewById(R.id.kuisBrand);
        Typeface customfont=Typeface.createFromAsset(getActivity().getAssets(),"font/timenewroman.otf");
        timeNewRoman.setTypeface(customfont);
    }

    private void initializeView(View view) {
        imageViewAlgorithm = view.findViewById(R.id.algoritma_logo);
        imageViewJava = view.findViewById(R.id.java_logo);
        imageViewCpp = view.findViewById(R.id.cpp_logo);
        imageViewMySQL = view.findViewById(R.id.mysql_logo);
        imageViewJavaScript = view.findViewById(R.id.javascript_logo);
        imageViewPython = view.findViewById(R.id.python_logo);
    }

    private void bindViewEvents() {
        imageViewPython.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(QuizActivity.newIntent(getContext(), "python_questions", "Python"));
            }
        });

        imageViewJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(QuizActivity.newIntent(getContext(), "java_questions", "Java"));
            }
        });

        imageViewCpp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(QuizActivity.newIntent(getContext(), "cpp_questions", "C++"));
            }
        });

        imageViewMySQL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(QuizActivity.newIntent(getContext(), "mysql_questions", "MySQL"));
            }
        });

        imageViewJavaScript.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(QuizActivity.newIntent(getContext(), "javascript_questions", "JavaScript"));
            }
        });

        imageViewAlgorithm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(QuizActivity.newIntent(getContext(), "algorithm_questions", "Algoritma"));
            }
        });
    }
}
