package dtlv.com.dtlv_application;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by Utilisateur on 2015-12-06.
 */
public class Test5 extends Activity{

    private ImageButton btest5_next = null;

    private int ptsT5 = 0;
    private GestionPoint gestPts;

    public Test5(){
        gestPts = Menu.gestPts;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test5);
        btest5_next = (ImageButton) findViewById(R.id.test5_bnext);
        //btest5_next.setEnabled(false);
        //btest5_next.setClickable(false);
        //btest5_next.setImageResource(R.drawable.next_grey);

        btest5_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on passe au test suivant et on envoit le score a la gestion des points
                gestPts.setT1(ptsT5);
                Intent itest5 = new Intent(Test5.this, Test6.class);
                startActivity(itest5);
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
