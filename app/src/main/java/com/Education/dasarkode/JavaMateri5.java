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


public class JavaMateri5 extends Fragment {
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
        View view = inflater.inflate(R.layout.fragment_java_materi5, container, false);
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

        //Fourth sound button
        fourthButtonPlaying = (Button) view.findViewById(R.id.FourthBtnPlay);
        fourthElapsedTimeLabel = (TextView) view.findViewById(R.id.FourthElapsedTimeLabel);
        fourthRemainingTimeLabel = (TextView) view.findViewById(R.id.FourthRemainingTimeLabel);
        fourthMediaPlayer = MediaPlayer.create(getActivity(), R.raw.teshp);
        fourthMediaPlayer.seekTo(0);
        fourthTotalTime = fourthMediaPlayer.getDuration();
        fourthSeekBar =(SeekBar) view.findViewById(R.id.FourthSeekBar);


        //Sixth sound button
        sixthButtonPlaying = (Button) view.findViewById(R.id.SixthBtnPlay);
        sixthElapsedTimeLabel = (TextView) view.findViewById(R.id.SixthElapsedTimeLabel);
        sixthRemainingTimeLabel = (TextView) view.findViewById(R.id.SixthRemainingTimeLabel);
        sixthMediaPlayer = MediaPlayer.create(getActivity(), R.raw.song);
        sixthMediaPlayer.seekTo(0);
        sixthTotalTime = sixthMediaPlayer.getDuration();
        sixthSeekBar =(SeekBar) view.findViewById(R.id.SixthSeekBar);

       //Eigth sound button
        eigthButtonPlaying = (Button) view.findViewById(R.id.EigthBtnPlay);
        eigthElapsedTimeLabel = (TextView) view.findViewById(R.id.EigthElapsedTimeLabel);
        eigthRemainingTimeLabel = (TextView) view.findViewById(R.id.EigthRemainingTimeLabel);
        eigthMediaPlayer = MediaPlayer.create(getActivity(), R.raw.song);
        eigthMediaPlayer.seekTo(0);
        eigthTotalTime = eigthMediaPlayer.getDuration();
        eigthSeekBar =(SeekBar) view.findViewById(R.id.EigthSeekBar);
        btnSound1();
        btnSound2();
        btnSound4();
        btnSound6();
        btnSound8();
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


    //    method btn sound 6
    public void btnSound6(){
        sixthSeekBar.setMax(sixthTotalTime);
        sixthSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if(fromUser){
                    sixthMediaPlayer.seekTo(progress);
                    sixthSeekBar.setProgress(progress);
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
                while (sixthMediaPlayer != null){
                    try {
                        Message msg =new Message();
                        msg.what = sixthMediaPlayer.getCurrentPosition();
                        handler6.sendMessage(msg);
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                    }
                }
            }
        }).start();
        sixthButtonPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!sixthMediaPlayer.isPlaying()){
                    sixthMediaPlayer.start();
                    sixthButtonPlaying.setBackgroundResource(R.drawable.pause_sound);
                }else{
                    sixthMediaPlayer.pause();
                    sixthButtonPlaying.setBackgroundResource(R.drawable.play_sound);
                }
            }
        });
    }

    private Handler handler6 = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            int currentPosition = msg.what;
            sixthSeekBar.setProgress(currentPosition);
            String elapsedTime = sixthCreateTimeLabel(currentPosition);
            sixthElapsedTimeLabel.setText(elapsedTime);
            String remainingTime = sixthCreateTimeLabel(sixthTotalTime-currentPosition);
            sixthRemainingTimeLabel.setText("-" + remainingTime);
        }
    };

    public String sixthCreateTimeLabel(int time){
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

}
