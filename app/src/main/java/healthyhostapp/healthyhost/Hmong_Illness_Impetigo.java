package healthyhostapp.healthyhost;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Hmong_Illness_Impetigo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hmong_illness_impetigo);
        AudioPlayer.CreateAudioPlayer(this, R.raw.hmong_impetigo);
    }
}
