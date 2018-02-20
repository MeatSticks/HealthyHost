package healthyhostapp.healthyhost;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class LanguageBtns extends Fragment {
    private View layout;
    private Context context;
    private Button btnEnglish, btnHmong, btnSpanish;

    public LanguageBtns() {
        // Required empty public constructor
    }

    static public LanguageBtns CreateLanguageBtns() {
        LanguageBtns btns = new LanguageBtns();
        return btns;
    }

    private void setUpLayout() {
        // setup buttons for selecting the app's display language
        btnEnglish = (Button) layout.findViewById(R.id.btnEnglish);
        btnEnglish.setOnClickListener(btnClick);

        btnHmong = (Button) layout.findViewById(R.id.btnHmong);
        btnHmong.setOnClickListener(btnClick);

        btnSpanish = (Button) layout.findViewById(R.id.btnSpanish);
        btnSpanish.setOnClickListener(btnClick);

        disableBtn();
    }

    private void disableBtn() {
        Button button;

        if(context.getClass() == homePage.class) {

            button = btnEnglish;

        } else if(context.getClass() == hmongHomePage.class) {

            button = btnHmong;

        } else if(context.getClass() == spanishHomePage.class) {

            button = btnSpanish;

        } else {

            return;

        }

        button.setClickable(false);
        button.setTextColor(ContextCompat.getColor(context, R.color.colorDisabledBtn));
    }

    final View.OnClickListener btnClick = new View.OnClickListener() {
        @Override
        public void onClick(View view){
            switch( view.getId() ){
                case R.id.btnEnglish:
                    gotoPage(homePage.class);
                    break;
                case R.id.btnHmong:
                    gotoPage(hmongHomePage.class);
                    break;
                case R.id.btnSpanish:
                    gotoPage(spanishHomePage.class);
                    break;
            }
        }
    };

    private void gotoPage(Class page) {
        Intent intent = new Intent(context, page);
        startActivity(intent);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        layout = inflater.inflate(R.layout.fragment_language_btns, container, false);
        setUpLayout();
        return layout;
    }

}
