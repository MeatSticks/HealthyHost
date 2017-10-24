package healthyhostapp.healthyhost;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Leo Alonso Cabrera on 2/6/2017.
 */

public class amoxcillin extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.amoxcillin);

        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.moonlight);
        mediaPlayer.start(); // no need to call prepare(); create() does that for you
    }
}
