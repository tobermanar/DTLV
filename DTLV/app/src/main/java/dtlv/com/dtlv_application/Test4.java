package dtlv.com.dtlv_application;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by Utilisateur on 2015-12-06.
 */
public class Test4 extends Activity{

    private ImageButton btest4_next = null;

    private int ptsT4 = 0;
    private GestionPoint gestPts;

    public Test4(){
        gestPts = Menu.gestPts;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test4);
        btest4_next = (ImageButton) findViewById(R.id.test4_bnext);
        //btest4_next.setEnabled(false);
        //btest4_next.setClickable(false);
        //btest4_next.setImageResource(R.drawable.next_grey);

        btest4_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on passe au test suivant et on envoit le score a la gestion des points
                gestPts.setT1(ptsT4);
                Intent itest4 = new Intent(Test4.this, Test5.class);
                startActivity(itest4);
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
