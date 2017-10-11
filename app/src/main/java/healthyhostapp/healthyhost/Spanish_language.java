package healthyhostapp.healthyhost;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by herda on 10/10/2017.
 */

public class Spanish_language extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spanish_language);

        Button resources = (Button) findViewById(R.id.resources);
        resources.setOnClickListener(this); //this is for Antibiotics

        Button spanishbackgroundinfo = (Button) findViewById(R.id.spanishbackgroundinfo);
        spanishbackgroundinfo.setOnClickListener(this); //Illnesses

        Button languages =(Button) findViewById(R.id.languages);
        languages.setOnClickListener(this);
    }

    public void onClick(View v){
        switch(v.getId()){
            case R.id.resources:
                Intent intent1 = new Intent(Spanish_language.this, resources.class);
                startActivity(intent1);
                break;
            case R.id.spanishbackgroundinfo:
                Intent intent2 = new Intent(Spanish_language.this, Spanish_Backgroundinfo.class);
                startActivity(intent2);
                break;
            case R.id.languages:
                Intent intent3 = new Intent(Spanish_language.this, LANGUAGES.class);
                startActivity(intent3);
                break;
        }
    }
}
