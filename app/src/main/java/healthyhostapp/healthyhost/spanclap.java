package healthyhostapp.healthyhost;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by herda on 10/2/2017.
 */

public class spanclap extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spanclap);
        AudioPlayer.CreateAudioPlayer(this, R.raw.spanish_clap);
    }
}
