package com.education.dasarkode;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.education.dasarkode.models.Quiz;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.List;

public class QuizActivity extends AppCompatActivity {

    private static final String COLLECTION_NAME = "COLLECTION_NAME";

    private FirebaseFirestore firebaseFirestore;
    private int correctAnswer = 0;
    private int wrongAnswer = 0;

    private List<Quiz> quizzes;
    private int currentQuizIndex = 0;

    public static Intent newIntent(Context context, String collectionName) {
        Intent intent = new Intent(context, QuizActivity.class);
        intent.putExtra(COLLECTION_NAME, collectionName);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        firebaseFirestore = FirebaseFirestore.getInstance();

        loadData();
    }

    private void loadData() {

        String collectionName = getIntent().getStringExtra(COLLECTION_NAME);
        firebaseFirestore.collection(collectionName).get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                        }
                    }
                });
    }

    public void wrongAnswer() {
        wrongAnswer++;
        currentQuizIndex++;
    }

    public void correctAnswer() {
        correctAnswer++;
        currentQuizIndex++;
    }
}
