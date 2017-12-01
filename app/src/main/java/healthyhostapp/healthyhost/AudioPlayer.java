package healthyhostapp.healthyhost;

import android.app.Fragment;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Michael on 11/28/17.
 */

public class AudioPlayer extends Fragment {
    private static AudioPlayer player;
    private Context context;
    private MediaPlayer mediaPlayer;
    private int audioFile;

    public AudioPlayer() {
        // Required empty public constructor
    }

    public AudioPlayer CreateAudioPlayer(Context context, int audioFile) {
        if(player == null) {
            player = new AudioPlayer();
            player.context = context;
            player.audioFile = audioFile;
        }
        return player;
    }

    private void setupMediaPlayer() {
        // load the audio in /raw folder called moonlight
        mediaPlayer = MediaPlayer.create(context, audioFile);
        // loop the audio to play when it ends
        mediaPlayer.setLooping(true);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupMediaPlayer();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_audio_player, container, false);

        Button play = (Button) view.findViewById(R.id.btnPlayAudio);
        play.setOnClickListener(btnClick);
        Button pause = (Button) view.findViewById(R.id.btnPauseAudio);
        pause.setOnClickListener(btnClick);
        Button reset = (Button) view.findViewById(R.id.btnResetAudio);
        reset.setOnClickListener(btnClick);

        return view;
    }

    @Override
    public void onPause() {
        super.onPause();
        mediaPlayer.release();
    }

    @Override
    public void onResume() {
        super.onResume();
        this.setupMediaPlayer();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    // play audio, if it is already playing reset it
    public void playAudio() {
        if(mediaPlayer.isPlaying() == false)
            mediaPlayer.start(); // no need to call prepare(); create() does that for you
        else
            resetAudio();
    }

    // reset audio to 0sec and lay it
    public void resetAudio() {
        mediaPlayer.seekTo(0);
        mediaPlayer.start();
    }

    // pause the video if it is playing
    public void pauseAudio() {
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

    // release media player
    public void releasePlayer() {
        mediaPlayer.release();
    }

    // set the audio track that will be played
    public void setTrack() {
    }
}
