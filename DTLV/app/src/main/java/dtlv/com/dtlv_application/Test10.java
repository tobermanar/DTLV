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

    private LinearLayout test10_layout1 = null;
    private LinearLayout test10_layout2 = null;
    private LinearLayout test10_layout3 = null;

    private ImageButton btest10_next = null;

    //Variables de quotation
    private int q1 = 0;
    private int q2 = 0;
    private int q3 = 0;

    private GestionPoint gestPts;

    private ImageButton btest10_help = null;
    private AlertDialog alertDialog = null;
    private TextView tv_test10 = null;

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
        tuto_bt10.setBackgroundColor(Color.YELLOW);

        btest10_validate1 = (ImageButton) findViewById(R.id.test10_text1_bvalid);
        btest10_refuse1 = (ImageButton) findViewById(R.id.test10_text1_brefuse);
        btest10_validate2 = (ImageButton) findViewById(R.id.test10_text2_bvalid);
        btest10_refuse2 = (ImageButton) findViewById(R.id.test10_text2_brefuse);
        btest10_validate3 = (ImageButton) findViewById(R.id.test10_text3_bvalid);
        btest10_refuse3 = (ImageButton) findViewById(R.id.test10_text3_brefuse);
        test10_layout1 = (LinearLayout) findViewById(R.id.test10_layout1);
        test10_layout2 = (LinearLayout) findViewById(R.id.test10_layout2);
        test10_layout3 = (LinearLayout) findViewById(R.id.test10_layout3);

        btest10_help = (ImageButton) findViewById(R.id.test10_bhelp);

        //Gestion des notations
        btest10_validate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test10_layout1.setBackgroundColor(getResources().getColor(R.color.red));
                quotation_1 = true;
                q1=0;
                activateNext();
            }
        });
        btest10_refuse1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test10_layout1.setBackgroundColor(getResources().getColor(R.color.green));
                quotation_1 = true;
                q1=1;
                activateNext();
            }
        });
        btest10_validate2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test10_layout2.setBackgroundColor(getResources().getColor(R.color.red));
                quotation_2 = true;
                q2=0;
                activateNext();
            }
        });
        btest10_refuse2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test10_layout2.setBackgroundColor(getResources().getColor(R.color.green));
                quotation_2 = true;
                q2=1;
                activateNext();
            }
        });
        btest10_validate3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test10_layout3.setBackgroundColor(getResources().getColor(R.color.red));
                q3=0;
                quotation_3 = true;
                activateNext();
            }
        });
        btest10_refuse3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test10_layout3.setBackgroundColor(getResources().getColor(R.color.green));
                quotation_3 = true;
                q3=1;
                activateNext();
            }
        });

        btest10_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on passe au test suivant et on envoit le score a la gestion des points
                gestPts.setT10(q1+q2+q3);
                Intent itest10 = new Intent(Test10.this, Results.class);
                startActivity(itest10);
            }
        });

        btest10_help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog = new AlertDialog.Builder(Test10.this).create();
                alertDialog.setTitle(getResources().getString(R.string.help_test10_title));
                String admin = getResources().getString(R.string.help_admin);
                String quote = getResources().getString(R.string.help_quote);

                tv_test10 = new TextView(Test10.this);

                Spannable st10_1 = getTextWithImages(alertDialog.getContext(), getResources().getString(R.string.help_test10_text1));
                Spannable st10_2 = getTextWithImages(alertDialog.getContext(), getResources().getString(R.string.help_test10_text2));

                tv_test10.setText(TextUtils.concat(admin, st10_1, quote, st10_2));

                alertDialog.setView(tv_test10);

                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                alertDialog.show();
            }
        });


    }//end OnCreate

    //Check if everything is quoted to unlock the button to the next test
    public void activateNext() {
        if (quotation_1 == true && quotation_2 == true && quotation_3 == true) {
            btest10_next.setEnabled(true);
            btest10_next.setClickable(true);
            btest10_next.setImageResource(R.drawable.next);
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
            icon.setBounds(0, 0, tv_test10.getLineHeight(), tv_test10.getLineHeight());
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
