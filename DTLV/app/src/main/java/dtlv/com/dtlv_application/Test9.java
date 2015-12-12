package dtlv.com.dtlv_application;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by Utilisateur on 2015-12-06.
 */
public class Test9 extends Activity{

    private ImageButton btest9_next = null;

    private int ptsT9 = 0;
    private GestionPoint gestPts;

    public Test9(){
        gestPts = Menu.gestPts;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test9);
        btest9_next = (ImageButton) findViewById(R.id.test9_bnext);
        //btest9_next.setEnabled(false);
        //btest9_next.setClickable(false);
        //btest9_next.setImageResource(R.drawable.next_grey);

        btest9_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on passe au test suivant et on envoit le score a la gestion des points
                gestPts.setT1(ptsT9);
                Intent itest9 = new Intent(Test9.this, Test10.class);
                startActivity(itest9);
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
