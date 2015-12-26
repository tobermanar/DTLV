package dtlv.com.dtlv_application;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


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

    private ImageButton btest3_help = null;
    private AlertDialog alertDialog = null;
    private TextView tv_test3 = null;


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

        btest3_help = (ImageButton) findViewById(R.id.test3_bhelp);

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

        btest3_help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog = new AlertDialog.Builder(Test3.this).create();
                alertDialog.setTitle(getResources().getString(R.string.help_test3_title));
                String admin = getResources().getString(R.string.help_admin);
                String quote = getResources().getString(R.string.help_quote);

                tv_test3 = new TextView(Test3.this);

                Spannable st3_1 = getTextWithImages(alertDialog.getContext(), getResources().getString(R.string.help_test3_text1));
                Spannable st3_2 = getTextWithImages(alertDialog.getContext(), getResources().getString(R.string.help_test3_text2));

                tv_test3.setText(TextUtils.concat(admin, st3_1, quote, st3_2));

                alertDialog.setView(tv_test3);

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
            icon.setBounds(0, 0, tv_test3.getLineHeight(), tv_test3.getLineHeight());
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
