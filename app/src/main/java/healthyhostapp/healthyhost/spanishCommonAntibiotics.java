package healthyhostapp.healthyhost;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Leo Alonso Cabrera on 4/4/2017.
 */

public class spanishCommonAntibiotics extends AppCompatActivity implements View.OnClickListener{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spanishcommonantibiotics);

        Button spanishlevaquin = (Button) findViewById(R.id.spanishlevaquin);
        spanishlevaquin.setOnClickListener(this); //this is for Antibiotics

        Button spanishpoxycycline = (Button) findViewById(R.id.spanishpoxycycline);
        spanishpoxycycline.setOnClickListener(this); //this is for Antibiotics

        Button spanishamoxcillin = (Button) findViewById(R.id.spanishamoxcillin);
        spanishamoxcillin.setOnClickListener(this);

        Button spanishazythromycin = (Button) findViewById(R.id.spanishazithromycin);
        spanishazythromycin.setOnClickListener(this);

        Button spanishdos_donts = (Button) findViewById(R.id.spanishdodont);
        spanishdos_donts.setOnClickListener(this);

    }
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.spanishlevaquin:
                Intent intent = new Intent(spanishCommonAntibiotics.this, spanishlevaquin.class);
                startActivity(intent);
                break;

            case R.id.spanishpoxycycline:
                Intent intent1 = new Intent(spanishCommonAntibiotics.this, spanishpoxycycline.class);
                startActivity(intent1);
                break;

            case R.id.spanishamoxcillin:
                Intent intent2 = new Intent(spanishCommonAntibiotics.this, spanishamoxcillin.class);
                startActivity(intent2);
                break;

            case R.id.spanishazithromycin:
                Intent intent3 = new Intent(spanishCommonAntibiotics.this, spanishazithromycin.class);
                startActivity(intent3);
                break;

            case R.id.spanishdodont:
                Intent intent4 = new Intent(spanishCommonAntibiotics.this, spanishdos_donts.class);
                startActivity(intent4);
                break;



        }
    }
}