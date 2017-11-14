package healthyhostapp.healthyhost;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import android.widget.Button;


/**
 * Created by Danny Her on 11/7/2016.
 */

public class Hmong_Antibiotics extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hmong_antibiotics);

        //set up the buttons and the functionality
        Button hmong_levaquin = (Button) findViewById(R.id.Hmong_Levaquin);
        hmong_levaquin.setOnClickListener(this); //this is for Antibiotics

        Button hmong_antibiotic_erythromycin = (Button) findViewById(R.id.Hmong_Erythromycin);
        hmong_antibiotic_erythromycin.setOnClickListener(this);

        /*Button poxycycline = (Button) findViewById(R.id.poxycycline);
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
        ofloxacin.setOnClickListener(this);*/

        Button hmong_antibiotic_usage = (Button) findViewById(R.id.Antibiotic_Usage);
        hmong_antibiotic_usage.setOnClickListener(this);

        Button hmong_homepage = (Button) findViewById(R.id.hmong_homepage);
        hmong_homepage.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Hmong_Levaquin:
                Intent intent = new Intent(Hmong_Antibiotics.this, Hmong_Levaquin.class);
                startActivity(intent);
                break;
            case R.id.Hmong_Erythromycin:
                Intent intent1 = new Intent(Hmong_Antibiotics.this,Hmong_Antibiotic_Erythromycin.class);
                startActivity(intent1);
                break;

            /*case R.id.poxycycline:
                Intent intent1 = new Intent(hmong_antibiotics.this, poxycycline.class);
                startActivity(intent1);
                break;

            case R.id.amoxcillin:
                Intent intent2 = new Intent(hmong_antibiotics.this, amoxcillin.class);
                startActivity(intent2);
                break;

            case R.id.azithromycin:
                Intent intent3 = new Intent(hmong_antibiotics.this, azythromycin.class);
                startActivity(intent3);
                break;

            case R.id.metronidazole:
                Intent intent4 = new Intent(hmong_antibiotics.this, metronidazole.class);
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
                Intent intent9 = new Intent(commonAntibiotics.this, gpill.class);
                startActivity(intent9);
                break;

            case R.id.ofloxacin:
                Intent intent10 = new Intent(commonAntibiotics.this, ofloxacin.class);
                startActivity(intent10);
                break;*/

            case R.id.Antibiotic_Usage:
                Intent intent11 = new Intent(Hmong_Antibiotics.this, Hmong_Antibiotic_Usage.class);
                startActivity(intent11);
                break;

            case R.id.hmong_homepage:
                Intent intent12 = new Intent (Hmong_Antibiotics.this, hmongHomePage.class);
                startActivity(intent12);

        }
    }
}
