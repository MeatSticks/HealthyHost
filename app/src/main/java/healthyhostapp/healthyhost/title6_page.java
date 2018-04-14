package healthyhostapp.healthyhost;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class title6_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.title6_page);

        String title6English = "Several Federal and State laws and regulations mandate linguistic competence. Primarily, the U.S. Department of Health and Human Services Office for Civil Rights (OCR) requires all recipients of federal funds to comply with Title VI of the Civil Right Act of 1964. Compliance prohibits discrimination based on race or national origin, such as failing to provide effective methods of communication between English speaking providers and patients with Limited English Proficiency (LEP). For an interpreter call Healthy House: (209) 724-0102 For information of Title VI call (800) 242-2752 or the Office of Civil Rights (415) 437-8310";
        TextView textView = (TextView) findViewById(R.id.title6);
        textView.setText(title6English);


    }
}
