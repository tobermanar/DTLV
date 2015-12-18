package dtlv.com.dtlv_application;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by Utilisateur on 2015-12-06.
 */
public class Results extends Activity{

    private int[] resTestDetail;
    private int resTestGlobal;
    private ImageButton bresult_next = null;
    private GestionPoint gestPts;

    public Results(){
        gestPts = Menu.gestPts;
    }
    @Override
    public void onBackPressed() {
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.results);
        bresult_next = (ImageButton) findViewById(R.id.result_bnext);

        bresult_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on passe au test suivant et on envoit le score a la gestion des points
                Intent iresult = new Intent(Results.this, Menu.class);
                startActivity(iresult);
            }
        });
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
