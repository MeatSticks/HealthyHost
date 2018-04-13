package healthyhostapp.healthyhost;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Hmong_Illness_rsv extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hmong_illness_rsv);
        AudioPlayer.CreateAudioPlayer(this, R.raw.hmong_rsv);

    }
}
