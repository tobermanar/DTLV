package dtlv.com.dtlv_application;

import android.content.Intent;
import android.view.View.OnClickListener;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


/**
 * Created by Utilisateur on 2015-12-05.
 */

public class Menu extends Activity{


    private Button tutorial = null;
    private Button credits = null;
    private Button start = null;
    private Button language = null;
    private Button exit = null;
    private float brightnessSetting = 0;

    public static GestionPoint gestPts;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        //Creation de la gestion de point
        gestPts = new GestionPoint();

        tutorial = (Button) findViewById(R.id.b_tutorial);
        credits = (Button) findViewById(R.id.b_credits);
        start = (Button) findViewById(R.id.b_start);
        language = (Button) findViewById(R.id.b_language);
        exit = (Button) findViewById(R.id.b_exit);
        tutorial.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                // Au click sur le bouton, une nouvelle activité est lancé.
                Intent itutorial = new Intent(Menu.this, Tutorial.class);
                startActivity(itutorial);
            }
        });
        credits.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                // Au click sur le bouton, une nouvelle activité est lancé.
                Intent icredits = new Intent(Menu.this, Credits.class);
                startActivity(icredits);
            }
        });
        start.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                // Au click sur le bouton, une nouvelle activité est lancé.
                Intent istart = new Intent(Menu.this, Config.class);
                startActivity(istart);
            }
        });
        language.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                // Au click sur le bouton, une nouvelle activité est lancé.
                Intent ilanguage = new Intent(Menu.this, Language.class);
                startActivity(ilanguage);
            }
        });
        exit.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                // Au click sur le bouton, l'application se ferme.
                System.exit(0);
            }
        });

    }
}