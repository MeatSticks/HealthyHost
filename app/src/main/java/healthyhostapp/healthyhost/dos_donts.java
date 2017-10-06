package healthyhostapp.healthyhost;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Leo Alonso Cabrera on 11/28/2016.
 */

public class dos_donts extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.do_dont);

        //set up the buttons and the functionality
        Button dos = (Button) findViewById(R.id.dos);
        dos.setOnClickListener(this); //this is for Antibiotics

        Button dont = (Button) findViewById(R.id.dont);
        dont.setOnClickListener(this); //this is for Antibiotics

    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.dos:
                Intent dos = new Intent(dos_donts.this, dos.class);
                startActivity(dos);
                break;
            case R.id.dont:
                Intent dont = new Intent(dos_donts.this, dont.class);
                startActivity(dont);
                break;
        }
    }
}