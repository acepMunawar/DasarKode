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

public class CppMateri4 extends Fragment {
    Button firstButtonPlaying,secondButtonPlaying,thirdButtonPlaying,fourthButtonPlaying ;
    SeekBar firstSeekBar,secondSeekBar,thirdSeekBar,fourthSeekBar;
    TextView firstElapsedTimeLabel,secondElapsedTimeLabel,thirdElapsedTimeLabel,fourthElapsedTimeLabel;
    TextView firstRemainingTimeLabel,secondRemainingTimeLabel,thirdRemainingTimeLabel,fourthRemainingTimeLabel;
    MediaPlayer firstMediaPlayer,secondMediaPlayer,thirdMediaPlayer,fourthMediaPlayer;
    int firstTotalTime, secondTotalTime,thirdTotalTime,fourthTotalTime;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cpp_materi4, container, false);

        //first sound button
//        firstButtonPlaying= (Button) view.findViewById(R.id.FirstBtnPlayAD);
//        firstElapsedTimeLabel = (TextView) view.findViewById(R.id.FirstelapsedTimeLabelAD);
//        firstRemainingTimeLabel = (TextView) view.findViewById(R.id.FirstremainingTimeLabelAD);
//        firstMediaPlayer = MediaPlayer.create(getActivity(), R.raw.song);
//        firstMediaPlayer.seekTo(0);
//        firstTotalTime = firstMediaPlayer.getDuration();
//        firstSeekBar =(SeekBar) view.findViewById(R.id.FirstSeekBarAD);

        //second sound button
        secondButtonPlaying= (Button) view.findViewById(R.id.SecondBtnPlayAD);
        secondElapsedTimeLabel = (TextView) view.findViewById(R.id.SecondelapsedTimeLabelAD);
        secondRemainingTimeLabel = (TextView) view.findViewById(R.id.SecondremainingTimeLabelAD);
        secondMediaPlayer = MediaPlayer.create(getActivity(), R.raw.song);
        secondMediaPlayer.seekTo(0);
        secondTotalTime = secondMediaPlayer.getDuration();
        secondSeekBar =(SeekBar) view.findViewById(R.id.SecondSeekBarAD);

        //Third sound button
//        thirdButtonPlaying = (Button) view.findViewById(R.id.ThirdBtnPlayAD);
//        thirdElapsedTimeLabel = (TextView) view.findViewById(R.id.ThirdelapsedTimeLabelAD);
//        thirdRemainingTimeLabel = (TextView) view.findViewById(R.id.ThirdremainingTimeLabelAD);
//        thirdMediaPlayer = MediaPlayer.create(getActivity(), R.raw.song);
//        thirdMediaPlayer.seekTo(0);
//        thirdTotalTime = thirdMediaPlayer.getDuration();
//        thirdSeekBar =(SeekBar) view.findViewById(R.id.ThirdSeekBarAD);

        fourthButtonPlaying = (Button) view.findViewById(R.id.FourthBtnPlayAD);
        fourthElapsedTimeLabel = (TextView) view.findViewById(R.id.FourthelapsedTimeLabelAD);
        fourthRemainingTimeLabel = (TextView) view.findViewById(R.id.FourthremainingTimeLabelAD);
        fourthMediaPlayer = MediaPlayer.create(getActivity(), R.raw.teshp);
        fourthMediaPlayer.seekTo(0);
        fourthTotalTime = fourthMediaPlayer.getDuration();
        fourthSeekBar =(SeekBar) view.findViewById(R.id.FourthSeekBarAD);


//        btnSound1();
        btnSound2();
//        btnSound3();
        btnSound4();

        return view;
    }

//
//    //    method btn sound 1
//    public void btnSound1(){
//        firstSeekBar.setMax(firstTotalTime);
//        firstSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
//            @Override
//            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//                if(fromUser){
//                    firstMediaPlayer.seekTo(progress);
//                    firstSeekBar.setProgress(progress);
//                }
//            }
//            @Override
//            public void onStartTrackingTouch(SeekBar seekBar) {
//            }
//            @Override
//            public void onStopTrackingTouch(SeekBar seekBar) {
//            }
//        });
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while (firstMediaPlayer != null){
//                    try {
//                        Message msg =new Message();
//                        msg.what = firstMediaPlayer.getCurrentPosition();
//                        handler.sendMessage(msg);
//                        Thread.sleep(1000);
//                    }catch (InterruptedException e){
//                    }
//                }
//            }
//        }).start();
//        firstButtonPlaying.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(!firstMediaPlayer.isPlaying()){
//                    firstMediaPlayer.start();
//                    firstButtonPlaying.setBackgroundResource(R.drawable.pause_sound);
//                }else{
//                    firstMediaPlayer.pause();
//                    firstButtonPlaying.setBackgroundResource(R.drawable.play_sound);
//                }
//            }
//        });
//    }
//
//    private Handler handler = new Handler(){
//        @Override
//        public void handleMessage(Message msg) {
//            super.handleMessage(msg);
//            int currentPosition = msg.what;
//            firstSeekBar.setProgress(currentPosition);
//            String elapsedTime = firstCreateTimeLabel(currentPosition);
//            firstElapsedTimeLabel.setText(elapsedTime);
//            String remainingTime = firstCreateTimeLabel(firstTotalTime-currentPosition);
//            firstRemainingTimeLabel.setText("-" + remainingTime);
//        }
//    };
//
//    public String firstCreateTimeLabel(int time){
//        String timeLabel = "";
//        int min = time / 1000 /60;
//        int sec =time /1000 % 60;
//        timeLabel = min + "";
//        if(sec <10) timeLabel +="0";
//        timeLabel += sec;
//        return timeLabel;
//    }
//

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


    //    method btn sound 3
//    public void btnSound3(){
//        thirdSeekBar.setMax(thirdTotalTime);
//        thirdSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
//            @Override
//            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//                if(fromUser){
//                    thirdMediaPlayer.seekTo(progress);
//                    thirdSeekBar.setProgress(progress);
//                }
//            }
//            @Override
//            public void onStartTrackingTouch(SeekBar seekBar) {
//            }
//            @Override
//            public void onStopTrackingTouch(SeekBar seekBar) {
//            }
//        });
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while (thirdMediaPlayer != null){
//                    try {
//                        Message msg =new Message();
//                        msg.what = thirdMediaPlayer.getCurrentPosition();
//                        handler3.sendMessage(msg);
//                        Thread.sleep(1000);
//                    }catch (InterruptedException e){
//                    }
//                }
//            }
//        }).start();
//        thirdButtonPlaying.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(!thirdMediaPlayer.isPlaying()){
//                    thirdMediaPlayer.start();
//                    thirdButtonPlaying.setBackgroundResource(R.drawable.pause_sound);
//                }else{
//                    thirdMediaPlayer.pause();
//                    thirdButtonPlaying.setBackgroundResource(R.drawable.play_sound);
//                }
//            }
//        });
//    }
//
//    private Handler handler3 = new Handler(){
//        @Override
//        public void handleMessage(Message msg) {
//            super.handleMessage(msg);
//            int currentPosition = msg.what;
//            thirdSeekBar.setProgress(currentPosition);
//            String elapsedTime = thirdCreateTimeLabel(currentPosition);
//            thirdElapsedTimeLabel.setText(elapsedTime);
//            String remainingTime = thirdCreateTimeLabel(thirdTotalTime-currentPosition);
//            thirdRemainingTimeLabel.setText("-" + remainingTime);
//        }
//    };
//
//    public String thirdCreateTimeLabel(int time){
//        String timeLabel = "";
//        int min = time / 1000 /60;
//        int sec =time /1000 % 60;
//        timeLabel = min + "";
//        if(sec <10) timeLabel +="0";
//        timeLabel += sec;
//        return timeLabel;
//    }
//

    //    method btn sound 4
    public void btnSound4(){
        fourthSeekBar.setMax(fourthTotalTime);
        fourthSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if(fromUser){
                    fourthMediaPlayer.seekTo(progress);
                    fourthSeekBar.setProgress(progress);
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
                while (fourthMediaPlayer != null){
                    try {
                        Message msg =new Message();
                        msg.what = fourthMediaPlayer.getCurrentPosition();
                        handler4.sendMessage(msg);
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                    }
                }
            }
        }).start();
        fourthButtonPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!fourthMediaPlayer.isPlaying()){
                    fourthMediaPlayer.start();
                    fourthButtonPlaying.setBackgroundResource(R.drawable.pause_sound);
                }else{
                    fourthMediaPlayer.pause();
                    fourthButtonPlaying.setBackgroundResource(R.drawable.play_sound);
                }
            }
        });
    }

    private Handler handler4 = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            int currentPosition = msg.what;
            fourthSeekBar.setProgress(currentPosition);
            String elapsedTime = fourthCreateTimeLabel(currentPosition);
            fourthElapsedTimeLabel.setText(elapsedTime);
            String remainingTime = fourthCreateTimeLabel(fourthTotalTime-currentPosition);
            fourthRemainingTimeLabel.setText("-" + remainingTime);
        }
    };

    public String fourthCreateTimeLabel(int time){
        String timeLabel = "";
        int min = time / 1000 /60;
        int sec =time /1000 % 60;
        timeLabel = min + "";
        if(sec <10) timeLabel +="0";
        timeLabel += sec;
        return timeLabel;
    }



}