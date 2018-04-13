package healthyhostapp.healthyhost;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class title6hmong_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.title6_page);

        String title6English = "Muaj ntau yam cai tsis hais Federal los yog State yuav kom muaj kev koom tes rau sab kev hais lus kom muaj kev sib to taub. Yam tshwj xeeb tshaj, U.S. Department of Health and Human Services Office for Civil Rights (OCR) xav kom tag nrho cov neeg ua tau txais nyiaj txiag ua kom raws txoj cai los the Nai 6 (Title VI) uas yog the Civil Rights Act nyob rau xyoo 1964. Kev koom tes no yog txwv tsis pub muaj kev saib tsis taus lwm haiv neeg, xws li tsis muaj kev ncaj ncees rau sab kev hais lus rau cov neeg uas tsis paub lus Askiv lossis Limited English Proficiency (LEP). Yog xav tau neeg txhais lus, hu rau Healthy House: (209) 724-0102. Yog xav paub txog tsab cai Nqi 6 (Title VI) hu tau rau (800) 242-2752 lossis hu tau mus rau lawv qhov chaw uas yog Office of Civil Rights (415) 437-8310";
        TextView textView = (TextView) findViewById(R.id.title6);
        textView.setText(title6English);


    }
}
