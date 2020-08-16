package com.Education.dasarkode.UserInterface.Belajar.Algoritma;

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
import android.media.MediaPlayer;
import com.Education.dasarkode.R;

public class FragmentAlgoritmaMateri1 extends Fragment {
    Button FirstButtonPlaying;
    SeekBar firstSeekBar;
    TextView ElapsedTimeLabel;
    TextView RemainingTimeLabel;
    MediaPlayer FirstMediaPlayer;
    int totalTime;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        View view = inflater.inflate(R.layout.fragment_algoritma_materi1, container, false);
        FirstButtonPlaying= (Button) view.findViewById(R.id.FirstBtnPlay);
        ElapsedTimeLabel = (TextView) view.findViewById(R.id.elapsedTimeLabel);
        RemainingTimeLabel = (TextView) view.findViewById(R.id.remainingTimeLabel);
        FirstMediaPlayer = MediaPlayer.create(getActivity(), R.raw.tes);
        FirstMediaPlayer.seekTo(0);
        totalTime = FirstMediaPlayer.getDuration();

        firstSeekBar =(SeekBar) view.findViewById(R.id.FirstSeekBar);
        firstSeekBar.setMax(totalTime);
        firstSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if(fromUser){
                    FirstMediaPlayer.seekTo(progress);
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
                    while (FirstMediaPlayer != null){
                        try {
                            Message msg =new Message();
                            msg.what = FirstMediaPlayer.getCurrentPosition();
                            handler.sendMessage(msg);
                            Thread.sleep(1000);
                        }catch (InterruptedException e){

                        }
                    }
                }

            }).start();

        FirstButtonPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!FirstMediaPlayer.isPlaying()){
                    FirstMediaPlayer.start();
                    FirstButtonPlaying.setBackgroundResource(R.drawable.pause_sound);
                }else{
                    FirstMediaPlayer.pause();
                    FirstButtonPlaying.setBackgroundResource(R.drawable.play_sound);
                }
            }
        });

            return view;
    }

private Handler handler = new Handler(){
    @Override
    public void handleMessage(Message msg) {
        super.handleMessage(msg);
        int currentPosition = msg.what;
            firstSeekBar.setProgress(currentPosition);
            String elapsedTime = createTimeLabel(currentPosition);
            ElapsedTimeLabel.setText(elapsedTime);

            String remainingTime = createTimeLabel(totalTime-currentPosition);
            RemainingTimeLabel.setText("-" + remainingTime);
    }
};

public String createTimeLabel(int time){
         String timeLabel = "";
         int min = time / 1000 /60;
         int sec =time /1000 % 60;
                timeLabel = min + "";
            if(sec <10) timeLabel +="0";
                timeLabel += sec;

        return timeLabel;
}

//    public void playBtnClick(View view){
//            if(!FirstMediaPlayer.isPlaying()){
//                FirstMediaPlayer.start();
//                FirstButtonPlaying.setBackgroundResource(R.drawable.pause_sound);
//            }else{
//                FirstMediaPlayer.pause();
//                FirstButtonPlaying.setBackgroundResource(R.drawable.play_sound);
//            }
//    }




}
