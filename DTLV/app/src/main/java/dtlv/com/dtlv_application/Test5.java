package dtlv.com.dtlv_application;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Utilisateur on 2015-12-06.
 */
public class Test5 extends Activity{

    private GestionPoint gestPts;

    private TextView btest5_text1 = null;
    private boolean quotation_text1 = false;
    private ImageButton btest5_validate1 = null;
    private ImageButton btest5_refuse1 = null;
    private LinearLayout test5_layout1 = null;

    private TextView btest5_text2 = null;
    private ImageButton btest5_text1_back = null;
    private boolean quotation_text2 = false;
    private ImageButton btest5_validate2 = null;
    private ImageButton btest5_refuse2 = null;
    private LinearLayout test5_layout2 = null;

    private TextView btest5_text3 = null;
    private boolean quotation_text3 = false;
    private ImageButton btest5_validate3 = null;
    private ImageButton btest5_refuse3 = null;
    private LinearLayout test5_layout3 = null;

    private TextView btest5_text4 = null;
    private boolean quotation_text4 = false;
    private ImageButton btest5_validate4 = null;
    private ImageButton btest5_refuse4 = null;
    private LinearLayout test5_layout4 = null;

    private TextView btest5_text5 = null;
    private boolean quotation_text5 = false;
    private ImageButton btest5_validate5 = null;
    private ImageButton btest5_refuse5 = null;
    private LinearLayout test5_layout5 = null;

    private TextView btest5_text6 = null;
    private boolean quotation_text6 = false;
    private ImageButton btest5_validate6 = null;
    private ImageButton btest5_refuse6 = null;
    private LinearLayout test5_layout6 = null;

    private ImageButton btest5_next = null;


    //Variables de quotation
    private int q1 = 0;
    private int q2 = 0;
    private int q3 = 0;
    private int q4 = 0;
    private int q5 = 0;
    private int q6 = 0;

    public Test5(){
        //Recuperation du systeme de gestion des points
        gestPts = Menu.gestPts;
    }
    @Override
    public void onBackPressed() {
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test5);
        btest5_text1 = (TextView) findViewById(R.id.test5_text1);
        btest5_validate1 = (ImageButton) findViewById(R.id.test5_validate1);
        btest5_validate1.setEnabled(false);
        btest5_validate1.setClickable(false);
        btest5_validate1.setImageResource(R.drawable.validate_grey);
        btest5_refuse1 = (ImageButton) findViewById(R.id.test5_refuse1);
        btest5_refuse1.setEnabled(false);
        btest5_refuse1.setClickable(false);
        btest5_refuse1.setImageResource(R.drawable.refuse_grey);
        test5_layout1 = (LinearLayout) findViewById(R.id.test5_layout1);
        test5_layout1.setBackgroundColor(getResources().getColor(R.color.yellow));
        btest5_text2 = (TextView) findViewById(R.id.test5_text2);
        btest5_text2.setEnabled(false);
        btest5_text2.setClickable(false);
        btest5_validate2 = (ImageButton) findViewById(R.id.test5_validate2);
        btest5_validate2.setEnabled(false);
        btest5_validate2.setClickable(false);
        btest5_validate2.setImageResource(R.drawable.validate_grey);
        btest5_refuse2 = (ImageButton) findViewById(R.id.test5_refuse2);
        btest5_refuse2.setEnabled(false);
        btest5_refuse2.setClickable(false);
        btest5_refuse2.setImageResource(R.drawable.refuse_grey);
        test5_layout2 = (LinearLayout) findViewById(R.id.test5_layout2);
        btest5_text3 = (TextView) findViewById(R.id.test5_text3);
        btest5_text3.setEnabled(false);
        btest5_text3.setClickable(false);
        btest5_validate3 = (ImageButton) findViewById(R.id.test5_validate3);
        btest5_validate3.setEnabled(false);
        btest5_validate3.setClickable(false);
        btest5_validate3.setImageResource(R.drawable.validate_grey);
        btest5_refuse3 = (ImageButton) findViewById(R.id.test5_refuse3);
        btest5_refuse3.setEnabled(false);
        btest5_refuse3.setClickable(false);
        btest5_refuse3.setImageResource(R.drawable.refuse_grey);
        test5_layout3 = (LinearLayout) findViewById(R.id.test5_layout3);
        btest5_text4 = (TextView) findViewById(R.id.test5_text4);
        btest5_text4.setEnabled(false);
        btest5_text4.setClickable(false);
        btest5_validate4 = (ImageButton) findViewById(R.id.test5_validate4);
        btest5_validate4.setEnabled(false);
        btest5_validate4.setClickable(false);
        btest5_validate4.setImageResource(R.drawable.validate_grey);
        btest5_refuse4 = (ImageButton) findViewById(R.id.test5_refuse4);
        btest5_refuse4.setEnabled(false);
        btest5_refuse4.setClickable(false);
        btest5_refuse4.setImageResource(R.drawable.refuse_grey);
        test5_layout4 = (LinearLayout) findViewById(R.id.test5_layout4);
        btest5_text5 = (TextView) findViewById(R.id.test5_text5);
        btest5_text5.setEnabled(false);
        btest5_text5.setClickable(false);
        btest5_validate5 = (ImageButton) findViewById(R.id.test5_validate5);
        btest5_validate5.setEnabled(false);
        btest5_validate5.setClickable(false);
        btest5_validate5.setImageResource(R.drawable.validate_grey);
        btest5_refuse5 = (ImageButton) findViewById(R.id.test5_refuse5);
        btest5_refuse5.setEnabled(false);
        btest5_refuse5.setClickable(false);
        btest5_refuse5.setImageResource(R.drawable.refuse_grey);
        test5_layout5 = (LinearLayout) findViewById(R.id.test5_layout5);
        btest5_text6 = (TextView) findViewById(R.id.test5_text6);
        btest5_text6.setEnabled(false);
        btest5_text6.setClickable(false);
        btest5_validate6 = (ImageButton) findViewById(R.id.test5_validate6);
        btest5_validate6.setEnabled(false);
        btest5_validate6.setClickable(false);
        btest5_validate6.setImageResource(R.drawable.validate_grey);
        btest5_refuse6 = (ImageButton) findViewById(R.id.test5_refuse6);
        btest5_refuse6.setEnabled(false);
        btest5_refuse6.setClickable(false);
        btest5_refuse6.setImageResource(R.drawable.refuse_grey);
        test5_layout6 = (LinearLayout) findViewById(R.id.test5_layout6);
        btest5_next = (ImageButton) findViewById(R.id.test5_bnext);
        btest5_next.setEnabled(true);
        btest5_next.setClickable(true);
        btest5_next.setImageResource(R.drawable.next_grey);

        //Text 1
        btest5_text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Test5.this, Test5_text.class);
                intent.putExtra("key", 1);
                startActivity(intent);
                // Au click sur le bouton, on débloque les boutons valider et refuser
                btest5_validate1.setEnabled(true);
                btest5_validate1.setClickable(true);
                btest5_validate1.setImageResource(R.drawable.validate);
                btest5_refuse1.setEnabled(true);
                btest5_refuse1.setClickable(true);
                btest5_refuse1.setImageResource(R.drawable.refuse);
                btest5_text2.setEnabled(true);
                btest5_text2.setClickable(true);
                test5_layout1.setBackgroundColor(Color.TRANSPARENT);
                test5_layout2.setBackgroundColor(getResources().getColor(R.color.yellow));
            }
        });

        btest5_validate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test5_layout1.setBackgroundColor(getResources().getColor(R.color.green));
                quotation_text1 = true;
                //On cote q1 comme juste
                q1=1;
                //Check if all pictures are cote to unluck the button to the next test
                if (quotation_text1 == true && quotation_text2 == true && quotation_text3 == true &&
                        quotation_text4 == true && quotation_text5 == true && quotation_text6 == true) {
                    btest5_next.setEnabled(true);
                    btest5_next.setClickable(true);
                    btest5_next.setImageResource(R.drawable.next);
                }
            }
        });
        btest5_refuse1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test5_layout1.setBackgroundColor(getResources().getColor(R.color.red));
                quotation_text1 = true;
                q1=0;
                //Check if all pictures are cote to unluck the button to the next test
                if (quotation_text1 == true && quotation_text2 == true && quotation_text3 == true &&
                        quotation_text4 == true && quotation_text5 == true && quotation_text6 == true) {
                    btest5_next.setEnabled(true);
                    btest5_next.setClickable(true);
                    btest5_next.setImageResource(R.drawable.next);
                }
            }
        });

        //Text 2
        btest5_text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Test5.this, Test5_text.class);
                intent.putExtra("key", 2);
                startActivity(intent);
                // Au click sur le bouton, on débloque les boutons valider et refuser
                btest5_validate2.setEnabled(true);
                btest5_validate2.setClickable(true);
                btest5_validate2.setImageResource(R.drawable.validate);
                btest5_refuse2.setEnabled(true);
                btest5_refuse2.setClickable(true);
                btest5_refuse2.setImageResource(R.drawable.refuse);
                btest5_text3.setEnabled(true);
                btest5_text3.setClickable(true);
                test5_layout2.setBackgroundColor(Color.TRANSPARENT);
                test5_layout3.setBackgroundColor(getResources().getColor(R.color.yellow));
            }
        });
        btest5_validate2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test5_layout2.setBackgroundColor(getResources().getColor(R.color.green));
                quotation_text2 = true;
                q2=1;
                //Check if all pictures are cote to unluck the button to the next test
                if (quotation_text1 == true && quotation_text2 == true && quotation_text3 == true &&
                        quotation_text4 == true && quotation_text5 == true && quotation_text6 == true) {
                    btest5_next.setEnabled(true);
                    btest5_next.setClickable(true);
                    btest5_next.setImageResource(R.drawable.next);
                }
            }
        });
        btest5_refuse2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test5_layout2.setBackgroundColor(getResources().getColor(R.color.red));
                quotation_text2 = true;
                q2=0;
                //Check if all pictures are cote to unluck the button to the next test
                if (quotation_text1 == true && quotation_text2 == true && quotation_text3 == true &&
                        quotation_text4 == true && quotation_text5 == true && quotation_text6 == true) {
                    btest5_next.setEnabled(true);
                    btest5_next.setClickable(true);
                    btest5_next.setImageResource(R.drawable.next);
                }
            }
        });

        //Text 3
        btest5_text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Test5.this, Test5_text.class);
                intent.putExtra("key", 3);
                startActivity(intent);
                // Au click sur le bouton, on débloque les boutons valider et refuser
                btest5_validate3.setEnabled(true);
                btest5_validate3.setClickable(true);
                btest5_validate3.setImageResource(R.drawable.validate);
                btest5_refuse3.setEnabled(true);
                btest5_refuse3.setClickable(true);
                btest5_refuse3.setImageResource(R.drawable.refuse);
                btest5_text4.setEnabled(true);
                btest5_text4.setClickable(true);
                test5_layout3.setBackgroundColor(Color.TRANSPARENT);
                test5_layout4.setBackgroundColor(getResources().getColor(R.color.yellow));
            }
        });
        btest5_validate3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test5_layout3.setBackgroundColor(getResources().getColor(R.color.green));
                quotation_text3 = true;
                q3=1;
                //Check if all pictures are cote to unluck the button to the next test
                if (quotation_text1 == true && quotation_text2 == true && quotation_text3 == true &&
                        quotation_text4 == true && quotation_text5 == true && quotation_text6 == true) {
                    btest5_next.setEnabled(true);
                    btest5_next.setClickable(true);
                    btest5_next.setImageResource(R.drawable.next);
                }
            }
        });
        btest5_refuse3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test5_layout3.setBackgroundColor(getResources().getColor(R.color.red));
                quotation_text3 = true;
                q3=0;
                //Check if all pictures are cote to unluck the button to the next test
                if (quotation_text1 == true && quotation_text2 == true && quotation_text3 == true &&
                        quotation_text4 == true && quotation_text5 == true && quotation_text6 == true) {
                    btest5_next.setEnabled(true);
                    btest5_next.setClickable(true);
                    btest5_next.setImageResource(R.drawable.next);
                }
            }
        });

        //Text 4
        btest5_text4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Test5.this, Test5_text.class);
                intent.putExtra("key", 4);
                startActivity(intent);
                // Au click sur le bouton, on débloque les boutons valider et refuser
                btest5_validate4.setEnabled(true);
                btest5_validate4.setClickable(true);
                btest5_validate4.setImageResource(R.drawable.validate);
                btest5_refuse4.setEnabled(true);
                btest5_refuse4.setClickable(true);
                btest5_refuse4.setImageResource(R.drawable.refuse);
                btest5_text5.setEnabled(true);
                btest5_text5.setClickable(true);
                test5_layout4.setBackgroundColor(Color.TRANSPARENT);
                test5_layout5.setBackgroundColor(getResources().getColor(R.color.yellow));
            }
        });
        btest5_validate4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test5_layout4.setBackgroundColor(getResources().getColor(R.color.green));
                quotation_text4 = true;
                q4=1;
                //Check if all pictures are cote to unluck the button to the next test
                if (quotation_text1 == true && quotation_text2 == true && quotation_text3 == true &&
                        quotation_text4 == true && quotation_text5 == true && quotation_text6 == true) {
                    btest5_next.setEnabled(true);
                    btest5_next.setClickable(true);
                    btest5_next.setImageResource(R.drawable.next);
                }
            }
        });
        btest5_refuse4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test5_layout4.setBackgroundColor(getResources().getColor(R.color.red));
                quotation_text4 = true;
                q4=0;
                //Check if all pictures are cote to unluck the button to the next test
                if (quotation_text1 == true && quotation_text2 == true && quotation_text3 == true &&
                        quotation_text4 == true && quotation_text5 == true && quotation_text6 == true) {
                    btest5_next.setEnabled(true);
                    btest5_next.setClickable(true);
                    btest5_next.setImageResource(R.drawable.next);
                }
            }
        });

        //Text 5
        btest5_text5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Test5.this, Test5_text.class);
                intent.putExtra("key", 5);
                startActivity(intent);
                // Au click sur le bouton, on débloque les boutons valider et refuser
                btest5_validate5.setEnabled(true);
                btest5_validate5.setClickable(true);
                btest5_validate5.setImageResource(R.drawable.validate);
                btest5_refuse5.setEnabled(true);
                btest5_refuse5.setClickable(true);
                btest5_refuse5.setImageResource(R.drawable.refuse);
                btest5_text6.setEnabled(true);
                btest5_text6.setClickable(true);
                test5_layout5.setBackgroundColor(Color.TRANSPARENT);
                test5_layout6.setBackgroundColor(getResources().getColor(R.color.yellow));
            }
        });
        btest5_validate5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test5_layout5.setBackgroundColor(getResources().getColor(R.color.green));
                quotation_text5 = true;
                q5=1;
                //Check if all pictures are cote to unluck the button to the next test
                if (quotation_text1 == true && quotation_text2 == true && quotation_text3 == true &&
                        quotation_text4 == true && quotation_text5 == true && quotation_text6 == true) {
                    btest5_next.setEnabled(true);
                    btest5_next.setClickable(true);
                    btest5_next.setImageResource(R.drawable.next);
                }
            }
        });
        btest5_refuse5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test5_layout5.setBackgroundColor(getResources().getColor(R.color.red));
                quotation_text5 = true;
                q5=0;
                //Check if all pictures are cote to unluck the button to the next test
                if (quotation_text1 == true && quotation_text2 == true && quotation_text3 == true &&
                        quotation_text4 == true && quotation_text5 == true && quotation_text6 == true) {
                    btest5_next.setEnabled(true);
                    btest5_next.setClickable(true);
                    btest5_next.setImageResource(R.drawable.next);
                }
            }
        });

        //Text 6
        btest5_text6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Test5.this, Test5_text.class);
                intent.putExtra("key", 6);
                startActivity(intent);
                // Au click sur le bouton, on débloque les boutons valider et refuser
                btest5_validate6.setEnabled(true);
                btest5_validate6.setClickable(true);
                btest5_validate6.setImageResource(R.drawable.validate);
                btest5_refuse6.setEnabled(true);
                btest5_refuse6.setClickable(true);
                btest5_refuse6.setImageResource(R.drawable.refuse);
                test5_layout6.setBackgroundColor(Color.TRANSPARENT);
            }
        });
        btest5_validate6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test5_layout6.setBackgroundColor(getResources().getColor(R.color.green));
                quotation_text6 = true;
                q6=1;
                //Check if all pictures are cote to unluck the button to the next test
                if (quotation_text1 == true && quotation_text2 == true && quotation_text3 == true &&
                        quotation_text4 == true && quotation_text5 == true && quotation_text6 == true) {
                    btest5_next.setEnabled(true);
                    btest5_next.setClickable(true);
                    btest5_next.setImageResource(R.drawable.next);
                }
            }
        });
        btest5_refuse6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test5_layout6.setBackgroundColor(getResources().getColor(R.color.red));
                quotation_text6 = true;
                q6=0;
                //Check if all pictures are cote to unlock the button to the next test
                if (quotation_text1 == true && quotation_text2 == true && quotation_text3 == true &&
                        quotation_text4 == true && quotation_text5 == true && quotation_text6 == true) {
                    btest5_next.setEnabled(true);
                    btest5_next.setClickable(true);
                    btest5_next.setImageResource(R.drawable.next);
                }
            }
        });

        btest5_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on passe au test suivant et on envoit le score a la gestion des points
                gestPts.setT5(q1+q2+q3+q4+q5+q6);
                Intent itest5 = new Intent(Test5.this, Test6.class);
                startActivity(itest5);
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
