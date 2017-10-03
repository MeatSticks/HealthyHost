package healthyhostapp.healthyhost;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Leo Alonso Cabrera on 4/4/2017.
 */

public class LANGUAGES extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.languages);

        Button resources = (Button) findViewById(R.id.english);
        resources.setOnClickListener(this); //this is for Antibiotics

        Button sizes = (Button) findViewById(R.id.espanol);
        sizes.setOnClickListener(this); //Illnesses

        //Button languages =(Button) findViewById(R.id.hmong);
        //languages.setOnClickListener(this);
}
    public void onClick(View v){
        switch(v.getId()){
            case R.id.english:
                Intent intent1 = new Intent(LANGUAGES.this, homePage.class);
                startActivity(intent1);
                break;
            case R.id.espanol:
                Intent intent2 = new Intent(LANGUAGES.this, spanishHomePage.class);
                startActivity(intent2);
                break;
          //  case R.id.hmong:
            //    Intent intent3 = new Intent(LANGUAGES.this, hmongHomePage.class);
              //  startActivity(intent3);
                //break;
        }
    }
}
