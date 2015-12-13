package dtlv.com.dtlv_application;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by Utilisateur on 2015-12-06.
 */
public class Test6 extends Activity{

    private ImageButton btest6_next = null;

    private int ptsT6 = 0;
    private GestionPoint gestPts;

    public Test6(){
        gestPts = Menu.gestPts;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test6);
        btest6_next = (ImageButton) findViewById(R.id.test6_bnext);
        //btest6_next.setEnabled(false);
        //btest6_next.setClickable(false);
        //btest6_next.setImageResource(R.drawable.next_grey);

        btest6_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on passe au test suivant et on envoit le score a la gestion des points
                gestPts.setT1(ptsT6);
                Intent itest6 = new Intent(Test6.this, Test7.class);
                startActivity(itest6);
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
