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

        Button hmong_antibiotic_cephalexin = (Button) findViewById(R.id.Hmong_Cephalexin);
        hmong_antibiotic_cephalexin.setOnClickListener(this);

        Button hmong_antibiotic_doxycycline = (Button) findViewById(R.id.Hmong_Doxcycline);
        hmong_antibiotic_doxycycline.setOnClickListener(this);

        Button hmong_antibiotic_amoxicillin = (Button) findViewById(R.id.Hmong_Amoxcillin);
        hmong_antibiotic_amoxicillin.setOnClickListener(this);

        Button hmong_antibiotic_azythromycin = (Button) findViewById(R.id.Hmong_Azithromycin);
        hmong_antibiotic_azythromycin.setOnClickListener(this);

        Button hmong_antibiotic_metronidazole = (Button) findViewById(R.id.Hmong_Metronidazole);
        hmong_antibiotic_metronidazole.setOnClickListener(this);

        Button hmong_antibiotic_flucloxacillin = (Button) findViewById(R.id.Hmong_Flucloxacillin);
        hmong_antibiotic_flucloxacillin.setOnClickListener(this);

        Button hmong_antibiotic_ceftriaxone = (Button) findViewById(R.id.Hmong_Ceftriaxone);
        hmong_antibiotic_ceftriaxone.setOnClickListener(this);

        Button hmong_antibiotic_penecillin_g = (Button) findViewById(R.id.Hmong_Penecillin_G);
        hmong_antibiotic_penecillin_g.setOnClickListener(this);

        Button hmong_antibiotic_ofloxacin = (Button) findViewById(R.id.Hmong_Ofloxacin);
        hmong_antibiotic_ofloxacin.setOnClickListener(this);

        Button hmong_antibiotic_usage = (Button) findViewById(R.id.Antibiotic_Usage);
        hmong_antibiotic_usage.setOnClickListener(this);

        Button hmong_homepage = (Button) findViewById(R.id.hmong_homepage);
        hmong_homepage.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.Hmong_Levaquin:
                Intent intent = new Intent(Hmong_Antibiotics.this, Hmong_Antibiotic_Levaquin.class);
                startActivity(intent);
                break;
            case R.id.Hmong_Erythromycin:
                Intent intent1 = new Intent(Hmong_Antibiotics.this,Hmong_Antibiotic_Erythromycin.class);
                startActivity(intent1);
                break;

            case R.id.Hmong_Cephalexin:
                Intent intent2 = new Intent(Hmong_Antibiotics.this,Hmong_Antibiotic_Cephalexin.class);
                startActivity(intent2);
                break;

            case R.id.Hmong_Doxcycline:
                Intent intent3 = new Intent(Hmong_Antibiotics.this,Hmong_Antibiotic_Doxycycline.class);
                startActivity(intent3);
                break;

            case R.id.Hmong_Amoxcillin:
                Intent intent4 = new Intent(Hmong_Antibiotics.this,Hmong_Antibiotic_Amoxicillin.class);
                startActivity(intent4);
                break;

            case R.id.Hmong_Azithromycin:
                Intent intent5 = new Intent(Hmong_Antibiotics.this,Hmong_Antibiotic_Azythromycin.class);
                startActivity(intent5);
                break;

            case R.id.Hmong_Metronidazole:
                Intent intent6 = new Intent(Hmong_Antibiotics.this,Hmong_Antibiotic_Metronidazole.class);
                startActivity(intent6);
                break;

            case R.id.Hmong_Flucloxacillin:
                Intent intent7 = new Intent(Hmong_Antibiotics.this,Hmong_Antibiotic_Flucloxacillin.class);
                startActivity(intent7);
                break;

            case R.id.Hmong_Ceftriaxone:
                Intent intent8 = new Intent(Hmong_Antibiotics.this,Hmong_Antibiotic_Ceftriaxone.class);
                startActivity(intent8);
                break;

            case R.id.Hmong_Penecillin_G:
                Intent intent9 = new Intent(Hmong_Antibiotics.this,Hmong_Antibiotic_Penecillin_G.class);
                startActivity(intent9);
                break;

            case R.id.Hmong_Ofloxacin:
                Intent intent10 = new Intent(Hmong_Antibiotics.this,Hmong_Antibiotic_Ofloxacin.class);
                startActivity(intent10);
                break;

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
