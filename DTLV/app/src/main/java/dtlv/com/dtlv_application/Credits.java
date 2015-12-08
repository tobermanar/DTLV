package dtlv.com.dtlv_application;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Utilisateur on 2015-12-05.
 */
public class Credits extends Activity {

    public Credits(Controleur controleur) {
        this.controleur = controleur;
    }

    private Controleur controleur;
    private TextView credits = null;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.credits);
    }
}
