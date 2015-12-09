package dtlv.com.dtlv_application;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


/**
 * Created by Utilisateur on 2015-12-06.
 */
public class Test1 extends Activity{
    private Button btest1_image1 = null;
    private Button btest1_validate1 = null;
    private Button btest1_refuse1 = null;
    private Button btest1_image2 = null;
    private Button btest1_refuse2 = null;
    private Button btest1_image3 = null;
    private Button btest1_validate3 = null;
    private Button btest1_refuse3 = null;
    private Button btest1_image4 = null;
    private Button btest1_validate4 = null;
    private Button btest1_refuse4 = null;
    private Button btest1_image5 = null;
    private Button btest1_validate5 = null;
    private Button btest1_refuse5 = null;
    private Button btest1_image6 = null;
    private Button btest1_validate6 = null;
    private Button btest1_refuse6 = null;

    private GestionPoint gestPts;

    public Test1(){
        gestPts = Menu.gestPts;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test1);
        btest1_image1 = (Button) findViewById(R.id.test1_image1);
       /* btest1_validate1 = (Button) findViewById(R.id.test1_validate1);
        btest1_refuse1 = (Button) findViewById(R.id.test1_refuse1);
        btest1_image2 = (Button) findViewById(R.id.test1_image2);
        btest1_validate2 = (Button) findViewById(R.id.test1_validate2);
        btest1_refuse2 = (Button) findViewById(R.id.test1_refuse2);
        btest1_image3 = (Button) findViewById(R.id.test1_image3);
        btest1_validate3 = (Button) findViewById(R.id.test1_validate3);
        btest1_refuse3 = (Button) findViewById(R.id.test1_refuse3);
        btest1_image4 = (Button) findViewById(R.id.test1_image4);
        btest1_validate4 = (Button) findViewById(R.id.test1_validate4);
        btest1_refuse4 = (Button) findViewById(R.id.test1_refuse4);
        btest1_image5 = (Button) findViewById(R.id.test1_image5);
        btest1_validate5 = (Button) findViewById(R.id.test1_validate5);
        btest1_refuse5 = (Button) findViewById(R.id.test1_refuse5);
        btest1_image6 = (Button) findViewById(R.id.test1_image6);
        btest1_validate6 = (Button) findViewById(R.id.test1_validate6);
        btest1_refuse6 = (Button) findViewById(R.id.test1_refuse6);*/

        btest1_validate1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Au click sur le bouton, on change une valeur dans le controleur

            }
        });
        btest1_refuse1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Au click sur le bouton, on change une valeur dans le controleur

            }
        });

    }

    /**
     * Obtain the point manager
     * @param gestPtsF
     */
    public void giveGestPts(GestionPoint gestPtsF){
        this.gestPts = gestPtsF;
    }


}
