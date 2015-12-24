package dtlv.com.dtlv_application;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

/**
 * Created by Utilisateur on 2015-12-06.
 */
public class Test9 extends Activity{

    private Button btest9_text1 = null;
    private Button btest9_text2 = null;
    private boolean quotation_text2 = false;
    private ImageButton btest9_validate2 = null;
    private ImageButton btest9_refuse2 = null;
    private Button btest9_text3 = null;
    private boolean quotation_text3 = false;
    private ImageButton btest9_validate3 = null;
    private ImageButton btest9_refuse3 = null;
    private Button btest9_text4 = null;
    private boolean quotation_text4 = false;
    private ImageButton btest9_validate4 = null;
    private ImageButton btest9_refuse4 = null;
    private Button btest9_text5 = null;
    private boolean quotation_text5 = false;
    private ImageButton btest9_validate5 = null;
    private ImageButton btest9_refuse5 = null;
    private ImageButton btest9_next = null;

    private LinearLayout test9_layout1 = null;
    private LinearLayout test9_layout2 = null;
    private LinearLayout test9_layout3 = null;
    private LinearLayout test9_layout4 = null;
    private LinearLayout test9_layout5 = null;


    //Variables de quotation
    //private int q1 = 0; on ne cote pas q1 c'est un exemple
    private int q2 = 0;
    private int q3 = 0;
    private int q4 = 0;
    private int q5 = 0;
    private GestionPoint gestPts;

    public Test9(){
        gestPts = Menu.gestPts;
    }
    @Override
    public void onBackPressed() {
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test9);
        btest9_text1 = (Button) findViewById(R.id.test9_text1);
        btest9_text2 = (Button) findViewById(R.id.test9_text2);
        btest9_text2.setEnabled(false);
        btest9_text2.setClickable(false);
        //btest9_text2.setImageResource(R.drawable.folder_grey);
        btest9_validate2 = (ImageButton) findViewById(R.id.test9_text2_bvalid);
        btest9_validate2.setEnabled(false);
        btest9_validate2.setClickable(false);
        btest9_validate2.setImageResource(R.drawable.validate_grey);
        btest9_refuse2 = (ImageButton) findViewById(R.id.test9_text2_brefuse);
        btest9_refuse2.setEnabled(false);
        btest9_refuse2.setClickable(false);
        btest9_refuse2.setImageResource(R.drawable.refuse_grey);
        btest9_text3 = (Button) findViewById(R.id.test9_text3);
        btest9_text3.setEnabled(false);
        btest9_text3.setClickable(false);
        //btest9_text3.setImageResource(R.drawable.folder_grey);
        btest9_validate3 = (ImageButton) findViewById(R.id.test9_text3_bvalid);
        btest9_validate3.setEnabled(false);
        btest9_validate3.setClickable(false);
        btest9_validate3.setImageResource(R.drawable.validate_grey);
        btest9_refuse3 = (ImageButton) findViewById(R.id.test9_text3_brefuse);
        btest9_refuse3.setEnabled(false);
        btest9_refuse3.setClickable(false);
        btest9_refuse3.setImageResource(R.drawable.refuse_grey);
        btest9_text4 = (Button) findViewById(R.id.test9_text4);
        btest9_text4.setEnabled(false);
        btest9_text4.setClickable(false);
        //btest9_text4.setImageResource(R.drawable.folder_grey);
        btest9_validate4 = (ImageButton) findViewById(R.id.test9_text4_bvalid);
        btest9_validate4.setEnabled(false);
        btest9_validate4.setClickable(false);
        btest9_validate4.setImageResource(R.drawable.validate_grey);
        btest9_refuse4 = (ImageButton) findViewById(R.id.test9_text4_brefuse);
        btest9_refuse4.setEnabled(false);
        btest9_refuse4.setClickable(false);
        btest9_refuse4.setImageResource(R.drawable.refuse_grey);
        btest9_text5 = (Button) findViewById(R.id.test9_text5);
        btest9_text5.setEnabled(false);
        btest9_text5.setClickable(false);
        //btest9_text5.setImageResource(R.drawable.folder_grey);
        btest9_validate5 = (ImageButton) findViewById(R.id.test9_text5_bvalid);
        btest9_validate5.setEnabled(false);
        btest9_validate5.setClickable(false);
        btest9_validate5.setImageResource(R.drawable.validate_grey);
        btest9_refuse5 = (ImageButton) findViewById(R.id.test9_text5_brefuse);
        btest9_refuse5.setEnabled(false);
        btest9_refuse5.setClickable(false);
        btest9_refuse5.setImageResource(R.drawable.refuse_grey);
        btest9_next = (ImageButton) findViewById(R.id.test9_bnext);
        btest9_next.setEnabled(false);
        btest9_next.setClickable(false);
        btest9_next.setImageResource(R.drawable.next_grey);

        test9_layout1 = (LinearLayout) findViewById(R.id.test9_layout1);
        test9_layout1.setBackgroundColor(getResources().getColor(R.color.yellow));
        test9_layout2 = (LinearLayout) findViewById(R.id.test9_layout2);
        test9_layout3 = (LinearLayout) findViewById(R.id.test9_layout3);
        test9_layout4 = (LinearLayout) findViewById(R.id.test9_layout4);
        test9_layout5 = (LinearLayout) findViewById(R.id.test9_layout5);


        //Text 1
        btest9_text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Test9.this, Test9_text.class);
                intent.putExtra("key", 1);
                startActivity(intent);
                // Au click sur le bouton, on débloque les le test suivant
                btest9_text2.setEnabled(true);
                btest9_text2.setClickable(true);
                //btest9_text2.setImageResource(R.drawable.folder);
                test9_layout1.setBackgroundColor(Color.TRANSPARENT);
                test9_layout2.setBackgroundColor(getResources().getColor(R.color.yellow));
            }
        });

        //Text 2
        btest9_text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Test9.this, Test9_text.class);
                intent.putExtra("key",2);
                startActivity(intent);
                // Au click sur le bouton, on débloque les boutons valider et refuser
                btest9_validate2.setEnabled(true);
                btest9_validate2.setClickable(true);
                btest9_validate2.setImageResource(R.drawable.validate);
                btest9_refuse2.setEnabled(true);
                btest9_refuse2.setClickable(true);
                btest9_refuse2.setImageResource(R.drawable.refuse);
                btest9_text3.setEnabled(true);
                btest9_text3.setClickable(true);
                //btest9_text3.setImageResource(R.drawable.folder);
                test9_layout2.setBackgroundColor(Color.TRANSPARENT);
                test9_layout3.setBackgroundColor(getResources().getColor(R.color.yellow));
            }
        });
        btest9_validate2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test9_layout2.setBackgroundColor(getResources().getColor(R.color.green));
                quotation_text2 = true;
                q2=1;
                activateNext();
            }
        });
        btest9_refuse2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test9_layout2.setBackgroundColor(getResources().getColor(R.color.red));
                quotation_text2 = true;
                q2=0;
                activateNext();
            }
        });

        //Text 3
        btest9_text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Test9.this, Test9_text.class);
                intent.putExtra("key", 3);
                startActivity(intent);
                // Au click sur le bouton, on débloque les boutons valider et refuser
                btest9_validate3.setEnabled(true);
                btest9_validate3.setClickable(true);
                btest9_validate3.setImageResource(R.drawable.validate);
                btest9_refuse3.setEnabled(true);
                btest9_refuse3.setClickable(true);
                btest9_refuse3.setImageResource(R.drawable.refuse);
                btest9_text4.setEnabled(true);
                btest9_text4.setClickable(true);
                //btest9_text4.setImageResource(R.drawable.folder);
                test9_layout3.setBackgroundColor(Color.TRANSPARENT);
                test9_layout4.setBackgroundColor(getResources().getColor(R.color.yellow));
            }
        });
        btest9_validate3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test9_layout3.setBackgroundColor(getResources().getColor(R.color.green));
                quotation_text3 = true;
                q3=1;
                activateNext();
            }
        });
        btest9_refuse3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test9_layout3.setBackgroundColor(getResources().getColor(R.color.red));
                quotation_text3 = true;
                q3=0;
                activateNext();
            }
        });

        //Text 4
        btest9_text4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Test9.this, Test9_text.class);
                intent.putExtra("key", 4);
                startActivity(intent);
                // Au click sur le bouton, on débloque les boutons valider et refuser
                btest9_validate4.setEnabled(true);
                btest9_validate4.setClickable(true);
                btest9_validate4.setImageResource(R.drawable.validate);
                btest9_refuse4.setEnabled(true);
                btest9_refuse4.setClickable(true);
                btest9_refuse4.setImageResource(R.drawable.refuse);
                btest9_text5.setEnabled(true);
                btest9_text5.setClickable(true);
                //btest9_text5.setImageResource(R.drawable.folder);
                test9_layout4.setBackgroundColor(Color.TRANSPARENT);
                test9_layout5.setBackgroundColor(getResources().getColor(R.color.yellow));
            }
        });
        btest9_validate4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test9_layout4.setBackgroundColor(getResources().getColor(R.color.green));
                quotation_text4 = true;
                q4=1;
                activateNext();
            }
        });
        btest9_refuse4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test9_layout4.setBackgroundColor(getResources().getColor(R.color.red));
                quotation_text4 = true;
                q4=0;
                activateNext();
            }
        });

        //Text 5
        btest9_text5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Test9.this, Test9_text.class);
                intent.putExtra("key", 5);
                startActivity(intent);
                // Au click sur le bouton, on débloque les boutons valider et refuser
                btest9_validate5.setEnabled(true);
                btest9_validate5.setClickable(true);
                btest9_validate5.setImageResource(R.drawable.validate);
                btest9_refuse5.setEnabled(true);
                btest9_refuse5.setClickable(true);
                btest9_refuse5.setImageResource(R.drawable.refuse);
                test9_layout5.setBackgroundColor(Color.TRANSPARENT);
            }
        });
        btest9_validate5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test9_layout5.setBackgroundColor(getResources().getColor(R.color.green));
                quotation_text5 = true;
                q5=1;
                activateNext();
            }
        });
        btest9_refuse5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test9_layout5.setBackgroundColor(getResources().getColor(R.color.red));
                quotation_text5 = true;
                q5=0;
                activateNext();
            }
        });

        btest9_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on passe au test suivant et on envoit le score a la gestion des points
                gestPts.setT9(q2+q3+q4+q5);
                Intent itest9 = new Intent(Test9.this, Test10.class);
                startActivity(itest9);
            }
        });
    }//end onCreate


    //Check if everything is quoted to unlock the button to the next test
    public void activateNext() {
        if(quotation_text2 == true && quotation_text3 == true &&
                quotation_text4 == true && quotation_text5 == true)
        {
            btest9_next.setEnabled(true);
            btest9_next.setClickable(true);
            btest9_next.setImageResource(R.drawable.next);
        }
    }

    /**
     * Obtain the point manager
     * @param gestPtsF
     */
    public void giveGestPts(GestionPoint gestPtsF){
        this.gestPts = gestPtsF;
    }
}
