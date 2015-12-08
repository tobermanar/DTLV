package dtlv.com.dtlv_application;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Utilisateur on 2015-12-06.
 */
public class Config extends Activity{

    private Controleur controleur;

    public Config(Controleur controleur) {
        this.controleur = controleur;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.config);
    }
    /*
    tutorial.setOnClickListener(new OnClickListener() {

        public void onClick(View v) {
            // Au click sur le bouton, une nouvelle activité est lancé.
            Intent itutorial = new Intent(Menu.this, Tutorial.class);
            startActivity(itutorial);
        }
    });*/
}
