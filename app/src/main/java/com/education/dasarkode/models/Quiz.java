package com.education.dasarkode.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Quiz implements Parcelable {
    public String question_image_url;
    public String question;
    public String answer_a;
    public String answer_b;
    public String answer_c;
    public String answer_d;
    public String correct_answer;

    public Quiz() {

    }

    protected Quiz(Parcel in) {
        question_image_url = in.readString();
        question = in.readString();
        answer_a = in.readString();
        answer_b = in.readString();
        answer_c = in.readString();
        answer_d = in.readString();
        correct_answer = in.readString();
    }

    public static final Creator<Quiz> CREATOR = new Creator<Quiz>() {
        @Override
        public Quiz createFromParcel(Parcel in) {
            return new Quiz(in);
        }

        @Override
        public Quiz[] newArray(int size) {
            return new Quiz[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(question_image_url);
        dest.writeString(question);
        dest.writeString(answer_a);
        dest.writeString(answer_b);
        dest.writeString(answer_c);
        dest.writeString(answer_d);
        dest.writeString(correct_answer);
    }
}
