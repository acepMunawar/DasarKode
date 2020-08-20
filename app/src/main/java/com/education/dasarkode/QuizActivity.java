package com.education.dasarkode;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.education.dasarkode.models.Quiz;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.List;

public class QuizActivity extends AppCompatActivity {

    private static final String COLLECTION_NAME = "COLLECTION_NAME";
    private static final String QUIZ_NAME = "QUIZ_NAME";

    private FirebaseFirestore firebaseFirestore;
    private int correctAnswer = 0;
    private int wrongAnswer = 0;

    private List<Quiz> quizzes;
    private int currentQuizIndex = 0;

    public static Intent newIntent(Context context, String collectionName, String quizName) {
        Intent intent = new Intent(context, QuizActivity.class);
        intent.putExtra(COLLECTION_NAME, collectionName);
        intent.putExtra(QUIZ_NAME, quizName);
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
                            quizzes = task.getResult().toObjects(Quiz.class);
                            loadQuizFragment();
                            return;
                        }

                        Log.w("Error", "Error getting documents.", task.getException());
                        Toast.makeText(QuizActivity.this, "Gagal mengambil kuis!", Toast.LENGTH_SHORT).show();
                        finish();
                    }
                });
    }

    public void wrongAnswer() {
        wrongAnswer++;
        currentQuizIndex++;
        if (currentQuizIndex < quizzes.size()) {
            loadQuizFragment();
            return;
        }

        loadScoreFragment();
    }

    public void correctAnswer() {
        correctAnswer++;
        currentQuizIndex++;
        if (currentQuizIndex < quizzes.size()) {
            loadQuizFragment();
            return;
        }

        loadScoreFragment();
    }

    private void loadQuizFragment() {
        String quizName = getIntent().getStringExtra(QUIZ_NAME);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.quizFrame, QuizFragment.newInstance(quizzes.get(currentQuizIndex), quizName))
                .commit();
    }

    private void loadScoreFragment() {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.quizFrame, new hasilkuis())
                .commit();
    }
}
