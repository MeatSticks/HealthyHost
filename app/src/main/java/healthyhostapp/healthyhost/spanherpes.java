package healthyhostapp.healthyhost;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Leo Alonso Cabrera on 4/4/2017.
 */

public class spanherpes extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spanherpes);
        AudioPlayer.CreateAudioPlayer(this, R.raw.spanish_herpes);
    }
}
