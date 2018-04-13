package healthyhostapp.healthyhost;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Leo Alonso Cabrera on 11/28/2016.
 */

public class resources extends AppCompatActivity {
    public final String[] resourcesURLS = {"www.cdc.gov",
            "http://www.bpac.org.nz/Supplement/2013/July/antibiotics-guide.aspx#ear-nose-throat-sec",
            "http://www.emedicinehealth.com/antibiotics/page2_em.htm",
            "http://health.mo.gov/safety/antibioticresistance/",
            "https://www.webmd.com/a-to-z-guides/bacterial-and-viral-infections",
            "http://www.livestrong.com/article/84796-bacteria-infect/",
            "http://www.emedicinehealth.com/drug-ofloxacin/article_em.htm#whatis",
            "https://www.nlm.nih.gov/medlineplus/druginfo/meds/a685032.html",
            "http://www.drugs.com/alpha/a1.html",
            "http://www.cdc.gov/non-polio-enterovirus/about/EV-D68.html#",
            "http://www.cdc.gov/non-polio-enterovirus/about/ev68-infographic.html#text"} ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resources);
    }
}
