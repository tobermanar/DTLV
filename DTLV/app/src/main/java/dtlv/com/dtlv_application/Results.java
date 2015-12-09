package dtlv.com.dtlv_application;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Utilisateur on 2015-12-06.
 */
public class Results extends Activity{

    private int[] resTestDetail;
    private int resTestGlobal;
    private GestionPoint gestPts;

    public Results(){
        gestPts = Menu.gestPts;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.results);

        //Recuperation des resultats
        getResults();

    }

    /**
     * Obtain the point manager
     * @param gestPtsF
     */
    public void giveGestPts(GestionPoint gestPtsF){
        this.gestPts = gestPtsF;
    }

    /**
     * Get and set locally results of the test ( Global and test by test )
     */
    public void getResults(){
        resTestDetail = gestPts.getPointParTest();
        resTestGlobal = gestPts.getPointTot();
    }


}
