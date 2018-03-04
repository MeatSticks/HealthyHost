package healthyhostapp.healthyhost;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Leo Alonso Cabrera on 2/9/2017.
 */

public class ofloxacin extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ofloxacin);
        AudioPlayer.CreateAudioPlayer(this, R.raw.english_antiobio11);

    }
}
