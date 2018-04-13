package healthyhostapp.healthyhost;

import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Leo Alonso Cabrera on 4/4/2017.
 */

public class spanimpetigo extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spanimpetigo);
        AudioPlayer.CreateAudioPlayer(this, R.raw.spanish_impetigo);
    }
}
