package healthyhostapp.healthyhost;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by herda on 11/16/2017.
 */

public class Hmong_Antibiotic_Metronidazole extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hmong_antibiotic_metronidazole);
        AudioPlayer.CreateAudioPlayer(this, R.raw.hmong_metronidazole);
    }
}
