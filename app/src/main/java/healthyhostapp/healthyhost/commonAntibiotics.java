package healthyhostapp.healthyhost;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import android.widget.Button;


/**
 * Created by Leo Alonso Cabrera on 11/27/2016.
 */

public class commonAntibiotics extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.commonantibiotics);

        //set up the buttons and the functionality
        Button levaquin = (Button) findViewById(R.id.levaquin);
        levaquin.setOnClickListener(this); //this is for Antibiotics

        Button poxycycline = (Button) findViewById(R.id.poxycycline);
        poxycycline.setOnClickListener(this); //this is for Antibiotics

        Button amoxcillin = (Button) findViewById(R.id.amoxcillin);
        amoxcillin.setOnClickListener(this);

        Button azythromycin = (Button) findViewById(R.id.azithromycin);
        azythromycin.setOnClickListener(this);

        Button metronidazole = (Button) findViewById(R.id.metronidazole);
        metronidazole.setOnClickListener(this);

        Button erythromycin = (Button) findViewById(R.id.erythromycin);
        erythromycin.setOnClickListener(this);

        Button cephalexin = (Button) findViewById(R.id.cephalexin);
        cephalexin.setOnClickListener(this);

        Button flucloxacillin = (Button) findViewById(R.id.flucloxacillin);
        flucloxacillin.setOnClickListener(this);

        Button ceftriaxone = (Button) findViewById(R.id.ceftriaxone);
        ceftriaxone.setOnClickListener(this);

        Button gpill = (Button) findViewById(R.id.gpill);
        gpill.setOnClickListener(this);

        Button ofloxacin = (Button) findViewById(R.id.ofloxacin);
        ofloxacin.setOnClickListener(this);

        Button dos_donts = (Button) findViewById(R.id.button3);
        dos_donts.setOnClickListener(this);

        Button home_page = (Button) findViewById(R.id.homepage);
        home_page.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.levaquin:
                Intent intent = new Intent(commonAntibiotics.this, levaquin.class);
                startActivity(intent);
                break;

            case R.id.poxycycline:
                Intent intent1 = new Intent(commonAntibiotics.this, doxycycline.class);
                startActivity(intent1);
                break;

            case R.id.amoxcillin:
                Intent intent2 = new Intent(commonAntibiotics.this, amoxcillin.class);
                startActivity(intent2);
                break;

            case R.id.azithromycin:
                Intent intent3 = new Intent(commonAntibiotics.this, azythromycin.class);
                startActivity(intent3);
                break;

            case R.id.metronidazole:
                Intent intent4 = new Intent(commonAntibiotics.this, metronidazole.class);
                startActivity(intent4);
                break;

            case R.id.erythromycin:
                Intent intent5 = new Intent(commonAntibiotics.this, erythromycin.class);
                startActivity(intent5);
                break;

            case R.id.cephalexin:
                Intent intent6 = new Intent(commonAntibiotics.this, cephalexin.class);
                startActivity(intent6);
                break;

            case R.id.flucloxacillin:
                Intent intent7 = new Intent(commonAntibiotics.this, flucloxacillin.class);
                startActivity(intent7);
                break;

            case R.id.ceftriaxone:
                Intent intent8 = new Intent(commonAntibiotics.this, ceftriaxone.class);
                startActivity(intent8);
                break;

            case R.id.gpill:
                Intent intent9 = new Intent(commonAntibiotics.this, penicilling.class);
                startActivity(intent9);
                break;

            case R.id.ofloxacin:
                Intent intent10 = new Intent(commonAntibiotics.this, ofloxacin.class);
                startActivity(intent10);
                break;

            case R.id.button3:
                Intent intent11 = new Intent(commonAntibiotics.this, dos_donts.class);
                startActivity(intent11);
                break;

            case R.id.homepage:
                Intent intent12 = new Intent (commonAntibiotics.this, homePage.class);
                startActivity(intent12);

        }
    }
}
