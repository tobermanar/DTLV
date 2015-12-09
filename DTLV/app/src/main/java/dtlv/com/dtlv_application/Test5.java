package dtlv.com.dtlv_application;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Utilisateur on 2015-12-06.
 */
public class Test5 extends Activity{

    private GestionPoint gestPts;

    public Test5(){
        gestPts = Menu.gestPts;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test5);
    }

    /**
     * Obtain the point manager
     * @param gestPtsF
     */
    public void giveGestPts(GestionPoint gestPtsF){
        this.gestPts = gestPtsF;
    }
}
