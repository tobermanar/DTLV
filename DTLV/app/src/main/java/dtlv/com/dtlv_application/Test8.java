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
public class Test8 extends Activity{

    private ImageButton btest8_next = null;
    private ImageButton btest8_validate1 = null;
    private ImageButton btest8_refuse1 = null;
    private LinearLayout test8_layout1 = null;
    //Variables de quotation
    private int q1 = 0;

    private GestionPoint gestPts;

    private ImageButton btest8_help = null;
    private AlertDialog alertDialog = null;
    private TextView tv_test8 = null;

    private Button tuto_bt1 = null;
    private Button tuto_bt2 = null;
    private Button tuto_bt3 = null;
    private Button tuto_bt4 = null;
    private Button tuto_bt5 = null;
    private Button tuto_bt6 = null;
    private Button tuto_bt7 = null;
    private Button tuto_bt8 = null;

    public Test8(){
        gestPts = Menu.gestPts;
    }
    @Override
    public void onBackPressed() {
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test8);
        btest8_validate1 = (ImageButton) findViewById(R.id.test8_validate1);
        btest8_refuse1 = (ImageButton) findViewById(R.id.test8_refuse1);
        test8_layout1 = (LinearLayout) findViewById(R.id.test8_layout1);
        //test8_layout1.setBackgroundColor(getResources().getColor(R.color.yellow));

        btest8_next = (ImageButton) findViewById(R.id.test8_bnext);
        btest8_next.setEnabled(false);
        btest8_next.setClickable(false);
        btest8_next.setImageResource(R.drawable.next_grey);

        btest8_help = (ImageButton) findViewById(R.id.test8_bhelp);

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
        tuto_bt8.setBackgroundColor(getResources().getColor(R.color.yellow));

        btest8_validate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test8_layout1.setBackgroundColor(getResources().getColor(R.color.green));
                q1=1;
                btest8_next.setEnabled(true);
                btest8_next.setClickable(true);
                btest8_next.setImageResource(R.drawable.next);
            }
        });
        btest8_refuse1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test8_layout1.setBackgroundColor(getResources().getColor(R.color.red));
                q1=0;
                btest8_next.setEnabled(true);
                btest8_next.setClickable(true);
                btest8_next.setImageResource(R.drawable.next);
            }
        });


        btest8_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on passe au test suivant et on envoit le score a la gestion des points
                gestPts.setT8(q1);
                Intent itest8 = new Intent(Test8.this, Test9.class);
                startActivity(itest8);
            }
        });

        btest8_help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog = new AlertDialog.Builder(Test8.this).create();
                alertDialog.setTitle(getResources().getString(R.string.help_test8_title));
                String admin = getResources().getString(R.string.help_admin);
                String quote = getResources().getString(R.string.help_quote);

                tv_test8 = new TextView(Test8.this);

                Spannable st8_1 = getTextWithImages(alertDialog.getContext(), getResources().getString(R.string.help_test8_text1));
                Spannable st8_2 = getTextWithImages(alertDialog.getContext(), getResources().getString(R.string.help_test8_text2));

                tv_test8.setText(TextUtils.concat(admin, st8_1, quote, st8_2));

                alertDialog.setView(tv_test8, 20, 20, 20, 20);

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
            icon.setBounds(0, 0, tv_test8.getLineHeight(), tv_test8.getLineHeight());
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
