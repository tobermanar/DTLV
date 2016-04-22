package dtlv.com.dtlv_application;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
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

    private ImageButton results_help = null;
    private AlertDialog alertDialog = null;
    private TextView tv_results = null;


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
        tuto_bt1.setBackgroundColor(getResources().getColor(R.color.green));
        tuto_bt2 = (Button) findViewById(R.id.tuto_bt2);
        tuto_bt2.setBackgroundColor(getResources().getColor(R.color.green));
        tuto_bt3 = (Button) findViewById(R.id.tuto_bt3);
        tuto_bt3.setBackgroundColor(getResources().getColor(R.color.green));
        tuto_bt4 = (Button) findViewById(R.id.tuto_bt4);
        tuto_bt4.setBackgroundColor(getResources().getColor(R.color.green));
        tuto_bt5 = (Button) findViewById(R.id.tuto_bt5);
        tuto_bt5.setBackgroundColor(getResources().getColor(R.color.green));
        tuto_bt6 = (Button) findViewById(R.id.tuto_bt6);
        tuto_bt6.setBackgroundColor(getResources().getColor(R.color.green));
        tuto_bt7 = (Button) findViewById(R.id.tuto_bt7);
        tuto_bt7.setBackgroundColor(getResources().getColor(R.color.green));
        tuto_bt8 = (Button) findViewById(R.id.tuto_bt8);
        tuto_bt8.setBackgroundColor(getResources().getColor(R.color.green));
        tuto_bt9 = (Button) findViewById(R.id.tuto_bt9);
        tuto_bt9.setBackgroundColor(getResources().getColor(R.color.green));
        tuto_bt10 = (Button) findViewById(R.id.tuto_bt10);
        tuto_bt10.setBackgroundColor(getResources().getColor(R.color.green));

        results_help = (ImageButton) findViewById(R.id.result_bhelp);

        Export_PDF noteFragment = Export_PDF.newInstance();

        android.app.FragmentTransaction fragTransaction= this.getFragmentManager().beginTransaction();
        fragTransaction.replace(R.id.container, noteFragment);
        fragTransaction.commit();

        bresult_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bresult_next.setActivated(false);
                // Au click sur le bouton, on passe au test suivant et on envoit le score a la gestion des points
                Intent iresult = new Intent(Results.this, Menu.class);
                startActivity(iresult);
            }
        });
    getResults();


        //Help
        results_help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog = new AlertDialog.Builder(Results.this).create();
                alertDialog.setTitle(getResources().getString(R.string.help_results_title));
                tv_results = new TextView(Results.this);
                tv_results.setText(getResources().getString(R.string.help_results_text));
                // alertDialog.setView(tv_results);
                alertDialog.setView(tv_results, 20, 20, 20, 20);
                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                alertDialog.show();
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

    /**
     * Get and set locally results of the test ( Global and test by test )
     */
    public void getResults(){
        resTestDetail = gestPts.getPointParTest();
        resTestGlobal = gestPts.getPointTot();
    }
}
