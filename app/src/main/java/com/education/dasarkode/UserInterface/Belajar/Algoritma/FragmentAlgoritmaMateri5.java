package com.education.dasarkode.UserInterface.Belajar.Algoritma;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;

import com.education.dasarkode.R;
import com.education.dasarkode.FragmentMenuJava;


public class FragmentAlgoritmaMateri5 extends Fragment {
    Button firstButtonPlaying;
    SeekBar firstSeekBar;
    TextView firstElapsedTimeLabel;
    TextView firstRemainingTimeLabel;
    MediaPlayer firstMediaPlayer;
    int firstTotalTime;
    ImageButton imgBtn;

    TextView JudulPengertianPseudocode;
    TextView PengertianPseudocode;
    TextView JudulTujuanBelajarPseudocode;
    TextView TujuanBelajarPseudocode;
    TextView PengertianADDP;
    TextView JudulPengertianContohPenulisanPseudocode;
    TextView PengertianContohPenulisanPseudocode;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_algoritma_materi5, container, false);
        firstButtonPlaying= (Button) view.findViewById(R.id.FirstBtnPlay);
        firstElapsedTimeLabel = (TextView) view.findViewById(R.id.FirstElapsedTimeLabel);
        firstRemainingTimeLabel = (TextView) view.findViewById(R.id.FirstRemainingTimeLabel);
        firstMediaPlayer = MediaPlayer.create(getActivity(), R.raw.javainstall2);
        firstMediaPlayer.seekTo(0);
        firstTotalTime = firstMediaPlayer.getDuration();
        firstSeekBar =(SeekBar) view.findViewById(R.id.FirstSeekBar);
        imgBtn = (ImageButton) view.findViewById(R.id.back);
        imgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentMenuJava fragmentTreeMateri = new FragmentMenuJava();
                FragmentTransaction fragmentTransactionTree = getFragmentManager().beginTransaction();
                fragmentTransactionTree.replace(R.id.fragmentLayoutBelajarJava,fragmentTreeMateri);
                fragmentTransactionTree.commit();
            }
        });
        btnSound1();
        onFontTextView(view);
        return view;
    }

    private void onFontTextView(View view){
        JudulPengertianPseudocode = (TextView) view.findViewById(R.id.JudulPengertianPseudocode);
        PengertianPseudocode = (TextView) view.findViewById(R.id.PengertianPseudocode);
        JudulTujuanBelajarPseudocode = (TextView) view.findViewById(R.id.JudulTujuanBelajarPseudocode);
        TujuanBelajarPseudocode = (TextView) view.findViewById(R.id.TujuanBelajarPseudocode);
        PengertianADDP = (TextView) view.findViewById(R.id.PengertianADDP);
        JudulPengertianContohPenulisanPseudocode = (TextView) view.findViewById(R.id.JudulPengertianContohPenulisanPseudocode);
        PengertianContohPenulisanPseudocode = (TextView) view.findViewById(R.id.PengertianContohPenulisanPseudocode);

        Typeface costumFont = Typeface.createFromAsset(getActivity().getAssets(),"font/timenewroman.otf");
        JudulPengertianPseudocode.setTypeface(costumFont);
        PengertianPseudocode.setTypeface(costumFont);
        JudulTujuanBelajarPseudocode.setTypeface(costumFont);
        TujuanBelajarPseudocode.setTypeface(costumFont);
        PengertianADDP.setTypeface(costumFont);
        JudulPengertianContohPenulisanPseudocode.setTypeface(costumFont);
        PengertianContohPenulisanPseudocode.setTypeface(costumFont);
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



}
