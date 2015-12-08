package dtlv.com.dtlv_application;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Utilisateur on 2015-12-06.
 */
public class Results extends Activity{

    private int[] resTestDetail;
    private int resTestGlobal;

    private Controleur controleur;

    /**
     * Constructor
     * @param controleur Link with other classes
     */
    public Results(Controleur controleur) {
        this.controleur = controleur;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.results);
    }

    /**
     * Get and set locally results of the test ( Global and test by test )
     */
    public void getResults(){
        resTestDetail = controleur.getResultsDetailed();
        resTestGlobal = controleur.getResultsGlobal();
    }


}
