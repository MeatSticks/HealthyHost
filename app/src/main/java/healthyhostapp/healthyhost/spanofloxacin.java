package healthyhostapp.healthyhost;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by herda on 10/5/2017.
 */

public class spanofloxacin extends AppCompatActivity {
    static private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spanofloxacin);

        Button play = (Button) findViewById(R.id.btnPlayAudio);
        play.setOnClickListener(btnClick);
        Button pause = (Button) findViewById(R.id.btnPauseAudio);
        pause.setOnClickListener(btnClick);
        Button reset = (Button) findViewById(R.id.btnResetAudio);
        reset.setOnClickListener(btnClick);

        // load the audio in /raw folder called moonlight
        mediaPlayer = MediaPlayer.create(this, R.raw.spanish_anti_flucloxacillin);
        // loop the audio to play when it ends
        mediaPlayer.setLooping(true);
    }

    // play audio, if it is already playing reset it
    static void playAudio() {
        if(mediaPlayer.isPlaying() == false)
            mediaPlayer.start(); // no need to call prepare(); create() does that for you
        else
            resetAudio();
    }

    // reset audio to 0sec and lay it
    static void resetAudio() {
        mediaPlayer.seekTo(0);
        mediaPlayer.start();
    }

    // pause the video if it is playing
    static void pauseAudio() {
        if(mediaPlayer.isPlaying())
            mediaPlayer.pause();
    }

    // the button click handlers for play, pause, and reset buttons
    final View.OnClickListener btnClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch(view.getId()) {
                case R.id.btnPlayAudio:
                    playAudio();
                    break;
                case R.id.btnPauseAudio:
                    pauseAudio();
                    break;
                case R.id.btnResetAudio:
                    resetAudio();
                    break;
            }
        }
    };
}