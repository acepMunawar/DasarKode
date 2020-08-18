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


public class PyMateri4 extends Fragment {
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
        View view = inflater.inflate(R.layout.fragment_py_materi4, container, false);
        //first sound button
        firstButtonPlaying= (Button) view.findViewById(R.id.FirstBtnPlay);
        firstElapsedTimeLabel = (TextView) view.findViewById(R.id.FirstElapsedTimeLabel);
        firstRemainingTimeLabel = (TextView) view.findViewById(R.id.FirstRemainingTimeLabel);
        firstMediaPlayer = MediaPlayer.create(getActivity(), R.raw.song);
        firstMediaPlayer.seekTo(0);
        firstTotalTime = firstMediaPlayer.getDuration();
        firstSeekBar =(SeekBar) view.findViewById(R.id.FirstSeekBar);

        //Seventh sound button
        seventhButtonPlaying = (Button) view.findViewById(R.id.SeventhBtnPlay);
        seventhElapsedTimeLabel = (TextView) view.findViewById(R.id.SeventhElapsedTimeLabel);
        seventhRemainingTimeLabel = (TextView) view.findViewById(R.id.SeventhRemainingTimeLabel);
        seventhMediaPlayer = MediaPlayer.create(getActivity(), R.raw.song);
        seventhMediaPlayer.seekTo(0);
        seventhTotalTime = seventhMediaPlayer.getDuration();
        seventhSeekBar =(SeekBar) view.findViewById(R.id.SeventhSeekBar);

        //Eigth sound button
        eigthButtonPlaying = (Button) view.findViewById(R.id.EigthBtnPlay);
        eigthElapsedTimeLabel = (TextView) view.findViewById(R.id.EigthElapsedTimeLabel);
        eigthRemainingTimeLabel = (TextView) view.findViewById(R.id.EigthRemainingTimeLabel);
        eigthMediaPlayer = MediaPlayer.create(getActivity(), R.raw.song);
        eigthMediaPlayer.seekTo(0);
        eigthTotalTime = eigthMediaPlayer.getDuration();
        eigthSeekBar =(SeekBar) view.findViewById(R.id.EigthSeekBar);
        btnSound1();
        btnSound7();
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
            String elapsedTime = seventhCreateTimeLabel(currentPosition);
            seventhElapsedTimeLabel.setText(elapsedTime);
            String remainingTime = seventhCreateTimeLabel(seventhTotalTime-currentPosition);
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