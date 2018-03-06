package healthyhostapp.healthyhost;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import healthyhostapp.healthyhost.R;

/**
 * Created by herda on 11/14/2017.
 */

public class Hmong_Antibiotic_Cephalexin extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hmong_antibiotic_cephalexin);
        AudioPlayer.CreateAudioPlayer(this, R.raw.hmong_cephalexcin);
    }
}