package dtlv.com.dtlv_application;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by Utilisateur on 2015-12-06.
 */
public class Test7 extends Activity{

    private ImageButton btest7_next = null;

    private int ptsT7 = 0;
    private GestionPoint gestPts;

    public Test7(){
        gestPts = Menu.gestPts;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test7);
        btest7_next = (ImageButton) findViewById(R.id.test7_bnext);
        //btest7_next.setEnabled(false);
        //btest7_next.setClickable(false);
        //btest7_next.setImageResource(R.drawable.next_grey);

        btest7_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on passe au test suivant et on envoit le score a la gestion des points
                gestPts.setT1(ptsT7);
                Intent itest7 = new Intent(Test7.this, Test8.class);
                startActivity(itest7);
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
