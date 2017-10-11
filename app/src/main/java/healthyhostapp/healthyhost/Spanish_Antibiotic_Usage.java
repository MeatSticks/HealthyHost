package healthyhostapp.healthyhost;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by herda on 10/9/2017.
 */

public class Spanish_Antibiotic_Usage extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spanish_antibiotic_usage);

        //set up the buttons and the functionality
        Button proper = (Button) findViewById(R.id.proper);
        proper.setOnClickListener(this); //this is for Antibiotics

        Button improper = (Button) findViewById(R.id.improper);
        improper.setOnClickListener(this); //this is for Antibiotics

    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.proper:
                Intent spanish_antibiotic_proper = new Intent(Spanish_Antibiotic_Usage.this, Spanish_Antibiotic_Proper.class);
                startActivity(spanish_antibiotic_proper);
                break;
            case R.id.improper:
                Intent spanish_antibiotic_improper = new Intent(Spanish_Antibiotic_Usage.this, Spanish_Antibiotic_Improper.class);
                startActivity(spanish_antibiotic_improper);
                break;
        }
    }
}