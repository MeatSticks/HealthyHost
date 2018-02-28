package healthyhostapp.healthyhost;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Leo Alonso Cabrera on 11/28/2016.
 */

public class Hmong_Illnesses extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hmong_illnesses);

        //set up the buttons and the functionality


        Button hmong_illness_herpes = (Button) findViewById(R.id.Hmong_Type_2_Herpes);
        hmong_illness_herpes.setOnClickListener(this);

        Button hmong_illness_chylamydia = (Button) findViewById(R.id.Hmong_Chlamydia);
        hmong_illness_chylamydia.setOnClickListener(this);

        Button hmong_illness_ear_infection = (Button) findViewById(R.id.Hmong_Ear);
        hmong_illness_ear_infection.setOnClickListener(this);

        Button hmong_illness_h_pylori = (Button) findViewById(R.id.Hmong_Pylori);
        hmong_illness_h_pylori.setOnClickListener(this);

        Button hmong_illness_lyme_disease = (Button) findViewById(R.id.Hmong_Lyme_Disease);
        hmong_illness_lyme_disease.setOnClickListener(this);

        Button hmong_illness_mastitis = (Button) findViewById(R.id.Hmong_Mastitis);
        hmong_illness_mastitis.setOnClickListener(this);

        Button hmong_illness_valleyfever = (Button) findViewById(R.id.Hmong_Valley_Fever);
        hmong_illness_valleyfever.setOnClickListener(this);

        Button hmong_illness_mononucleosis = (Button) findViewById(R.id.Hmong_Mononucleosis);
        hmong_illness_mononucleosis.setOnClickListener(this);

        Button hmong_illness_impetigo = (Button) findViewById(R.id.Hmong_Impetigo);
        hmong_illness_impetigo.setOnClickListener(this);

        /*

        Button ValleyFever = (Button) findViewById(R.id.ValleyFever);
        ValleyFever.setOnClickListener(this);

        */

        Button hmong_illness_necro = (Button) findViewById(R.id.Hmong_Necrotizing_Fascitis);
        hmong_illness_necro.setOnClickListener(this);

        Button hmong_illness_rsv = (Button) findViewById(R.id.Hmong_Respiratory_Syncytial_Virus);
        hmong_illness_rsv.setOnClickListener(this);

        Button hmong_illness_throat = (Button) findViewById(R.id.Hmong_Strep_Throat);
        hmong_illness_throat.setOnClickListener(this);

        Button hmong_illness_uti = (Button) findViewById(R.id.Hmong_Urinary_Tract_Infection);
        hmong_illness_uti.setOnClickListener(this);

        /*
        Button clap = (Button) findViewById(R.id.clap);
        clap.setOnClickListener(this);

        Button ear = (Button) findViewById(R.id.ear);
        ear.setOnClickListener(this);

        Button pylori = (Button) findViewById(R.id.pylori);
        pylori.setOnClickListener(this);

        Button lyme = (Button) findViewById(R.id.lyme);
        lyme.setOnClickListener(this);

        Button mastitis = (Button) findViewById(R.id.mastitis);
        mastitis.setOnClickListener(this);
        */

    }
    public void onClick(View v){
        switch(v.getId()){




            case R.id.Hmong_Type_2_Herpes:
                Intent intent2 = new Intent(Hmong_Illnesses.this, Hmong_Illness_Herpes.class);
                startActivity(intent2);
                break;

            case R.id.Hmong_Mononucleosis:
                Intent intent3 = new Intent(Hmong_Illnesses.this, Hmong_Illness_Mononucleosis.class);
                startActivity(intent3);
                break;

            case R.id.Hmong_Impetigo:
                Intent intent4 = new Intent(Hmong_Illnesses.this, Hmong_Illness_Impetigo.class);
                startActivity(intent4);
                break;


            case R.id. Hmong_Valley_Fever:
                Intent intent5 = new Intent(Hmong_Illnesses.this, Hmong_Illness_Valleyfever.class);
                startActivity(intent5);
                break;


            case R.id.Hmong_Necrotizing_Fascitis:
                Intent intent6 = new Intent(Hmong_Illnesses.this, Hmong_Illness_Necro.class);
                startActivity(intent6);
                break;

            case R.id.Hmong_Respiratory_Syncytial_Virus:
                Intent intent7 = new Intent(Hmong_Illnesses.this, Hmong_Illness_rsv.class);
                startActivity(intent7);
                break;

            case R.id.Hmong_Strep_Throat:
                Intent intent8 = new Intent(Hmong_Illnesses.this, Hmong_Illness_throat.class);
                startActivity(intent8);
                break;

            case R.id.Hmong_Urinary_Tract_Infection:
                Intent intent10 = new Intent(Hmong_Illnesses.this, Hmong_Illness_uti.class);
                startActivity(intent10);
                break;
            
            case R.id.Hmong_Chlamydia:
                Intent intent11 = new Intent(Hmong_Illnesses.this, Hmong_Illness_Chylamydia.class);
                startActivity(intent11);
                break;

            case R.id.Hmong_Ear:
                Intent intent12 = new Intent(Hmong_Illnesses.this, Hmong_Illness_Ear_Infection.class);
                startActivity(intent12);
                break;

            case R.id.Hmong_Pylori:
                Intent intent13 = new Intent(Hmong_Illnesses.this, Hmong_Illness_H_Pylori.class);
                startActivity(intent13);
                break;

            case R.id.Hmong_Lyme_Disease:
                Intent intent14 = new Intent(Hmong_Illnesses.this, Hmong_Illness_Lyme_Disease.class);
                startActivity(intent14);
                break;

            case R.id.Hmong_Mastitis:
                Intent intent15 = new Intent(Hmong_Illnesses.this, Hmong_Illness_Mastitis.class);
                startActivity(intent15);
                break;

        }
    }
}
