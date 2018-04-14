package healthyhostapp.healthyhost;

import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by herda on 10/2/2017.
 */

public class spanthroat extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spanthroat);
        AudioPlayer.CreateAudioPlayer(this, R.raw.moonlight);
    }
}
