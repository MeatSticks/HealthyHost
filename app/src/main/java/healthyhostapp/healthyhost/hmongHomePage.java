package healthyhostapp.healthyhost;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Leo Alonso Cabrera on 4/4/2017.
 */

public class hmongHomePage extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hmong_home_page);

        Button Hmong_Antibiotics = (Button) findViewById(R.id.HmongAntibiotic);
        Hmong_Antibiotics.setOnClickListener(this); //this is for Antibiotics

        Button Hmong_Illnesses = (Button) findViewById(R.id.HmongIllnesses);
        Hmong_Illnesses.setOnClickListener(this); //Illnesses

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);

        Button button5 =(Button) findViewById(R.id.button5);
        button5.setOnClickListener(this);

        Button button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(this);

        LanguageBtns.CreateLanguageBtns();
    }
    public void onClick(View v){
        switch(v.getId()){
            case R.id.HmongAntibiotic:
                Intent intent = new Intent(hmongHomePage.this, Hmong_Antibiotics.class);
                startActivity(intent);
                break;
            case R.id.HmongIllnesses:
                Intent intent2 = new Intent(hmongHomePage.this, Hmong_Illnesses.class);
                startActivity(intent2);
                break;
            case R.id.button4:
                Intent intent4 = new Intent(hmongHomePage.this, Hmong_Faq.class);
                startActivity(intent4);
                break;
            case R.id.button5:
                Intent intent5 = new Intent(hmongHomePage.this, Hmong_Local_Clinics.class);
                startActivity(intent5);
                break;
            case R.id.button6: //this case actually represents what will be the settings page, no longer the language
                Intent intent6 = new Intent(hmongHomePage.this, Hmong_Settings.class);
                startActivity(intent6);
                break;




        }
    }
}