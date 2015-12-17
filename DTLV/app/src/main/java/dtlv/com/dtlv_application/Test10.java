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

    private boolean quotation_1 = false;
    private ImageButton btest10_validate1 = null;
    private ImageButton btest10_refuse1 = null;

    private boolean quotation_2 = false;
    private ImageButton btest10_validate2 = null;
    private ImageButton btest10_refuse2 = null;

    private boolean quotation_3 = false;
    private ImageButton btest10_validate3 = null;
    private ImageButton btest10_refuse3 = null;

    private ImageButton btest10_next = null;

    //Variables de quotation
    private int q1 = 0;
    private int q2 = 0;
    private int q3 = 0;

    private GestionPoint gestPts;

    public Test10(){
        gestPts = Menu.gestPts;
    }
    @Override
    public void onBackPressed() {
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test10);
        btest10_next = (ImageButton) findViewById(R.id.test10_bnext);
        btest10_next.setEnabled(false);
        btest10_next.setClickable(false);
        btest10_next.setImageResource(R.drawable.next_grey);

        btest10_validate1 = (ImageButton) findViewById(R.id.test10_text1_bvalid);
        btest10_refuse1 = (ImageButton) findViewById(R.id.test10_text1_brefuse);
        btest10_validate2 = (ImageButton) findViewById(R.id.test10_text2_bvalid);
        btest10_refuse2 = (ImageButton) findViewById(R.id.test10_text2_brefuse);
        btest10_validate3 = (ImageButton) findViewById(R.id.test10_text3_bvalid);
        btest10_refuse3 = (ImageButton) findViewById(R.id.test10_text3_brefuse);

        //Gestion des notations
        btest10_validate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btest10_refuse1.setImageResource(R.drawable.refuse_grey);
                btest10_validate1.setImageResource(R.drawable.validate);
                quotation_1 = true;
                q1=1;
                if (quotation_1 == true && quotation_2 == true && quotation_3 == true) {
                    btest10_next.setEnabled(true);
                    btest10_next.setClickable(true);
                    btest10_next.setImageResource(R.drawable.next);
                }
            }
        });
        btest10_refuse1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btest10_validate1.setImageResource(R.drawable.validate_grey);
                btest10_refuse1.setImageResource(R.drawable.refuse);
                quotation_1 = true;
                q1=0;
                if (quotation_1 == true && quotation_2 == true && quotation_3 == true) {
                    btest10_next.setEnabled(true);
                    btest10_next.setClickable(true);
                    btest10_next.setImageResource(R.drawable.next);
                }
            }
        });
        btest10_validate2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btest10_refuse2.setImageResource(R.drawable.refuse_grey);
                btest10_validate2.setImageResource(R.drawable.validate);
                quotation_2 = true;
                q2=1;
                if (quotation_1 == true && quotation_2 == true && quotation_3 == true) {
                    btest10_next.setEnabled(true);
                    btest10_next.setClickable(true);
                    btest10_next.setImageResource(R.drawable.next);
                }
            }
        });
        btest10_refuse2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btest10_validate2.setImageResource(R.drawable.validate_grey);
                btest10_refuse2.setImageResource(R.drawable.refuse);
                quotation_2 = true;
                q2=0;
                if (quotation_1 == true && quotation_2 == true && quotation_3 == true) {
                    btest10_next.setEnabled(true);
                    btest10_next.setClickable(true);
                    btest10_next.setImageResource(R.drawable.next);
                }
            }
        });
        btest10_validate3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btest10_refuse3.setImageResource(R.drawable.refuse_grey);
                btest10_validate3.setImageResource(R.drawable.validate);
                q3=1;
                quotation_3 = true;
                if (quotation_1 == true && quotation_2 == true && quotation_3 == true) {
                    btest10_next.setEnabled(true);
                    btest10_next.setClickable(true);
                    btest10_next.setImageResource(R.drawable.next);
                }
            }
        });
        btest10_refuse3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btest10_validate3.setImageResource(R.drawable.validate_grey);
                btest10_refuse3.setImageResource(R.drawable.refuse);
                quotation_3 = true;
                q3=0;
                if (quotation_1 == true && quotation_2 == true && quotation_3 == true) {
                    btest10_next.setEnabled(true);
                    btest10_next.setClickable(true);
                    btest10_next.setImageResource(R.drawable.next);
                }
            }
        });

        btest10_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on passe au test suivant et on envoit le score a la gestion des points
                gestPts.setT10(q1=q2+q3);
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
