package dtlv.com.dtlv_application;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

/**
 * Created by Utilisateur on 2015-12-06.
 */
public class Test1 extends Activity{

    private GestionPoint gestPts;

    private ImageButton btest1_image1 = null;
    private boolean quotation_image1 = false;
    private ImageButton btest1_validate1 = null;
    private ImageButton btest1_refuse1 = null;
    private ImageButton btest1_image2 = null;
    private ImageButton btest1_image1_back = null;
    private boolean quotation_image2 = false;
    private ImageButton btest1_validate2 = null;
    private ImageButton btest1_refuse2 = null;
    private ImageButton btest1_image3 = null;
    private boolean quotation_image3 = false;
    private ImageButton btest1_validate3 = null;
    private ImageButton btest1_refuse3 = null;
    private ImageButton btest1_image4 = null;
    private boolean quotation_image4 = false;
    private ImageButton btest1_validate4 = null;
    private ImageButton btest1_refuse4 = null;
    private ImageButton btest1_image5 = null;
    private boolean quotation_image5 = false;
    private ImageButton btest1_validate5 = null;
    private ImageButton btest1_refuse5 = null;
    private ImageButton btest1_image6 = null;
    private boolean quotation_image6 = false;
    private ImageButton btest1_validate6 = null;
    private ImageButton btest1_refuse6 = null;
    private ImageButton btest1_next = null;
    //Variables de quotation
    private int q1 = 0;
    private int q2 = 0;
    private int q3 = 0;
    private int q4 = 0;
    private int q5 = 0;
    private int q6 = 0;

    private LinearLayout test1_layout1 = null;
    private LinearLayout test1_layout2 = null;
    private LinearLayout test1_layout3 = null;
    private LinearLayout test1_layout4 = null;
    private LinearLayout test1_layout5 = null;
    private LinearLayout test1_layout6 = null;

    public Test1(){
        //Recuperation du systeme de gestion des points
        gestPts = Menu.gestPts;
    }
    @Override
    public void onBackPressed() {
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test1);
        btest1_image1 = (ImageButton) findViewById(R.id.test1_image1);
        btest1_validate1 = (ImageButton) findViewById(R.id.test1_validate1);
        //btest1_image1_back = (ImageButton) findViewById(R.id.test1_image1_back);
        btest1_validate1.setEnabled(false);
        btest1_validate1.setClickable(false);
        btest1_validate1.setImageResource(R.drawable.validate_grey);
        btest1_refuse1 = (ImageButton) findViewById(R.id.test1_refuse1);
        btest1_refuse1.setEnabled(false);
        btest1_refuse1.setClickable(false);
        btest1_refuse1.setImageResource(R.drawable.refuse_grey);
        btest1_image2 = (ImageButton) findViewById(R.id.test1_image2);
        btest1_image2.setEnabled(false);
        btest1_image2.setClickable(false);
        btest1_validate2 = (ImageButton) findViewById(R.id.test1_validate2);
        btest1_validate2.setEnabled(false);
        btest1_validate2.setClickable(false);
        btest1_validate2.setImageResource(R.drawable.validate_grey);
        btest1_refuse2 = (ImageButton) findViewById(R.id.test1_refuse2);
        btest1_refuse2.setEnabled(false);
        btest1_refuse2.setClickable(false);
        btest1_refuse2.setImageResource(R.drawable.refuse_grey);
        btest1_image3 = (ImageButton) findViewById(R.id.test1_image3);
        btest1_image3.setEnabled(false);
        btest1_image3.setClickable(false);
        btest1_validate3 = (ImageButton) findViewById(R.id.test1_validate3);
        btest1_validate3.setEnabled(false);
        btest1_validate3.setClickable(false);
        btest1_validate3.setImageResource(R.drawable.validate_grey);
        btest1_refuse3 = (ImageButton) findViewById(R.id.test1_refuse3);
        btest1_refuse3.setEnabled(false);
        btest1_refuse3.setClickable(false);
        btest1_refuse3.setImageResource(R.drawable.refuse_grey);
        btest1_image4 = (ImageButton) findViewById(R.id.test1_image4);
        btest1_image4.setEnabled(false);
        btest1_image4.setClickable(false);
        btest1_validate4 = (ImageButton) findViewById(R.id.test1_validate4);
        btest1_validate4.setEnabled(false);
        btest1_validate4.setClickable(false);
        btest1_validate4.setImageResource(R.drawable.validate_grey);
        btest1_refuse4 = (ImageButton) findViewById(R.id.test1_refuse4);
        btest1_refuse4.setEnabled(false);
        btest1_refuse4.setClickable(false);
        btest1_refuse4.setImageResource(R.drawable.refuse_grey);
        btest1_image5 = (ImageButton) findViewById(R.id.test1_image5);
        btest1_image5.setEnabled(false);
        btest1_image5.setClickable(false);
        btest1_validate5 = (ImageButton) findViewById(R.id.test1_validate5);
        btest1_validate5.setEnabled(false);
        btest1_validate5.setClickable(false);
        btest1_validate5.setImageResource(R.drawable.validate_grey);
        btest1_refuse5 = (ImageButton) findViewById(R.id.test1_refuse5);
        btest1_refuse5.setEnabled(false);
        btest1_refuse5.setClickable(false);
        btest1_refuse5.setImageResource(R.drawable.refuse_grey);
        btest1_image6 = (ImageButton) findViewById(R.id.test1_image6);
        btest1_image6.setEnabled(false);
        btest1_image6.setClickable(false);
        btest1_validate6 = (ImageButton) findViewById(R.id.test1_validate6);
        btest1_validate6.setEnabled(false);
        btest1_validate6.setClickable(false);
        btest1_validate6.setImageResource(R.drawable.validate_grey);
        btest1_refuse6 = (ImageButton) findViewById(R.id.test1_refuse6);
        btest1_refuse6.setEnabled(false);
        btest1_refuse6.setClickable(false);
        btest1_refuse6.setImageResource(R.drawable.refuse_grey);
        btest1_next = (ImageButton) findViewById(R.id.test1_next);
        btest1_next.setEnabled(false);//TODO laisser false
        btest1_next.setClickable(false);//TODO laisser false
        btest1_next.setImageResource(R.drawable.next_grey);

        test1_layout1 = (LinearLayout) findViewById(R.id.test1_layout1);
        test1_layout1.setBackgroundColor(Color.YELLOW);
        test1_layout2 = (LinearLayout) findViewById(R.id.test1_layout2);
        test1_layout3 = (LinearLayout) findViewById(R.id.test1_layout3);
        test1_layout4 = (LinearLayout) findViewById(R.id.test1_layout4);
        test1_layout5 = (LinearLayout) findViewById(R.id.test1_layout5);
        test1_layout6 = (LinearLayout) findViewById(R.id.test1_layout6);

    //Image 1
        btest1_image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Test1.this, Test1_image1.class);
                intent.putExtra("key", 1);
                startActivity(intent);

                // Au click sur le bouton, on débloque les boutons valider et refuser
                btest1_validate1.setEnabled(true);
                btest1_validate1.setClickable(true);
                btest1_validate1.setImageResource(R.drawable.validate);
                btest1_refuse1.setEnabled(true);
                btest1_refuse1.setClickable(true);
                btest1_refuse1.setImageResource(R.drawable.refuse);
                test1_layout1.setBackgroundColor(Color.TRANSPARENT);
                btest1_image2.setEnabled(true);
                btest1_image2.setClickable(true);
                test1_layout2.setBackgroundColor(Color.YELLOW);

            }
        });
        // TODO A DEBUG QUAND ON OUVRE L'APPLICATION PLANTE
        /*btest1_image1_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.test1);
            }
        });*/
        btest1_validate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test1_layout1.setBackgroundColor(Color.GREEN);
                quotation_image1 = true;
                //cote la question 1 comme juste
                q1=1;
                activateNext();
            }
        });
        btest1_refuse1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test1_layout1.setBackgroundColor(Color.RED);
                quotation_image1 = true;
                //cote la question 1 comme fausse
                q1=0;
                activateNext();
            }
        });

    //Image 2
        btest1_image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Test1.this, Test1_image1.class);
                intent.putExtra("key", 2);
                startActivity(intent);

                // Au click sur le bouton, on débloque les boutons valider et refuser
                btest1_validate2.setEnabled(true);
                btest1_validate2.setClickable(true);
                btest1_validate2.setImageResource(R.drawable.validate);
                btest1_refuse2.setEnabled(true);
                btest1_refuse2.setClickable(true);
                btest1_refuse2.setImageResource(R.drawable.refuse);
                test1_layout2.setBackgroundColor(Color.TRANSPARENT);
                btest1_image3.setEnabled(true);
                btest1_image3.setClickable(true);
                test1_layout3.setBackgroundColor(Color.YELLOW);
            }
        });
        btest1_validate2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on affiche un calque vert sur l'image A MODIFIER
                test1_layout2.setBackgroundColor(Color.GREEN);
                quotation_image2 = true;
                q2=1;
                activateNext();
            }
        });
        btest1_refuse2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on affiche un calque rouge sur l'image A MODIFIER
                test1_layout2.setBackgroundColor(Color.RED);
                quotation_image2 = true;
                q2=0;
                activateNext();
            }
        });

    //Image 3
        btest1_image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Test1.this, Test1_image1.class);
                intent.putExtra("key", 3);
                startActivity(intent);

                // Au click sur le bouton, on débloque les boutons valider et refuser
                btest1_validate3.setEnabled(true);
                btest1_validate3.setClickable(true);
                btest1_validate3.setImageResource(R.drawable.validate);
                btest1_refuse3.setEnabled(true);
                btest1_refuse3.setClickable(true);
                btest1_refuse3.setImageResource(R.drawable.refuse);
                test1_layout3.setBackgroundColor(Color.TRANSPARENT);
                btest1_image4.setEnabled(true);
                btest1_image4.setClickable(true);
                test1_layout4.setBackgroundColor(Color.YELLOW);
            }
        });
        btest1_validate3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on affiche un calque vert sur l'image A MODIFIER
                test1_layout3.setBackgroundColor(Color.GREEN);
                quotation_image3 = true;
                q3=1;
                activateNext();
            }
        });
        btest1_refuse3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on affiche un calque rouge sur l'image A MODIFIER
                test1_layout3.setBackgroundColor(Color.RED);
                quotation_image3 = true;
                q3=0;
                activateNext();
            }
        });

    //Image 4
        btest1_image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Test1.this, Test1_image1.class);
                intent.putExtra("key", 4);
                startActivity(intent);

                // Au click sur le bouton, on débloque les boutons valider et refuser
                btest1_validate4.setEnabled(true);
                btest1_validate4.setClickable(true);
                btest1_validate4.setImageResource(R.drawable.validate);
                btest1_refuse4.setEnabled(true);
                btest1_refuse4.setClickable(true);
                btest1_refuse4.setImageResource(R.drawable.refuse);
                test1_layout4.setBackgroundColor(Color.TRANSPARENT);
                btest1_image5.setEnabled(true);
                btest1_image5.setClickable(true);
                test1_layout5.setBackgroundColor(Color.YELLOW);
            }
        });
        btest1_validate4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on affiche un calque vert sur l'image A MODIFIER
                test1_layout4.setBackgroundColor(Color.GREEN);
                quotation_image4 = true;
                q4=1;
                activateNext();
            }
        });
        btest1_refuse4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on affiche un calque rouge sur l'image A MODIFIER
                test1_layout4.setBackgroundColor(Color.RED);
                quotation_image4 = true;
                q4=0;
                activateNext();
            }
        });

    //Image 5
        btest1_image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Test1.this, Test1_image1.class);
                intent.putExtra("key", 5);
                startActivity(intent);

                // Au click sur le bouton, on débloque les boutons valider et refuser
                btest1_validate5.setEnabled(true);
                btest1_validate5.setClickable(true);
                btest1_validate5.setImageResource(R.drawable.validate);
                btest1_refuse5.setEnabled(true);
                btest1_refuse5.setClickable(true);
                btest1_refuse5.setImageResource(R.drawable.refuse);
                test1_layout5.setBackgroundColor(Color.TRANSPARENT);
                btest1_image6.setEnabled(true);
                btest1_image6.setClickable(true);
                test1_layout6.setBackgroundColor(Color.YELLOW);
            }
        });
        btest1_validate5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on affiche un calque vert sur l'image A MODIFIER
                test1_layout5.setBackgroundColor(Color.GREEN);
                quotation_image5 = true;
                q5=1;
                activateNext();
            }
        });
        btest1_refuse5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on affiche un calque rouge sur l'image A MODIFIER
                test1_layout5.setBackgroundColor(Color.RED);
                quotation_image5 = true;
                q5=0;
                activateNext();
            }
        });

    //Image 6
        btest1_image6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Test1.this, Test1_image1.class);
                intent.putExtra("key", 6);
                startActivity(intent);

                // Au click sur le bouton, on débloque les boutons valider et refuser
                btest1_validate6.setEnabled(true);
                btest1_validate6.setClickable(true);
                btest1_validate6.setImageResource(R.drawable.validate);
                btest1_refuse6.setEnabled(true);
                btest1_refuse6.setClickable(true);
                btest1_refuse6.setImageResource(R.drawable.refuse);
                test1_layout6.setBackgroundColor(Color.TRANSPARENT);
            }
        });
        btest1_validate6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on affiche un calque vert sur l'image A MODIFIER
                test1_layout6.setBackgroundColor(Color.GREEN);
                quotation_image6 = true;
                q6=1;
                activateNext();
            }
        });
        btest1_refuse6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on affiche un calque rouge sur l'image A MODIFIER
                test1_layout6.setBackgroundColor(Color.RED);
                quotation_image6 = true;
                q6=0;
                activateNext();
            }
        });

        btest1_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on passe au test suivant et on envoie le score a la gestion des points

                gestPts.setT1(q1 + q2 + q3 + q4 + q5 + q6);
                Intent itest2 = new Intent(Test1.this, Test2.class);
                startActivity(itest2);
            }
        });


    } // Fin d'instance



    //Check if everything is quoted to unlock the button to the next test
    public void activateNext() {
        if (this.quotation_image1 == true && this.quotation_image2 == true && this.quotation_image3 == true &&
                quotation_image4 == true && quotation_image5 == true && quotation_image6 == true ) {
            btest1_next.setEnabled(true);
            btest1_next.setClickable(true);
            btest1_next.setImageResource(R.drawable.next);
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
