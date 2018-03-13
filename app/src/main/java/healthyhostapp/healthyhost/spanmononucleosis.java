package healthyhostapp.healthyhost;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Leo Alonso Cabrera on 4/4/2017.
 */

public class spanmononucleosis extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spanmononucleosis);
        AudioPlayer.CreateAudioPlayer(this R.raw.spanish__ear___mono)
    }
}
