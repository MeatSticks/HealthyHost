package healthyhostapp.healthyhost;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by herda on 10/5/2017.
 */

public class spanflucloxacillin extends AppCompatActivity {
    static private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spanflucloxacillin);
        AudioPlayer.CreateAudioPlayer(this, R.raw.spanish_anti_flucloxacillin);
    }
}