package dtlv.com.dtlv_application;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by Utilisateur on 2015-12-06.
 */
public class Results extends Activity{

    private int[] resTestDetail;
    private int resTestGlobal;
    private ImageButton bresult_next = null;
    private GestionPoint gestPts;

    private Button tuto_bt1 = null;
    private Button tuto_bt2 = null;
    private Button tuto_bt3 = null;
    private Button tuto_bt4 = null;
    private Button tuto_bt5 = null;
    private Button tuto_bt6 = null;
    private Button tuto_bt7 = null;
    private Button tuto_bt8 = null;
    private Button tuto_bt9 = null;
    private Button tuto_bt10 = null;

    private TextView test_score = null;
    private TextView test1_score = null;
    private TextView test2_score = null;
    private TextView test3_score = null;
    private TextView test4_score = null;
    private TextView test5_score = null;
    private TextView test6_score = null;
    private TextView test7_score = null;
    private TextView test8_score = null;
    private TextView test9_score = null;
    private TextView test10_score = null;


    public Results(){
        gestPts = Menu.gestPts;
    }
    @Override
    public void onBackPressed() {
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.results);
        bresult_next = (ImageButton) findViewById(R.id.result_bnext);

        tuto_bt1 = (Button) findViewById(R.id.tuto_bt1);
        tuto_bt1.setBackgroundColor(Color.GREEN);
        tuto_bt2 = (Button) findViewById(R.id.tuto_bt2);
        tuto_bt2.setBackgroundColor(Color.GREEN);
        tuto_bt3 = (Button) findViewById(R.id.tuto_bt3);
        tuto_bt3.setBackgroundColor(Color.GREEN);
        tuto_bt4 = (Button) findViewById(R.id.tuto_bt4);
        tuto_bt4.setBackgroundColor(Color.GREEN);
        tuto_bt5 = (Button) findViewById(R.id.tuto_bt5);
        tuto_bt5.setBackgroundColor(Color.GREEN);
        tuto_bt6 = (Button) findViewById(R.id.tuto_bt6);
        tuto_bt6.setBackgroundColor(Color.GREEN);
        tuto_bt7 = (Button) findViewById(R.id.tuto_bt7);
        tuto_bt7.setBackgroundColor(Color.GREEN);
        tuto_bt8 = (Button) findViewById(R.id.tuto_bt8);
        tuto_bt8.setBackgroundColor(Color.GREEN);
        tuto_bt9 = (Button) findViewById(R.id.tuto_bt9);
        tuto_bt9.setBackgroundColor(Color.GREEN);
        tuto_bt10 = (Button) findViewById(R.id.tuto_bt10);
        tuto_bt10.setBackgroundColor(Color.GREEN);

        test_score = (TextView) findViewById(R.id.test_score);
        test_score.setText("Affichage provisoire des résultats aux tests.");
        test1_score = (TextView) findViewById(R.id.test1_score);
        test1_score.setText("Test 1 (Dénomination) : " + gestPts.getT1());
        test2_score = (TextView) findViewById(R.id.test2_score);
        test2_score.setText("Test 2 (Répétition) : " + gestPts.getT2());
        test3_score = (TextView) findViewById(R.id.test3_score);
        test3_score.setText("Test 3 (Fluence verbale) : " + gestPts.getT3());
        test4_score = (TextView) findViewById(R.id.test4_score);
        test4_score.setText("Test 4 (Alpha-span) : " + gestPts.getT4());
        test5_score = (TextView) findViewById(R.id.test5_score);
        test5_score.setText("Test 5 (Lecture) : " + gestPts.getT5());
        test6_score = (TextView) findViewById(R.id.test6_score);
        test6_score.setText("Test 6 (Compréhension des phrases) : " + gestPts.getT6());
        test7_score = (TextView) findViewById(R.id.test7_score);
        test7_score.setText("Test 7 (Dictée) : " + gestPts.getT7());
        test8_score = (TextView) findViewById(R.id.test8_score);
        test8_score.setText("Test 8 (Écriture spontanée) : " + gestPts.getT8());
        test9_score = (TextView) findViewById(R.id.test9_score);
        test9_score.setText("Test 9 (Compréhension sémantique) : " + gestPts.getT9());
        test10_score = (TextView) findViewById(R.id.test10_score);
        test10_score.setText("Test 10 (Language spontané) : " + gestPts.getT10());


        bresult_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on passe au test suivant et on envoit le score a la gestion des points
                Intent iresult = new Intent(Results.this, Menu.class);
                startActivity(iresult);
            }
        });
    getResults();
    }

    /**
     * Obtain the point manager
     * @param gestPtsF
     */
    public void giveGestPts(GestionPoint gestPtsF){
        this.gestPts = gestPtsF;
    }

    /**
     * Get and set locally results of the test ( Global and test by test )
     */
    public void getResults(){
        resTestDetail = gestPts.getPointParTest();
        resTestGlobal = gestPts.getPointTot();
    }


}
