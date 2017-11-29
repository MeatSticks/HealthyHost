package healthyhostapp.healthyhost;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by guest on 11/28/17.
 */

public class AudioPlayer {
    private Context context;
    private MediaPlayer mediaPlayer;
    private int audioFile;

    // TODO: should be a singleton
    public AudioPlayer(Context context, int audioFile) {
        this.context = context;
        this.audioFile = audioFile;

        // TODO: check if the audio file is there

        // load the audio in /raw folder called moonlight
        mediaPlayer = MediaPlayer.create(this.context, audioFile);
        // loop the audio to play when it ends
        mediaPlayer.setLooping(true);
    }

    // inserts player interface fragment into the activity's UI
    private void insertPlayerInterface() {

    }

    // insert player interface into specified activity's UI
    public void insertPlayerInterface(Context context) {

    }

    // play audio, if it is already playing reset it
    public void playAudio() {
        if(this.mediaPlayer.isPlaying() == false)
            this.mediaPlayer.start(); // no need to call prepare(); create() does that for you
        else
            resetAudio();
    }

    // reset audio to 0sec and lay it
    public void resetAudio() {
        this.mediaPlayer.seekTo(0);
        this.mediaPlayer.start();
    }

    // pause the video if it is playing
    public void pauseAudio() {
        if(this.mediaPlayer.isPlaying())
            this.mediaPlayer.pause();
    }

    // release media player
    public void releasePlayer() {
        this.mediaPlayer.release();
    }

    // set the audio track that will be played
    public void setTrack() {

    }
}
