package dtlv.com.dtlv_application;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Utilisateur on 2015-12-06.
 */
public class Test4 extends Activity{

    private Controleur controleur;

    /**
     * Constructor
     * @param controleur Link with other classes
     */
    public Test4(Controleur controleur) {
        this.controleur = controleur;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test4);
    }
}
