package healthyhostapp.healthyhost;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Leo Alonso Cabrera on 4/4/2017.
 */

public class spanishCommonIllnesses extends AppCompatActivity implements View.OnClickListener{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spanishcommonillnesses);

        Button spanherpes = (Button) findViewById(R.id.spanherpes);
        spanherpes.setOnClickListener(this);

        Button spanmononucleosis = (Button) findViewById(R.id.spanMono);
        spanmononucleosis.setOnClickListener(this);

        Button spanimpetigo = (Button) findViewById(R.id.spanImpetigo);
        spanimpetigo.setOnClickListener(this);

        Button spanvalley = (Button) findViewById(R.id.valleyspanish);
        spanvalley.setOnClickListener(this);

        Button spannecro = (Button) findViewById(R.id.necrospanish);
        spannecro.setOnClickListener(this);

        Button spanishrsv = (Button) findViewById(R.id.spanishrsv);
        spanishrsv.setOnClickListener(this);

        Button spanishclam = (Button) findViewById(R.id.spanishclam);
        spanishclam.setOnClickListener(this);

        Button spanishuti = (Button) findViewById(R.id.spanishuti);
        spanishuti.setOnClickListener(this);

        Button spanishmastitis = (Button) findViewById(R.id.spanishmastitis);
        spanishmastitis.setOnClickListener(this);


    }

    public void onClick(View v){
        switch(v.getId()){

            case R.id.spanherpes:
                Intent spanHerp = new Intent(spanishCommonIllnesses.this, spanherpes.class);
                startActivity(spanHerp);
                break;
            case R.id.spanMono:
                Intent spanMono = new Intent(spanishCommonIllnesses.this, spanmononucleosis.class);
                startActivity(spanMono);
                break;
            case R.id.spanImpetigo:
                Intent spanImp = new Intent(spanishCommonIllnesses.this, spanimpetigo.class);
                startActivity(spanImp);
                break;
            case R.id.valleyspanish:
                Intent spanVal = new Intent(spanishCommonIllnesses.this, valleyspanish.class);
                startActivity(spanVal);
                break;
            case R.id.necrospanish:
                Intent spanNec = new Intent(spanishCommonIllnesses.this, necrospanish.class);
                startActivity(spanNec);
                break;

            case R.id.spanishrsv:
                Intent spanishrsv = new Intent(spanishCommonIllnesses.this, spanishrsv.class);
                startActivity(spanishrsv);
                break;

            case R.id.spanishclam:
                Intent spanishclam = new Intent(spanishCommonIllnesses.this, spanishclam.class);
                startActivity(spanishclam);
                break;
            case R.id.spanishuti:
                Intent spanishuti = new Intent(spanishCommonIllnesses.this, spanishuti.class);
                startActivity(spanishuti);
                break;
            case R.id.spanishmastitis:
                Intent spanishmastitis = new Intent(spanishCommonIllnesses.this, spanishmastitis.class);
                startActivity(spanishmastitis);
                break;
        }
    }
}
