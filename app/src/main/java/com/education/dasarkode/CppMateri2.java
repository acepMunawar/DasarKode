package com.education.dasarkode;

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


public class CppMateri2 extends Fragment {
    Button firstButtonPlaying;
    SeekBar firstSeekBar;
    TextView firstElapsedTimeLabel;
    TextView firstRemainingTimeLabel;
    TextView tujuanBelajarAlgoritmaAd;
    TextView penjelasanTujuanBelajarAd;
    TextView definisiJudulAd;
    TextView penjelasanJudulAd;
    TextView definisiContohJudulAD;
    TextView penjelasanContohJudulAD;
    TextView judulPengertianAlgoritmaDeskriptif;
    TextView defenisiPengertianAlgoritmaDes;
    TextView defenisiContohAlgoritmaDes;
    TextView defenisiContohmenhitungjarijari;
    MediaPlayer firstMediaPlayer;
    int firstTotalTime;
    ImageButton imgBtn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cpp_materi2, container, false);
        firstButtonPlaying= (Button) view.findViewById(R.id.FirstBtnPlay);
        firstElapsedTimeLabel = (TextView) view.findViewById(R.id.FirstElapsedTimeLabel);
        firstRemainingTimeLabel = (TextView) view.findViewById(R.id.FirstRemainingTimeLabel);
        firstMediaPlayer = MediaPlayer.create(getActivity(), R.raw.cppfirstmateri);
        firstMediaPlayer.seekTo(0);
        firstTotalTime = firstMediaPlayer.getDuration();
        firstSeekBar =(SeekBar) view.findViewById(R.id.FirstSeekBar);
        imgBtn = (ImageButton) view.findViewById(R.id.back);
        imgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentMenuMateriCpp fragmentTreeMateri = new FragmentMenuMateriCpp();
                FragmentTransaction fragmentTransactionTree = getFragmentManager().beginTransaction();
                fragmentTransactionTree.replace(R.id.fragmentLayoutBelajarCpp,fragmentTreeMateri);
                fragmentTransactionTree.commit();
            }
        });
        btnSound1();
        onTextFontView(view);
        return view;
    }

    private void onTextFontView(View view){
        tujuanBelajarAlgoritmaAd = (TextView) view.findViewById(R.id.TujuanBelajarAlgoritmaAD);
        penjelasanTujuanBelajarAd = (TextView) view.findViewById(R.id.PenjelasanTujuanBelajarAD);
        definisiJudulAd = (TextView) view.findViewById(R.id.DefinisiJudulAD);
        penjelasanJudulAd = (TextView) view.findViewById(R.id.PenjelasanJudulAD);
        definisiContohJudulAD = (TextView) view.findViewById(R.id.DefinisiContohJudulAD);
        penjelasanContohJudulAD = (TextView) view.findViewById(R.id.PenjelasanContohJudulAD);
        judulPengertianAlgoritmaDeskriptif = (TextView) view.findViewById(R.id.JudulPengertianAlgoritmaDeskriptif);
        defenisiPengertianAlgoritmaDes = (TextView) view.findViewById(R.id.DefenisiPengertianAlgoritmaDes);
        defenisiContohAlgoritmaDes = (TextView) view.findViewById(R.id.DefenisiContohAlgoritmaDes);
        defenisiContohmenhitungjarijari = (TextView) view.findViewById(R.id.DefenisiContohmenhitungjarijari);
        Typeface costumeFont = Typeface.createFromAsset(getActivity().getAssets(),"font/timenewroman.otf");
        tujuanBelajarAlgoritmaAd.setTypeface(costumeFont);
        penjelasanTujuanBelajarAd.setTypeface(costumeFont);
        definisiJudulAd.setTypeface(costumeFont);
        penjelasanJudulAd.setTypeface(costumeFont);
        definisiContohJudulAD.setTypeface(costumeFont);
        penjelasanContohJudulAD.setTypeface(costumeFont);
        judulPengertianAlgoritmaDeskriptif.setTypeface(costumeFont);
        defenisiPengertianAlgoritmaDes.setTypeface(costumeFont);
        defenisiContohAlgoritmaDes.setTypeface(costumeFont);
        defenisiContohmenhitungjarijari.setTypeface(costumeFont);
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
