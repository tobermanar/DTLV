package dtlv.com.dtlv_application;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Utilisateur on 2015-12-06.
 */
public class Test1 extends Activity{

    private GestionPoint gestPts;

    private ImageButton btest1_image1 = null,btest1_validate1 = null,btest1_refuse1 = null;
    private boolean quotation_image1 = false;
    private ImageButton btest1_image2 = null,btest1_validate2 = null,btest1_refuse2 = null;
    private boolean quotation_image2 = false;
    private ImageButton btest1_image3 = null,btest1_validate3 = null,btest1_refuse3 = null;
    private boolean quotation_image3 = false;
    private ImageButton btest1_image4 = null,btest1_validate4 = null,btest1_refuse4 = null;
    private boolean quotation_image4 = false;
    private ImageButton btest1_image5 = null,btest1_validate5 = null,btest1_refuse5 = null;
    private boolean quotation_image5 = false;
    private ImageButton btest1_image6 = null,btest1_validate6 = null,btest1_refuse6 = null;
    private boolean quotation_image6 = false;

    private ImageButton btest1_next = null;
    //Variables de quotation
    private int q1 = 0,q2 = 0,q3 = 0,q4 = 0,q5 = 0,q6 = 0;

    private LinearLayout test1_layout1 = null,test1_layout2 = null,test1_layout3 = null,test1_layout4 = null,test1_layout5 = null,test1_layout6 = null;

    private ImageButton btest1_help = null;
    private AlertDialog alertDialog = null;
    private TextView tv_test1 = null;

    private Button tuto_bt1 = null;
    @Override
    public void onBackPressed() {
    }
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
        btest1_next = (ImageButton) findViewById(R.id.test1_bnext);
        btest1_next.setEnabled(false);
        btest1_next.setClickable(false);
        btest1_next.setImageResource(R.drawable.next_grey);

        test1_layout1 = (LinearLayout) findViewById(R.id.test1_layout1);
        test1_layout1.setBackgroundColor(getResources().getColor(R.color.yellow));
        test1_layout2 = (LinearLayout) findViewById(R.id.test1_layout2);
        test1_layout3 = (LinearLayout) findViewById(R.id.test1_layout3);
        test1_layout4 = (LinearLayout) findViewById(R.id.test1_layout4);
        test1_layout5 = (LinearLayout) findViewById(R.id.test1_layout5);
        test1_layout6 = (LinearLayout) findViewById(R.id.test1_layout6);

        btest1_help = (ImageButton) findViewById(R.id.test1_bhelp);
        tuto_bt1 = (Button) findViewById(R.id.tuto_bt1);
        tuto_bt1.setBackgroundColor(Color.YELLOW);

        //Image 1
        btest1_image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Test1.this, Test1_image.class);
                intent.putExtra("key", 1);
                startActivity(intent);
                test1_layout1.setBackgroundColor(Color.TRANSPARENT);
                Config.compt.setTest1_1(1);
            }
        });

        btest1_validate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test1_layout1.setBackgroundColor(getResources().getColor(R.color.green));
                quotation_image1 = true;
                //cote la question 1 comme juste
                q1=1;
                activateNext();
            }
        });
        btest1_refuse1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test1_layout1.setBackgroundColor(getResources().getColor(R.color.red));
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
                Intent intent = new Intent(Test1.this, Test1_image.class);
                intent.putExtra("key", 2);
                test1_layout2.setBackgroundColor(Color.TRANSPARENT);
                startActivity(intent);
                Config.compt.setTest1_2(1);
            }
        });
        btest1_validate2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on affiche un calque vert sur l'image
                test1_layout2.setBackgroundColor(getResources().getColor(R.color.green));
                quotation_image2 = true;
                q2=1;
                activateNext();
            }
        });
        btest1_refuse2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on affiche un calque rouge sur l'image
                test1_layout2.setBackgroundColor(getResources().getColor(R.color.red));
                quotation_image2 = true;
                q2=0;
                activateNext();
            }
        });

    //Image 3
        btest1_image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Test1.this, Test1_image.class);
                intent.putExtra("key", 3);
                test1_layout3.setBackgroundColor(Color.TRANSPARENT);
                startActivity(intent);
                Config.compt.setTest1_3(1);
            }
        });
        btest1_validate3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on affiche un calque vert sur l'image
                test1_layout3.setBackgroundColor(getResources().getColor(R.color.green));
                quotation_image3 = true;
                q3=1;
                activateNext();
            }
        });
        btest1_refuse3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on affiche un calque rouge sur l'image
                test1_layout3.setBackgroundColor(getResources().getColor(R.color.red));
                quotation_image3 = true;
                q3=0;
                activateNext();
            }
        });

    //Image 4
        btest1_image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Test1.this, Test1_image.class);
                intent.putExtra("key", 4);
                test1_layout4.setBackgroundColor(Color.TRANSPARENT);
                startActivity(intent);
                Config.compt.setTest1_4(1);
            }
        });
        btest1_validate4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on affiche un calque vert sur l'image A MODIFIER
                test1_layout4.setBackgroundColor(getResources().getColor(R.color.green));
                quotation_image4 = true;
                q4=1;
                activateNext();
            }
        });
        btest1_refuse4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on affiche un calque rouge sur l'image A MODIFIER
                test1_layout4.setBackgroundColor(getResources().getColor(R.color.red));
                quotation_image4 = true;
                q4=0;
                activateNext();
            }
        });

    //Image 5
        btest1_image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Test1.this, Test1_image.class);
                intent.putExtra("key", 5);
                test1_layout5.setBackgroundColor(Color.TRANSPARENT);
                startActivity(intent);
                Config.compt.setTest1_5(1);
            }
        });
        btest1_validate5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on affiche un calque vert sur l'image A MODIFIER
                test1_layout5.setBackgroundColor(getResources().getColor(R.color.green));
                quotation_image5 = true;
                q5=1;
                activateNext();
            }
        });
        btest1_refuse5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on affiche un calque rouge sur l'image A MODIFIER
                test1_layout5.setBackgroundColor(getResources().getColor(R.color.red));
                quotation_image5 = true;
                q5=0;
                activateNext();
            }
        });

    //Image 6
        btest1_image6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Test1.this, Test1_image.class);
                intent.putExtra("key", 6);
                test1_layout6.setBackgroundColor(Color.TRANSPARENT);
                startActivity(intent);
                Config.compt.setTest1_6(1);
            }
        });
        btest1_validate6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on affiche un calque vert sur l'image A MODIFIER
                test1_layout6.setBackgroundColor(getResources().getColor(R.color.green));
                quotation_image6 = true;
                q6 = 1;
                activateNext();
            }
        });
        btest1_refuse6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on affiche un calque rouge sur l'image A MODIFIER
                test1_layout6.setBackgroundColor(getResources().getColor(R.color.red));
                quotation_image6 = true;
                q6 = 0;
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
        btest1_help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog = new AlertDialog.Builder(Test1.this).create();
                alertDialog.setTitle(getResources().getString(R.string.help_test1_title));
                String admin = getResources().getString(R.string.help_admin);
                String quote = getResources().getString(R.string.help_quote);

                /*String t1 = getResources().getString(R.string.tuto_test1_text1);
                String t2 = getResources().getString(R.string.tuto_test1_text2);
                String t3 = getResources().getString(R.string.tuto_test1_text3);
                String t4 = getResources().getString(R.string.tuto_test1_text4);

                alertDialog.setMessage(ration + " : " + t1 + admin + " : " + t2 + instruct + " : " + t3 + quote + " : " + t4);*/

                tv_test1 = new TextView(Test1.this);

                Spannable st1_1 = getTextWithImages(alertDialog.getContext(), getResources().getString(R.string.help_test1_text1));
                Spannable st1_2 = getTextWithImages(alertDialog.getContext(), getResources().getString(R.string.help_test1_text2));

                tv_test1.setText(TextUtils.concat(admin, st1_1, quote, st1_2));

                alertDialog.setView(tv_test1);

                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                alertDialog.show();
            }
        });
    } // Fin d'instance

    @Override
    public void onResume()
    {
        activatePictures();
        super.onResume();
    }

    //Deal with the color and the unlocking of buttons and pictures
    public void activatePictures() {
        // Au click sur le bouton, on débloque les boutons valider et refuser et on affiche le suivant en Jaune
        if(Config.compt.getTest1_1()== 1) {
            btest1_validate1.setEnabled(true);
            btest1_validate1.setClickable(true);
            btest1_validate1.setImageResource(R.drawable.validate);
            btest1_refuse1.setEnabled(true);
            btest1_refuse1.setClickable(true);
            btest1_refuse1.setImageResource(R.drawable.refuse);
            btest1_image2.setEnabled(true);
            btest1_image2.setClickable(true);
            if (Config.compt.getTest1_2() == 0)
            {
                test1_layout2.setBackgroundColor(Color.YELLOW);
            }
        }
        if (Config.compt.getTest1_2() == 1) {
            btest1_validate2.setEnabled(true);
            btest1_validate2.setClickable(true);
            btest1_validate2.setImageResource(R.drawable.validate);
            btest1_refuse2.setEnabled(true);
            btest1_refuse2.setClickable(true);
            btest1_refuse2.setImageResource(R.drawable.refuse);
            btest1_image3.setEnabled(true);
            btest1_image3.setClickable(true);
            if (Config.compt.getTest1_3() == 0)
            {
                test1_layout3.setBackgroundColor(getResources().getColor(R.color.yellow));
            }
        }
        if (Config.compt.getTest1_3() == 1) {
            btest1_validate3.setEnabled(true);
            btest1_validate3.setClickable(true);
            btest1_validate3.setImageResource(R.drawable.validate);
            btest1_refuse3.setEnabled(true);
            btest1_refuse3.setClickable(true);
            btest1_refuse3.setImageResource(R.drawable.refuse);
            btest1_image4.setEnabled(true);
            btest1_image4.setClickable(true);
            if (Config.compt.getTest1_4() == 0)
            {
                test1_layout4.setBackgroundColor(getResources().getColor(R.color.yellow));
            }
        }
        if (Config.compt.getTest1_4() == 1) {
            btest1_validate4.setEnabled(true);
            btest1_validate4.setClickable(true);
            btest1_validate4.setImageResource(R.drawable.validate);
            btest1_refuse4.setEnabled(true);
            btest1_refuse4.setClickable(true);
            btest1_refuse4.setImageResource(R.drawable.refuse);
            btest1_image5.setEnabled(true);
            btest1_image5.setClickable(true);
            if (Config.compt.getTest1_5() == 0)
            {
                test1_layout5.setBackgroundColor(getResources().getColor(R.color.yellow));
            }
        }
        if (Config.compt.getTest1_5() == 1) {
            btest1_validate5.setEnabled(true);
            btest1_validate5.setClickable(true);
            btest1_validate5.setImageResource(R.drawable.validate);
            btest1_refuse5.setEnabled(true);
            btest1_refuse5.setClickable(true);
            btest1_refuse5.setImageResource(R.drawable.refuse);
            btest1_image6.setEnabled(true);
            btest1_image6.setClickable(true);
            if (Config.compt.getTest1_6() == 0)
            {
                test1_layout6.setBackgroundColor(getResources().getColor(R.color.yellow));
            }
        }
        if (Config.compt.getTest1_6() == 1) {
            btest1_validate6.setEnabled(true);
            btest1_validate6.setClickable(true);
            btest1_validate6.setImageResource(R.drawable.validate);
            btest1_refuse6.setEnabled(true);
            btest1_refuse6.setClickable(true);
            btest1_refuse6.setImageResource(R.drawable.refuse);
        }
    }

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

    public Spannable getTextWithImages(Context context, CharSequence text)
    {
        Spannable spannable = Spannable.Factory.getInstance().newSpannable(text);
        addImages(context, spannable);
        return spannable;
    }

    public boolean addImages(Context context, Spannable spannable)
    {
        Pattern refImg = Pattern.compile("\\Q[img src=\\E([a-zA-Z0-9_]+?)\\Q/]\\E");
        boolean hasChanges = false;

        Matcher matcher = refImg.matcher(spannable);
        while (matcher.find())
        {
            boolean set = true;
            for (ImageSpan span : spannable.getSpans(matcher.start(), matcher.end(), ImageSpan.class))
            {
                if (spannable.getSpanStart(span) >= matcher.start()
                        && spannable.getSpanEnd(span) <= matcher.end())
                {
                    spannable.removeSpan(span);
                }
                else
                {
                    set = false;
                    break;
                }
            }
            String resname = spannable.subSequence(matcher.start(1),matcher.end(1)).toString().trim();
            int id = context.getResources().getIdentifier(resname, "drawable", context.getPackageName());
            Drawable icon = context.getResources().getDrawable(id);//,this.getTheme());
            icon.setBounds(0, 0, tv_test1.getLineHeight(), tv_test1.getLineHeight());
            if (set)
            {
                hasChanges = true;
                spannable.setSpan(new ImageSpan(icon,ImageSpan.ALIGN_BASELINE),
                matcher.start(),
                matcher.end(),
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            }
        }
        return hasChanges;
    }
}



