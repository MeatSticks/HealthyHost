package healthyhostapp.healthyhost;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by herda on 11/29/2017.
 */

public class Hmong_Illness_H_Pylori extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hmong_illness_chylamydia);
        AudioPlayer.CreateAudioPlayer(this, R.raw.hmong_hpylori);
    }
}