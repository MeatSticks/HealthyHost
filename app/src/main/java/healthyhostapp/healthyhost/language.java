package healthyhostapp.healthyhost;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Leo Alonso Cabrera on 2/6/2017.
 */

public class language extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.language);

        Button resources = (Button) findViewById(R.id.resources);
        resources.setOnClickListener(this); //this is for Antibiotics

        Button backgroundinfo = (Button) findViewById(R.id.backgroundinfo);
        backgroundinfo.setOnClickListener(this); //Illnesses

        Button languages =(Button) findViewById(R.id.languages);
        languages.setOnClickListener(this);
    }

    public void onClick(View v){
        switch(v.getId()){
            case R.id.resources:
                Intent intent1 = new Intent(language.this, resources.class);
                startActivity(intent1);
                break;
            case R.id.backgroundinfo:
                Intent intent2 = new Intent(language.this, backgroundinfo.class);
                startActivity(intent2);
                break;
            case R.id.languages:
                Intent intent3 = new Intent(language.this, LANGUAGES.class);
                startActivity(intent3);
                break;
    }
}
}
