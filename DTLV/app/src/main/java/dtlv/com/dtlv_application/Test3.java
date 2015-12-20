package dtlv.com.dtlv_application;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;


/**
 * Created by Utilisateur on 2015-12-06.
 */

public class Test3 extends Activity{

    private TextView btest3_launch = null;
    private ImageButton btest3_plus = null;
    private ImageButton btest3_minus = null;
    private ImageButton btest3_next = null;
    private TextView test3_score = null;
    private TextView test3_countdown = null;

    private int ptsT3 = 0;
    private GestionPoint gestPts;

    public Test3(){
        gestPts = Menu.gestPts;
    }
    @Override
    public void onBackPressed() {
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test3);
        btest3_launch = (TextView) findViewById(R.id.test3_launch);
        btest3_launch.setEnabled(true);
        btest3_launch.setClickable(true);
        test3_score = (TextView) findViewById(R.id.test3_score);
        btest3_plus = (ImageButton) findViewById(R.id.test3_plus);
        btest3_minus = (ImageButton) findViewById(R.id.test3_minus);
        btest3_next = (ImageButton) findViewById(R.id.test3_bnext);
        test3_countdown = (TextView) findViewById(R.id.test3_countdown);
        btest3_next.setEnabled(true);
        btest3_next.setClickable(true);
        btest3_next.setImageResource(R.drawable.next_grey);

        //mSimpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        //mTextView = (TextView) findViewById(R.id.text);
        btest3_launch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on passe au test suivant et on envoit le score a la gestion des points
                test3_countdown.setText("59");
                new CountDownTimer(60000, 1000) {

                    public void onTick(long millisUntilFinished) {
                        test3_countdown.setText((millisUntilFinished / 1000)+" ");
                        btest3_launch.setClickable(false);
                    }

                    public void onFinish() {
                        test3_countdown.setText("Temps écoulé");
                        btest3_next.setEnabled(true);
                        btest3_next.setClickable(true);
                        btest3_next.setImageResource(R.drawable.next);
                    }
                }.start();
            }
        });
        btest3_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            ptsT3++;
            test3_score.setText(String.valueOf(ptsT3));

            }
        });
        btest3_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ptsT3>0) {
                    ptsT3--;
                }
              test3_score.setText(String.valueOf(ptsT3));
            }
        });


        btest3_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on passe au test suivant et on envoit le score a la gestion des points
                gestPts.setT3(ptsT3);
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
