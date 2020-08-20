package com.education.dasarkode;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;


public class JavaMateri11 extends Fragment {
    Button firstButtonPlaying,secondButtonPlaying,thirdButtonPlaying,fourthButtonPlaying,fifthButtonPlaying,sixthButtonPlaying,seventhButtonPlaying,eigthButtonPlaying ;
    SeekBar firstSeekBar,secondSeekBar,thirdSeekBar,fourthSeekBar,fifthSeekBar,sixthSeekBar,seventhSeekBar,eigthSeekBar;
    TextView firstElapsedTimeLabel,secondElapsedTimeLabel,thirdElapsedTimeLabel,fourthElapsedTimeLabel,fifthElapsedTimeLabel,sixthElapsedTimeLabel,seventhElapsedTimeLabel,eigthElapsedTimeLabel;
    TextView firstRemainingTimeLabel,secondRemainingTimeLabel,thirdRemainingTimeLabel,fourthRemainingTimeLabel,fifthRemainingTimeLabel,sixthRemainingTimeLabel,seventhRemainingTimeLabel,eigthRemainingTimeLabel;
    MediaPlayer firstMediaPlayer,secondMediaPlayer,thirdMediaPlayer,fourthMediaPlayer,fifthMediaPlayer,sixthMediaPlayer,seventhMediaPlayer,eigthMediaPlayer;
    int firstTotalTime, secondTotalTime,thirdTotalTime,fourthTotalTime,fifthTotalTime,sixthTotalTime,seventhTotalTime,eigthTotalTime;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_java_materi11, container, false);

        //first sound button
        firstButtonPlaying= (Button) view.findViewById(R.id.FirstBtnPlay);
        firstElapsedTimeLabel = (TextView) view.findViewById(R.id.FirstElapsedTimeLabel);
        firstRemainingTimeLabel = (TextView) view.findViewById(R.id.FirstRemainingTimeLabel);
        firstMediaPlayer = MediaPlayer.create(getActivity(), R.raw.song);
        firstMediaPlayer.seekTo(0);
        firstTotalTime = firstMediaPlayer.getDuration();
        firstSeekBar =(SeekBar) view.findViewById(R.id.FirstSeekBar);

        //second sound button
        secondButtonPlaying= (Button) view.findViewById(R.id.SecondBtnPlay);
        secondElapsedTimeLabel = (TextView) view.findViewById(R.id.SecondElapsedTimeLabel);
        secondRemainingTimeLabel = (TextView) view.findViewById(R.id.SecondRemainingTimeLabel);
        secondMediaPlayer = MediaPlayer.create(getActivity(), R.raw.song);
        secondMediaPlayer.seekTo(0);
        secondTotalTime = secondMediaPlayer.getDuration();
        secondSeekBar =(SeekBar) view.findViewById(R.id.SecondSeekBar);

        //Fifth sound button
        fifthButtonPlaying = (Button) view.findViewById(R.id.FifthBtnPlay);
        fifthElapsedTimeLabel = (TextView) view.findViewById(R.id.FifthElapsedTimeLabel);
        fifthRemainingTimeLabel = (TextView) view.findViewById(R.id.FifthRemainingTimeLabel);
        fifthMediaPlayer = MediaPlayer.create(getActivity(), R.raw.song);
        fifthMediaPlayer.seekTo(0);
        fifthTotalTime = fifthMediaPlayer.getDuration();
        fifthSeekBar =(SeekBar) view.findViewById(R.id.FifthSeekBar);

        //Seventh sound button
        seventhButtonPlaying = (Button) view.findViewById(R.id.SeventhBtnPlay);
        seventhElapsedTimeLabel = (TextView) view.findViewById(R.id.SeventhElapsedTimeLabel);
        seventhRemainingTimeLabel = (TextView) view.findViewById(R.id.SeventhRemainingTimeLabel);
        seventhMediaPlayer = MediaPlayer.create(getActivity(), R.raw.song);
        seventhMediaPlayer.seekTo(0);
        seventhTotalTime = seventhMediaPlayer.getDuration();
        seventhSeekBar =(SeekBar) view.findViewById(R.id.SeventhSeekBar);
        btnSound1();
        btnSound2();
        btnSound5();
        btnSound7();
        return view;
    }


    //    method btn sound 1
    public void btnSound1(){
        firstSeekBar.setMax(firstTotalTime);
        firstSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if(fromUser){
                    firstMediaPlayer.seekTo(progress);
                    firstSeekBar.setProgress(progress);
                }
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (firstMediaPlayer != null){
                    try {
                        Message msg =new Message();
                        msg.what = firstMediaPlayer.getCurrentPosition();
                        handler.sendMessage(msg);
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                    }
                }
            }
        }).start();
        firstButtonPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!firstMediaPlayer.isPlaying()){
                    firstMediaPlayer.start();
                    firstButtonPlaying.setBackgroundResource(R.drawable.pause_sound);
                }else{
                    firstMediaPlayer.pause();
                    firstButtonPlaying.setBackgroundResource(R.drawable.play_sound);
                }
            }
        });
    }

    private Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            int currentPosition = msg.what;
            firstSeekBar.setProgress(currentPosition);
            String elapsedTime = firstCreateTimeLabel(currentPosition);
            firstElapsedTimeLabel.setText(elapsedTime);
            String remainingTime = firstCreateTimeLabel(firstTotalTime-currentPosition);
            firstRemainingTimeLabel.setText("-" + remainingTime);
        }
    };

    public String firstCreateTimeLabel(int time){
        String timeLabel = "";
        int min = time / 1000 /60;
        int sec =time /1000 % 60;
        timeLabel = min + "";
        if(sec <10) timeLabel +="0";
        timeLabel += sec;
        return timeLabel;
    }


    //    method btn sound 2
    public void btnSound2(){
        secondSeekBar.setMax(secondTotalTime);
        secondSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if(fromUser){
                    secondMediaPlayer.seekTo(progress);
                    secondSeekBar.setProgress(progress);
                }
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (secondMediaPlayer != null){
                    try {
                        Message msg =new Message();
                        msg.what = secondMediaPlayer.getCurrentPosition();
                        handler2.sendMessage(msg);
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                    }
                }
            }
        }).start();
        secondButtonPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!secondMediaPlayer.isPlaying()){
                    secondMediaPlayer.start();
                    secondButtonPlaying.setBackgroundResource(R.drawable.pause_sound);
                }else{
                    secondMediaPlayer.pause();
                    secondButtonPlaying.setBackgroundResource(R.drawable.play_sound);
                }
            }
        });
    }

    private Handler handler2 = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            int currentPosition = msg.what;
            secondSeekBar.setProgress(currentPosition);
            String elapsedTime = secondCreateTimeLabel(currentPosition);
            secondElapsedTimeLabel.setText(elapsedTime);
            String remainingTime = secondCreateTimeLabel(secondTotalTime-currentPosition);
            secondRemainingTimeLabel.setText("-" + remainingTime);
        }
    };

    public String secondCreateTimeLabel(int time){
        String timeLabel = "";
        int min = time / 1000 /60;
        int sec =time /1000 % 60;
        timeLabel = min + "";
        if(sec <10) timeLabel +="0";
        timeLabel += sec;
        return timeLabel;
    }


    //    method btn sound 5
    public void btnSound5(){
        fifthSeekBar.setMax(thirdTotalTime);
        fifthSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if(fromUser){
                    fifthMediaPlayer.seekTo(progress);
                    fifthSeekBar.setProgress(progress);
                }
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (fifthMediaPlayer != null){
                    try {
                        Message msg =new Message();
                        msg.what = fifthMediaPlayer.getCurrentPosition();
                        handler5.sendMessage(msg);
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                    }
                }
            }
        }).start();
        fifthButtonPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!fifthMediaPlayer.isPlaying()){
                    fifthMediaPlayer.start();
                    fifthButtonPlaying.setBackgroundResource(R.drawable.pause_sound);
                }else{
                    fifthMediaPlayer.pause();
                    fifthButtonPlaying.setBackgroundResource(R.drawable.play_sound);
                }
            }
        });
    }

    private Handler handler5 = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            int currentPosition = msg.what;
            fifthSeekBar.setProgress(currentPosition);
            String elapsedTime = fifthCreateTimeLabel(currentPosition);
            fifthElapsedTimeLabel.setText(elapsedTime);
            String remainingTime = fifthCreateTimeLabel(fifthTotalTime-currentPosition);
            fifthRemainingTimeLabel.setText("-" + remainingTime);
        }
    };

    public String fifthCreateTimeLabel(int time){
        String timeLabel = "";
        int min = time / 1000 /60;
        int sec =time /1000 % 60;
        timeLabel = min + "";
        if(sec <10) timeLabel +="0";
        timeLabel += sec;
        return timeLabel;
    }



    //    method btn sound 7
    public void btnSound7(){
        seventhSeekBar.setMax(thirdTotalTime);
        seventhSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if(fromUser){
                    seventhMediaPlayer.seekTo(progress);
                    seventhSeekBar.setProgress(progress);
                }
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (seventhMediaPlayer != null){
                    try {
                        Message msg =new Message();
                        msg.what = seventhMediaPlayer.getCurrentPosition();
                        handler7.sendMessage(msg);
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                    }
                }
            }
        }).start();
        seventhButtonPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!seventhMediaPlayer.isPlaying()){
                    seventhMediaPlayer.start();
                    seventhButtonPlaying.setBackgroundResource(R.drawable.pause_sound);
                }else{
                    seventhMediaPlayer.pause();
                    seventhButtonPlaying.setBackgroundResource(R.drawable.play_sound);
                }
            }
        });
    }

    private Handler handler7 = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            int currentPosition = msg.what;
            seventhSeekBar.setProgress(currentPosition);
            String elapsedTime = fifthCreateTimeLabel(currentPosition);
            seventhElapsedTimeLabel.setText(elapsedTime);
            String remainingTime = fifthCreateTimeLabel(seventhTotalTime-currentPosition);
            seventhRemainingTimeLabel.setText("-" + remainingTime);
        }
    };

    public String seventhCreateTimeLabel(int time){
        String timeLabel = "";
        int min = time / 1000 /60;
        int sec =time /1000 % 60;
        timeLabel = min + "";
        if(sec <10) timeLabel +="0";
        timeLabel += sec;
        return timeLabel;
    }

}