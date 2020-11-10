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


public class FragmentAlgoritmaMateri3 extends Fragment {
    Button firstButtonPlaying;
    SeekBar firstSeekBar;
    TextView firstElapsedTimeLabel;
    TextView firstRemainingTimeLabel;
    MediaPlayer firstMediaPlayer;
    int firstTotalTime;
    ImageButton imgBtn;
    TextView TujuanBelajarAlgoritmaAD;
    TextView PenjelasanTujuanBelajarAD;
    TextView KalimatDeskriptif;
    TextView PenjelasanKalimatDeskrip;
    TextView DefinisiAD;
    TextView PenjelasanAD;
    TextView DefinisiJudulAD;
    TextView PenjelasanJudulAD;
    TextView DefinisiContohJudulAD;
    TextView PenjelasanContohJudulAD;
    TextView JudulPengertianAlgoritmaDeskriptif;
    TextView DefenisiPengertianAlgoritmaDes;
    TextView DefenisiContohAlgoritmaDes;
    TextView DefenisiContohmenhitungjarijari;
    TextView DefenisiContohdeskripsiAD;
    TextView DefenisiContohpenggunaandeskripsiAD;
    TextView PenjelasanADPK;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_algoritma_materi3, container, false);
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
        TujuanBelajarAlgoritmaAD = (TextView) view.findViewById(R.id.TujuanBelajarAlgoritmaAD);
        PenjelasanTujuanBelajarAD = (TextView) view.findViewById(R.id.PenjelasanTujuanBelajarAD);
        KalimatDeskriptif = (TextView) view.findViewById(R.id.KalimatDeskriptif);
        PenjelasanKalimatDeskrip = (TextView) view.findViewById(R.id.PenjelasanKalimatDeskrip);
        DefinisiAD = (TextView) view.findViewById(R.id.DefinisiAD);
        PenjelasanAD = (TextView) view.findViewById(R.id.PenjelasanAD);
        DefinisiJudulAD = (TextView) view.findViewById(R.id.DefinisiJudulAD);
        PenjelasanJudulAD = (TextView) view.findViewById(R.id.PenjelasanJudulAD);
        DefinisiContohJudulAD = (TextView) view.findViewById(R.id.DefinisiContohJudulAD);
        PenjelasanContohJudulAD = (TextView) view.findViewById(R.id.PenjelasanContohJudulAD);
        JudulPengertianAlgoritmaDeskriptif = (TextView) view.findViewById(R.id.JudulPengertianAlgoritmaDeskriptif);
        DefenisiPengertianAlgoritmaDes = (TextView) view.findViewById(R.id.DefenisiPengertianAlgoritmaDes);
        DefenisiContohAlgoritmaDes = (TextView) view.findViewById(R.id.DefenisiContohAlgoritmaDes);
        DefenisiContohmenhitungjarijari = (TextView) view.findViewById(R.id.DefenisiContohmenhitungjarijari);
        DefenisiContohdeskripsiAD = (TextView) view.findViewById(R.id.DefenisiContohdeskripsiAD);
        DefenisiContohmenhitungjarijari = (TextView) view.findViewById(R.id.DefenisiContohmenhitungjarijari);
        DefenisiContohpenggunaandeskripsiAD = (TextView) view.findViewById(R.id.DefenisiContohpenggunaandeskripsiAD);
        PenjelasanADPK = (TextView) view.findViewById(R.id.PenjelasanADPK);

        Typeface costumFont = Typeface.createFromAsset(getActivity().getAssets(),"font/timenewroman.otf");
        TujuanBelajarAlgoritmaAD.setTypeface(costumFont);
        PenjelasanTujuanBelajarAD.setTypeface(costumFont);
        KalimatDeskriptif.setTypeface(costumFont);
        PenjelasanKalimatDeskrip.setTypeface(costumFont);
        DefinisiAD.setTypeface(costumFont);
        PenjelasanAD.setTypeface(costumFont);
        DefinisiJudulAD.setTypeface(costumFont);
        PenjelasanJudulAD.setTypeface(costumFont);
        DefinisiContohJudulAD.setTypeface(costumFont);
        PenjelasanContohJudulAD.setTypeface(costumFont);
        JudulPengertianAlgoritmaDeskriptif.setTypeface(costumFont);
        DefenisiPengertianAlgoritmaDes.setTypeface(costumFont);
        DefenisiContohmenhitungjarijari.setTypeface(costumFont);
        DefenisiContohpenggunaandeskripsiAD.setTypeface(costumFont);
        PenjelasanADPK.setTypeface(costumFont);
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
