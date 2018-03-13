package healthyhostapp.healthyhost;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by herda on 10/3/2017.
 */

public class spanpylori extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spanpylori);
        AudioPlayer.CreateAudioPlayer(this R.raw.spanish__pylori___lime);
    }
}

