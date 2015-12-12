package dtlv.com.dtlv_application;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by Utilisateur on 2015-12-06.
 */
public class Test8 extends Activity{

    private ImageButton btest8_next = null;

    private int ptsT8 = 0;
    private GestionPoint gestPts;

    public Test8(){
        gestPts = Menu.gestPts;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test8);
        btest8_next = (ImageButton) findViewById(R.id.test8_bnext);
        //btest8_next.setEnabled(false);
        //btest8_next.setClickable(false);
        //btest8_next.setImageResource(R.drawable.next_grey);

        btest8_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on passe au test suivant et on envoit le score a la gestion des points
                gestPts.setT1(ptsT8);
                Intent itest8 = new Intent(Test8.this, Test9.class);
                startActivity(itest8);
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
