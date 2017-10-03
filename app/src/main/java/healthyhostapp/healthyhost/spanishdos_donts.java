package healthyhostapp.healthyhost;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Leo Alonso Cabrera on 4/5/2017.
 */

public class spanishdos_donts extends AppCompatActivity implements View.OnClickListener{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spanishdodont);
        //set up the buttons and the functionality
        Button spanishdo = (Button) findViewById(R.id.spanishdo);
        spanishdo.setOnClickListener(this); //this is for Antibiotics

        Button spanishdont = (Button) findViewById(R.id.spanishdont);
        spanishdont.setOnClickListener(this); //this is for Antibiotics

    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.spanishdo:
                Intent spanishdo = new Intent(spanishdos_donts.this, spanishdo.class);
                startActivity(spanishdo);
                break;
            case R.id.spanishdont:
                Intent spanishdont = new Intent(spanishdos_donts.this, spanishdont.class);
                startActivity(spanishdont);
                break;
        }
    }

}
