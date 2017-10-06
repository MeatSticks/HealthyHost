package healthyhostapp.healthyhost;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Leo Alonso Cabrera on 11/27/2016.
 */

public class homePage extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);

        //set up the buttons and the functionality
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this); //this is for Antibiotics

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this); //Illnesses

        Button button4 =(Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);

        Button button5 =(Button) findViewById(R.id.button5);
        button5.setOnClickListener(this);

        Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(this);
    }
    public void onClick(View v){
        switch(v.getId()){
            case R.id.button1:
                Intent intent = new Intent(homePage.this, commonAntibiotics.class);
                startActivity(intent);
                break;
            case R.id.button2:
                Intent intent2 = new Intent(homePage.this, commonIllnesses.class);
                startActivity(intent2);
                break;
            case R.id.button4:
                Intent intent4 = new Intent(homePage.this, faqs.class);
                startActivity(intent4);
                break;
            case R.id.button5:
                Intent intent5 = new Intent(homePage.this, localClinics.class);
                startActivity(intent5);
                break;
            case R.id.button6: //this case actually represents what will be the settings page, no longer the language
                Intent intent6 = new Intent(homePage.this, language.class);
                startActivity(intent6);
                break;




        }
    }
}
