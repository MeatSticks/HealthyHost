package healthyhostapp.healthyhost;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by herda on 10/2/2017.
 */
public class spanrsv extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spanrsv);
        AudioPlayer.CreateAudioPlayer(this R.raw.moonlight)
    }
}

