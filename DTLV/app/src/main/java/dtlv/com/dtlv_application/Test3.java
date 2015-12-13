package dtlv.com.dtlv_application;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by Utilisateur on 2015-12-06.
 */
public class Test3 extends Activity{

    private ImageButton btest3_next = null;

    private int ptsT3 = 0;
    private GestionPoint gestPts;

    public Test3(){
        gestPts = Menu.gestPts;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test3);
        btest3_next = (ImageButton) findViewById(R.id.test3_bnext);
        //btest3_next.setEnabled(false);
        //btest3_next.setClickable(false);
        //btest3_next.setImageResource(R.drawable.next_grey);

        btest3_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on passe au test suivant et on envoit le score a la gestion des points
                gestPts.setT1(ptsT3);
                Intent itest3 = new Intent(Test3.this, Test4.class);
                startActivity(itest3);
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
