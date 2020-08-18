package com.Education.dasarkode;

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


public class PyMateri5 extends Fragment {
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
        View view = inflater.inflate(R.layout.fragment_py_materi5, container, false);

        //first sound button
        firstButtonPlaying= (Button) view.findViewById(R.id.FirstBtnPlay);
        firstElapsedTimeLabel = (TextView) view.findViewById(R.id.FirstElapsedTimeLabel);
        firstRemainingTimeLabel = (TextView) view.findViewById(R.id.FirstRemainingTimeLabel);
        firstMediaPlayer = MediaPlayer.create(getActivity(), R.raw.song);
        firstMediaPlayer.seekTo(0);
        firstTotalTime = firstMediaPlayer.getDuration();
        firstSeekBar =(SeekBar) view.findViewById(R.id.FirstSeekBar);


        //Third sound button
        thirdButtonPlaying = (Button) view.findViewById(R.id.ThirdBtnPlay);
        thirdElapsedTimeLabel = (TextView) view.findViewById(R.id.ThirdElapsedTimeLabel);
        thirdRemainingTimeLabel = (TextView) view.findViewById(R.id.ThirdRemainingTimeLabel);
        thirdMediaPlayer = MediaPlayer.create(getActivity(), R.raw.song);
        thirdMediaPlayer.seekTo(0);
        thirdTotalTime = thirdMediaPlayer.getDuration();
        thirdSeekBar =(SeekBar) view.findViewById(R.id.ThirdSeekBar);


        //fifth sound Button
        fifthButtonPlaying = (Button) view.findViewById(R.id.FifthBtnPlay);
        fifthElapsedTimeLabel = (TextView) view.findViewById(R.id.FifthElapsedTimeLabel);
        fifthRemainingTimeLabel = (TextView) view.findViewById(R.id.FifthRemainingTimeLabel);
        fifthMediaPlayer = MediaPlayer.create(getActivity(), R.raw.song);
        fifthMediaPlayer.seekTo(0);
        fifthTotalTime = fifthMediaPlayer.getDuration();
        fifthSeekBar =(SeekBar) view.findViewById(R.id.FifthSeekBar);

        //Eigth sound button
        eigthButtonPlaying = (Button) view.findViewById(R.id.EigthBtnPlay);
        eigthElapsedTimeLabel = (TextView) view.findViewById(R.id.EigthElapsedTimeLabel);
        eigthRemainingTimeLabel = (TextView) view.findViewById(R.id.EigthRemainingTimeLabel);
        eigthMediaPlayer = MediaPlayer.create(getActivity(), R.raw.song);
        eigthMediaPlayer.seekTo(0);
        eigthTotalTime = eigthMediaPlayer.getDuration();
        eigthSeekBar =(SeekBar) view.findViewById(R.id.EigthSeekBar);

        btnSound1();
        btnSound5();
        btnSound8();
        btnSound3();
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


    //    method btn sound 8
    public void btnSound8(){
        eigthSeekBar.setMax(eigthTotalTime);
        eigthSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if(fromUser){
                    eigthMediaPlayer.seekTo(progress);
                    eigthSeekBar.setProgress(progress);
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
                while (eigthMediaPlayer != null){
                    try {
                        Message msg =new Message();
                        msg.what = eigthMediaPlayer.getCurrentPosition();
                        handler8.sendMessage(msg);
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                    }
                }
            }
        }).start();
        eigthButtonPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!eigthMediaPlayer.isPlaying()){
                    eigthMediaPlayer.start();
                    eigthButtonPlaying.setBackgroundResource(R.drawable.pause_sound);
                }else{
                    eigthMediaPlayer.pause();
                    eigthButtonPlaying.setBackgroundResource(R.drawable.play_sound);
                }
            }
        });
    }

    private Handler handler8 = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            int currentPosition = msg.what;
            eigthSeekBar.setProgress(currentPosition);
            String elapsedTime = eigthCreateTimeLabel(currentPosition);
            eigthElapsedTimeLabel.setText(elapsedTime);
            String remainingTime = eigthCreateTimeLabel(eigthTotalTime-currentPosition);
            eigthRemainingTimeLabel.setText("-" + remainingTime);
        }
    };

    public String eigthCreateTimeLabel(int time){
        String timeLabel = "";
        int min = time / 1000 /60;
        int sec =time /1000 % 60;
        timeLabel = min + "";
        if(sec <10) timeLabel +="0";
        timeLabel += sec;
        return timeLabel;
    }

    //    method btn sound 3
    public void btnSound3(){
        thirdSeekBar.setMax(thirdTotalTime);
        thirdSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if(fromUser){
                    thirdMediaPlayer.seekTo(progress);
                    thirdSeekBar.setProgress(progress);
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
                while (thirdMediaPlayer != null){
                    try {
                        Message msg =new Message();
                        msg.what = thirdMediaPlayer.getCurrentPosition();
                        handler3.sendMessage(msg);
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                    }
                }
            }
        }).start();
        thirdButtonPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!thirdMediaPlayer.isPlaying()){
                    thirdMediaPlayer.start();
                    thirdButtonPlaying.setBackgroundResource(R.drawable.pause_sound);
                }else{
                    thirdMediaPlayer.pause();
                    thirdButtonPlaying.setBackgroundResource(R.drawable.play_sound);
                }
            }
        });
    }

    private Handler handler3 = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            int currentPosition = msg.what;
            thirdSeekBar.setProgress(currentPosition);
            String elapsedTime = thirdCreateTimeLabel(currentPosition);
            thirdElapsedTimeLabel.setText(elapsedTime);
            String remainingTime = thirdCreateTimeLabel(thirdTotalTime-currentPosition);
            thirdRemainingTimeLabel.setText("-" + remainingTime);
        }
    };

    public String thirdCreateTimeLabel(int time){
        String timeLabel = "";
        int min = time / 1000 /60;
        int sec =time /1000 % 60;
        timeLabel = min + "";
        if(sec <10) timeLabel +="0";
        timeLabel += sec;
        return timeLabel;
    }


}