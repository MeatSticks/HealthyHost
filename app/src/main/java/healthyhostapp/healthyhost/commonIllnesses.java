package healthyhostapp.healthyhost;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Leo Alonso Cabrera on 11/28/2016.
 */

public class commonIllnesses extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.commonillnesses);

        //set up the buttons and the functionality

        Button herpes = (Button) findViewById(R.id.herpes);
        herpes.setOnClickListener(this);

        Button mononucleosis = (Button) findViewById(R.id.Mono);
        mononucleosis.setOnClickListener(this);

        Button impetigo = (Button) findViewById(R.id.Impetigo);
        impetigo.setOnClickListener(this);

        Button ValleyFever = (Button) findViewById(R.id.ValleyFever);
        ValleyFever.setOnClickListener(this);

        Button necro = (Button) findViewById(R.id.necro);
        necro.setOnClickListener(this);

        Button rsv = (Button) findViewById(R.id.rsv);
        rsv.setOnClickListener(this);

        Button throat = (Button) findViewById(R.id.throat);
        throat.setOnClickListener(this);

        Button uti = (Button) findViewById(R.id.uti);
        uti.setOnClickListener(this);

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


    }
    public void onClick(View v){
        switch(v.getId()){

            case R.id.herpes:
                Intent intent2 = new Intent(commonIllnesses.this, herpes.class);
                startActivity(intent2);
                break;
            case R.id.Mono:
                Intent intent3 = new Intent(commonIllnesses.this, mononucleosis.class);
                startActivity(intent3);
                break;
            case R.id.Impetigo:
                Intent intent4 = new Intent(commonIllnesses.this, impetigo.class);
                startActivity(intent4);
                break;

            case R.id.ValleyFever:
                Intent intent5 = new Intent(commonIllnesses.this, valley.class);
                startActivity(intent5);
                break;

            case R.id.necro:
                Intent intent6 = new Intent(commonIllnesses.this, necro.class);
                startActivity(intent6);
                break;

            case R.id.rsv:
                Intent intent7 = new Intent(commonIllnesses.this, rsv.class);
                startActivity(intent7);
                break;

            case R.id.throat:
                Intent intent8 = new Intent(commonIllnesses.this, throat.class);
                startActivity(intent8);
                break;

            case R.id.uti:
                Intent intent10 = new Intent(commonIllnesses.this, uti.class);
                startActivity(intent10);
                break;

            case R.id.clap:
                Intent intent11 = new Intent(commonIllnesses.this, clap.class);
                startActivity(intent11);
                break;

            case R.id.ear:
                Intent intent12 = new Intent(commonIllnesses.this, ear.class);
                startActivity(intent12);
                break;

            case R.id.pylori:
                Intent intent13 = new Intent(commonIllnesses.this, pylori.class);
                startActivity(intent13);
                break;

            case R.id.lyme:
                Intent intent14 = new Intent(commonIllnesses.this, lyme.class);
                startActivity(intent14);
                break;

            case R.id.mastitis:
                Intent intent15 = new Intent(commonIllnesses.this, mastitis.class);
                startActivity(intent15);
                break;

        }
    }
}