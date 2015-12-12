package dtlv.com.dtlv_application;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by Utilisateur on 2015-12-06.
 */
public class Test10 extends Activity{

    private ImageButton btest10_next = null;

    private int ptsT10 = 0;
    private GestionPoint gestPts;

    public Test10(){
        gestPts = Menu.gestPts;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test10);
        btest10_next = (ImageButton) findViewById(R.id.test10_bnext);
        //btest10_next.setEnabled(false);
        //btest10_next.setClickable(false);
        //btest10_next.setImageResource(R.drawable.next_grey);

        btest10_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on passe au test suivant et on envoit le score a la gestion des points
                gestPts.setT1(ptsT10);
                Intent itest10 = new Intent(Test10.this, Results.class);
                startActivity(itest10);
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
