package healthyhostapp.healthyhost;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class title6spanish_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.title6_page);

        String title6English = "Varias leyes y reglamentos federales y estatales requieren competencia lingüística. Sobre todo, la Oficina de los Derechos Civiles del Departamento Federal de Salud y Servicios Humanos requiere que todos los que reciben fondos federales cumplan con el Título VI de la Ley de los Derechos Civiles de 1964. El cumplimiento prohíbe la discriminación basada en la raza u origen nacional, tal como el no ofrecer métodos eficaces de comunicación entre los profesionales que hablan inglés y sus pacientes con conocimiento limitado del inglés (LEP). Llame a Healthy House para un intérprete al (209) 724-0102. Para información sobre el Título VI llame al (800) 242-2752 o a la Oficina de los Derechos Civiles al (415) 437-8310.";
        TextView textView = (TextView) findViewById(R.id.title6);
        textView.setText(title6English);


    }
}
