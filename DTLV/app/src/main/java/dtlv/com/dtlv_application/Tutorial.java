package dtlv.com.dtlv_application;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioButton;


/**
 * Created by Utilisateur on 2015-12-06.
 */
public class Tutorial extends Activity{

    private Controleur controleur;

    public Tutorial(Controleur controleur) {
        this.controleur = controleur;
    }

    private RadioButton r1 = null;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tutorial);
    }

}
