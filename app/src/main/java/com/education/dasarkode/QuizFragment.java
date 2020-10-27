package com.education.dasarkode;

import android.graphics.Typeface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.education.dasarkode.models.Quiz;

public class QuizFragment extends Fragment {

    private static final String QUIZ_NAME = "QUIZ_NAME";
    private static final String QUIZ_PARCEL = "QUIZ_PARCEL";

    private QuizActivity activity;
    private Quiz quiz;
    private String quizName;

    private ImageView imageViewClose;
    private TextView textViewTitle;
    private TextView textViewQuestion;
    private ImageView imageViewQuestion;
    private TextView textViewAnswerA;
    private TextView textViewAnswerB;
    private TextView textViewAnswerC;
    private TextView textViewAnswerD;
    private CardView answerACardView;
    private CardView answerBCardView;
    private CardView answerCCardView;
    private CardView answerDCardView;

    public static QuizFragment newInstance(Quiz quiz, String quizName) {
        QuizFragment fragment = new QuizFragment();
        Bundle args = new Bundle();
        args.putString(QUIZ_NAME, quizName);
        args.putParcelable(QUIZ_PARCEL, quiz);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            quizName = getArguments().getString(QUIZ_NAME);
            quiz = getArguments().getParcelable(QUIZ_PARCEL);
        }

        activity = (QuizActivity) getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_quiz, container, false);
        initializeView(view);
        onTextFontView(view);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        bindViewEvents();
    }

    private void initializeView(View view) {
        imageViewClose = view.findViewById(R.id.imageViewClose);
        textViewTitle = view.findViewById(R.id.textViewTitle);
        textViewQuestion = view.findViewById(R.id.textViewQuestion);
        imageViewQuestion = view.findViewById(R.id.imageViewQuestion);
        textViewAnswerA = view.findViewById(R.id.textViewAnswerA);
        textViewAnswerB = view.findViewById(R.id.textViewAnswerB);
        textViewAnswerC = view.findViewById(R.id.textViewAnswerC);
        textViewAnswerD = view.findViewById(R.id.textViewAnswerD);
        answerACardView = view.findViewById(R.id.answerACardView);
        answerBCardView = view.findViewById(R.id.answerBCardView);
        answerCCardView = view.findViewById(R.id.answerCCardView);
        answerDCardView = view.findViewById(R.id.answerDCardView);
    }

    private void onTextFontView(View view){
        textViewQuestion = view.findViewById(R.id.textViewQuestion);
        textViewAnswerA = view.findViewById(R.id.textViewAnswerA);
        textViewAnswerB = view.findViewById(R.id.textViewAnswerB);
        textViewAnswerC = view.findViewById(R.id.textViewAnswerC);
        textViewAnswerD = view.findViewById(R.id.textViewAnswerD);
        textViewTitle = view.findViewById(R.id.textViewTitle);
            Typeface customfont = Typeface.createFromAsset(getActivity().getAssets(),"font/timenewroman.otf");
                textViewQuestion.setTypeface(customfont);
                textViewAnswerA.setTypeface(customfont);
                textViewAnswerB.setTypeface(customfont);
                textViewAnswerC.setTypeface(customfont);
                textViewAnswerD.setTypeface(customfont);
                textViewTitle.setTypeface(customfont);
    }

    private void loadData() {
        textViewTitle.setText(quizName);
        textViewQuestion.setText(quiz.question.replace("\\n", "\n"));
        textViewAnswerA.setText(quiz.answer_a.replace("\\n", "\n"));
        textViewAnswerB.setText(quiz.answer_b.replace("\\n", "\n"));
        textViewAnswerC.setText(quiz.answer_c.replace("\\n", "\n"));
        textViewAnswerD.setText(quiz.answer_d.replace("\\n", "\n"));

        // load image from url
        Glide.with(this).load(quiz.question_image_url).into(imageViewQuestion);
    }

    private void bindViewEvents() {
        imageViewClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { onClose(); }
        });

        answerACardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { onAnswerAClicked(); }
        });

        answerBCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { onAnswerBClicked(); }
        });

        answerCCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { onAnswerCClicked(); }
        });

        answerDCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { onAnswerDClicked(); }
        });
    }

    private void onClose() {
        activity.finish();
    }

    private void onAnswerAClicked() {
        if (quiz.correct_answer.equals("a")) {
            activity.correctAnswer();
            return;
        }

        activity.wrongAnswer();
    }

    private void onAnswerBClicked() {
        if (quiz.correct_answer.equals("b")) {
            activity.correctAnswer();
            return;
        }

        activity.wrongAnswer();
    }

    private void onAnswerCClicked() {
        if (quiz.correct_answer.equals("c")) {
            activity.correctAnswer();
            return;
        }

        activity.wrongAnswer();
    }

    private void onAnswerDClicked() {
        if (quiz.correct_answer.equals("d")) {
            activity.correctAnswer();
            return;
        }

        activity.wrongAnswer();
    }
}
