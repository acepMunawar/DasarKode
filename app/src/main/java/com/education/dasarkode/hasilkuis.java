package com.education.dasarkode;

import android.graphics.Typeface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class hasilkuis extends Fragment {

    private static final String CORRECT_ANSWER = "CORRECT_ANSWER";
    private static final String WRONG_ANSWER = "WRONG_ANSWER";
    private static final String SCORE = "SCORE";

    private String correctAnswer;
    private String wrongAnswer;
    private String score;

    private TextView textViewScoreValue;
    private TextView textViewCorrect;
    private TextView textViewWrong;
    private TextView scoreTeks;
    private Button buttonFinish;

    public static hasilkuis newInstance(String correctAnswer, String wrongAnswer, String score) {
        hasilkuis fragment = new hasilkuis();
        Bundle args = new Bundle();
        args.putString(CORRECT_ANSWER, correctAnswer);
        args.putString(WRONG_ANSWER, wrongAnswer);
        args.putString(SCORE, score);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            correctAnswer = getArguments().getString(CORRECT_ANSWER);
            wrongAnswer = getArguments().getString(WRONG_ANSWER);
            score = getArguments().getString(SCORE);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hasilkuis, container, false);
        initializeView(view);
        onTextFontView(view);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        bindViewEvents();
    }

    private void initializeView(View view) {
        textViewScoreValue = view.findViewById(R.id.textViewScoreValue);
        textViewCorrect = view.findViewById(R.id.textViewCorrect);
        textViewWrong = view.findViewById(R.id.textViewWrong);
        buttonFinish = view.findViewById(R.id.buttonFinish);

        textViewScoreValue.setText(score);
        textViewCorrect.setText(String.format("Correct\n%s", correctAnswer));
        textViewWrong.setText(String.format("Incorrect\n%s", wrongAnswer));
    }

    private void onTextFontView(View view){
        textViewScoreValue = view.findViewById(R.id.textViewScoreValue);
        textViewCorrect = view.findViewById(R.id.textViewCorrect);
        textViewWrong = view.findViewById(R.id.textViewWrong);
        buttonFinish = view.findViewById(R.id.buttonFinish);
        scoreTeks = view.findViewById(R.id.textViewScore);
            Typeface customfont = Typeface.createFromAsset(getActivity().getAssets(),"font/timenewroman.otf");
                textViewScoreValue.setTypeface(customfont);
                textViewCorrect.setTypeface(customfont);
                textViewWrong.setTypeface(customfont);
                buttonFinish.setTypeface(customfont);
                scoreTeks.setTypeface(customfont);
    }

    private void bindViewEvents() {
        buttonFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().finish();
            }
        });
    }
}
