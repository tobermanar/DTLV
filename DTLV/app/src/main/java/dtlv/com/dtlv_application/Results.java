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

    public Results(Controleur controleur) {
        this.controleur = controleur;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.results);
    }

    public void getResults(){
        resTestDetail = controleur.getResultsDetailed();
        resTestGlobal = controleur.getResultsGlobal();
    }


}
