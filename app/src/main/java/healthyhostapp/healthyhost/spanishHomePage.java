package healthyhostapp.healthyhost;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Leo Alonso Cabrera on 4/4/2017.
 */

public class spanishHomePage extends AppCompatActivity implements View.OnClickListener{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.spanish_home_page);

        //set up the buttons and the functionality
        Button antibioticos = (Button) findViewById(R.id.antibioticos);
        antibioticos.setOnClickListener(this); //this is for Antibiotics

        Button enfermedades = (Button) findViewById(R.id.enfermedades);
        enfermedades.setOnClickListener(this); //Illnesses

        Button spanishfaq =(Button) findViewById(R.id.spanishfaq);
        spanishfaq.setOnClickListener(this);

        Button spanlocal_clinics =(Button) findViewById(R.id.spanlocal_clinics);
        spanlocal_clinics.setOnClickListener(this);

        Button adjustes = (Button) findViewById(R.id.adjustes);
        adjustes.setOnClickListener(this);



    }
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.antibioticos:
                Intent intent = new Intent(spanishHomePage.this, spanishCommonAntibiotics.class);
                startActivity(intent);
                break;
            case R.id.enfermedades:
                Intent intent2 = new Intent(spanishHomePage.this, spanishCommonIllnesses.class);
                startActivity(intent2);
                break;
            case R.id.spanishfaq:
                Intent intent4 = new Intent(spanishHomePage.this, Spanish_Faq.class);
                startActivity(intent4);
                break;
            case R.id.spanlocal_clinics:
                Intent intent5 = new Intent(spanishHomePage.this, spanlocal_clinics.class);
                startActivity(intent5);
                break;
            case R.id.adjustes: //this case actually represents what will be the settings page, no longer the language
                Intent intent6 = new Intent(spanishHomePage.this, language.class);
                startActivity(intent6);
                break;
        }
    }
}