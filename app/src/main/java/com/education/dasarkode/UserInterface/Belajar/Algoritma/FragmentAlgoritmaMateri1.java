package com.education.dasarkode.UserInterface.Belajar.Algoritma;

import android.graphics.Typeface;
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
import android.media.MediaPlayer;
import com.education.dasarkode.R;
import com.education.dasarkode.FragmentMenuJava;

public class FragmentAlgoritmaMateri1 extends Fragment {
    Button firstButtonPlaying;
    SeekBar firstSeekBar;
    TextView firstElapsedTimeLabel;
    TextView firstRemainingTimeLabel;
    MediaPlayer firstMediaPlayer;
    int firstTotalTime;
    ImageButton imgBtn;
    TextView tujuanBelajarAlgoritma;
    TextView PenjelasanTujuanBelajarLA;
    TextView logikaDanAlgoritma;
    TextView definisiLogikaDanAlgoritma;
    TextView logika;
    TextView definisiL;
    TextView algoritma;
    TextView definisiAlgoritma;
    TextView studiKasus;
    TextView FirststudiKasus;
    TextView penyelesaianMasalahJawaban;
    TextView KasusKedua;
    TextView SolusiAlgoritma;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_algoritma_materi1, container, false);
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
        tujuanBelajarAlgoritma = (TextView) view.findViewById(R.id.TujuanBelajarAlgoritma);
        PenjelasanTujuanBelajarLA = (TextView) view.findViewById(R.id.PenjelasanTujuanBelajarLA);
        logikaDanAlgoritma = (TextView) view.findViewById(R.id.logikaDanAlgoritma);
        definisiLogikaDanAlgoritma = (TextView) view.findViewById(R.id.definisiLogikaDanAlgoritma);
        logika = (TextView) view.findViewById(R.id.logika);
        definisiL = (TextView) view.findViewById(R.id.definisiL);
        algoritma = (TextView) view.findViewById(R.id.algoritma);
        definisiAlgoritma = (TextView) view.findViewById(R.id.definisiAlgoritma);
        studiKasus = (TextView) view.findViewById(R.id.studiKasus);
        FirststudiKasus = (TextView) view.findViewById(R.id.FirststudiKasus);
        penyelesaianMasalahJawaban = (TextView) view.findViewById(R.id.penyelesaianMasalahJawaban);
        KasusKedua = (TextView) view.findViewById(R.id.KasusKedua);
        SolusiAlgoritma = (TextView) view.findViewById(R.id.SolusiAlgoritma);

        Typeface costumFont = Typeface.createFromAsset(getActivity().getAssets(),"font/timenewroman.otf");
        tujuanBelajarAlgoritma.setTypeface(costumFont);
        PenjelasanTujuanBelajarLA.setTypeface(costumFont);
        logikaDanAlgoritma.setTypeface(costumFont);
        definisiLogikaDanAlgoritma.setTypeface(costumFont);
        logika.setTypeface(costumFont);
        definisiL.setTypeface(costumFont);
        algoritma.setTypeface(costumFont);
        definisiAlgoritma.setTypeface(costumFont);
        studiKasus.setTypeface(costumFont);
        FirststudiKasus.setTypeface(costumFont);
        penyelesaianMasalahJawaban.setTypeface(costumFont);
        KasusKedua.setTypeface(costumFont);
        SolusiAlgoritma.setTypeface(costumFont);
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
