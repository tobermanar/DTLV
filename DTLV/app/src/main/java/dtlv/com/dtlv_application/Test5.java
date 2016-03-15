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
public class Test5 extends Activity{

    private GestionPoint gestPts;

    private TextView btest5_text1 = null;
    private boolean quotation_text1 = false;
    private ImageButton btest5_validate1 = null;
    private ImageButton btest5_refuse1 = null;
    private LinearLayout test5_layout1 = null;

    private TextView btest5_text2 = null;
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

    private ImageButton btest5_help = null;
    private AlertDialog alertDialog = null;
    private TextView tv_test5 = null;

    private Button tuto_bt1 = null;
    private Button tuto_bt2 = null;
    private Button tuto_bt3 = null;
    private Button tuto_bt4 = null;
    private Button tuto_bt5 = null;

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
        btest5_next.setEnabled(false);
        btest5_next.setClickable(false);
        btest5_next.setImageResource(R.drawable.next_grey);

        btest5_help = (ImageButton) findViewById(R.id.test5_bhelp);

        tuto_bt1 = (Button) findViewById(R.id.tuto_bt1);
        tuto_bt1.setBackgroundColor(Color.GREEN);
        tuto_bt2 = (Button) findViewById(R.id.tuto_bt2);
        tuto_bt2.setBackgroundColor(Color.GREEN);
        tuto_bt3 = (Button) findViewById(R.id.tuto_bt3);
        tuto_bt3.setBackgroundColor(Color.GREEN);
        tuto_bt4 = (Button) findViewById(R.id.tuto_bt4);
        tuto_bt4.setBackgroundColor(Color.GREEN);
        tuto_bt5 = (Button) findViewById(R.id.tuto_bt5);
        tuto_bt5.setBackgroundColor(Color.YELLOW);

        //Text 1
        btest5_text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Test5.this, Test5_text.class);
                intent.putExtra("key", 1);
                startActivity(intent);
                Config.compt.setTest5_1(1);
                test5_layout1.setBackgroundColor(Color.TRANSPARENT);
            }
        });

        btest5_validate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test5_layout1.setBackgroundColor(getResources().getColor(R.color.green));
                quotation_text1 = true;
                //On cote q1 comme juste
                q1=1;
                activateNext();
            }
        });
        btest5_refuse1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test5_layout1.setBackgroundColor(getResources().getColor(R.color.red));
                quotation_text1 = true;
                q1=0;
                activateNext();
            }
        });

        //Text 2
        btest5_text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Test5.this, Test5_text.class);
                intent.putExtra("key", 2);
                startActivity(intent);
                Config.compt.setTest5_2(1);
                test5_layout2.setBackgroundColor(Color.TRANSPARENT);
            }
        });
        btest5_validate2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test5_layout2.setBackgroundColor(getResources().getColor(R.color.green));
                quotation_text2 = true;
                q2=1;
                activateNext();
            }
        });
        btest5_refuse2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test5_layout2.setBackgroundColor(getResources().getColor(R.color.red));
                quotation_text2 = true;
                q2=0;
                activateNext();
            }
        });

        //Text 3
        btest5_text3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Test5.this, Test5_text.class);
                intent.putExtra("key", 3);
                startActivity(intent);
                Config.compt.setTest5_3(1);
                test5_layout3.setBackgroundColor(Color.TRANSPARENT);
            }
        });
        btest5_validate3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test5_layout3.setBackgroundColor(getResources().getColor(R.color.green));
                quotation_text3 = true;
                q3=1;
                activateNext();
            }
        });
        btest5_refuse3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test5_layout3.setBackgroundColor(getResources().getColor(R.color.red));
                quotation_text3 = true;
                q3=0;
                activateNext();
            }
        });

        //Text 4
        btest5_text4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Test5.this, Test5_text.class);
                intent.putExtra("key", 4);
                startActivity(intent);
                Config.compt.setTest5_4(1);
                test5_layout4.setBackgroundColor(Color.TRANSPARENT);
            }
        });
        btest5_validate4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test5_layout4.setBackgroundColor(getResources().getColor(R.color.green));
                quotation_text4 = true;
                q4=1;
                activateNext();
            }
        });
        btest5_refuse4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test5_layout4.setBackgroundColor(getResources().getColor(R.color.red));
                quotation_text4 = true;
                q4=0;
                activateNext();
            }
        });

        //Text 5
        btest5_text5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Test5.this, Test5_text.class);
                intent.putExtra("key", 5);
                startActivity(intent);
                Config.compt.setTest5_5(1);
                test5_layout5.setBackgroundColor(Color.TRANSPARENT);
            }
        });
        btest5_validate5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test5_layout5.setBackgroundColor(getResources().getColor(R.color.green));
                quotation_text5 = true;
                q5=1;
                activateNext();
            }
        });
        btest5_refuse5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test5_layout5.setBackgroundColor(getResources().getColor(R.color.red));
                quotation_text5 = true;
                q5=0;
                activateNext();
            }
        });

        //Text 6
        btest5_text6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Test5.this, Test5_text.class);
                intent.putExtra("key", 6);
                startActivity(intent);
                Config.compt.setTest5_6(1);
                test5_layout6.setBackgroundColor(Color.TRANSPARENT);
            }
        });
        btest5_validate6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test5_layout6.setBackgroundColor(getResources().getColor(R.color.green));
                quotation_text6 = true;
                q6=1;
                activateNext();
            }
        });
        btest5_refuse6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test5_layout6.setBackgroundColor(getResources().getColor(R.color.red));
                quotation_text6 = true;
                q6=0;
                activateNext();
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

        btest5_help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog = new AlertDialog.Builder(Test5.this).create();
                alertDialog.setTitle(getResources().getString(R.string.help_test5_title));
                String admin = getResources().getString(R.string.help_admin);
                String quote = getResources().getString(R.string.help_quote);

                tv_test5 = new TextView(Test5.this);

                Spannable st5_1 = getTextWithImages(alertDialog.getContext(), getResources().getString(R.string.help_test5_text1));
                Spannable st5_2 = getTextWithImages(alertDialog.getContext(), getResources().getString(R.string.help_test5_text2));

                tv_test5.setText(TextUtils.concat(admin, st5_1, quote, st5_2));

                alertDialog.setView(tv_test5);

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
        if(Config.compt.getTest5_1()== 1) {
            btest5_validate1.setEnabled(true);
            btest5_validate1.setClickable(true);
            btest5_validate1.setImageResource(R.drawable.validate);
            btest5_refuse1.setEnabled(true);
            btest5_refuse1.setClickable(true);
            btest5_refuse1.setImageResource(R.drawable.refuse);
            btest5_text2.setEnabled(true);
            btest5_text2.setClickable(true);
            if (Config.compt.getTest5_2() == 0)
            {
                test5_layout2.setBackgroundColor(getResources().getColor(R.color.yellow));
            }
        }
        if (Config.compt.getTest5_2() == 1) {
            btest5_validate2.setEnabled(true);
            btest5_validate2.setClickable(true);
            btest5_validate2.setImageResource(R.drawable.validate);
            btest5_refuse2.setEnabled(true);
            btest5_refuse2.setClickable(true);
            btest5_refuse2.setImageResource(R.drawable.refuse);
            btest5_text3.setEnabled(true);
            btest5_text3.setClickable(true);
            if (Config.compt.getTest5_3() == 0)
            {
                test5_layout3.setBackgroundColor(getResources().getColor(R.color.yellow));
            }
        }
        if (Config.compt.getTest5_3() == 1) {
            btest5_validate3.setEnabled(true);
            btest5_validate3.setClickable(true);
            btest5_validate3.setImageResource(R.drawable.validate);
            btest5_refuse3.setEnabled(true);
            btest5_refuse3.setClickable(true);
            btest5_refuse3.setImageResource(R.drawable.refuse);
            btest5_text4.setEnabled(true);
            btest5_text4.setClickable(true);
            if (Config.compt.getTest5_4() == 0)
            {
                test5_layout4.setBackgroundColor(getResources().getColor(R.color.yellow));
            }
        }
        if (Config.compt.getTest5_4() == 1) {
            btest5_validate4.setEnabled(true);
            btest5_validate4.setClickable(true);
            btest5_validate4.setImageResource(R.drawable.validate);
            btest5_refuse4.setEnabled(true);
            btest5_refuse4.setClickable(true);
            btest5_refuse4.setImageResource(R.drawable.refuse);
            btest5_text5.setEnabled(true);
            btest5_text5.setClickable(true);
            if (Config.compt.getTest5_5() == 0)
            {
                test5_layout5.setBackgroundColor(getResources().getColor(R.color.yellow));
            }
        }
        if (Config.compt.getTest5_5() == 1) {
            btest5_validate5.setEnabled(true);
            btest5_validate5.setClickable(true);
            btest5_validate5.setImageResource(R.drawable.validate);
            btest5_refuse5.setEnabled(true);
            btest5_refuse5.setClickable(true);
            btest5_refuse5.setImageResource(R.drawable.refuse);
            btest5_text6.setEnabled(true);
            btest5_text6.setClickable(true);
            if (Config.compt.getTest5_6() == 0)
            {
                test5_layout6.setBackgroundColor(getResources().getColor(R.color.yellow));
            }
        }
        if (Config.compt.getTest5_6() == 1) {
            btest5_validate6.setEnabled(true);
            btest5_validate6.setClickable(true);
            btest5_validate6.setImageResource(R.drawable.validate);
            btest5_refuse6.setEnabled(true);
            btest5_refuse6.setClickable(true);
            btest5_refuse6.setImageResource(R.drawable.refuse);
        }
    }


    //Check if everything is quoted to unlock the button to the next test
    public void activateNext() {
        if (this.quotation_text1 == true && this.quotation_text2 == true && this.quotation_text3 == true &&
                this.quotation_text4 == true && this.quotation_text5 == true && this.quotation_text6 == true) {
            btest5_next.setEnabled(true);
            btest5_next.setClickable(true);
            btest5_next.setImageResource(R.drawable.next);
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
            icon.setBounds(0, 0, tv_test5.getLineHeight(), tv_test5.getLineHeight());
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
