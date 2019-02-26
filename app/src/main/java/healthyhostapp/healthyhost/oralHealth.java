package healthyhostapp.healthyhost;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class oralHealth extends AppCompatActivity implements View.OnClickListener {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.// Insert submenu);

        Button test = (Button) findViewById(R.id.test);
        test.setOnClickListener(this);

        Button test = (Button) findViewById(R.id.test);
        test.setOnClickListener(this);

        Button test = (Button) findViewById(R.id.test);
        test.setOnClickListener(this);

        Button test = (Button) findViewById(R.id.test);
        test.setOnClickListener(this);
}


}
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.test:
                Intent intent = new Intent(test.this, test.class);
                startActivity(intent);
                break;
            case R.id.test:
                Intent intent = new Intent(test.this, test.class);
                startActivity(intent);
                break;
            case R.id.test:
                Intent intent = new Intent(test.this, test.class);
                startActivity(intent);
                break;
            case R.id.test:
                Intent intent = new Intent(test.this, test.class);
                startActivity(intent);
                break;
        }
    }