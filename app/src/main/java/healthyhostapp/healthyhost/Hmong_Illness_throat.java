package healthyhostapp.healthyhost;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Hmong_Illness_throat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hmong_illness_throat);
        AudioPlayer.CreateAudioPlayer(this, R.raw.hmong_strepthroat);

    }
}
