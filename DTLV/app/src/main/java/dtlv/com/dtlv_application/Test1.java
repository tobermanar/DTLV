package dtlv.com.dtlv_application;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

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

    private int ptsT1 = 0;

    public Test1(){
        //Recuperation du systeme de gestion des points
        gestPts = Menu.gestPts;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test1);
        btest1_image1 = (ImageButton) findViewById(R.id.test1_image1);
        btest1_validate1 = (ImageButton) findViewById(R.id.test1_validate1);
        btest1_image1_back = (ImageButton) findViewById(R.id.test1_image1_back);
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
        btest1_next.setEnabled(false);
        btest1_next.setClickable(false);
        btest1_next.setImageResource(R.drawable.next_grey);

    //Image 1
        btest1_image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on débloque les boutons valider et refuser
                btest1_validate1.setEnabled(true);
                btest1_validate1.setClickable(true);
                btest1_validate1.setImageResource(R.drawable.validate);
                btest1_refuse1.setEnabled(true);
                btest1_refuse1.setClickable(true);
                btest1_refuse1.setImageResource(R.drawable.refuse);
                btest1_image2.setEnabled(true);
                btest1_image2.setClickable(true);
                //setContentView(R.layout.test1_image1);
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
                // TODO Au click sur le bouton, on affiche un calque vert sur l'image A MODIFIER
                btest1_image1.setImageResource(R.drawable.validate);
                quotation_image1 = true;
                //On incremente les points
                ptsT1++;
                //Check if all pictures are cote to unluck the button to the next test
                if(quotation_image1 == true && quotation_image2 == true && quotation_image3 == true &&
                        quotation_image4 == true && quotation_image5 == true && quotation_image6 == true)
                {
                    btest1_next.setEnabled(true);
                    btest1_next.setClickable(true);
                    btest1_next.setImageResource(R.drawable.next);
                }
            }
        });
        btest1_refuse1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Au click sur le bouton, on affiche un calque rouge sur l'image A MODIFIER
                btest1_image1.setImageResource(R.drawable.refuse);
                quotation_image1 = true;
                //Check if all pictures are cote to unluck the button to the next test
                if(quotation_image1 == true && quotation_image2 == true && quotation_image3 == true &&
                        quotation_image4 == true && quotation_image5 == true && quotation_image6 == true)
                {
                    btest1_next.setEnabled(true);
                    btest1_next.setClickable(true);
                    btest1_next.setImageResource(R.drawable.next);
                }
            }
        });

    //Image 2
        btest1_image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on débloque les boutons valider et refuser
                btest1_validate2.setEnabled(true);
                btest1_validate2.setClickable(true);
                btest1_validate2.setImageResource(R.drawable.validate);
                btest1_refuse2.setEnabled(true);
                btest1_refuse2.setClickable(true);
                btest1_refuse2.setImageResource(R.drawable.refuse);
                btest1_image3.setEnabled(true);
                btest1_image3.setClickable(true);
            }
        });
        btest1_validate2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on affiche un calque vert sur l'image A MODIFIER
                btest1_image2.setImageResource(R.drawable.validate);
                quotation_image2 = true;
                //On incremente les points
                ptsT1++;
                //Check if all pictures are cote to unluck the button to the next test
                if(quotation_image1 == true && quotation_image2 == true && quotation_image3 == true &&
                        quotation_image4 == true && quotation_image5 == true && quotation_image6 == true)
                {
                    btest1_next.setEnabled(true);
                    btest1_next.setClickable(true);
                    btest1_next.setImageResource(R.drawable.next);
                }
            }
        });
        btest1_refuse2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on affiche un calque rouge sur l'image A MODIFIER
                btest1_image2.setImageResource(R.drawable.refuse);
                quotation_image2 = true;
                //Check if all pictures are cote to unluck the button to the next test
                if(quotation_image1 == true && quotation_image2 == true && quotation_image3 == true &&
                        quotation_image4 == true && quotation_image5 == true && quotation_image6 == true)
                {
                    btest1_next.setEnabled(true);
                    btest1_next.setClickable(true);
                    btest1_next.setImageResource(R.drawable.next);
                }
            }
        });

    //Image 3
        btest1_image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on débloque les boutons valider et refuser
                btest1_validate3.setEnabled(true);
                btest1_validate3.setClickable(true);
                btest1_validate3.setImageResource(R.drawable.validate);
                btest1_refuse3.setEnabled(true);
                btest1_refuse3.setClickable(true);
                btest1_refuse3.setImageResource(R.drawable.refuse);
                btest1_image4.setEnabled(true);
                btest1_image4.setClickable(true);
            }
        });
        btest1_validate3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on affiche un calque vert sur l'image A MODIFIER
                btest1_image3.setImageResource(R.drawable.validate);
                quotation_image3 = true;
                //On incremente les points
                ptsT1++;
                //Check if all pictures are cote to unluck the button to the next test
                if(quotation_image1 == true && quotation_image2 == true && quotation_image3 == true &&
                        quotation_image4 == true && quotation_image5 == true && quotation_image6 == true)
                {
                    btest1_next.setEnabled(true);
                    btest1_next.setClickable(true);
                    btest1_next.setImageResource(R.drawable.next);
                }
            }
        });
        btest1_refuse3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on affiche un calque rouge sur l'image A MODIFIER
                btest1_image3.setImageResource(R.drawable.refuse);
                quotation_image3 = true;
                //Check if all pictures are cote to unluck the button to the next test
                if(quotation_image1 == true && quotation_image2 == true && quotation_image3 == true &&
                        quotation_image4 == true && quotation_image5 == true && quotation_image6 == true)
                {
                    btest1_next.setEnabled(true);
                    btest1_next.setClickable(true);
                    btest1_next.setImageResource(R.drawable.next);
                }
            }
        });

    //Image 4
        btest1_image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on débloque les boutons valider et refuser
                btest1_validate4.setEnabled(true);
                btest1_validate4.setClickable(true);
                btest1_validate4.setImageResource(R.drawable.validate);
                btest1_refuse4.setEnabled(true);
                btest1_refuse4.setClickable(true);
                btest1_refuse4.setImageResource(R.drawable.refuse);
                btest1_image5.setEnabled(true);
                btest1_image5.setClickable(true);
            }
        });
        btest1_validate4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on affiche un calque vert sur l'image A MODIFIER
                btest1_image4.setImageResource(R.drawable.validate);
                quotation_image4 = true;
                //On incremente les points
                ptsT1++;
                //Check if all pictures are cote to unluck the button to the next test
                if(quotation_image1 == true && quotation_image2 == true && quotation_image3 == true &&
                        quotation_image4 == true && quotation_image5 == true && quotation_image6 == true)
                {
                    btest1_next.setEnabled(true);
                    btest1_next.setClickable(true);
                    btest1_next.setImageResource(R.drawable.next);
                }
            }
        });
        btest1_refuse4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on affiche un calque rouge sur l'image A MODIFIER
                btest1_image4.setImageResource(R.drawable.refuse);
                quotation_image4 = true;
                //Check if all pictures are cote to unluck the button to the next test
                if(quotation_image1 == true && quotation_image2 == true && quotation_image3 == true &&
                        quotation_image4 == true && quotation_image5 == true && quotation_image6 == true)
                {
                    btest1_next.setEnabled(true);
                    btest1_next.setClickable(true);
                    btest1_next.setImageResource(R.drawable.next);
                }
            }
        });

    //Image 5
        btest1_image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on débloque les boutons valider et refuser
                btest1_validate5.setEnabled(true);
                btest1_validate5.setClickable(true);
                btest1_validate5.setImageResource(R.drawable.validate);
                btest1_refuse5.setEnabled(true);
                btest1_refuse5.setClickable(true);
                btest1_refuse5.setImageResource(R.drawable.refuse);
                btest1_image6.setEnabled(true);
                btest1_image6.setClickable(true);
            }
        });
        btest1_validate5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on affiche un calque vert sur l'image A MODIFIER
                btest1_image5.setImageResource(R.drawable.validate);
                quotation_image5 = true;
                //On incremente les points
                ptsT1++;
                //Check if all pictures are cote to unluck the button to the next test
                if(quotation_image1 == true && quotation_image2 == true && quotation_image3 == true &&
                        quotation_image4 == true && quotation_image5 == true && quotation_image6 == true)
                {
                    btest1_next.setEnabled(true);
                    btest1_next.setClickable(true);
                    btest1_next.setImageResource(R.drawable.next);
                }
            }
        });
        btest1_refuse5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on affiche un calque rouge sur l'image A MODIFIER
                btest1_image5.setImageResource(R.drawable.refuse);
                quotation_image5 = true;
                //Check if all pictures are cote to unluck the button to the next test
                if(quotation_image1 == true && quotation_image2 == true && quotation_image3 == true &&
                        quotation_image4 == true && quotation_image5 == true && quotation_image6 == true)
                {
                    btest1_next.setEnabled(true);
                    btest1_next.setClickable(true);
                    btest1_next.setImageResource(R.drawable.next);
                }
            }
        });

    //Image 6
        btest1_image6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on débloque les boutons valider et refuser
                btest1_validate6.setEnabled(true);
                btest1_validate6.setClickable(true);
                btest1_validate6.setImageResource(R.drawable.validate);
                btest1_refuse6.setEnabled(true);
                btest1_refuse6.setClickable(true);
                btest1_refuse6.setImageResource(R.drawable.refuse);
            }
        });
        btest1_validate6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on affiche un calque vert sur l'image A MODIFIER
                btest1_image6.setImageResource(R.drawable.validate);
                quotation_image6 = true;
                //On incremente les points
                ptsT1++;
                //Check if all pictures are cote to unluck the button to the next test
                if(quotation_image1 == true && quotation_image2 == true && quotation_image3 == true &&
                        quotation_image4 == true && quotation_image5 == true && quotation_image6 == true)
                {
                    btest1_next.setEnabled(true);
                    btest1_next.setClickable(true);
                    btest1_next.setImageResource(R.drawable.next);
                }
            }
        });
        btest1_refuse6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on affiche un calque rouge sur l'image A MODIFIER
                btest1_image6.setImageResource(R.drawable.refuse);
                quotation_image6 = true;
                //Check if all pictures are cote to unlock the button to the next test
                if(quotation_image1 == true && quotation_image2 == true && quotation_image3 == true &&
                        quotation_image4 == true && quotation_image5 == true && quotation_image6 == true)
                {
                    btest1_next.setEnabled(true);
                    btest1_next.setClickable(true);
                    btest1_next.setImageResource(R.drawable.next);
                }
            }
        });

        btest1_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on passe au test suivant et on envoit le score a la gestion des points
                gestPts.setT1(ptsT1);
                Intent itest2 = new Intent(Test1.this, Test2.class);
                startActivity(itest2);
            }
        });


    } // Fin d'instance

    /**
     * Obtain the point manager
     * @param gestPtsF
     */
    public void giveGestPts(GestionPoint gestPtsF){
        this.gestPts = gestPtsF;
    }
}
