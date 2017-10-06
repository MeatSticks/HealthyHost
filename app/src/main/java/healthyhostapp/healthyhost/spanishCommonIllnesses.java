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

        Button spanvalley = (Button) findViewById(R.id.spanValleyFever);
        spanvalley.setOnClickListener(this);

        Button spannecro = (Button) findViewById(R.id.spannecro);
        spannecro.setOnClickListener(this);

        Button spanrsv = (Button) findViewById(R.id.spanrsv);
        spanrsv.setOnClickListener(this);

        Button spanthroat = (Button) findViewById(R.id.spanthroat);
        spanthroat.setOnClickListener(this);

        Button spanuti = (Button) findViewById(R.id.spanuti);
        spanuti.setOnClickListener(this);

        Button spanclap = (Button) findViewById(R.id.spanclap);
        spanclap.setOnClickListener(this);

        Button spanear = (Button) findViewById(R.id.spanear);
        spanear.setOnClickListener(this);

        Button spanlyme = (Button) findViewById(R.id.spanlyme);
        spanlyme.setOnClickListener(this);

        Button spanmastitis = (Button) findViewById(R.id.spanmastitis);
        spanmastitis.setOnClickListener(this);

        Button spanpylori = (Button) findViewById(R.id.spanpylori);
        spanpylori.setOnClickListener(this);

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
            case R.id.spanValleyFever:
                Intent spanvalley = new Intent(spanishCommonIllnesses.this, spanvalley.class);
                startActivity(spanvalley);
                break;
            case R.id.spannecro:
                Intent spannecro = new Intent(spanishCommonIllnesses.this, spannecro.class);
                startActivity(spannecro);
                break;
            case R.id.spanrsv:
                Intent spanrsv = new Intent(spanishCommonIllnesses.this, spanrsv.class);
                startActivity(spanrsv);
                break;
            case R.id.spanthroat:
                Intent spanthroat = new Intent(spanishCommonIllnesses.this, spanthroat.class);
                startActivity(spanthroat);
                break;

            case R.id.spanuti:
                Intent spanuti = new Intent(spanishCommonIllnesses.this, spanuti.class);
                startActivity(spanuti);
                break;

            case R.id.spanclap:
                Intent spanclap = new Intent(spanishCommonIllnesses.this, spanclap.class);
                startActivity(spanclap);
                break;

            case R.id.spanear:
                Intent spanear = new Intent(spanishCommonIllnesses.this, spanear.class);
                startActivity(spanear);
                break;

            case R.id.spanlyme:
                Intent spanlyme = new Intent(spanishCommonIllnesses.this, spanlyme.class);
                startActivity(spanlyme);
                break;

            case R.id.spanmastitis:
                Intent spanmastitis = new Intent(spanishCommonIllnesses.this, spanmastitis.class);
                startActivity(spanmastitis);
                break;

            case R.id.spanpylori:
                Intent spanpylori = new Intent(spanishCommonIllnesses.this, spanpylori.class);
                startActivity(spanpylori);
                break;
        }
    }
}
