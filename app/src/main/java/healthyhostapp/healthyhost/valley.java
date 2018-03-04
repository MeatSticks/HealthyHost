package healthyhostapp.healthyhost;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Leo Alonso Cabrera on 2/7/2017.
 */

public class valley extends AppCompatActivity {

    static private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.valley);

        AudioPlayer.CreateAudioPlayer(this, R.raw.english_bactirial_infection_in_the_centtral_valley);

    }

}

