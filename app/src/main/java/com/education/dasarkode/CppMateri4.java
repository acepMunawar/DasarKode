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

        //second sound button
//        secondButtonPlaying= (Button) view.findViewById(R.id.SecondBtnPlayAD);
//        secondElapsedTimeLabel = (TextView) view.findViewById(R.id.SecondelapsedTimeLabelAD);
//        secondRemainingTimeLabel = (TextView) view.findViewById(R.id.SecondremainingTimeLabelAD);
//        secondMediaPlayer = MediaPlayer.create(getActivity(), R.raw.song);
//        secondMediaPlayer.seekTo(0);
//        secondTotalTime = secondMediaPlayer.getDuration();
//        secondSeekBar =(SeekBar) view.findViewById(R.id.SecondSeekBarAD);
//
//        fourthButtonPlaying = (Button) view.findViewById(R.id.FourthBtnPlayAD);
//        fourthElapsedTimeLabel = (TextView) view.findViewById(R.id.FourthelapsedTimeLabelAD);
//        fourthRemainingTimeLabel = (TextView) view.findViewById(R.id.FourthremainingTimeLabelAD);
//        fourthMediaPlayer = MediaPlayer.create(getActivity(), R.raw.teshp);
//        fourthMediaPlayer.seekTo(0);
//        fourthTotalTime = fourthMediaPlayer.getDuration();
//        fourthSeekBar =(SeekBar) view.findViewById(R.id.FourthSeekBarAD);

//        btnSound2();
//        btnSound4();

        return view;
    }

    //    method btn sound 2
//    public void btnSound2(){
//        secondSeekBar.setMax(secondTotalTime);
//        secondSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
//            @Override
//            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//                if(fromUser){
//                    secondMediaPlayer.seekTo(progress);
//                    secondSeekBar.setProgress(progress);
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
//                while (secondMediaPlayer != null){
//                    try {
//                        Message msg =new Message();
//                        msg.what = secondMediaPlayer.getCurrentPosition();
//                        handler2.sendMessage(msg);
//                        Thread.sleep(1000);
//                    }catch (InterruptedException e){
//                    }
//                }
//            }
//        }).start();
//        secondButtonPlaying.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(!secondMediaPlayer.isPlaying()){
//                    secondMediaPlayer.start();
//                    secondButtonPlaying.setBackgroundResource(R.drawable.pause_sound);
//                }else{
//                    secondMediaPlayer.pause();
//                    secondButtonPlaying.setBackgroundResource(R.drawable.play_sound);
//                }
//            }
//        });
//    }
//
//    private Handler handler2 = new Handler(){
//        @Override
//        public void handleMessage(Message msg) {
//            super.handleMessage(msg);
//            int currentPosition = msg.what;
//            secondSeekBar.setProgress(currentPosition);
//            String elapsedTime = secondCreateTimeLabel(currentPosition);
//            secondElapsedTimeLabel.setText(elapsedTime);
//            String remainingTime = secondCreateTimeLabel(secondTotalTime-currentPosition);
//            secondRemainingTimeLabel.setText("-" + remainingTime);
//        }
//    };
//
//    public String secondCreateTimeLabel(int time){
//        String timeLabel = "";
//        int min = time / 1000 /60;
//        int sec =time /1000 % 60;
//        timeLabel = min + "";
//        if(sec <10) timeLabel +="0";
//        timeLabel += sec;
//        return timeLabel;
//    }
//
//
//    //    method btn sound 4
//    public void btnSound4(){
//        fourthSeekBar.setMax(fourthTotalTime);
//        fourthSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
//            @Override
//            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//                if(fromUser){
//                    fourthMediaPlayer.seekTo(progress);
//                    fourthSeekBar.setProgress(progress);
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
//                while (fourthMediaPlayer != null){
//                    try {
//                        Message msg =new Message();
//                        msg.what = fourthMediaPlayer.getCurrentPosition();
//                        handler4.sendMessage(msg);
//                        Thread.sleep(1000);
//                    }catch (InterruptedException e){
//                    }
//                }
//            }
//        }).start();
//        fourthButtonPlaying.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(!fourthMediaPlayer.isPlaying()){
//                    fourthMediaPlayer.start();
//                    fourthButtonPlaying.setBackgroundResource(R.drawable.pause_sound);
//                }else{
//                    fourthMediaPlayer.pause();
//                    fourthButtonPlaying.setBackgroundResource(R.drawable.play_sound);
//                }
//            }
//        });
//    }
//
//    private Handler handler4 = new Handler(){
//        @Override
//        public void handleMessage(Message msg) {
//            super.handleMessage(msg);
//            int currentPosition = msg.what;
//            fourthSeekBar.setProgress(currentPosition);
//            String elapsedTime = fourthCreateTimeLabel(currentPosition);
//            fourthElapsedTimeLabel.setText(elapsedTime);
//            String remainingTime = fourthCreateTimeLabel(fourthTotalTime-currentPosition);
//            fourthRemainingTimeLabel.setText("-" + remainingTime);
//        }
//    };
//
//    public String fourthCreateTimeLabel(int time){
//        String timeLabel = "";
//        int min = time / 1000 /60;
//        int sec =time /1000 % 60;
//        timeLabel = min + "";
//        if(sec <10) timeLabel +="0";
//        timeLabel += sec;
//        return timeLabel;
//    }

}
