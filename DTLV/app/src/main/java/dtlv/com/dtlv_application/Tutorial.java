package dtlv.com.dtlv_application;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.text.Spannable;
import android.text.style.ImageSpan;

import org.w3c.dom.Text;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Created by Utilisateur on 2018-12-06.
 */
public class Tutorial extends Activity{


    /**
     * Idee: Pour l'appuis sur un bouton, changer l'image correspondante dans le "tuto_scroll" qui est un scroll_view
     * Soit changer la source de l'image dans le Image view? Ou alors carrement switcher entre les images view?
     */

    //private RadioButton r1 = null;
    private LinearLayout layout = null;
    private ScrollView scrollView = null;
    private ImageButton btuto_back = null;
    private TextView tv_intro = null;
    private TextView tv_test1 = null;
    private TextView tv_test2 = null;
    private TextView tv_test3 = null;
    private TextView tv_test4 = null;
    private TextView tv_test5 = null;
    private TextView tv_test6 = null;
    private TextView tv_test7 = null;
    private TextView tv_test8 = null;
    private TextView tv_test9 = null;
    private TextView tv_test10 = null;

    private Button btuto_set = null;
    private Button btuto_1 = null;
    private Button btuto_2 = null;
    private Button btuto_3 = null;
    private Button btuto_4 = null;
    private Button btuto_5 = null;
    private Button btuto_6 = null;
    private Button btuto_7 = null;
    private Button btuto_8 = null;
    private Button btuto_9 = null;
    private Button btuto_10 = null;
    private Button btuto_res = null;

    private TextView tv_intro_title = null;
    private TextView tv_intro_text = null;
    private TextView tv_set_title = null;
    private TextView tv_set_text = null;
    private TextView tv_test1_title = null;
    private TextView tv_test1_text = null;
    private TextView tv_test2_title = null;
    private TextView tv_test2_text = null;
    private TextView tv_test3_title = null;
    private TextView tv_test3_text = null;
    private TextView tv_test4_title = null;
    private TextView tv_test4_text = null;
    private TextView tv_test5_title = null;
    private TextView tv_test5_text = null;
    private TextView tv_test6_title = null;
    private TextView tv_test6_text = null;
    private TextView tv_test7_title = null;
    private TextView tv_test7_text = null;
    private TextView tv_test8_title = null;
    private TextView tv_test8_text = null;
    private TextView tv_test9_title = null;
    private TextView tv_test9_text = null;
    private TextView tv_test10_title = null;
    private TextView tv_test10_text = null;
    private TextView tv_res_title = null;
    private TextView tv_res_text = null;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tutorial);

        layout = (LinearLayout) findViewById(R.id.tuto_layout);
        scrollView = (ScrollView) findViewById(R.id.scrollView);

        String ration = getResources().getString(R.string.tuto_ration) + "\n\n";
        SpannableString span_ration = new SpannableString(ration);
        span_ration.setSpan(new UnderlineSpan(), 0, ration.length(), 0);

        String admin = getResources().getString(R.string.tuto_admin) + "\n\n";
        SpannableString span_admin = new SpannableString(admin);
        span_admin.setSpan(new UnderlineSpan(), 0, admin.length(), 0);

        String instruct = getResources().getString(R.string.tuto_instruct) + "\n\n";
        SpannableString span_instruct = new SpannableString(instruct);
        span_instruct.setSpan(new UnderlineSpan(), 0, instruct.length(), 0);

        String quote = getResources().getString(R.string.tuto_quote) + "\n\n";
        SpannableString span_quote = new SpannableString(quote);
        span_quote.setSpan(new UnderlineSpan(), 0, quote.length(), 0);



        /******   INTRODUCTION **********/
        /*tv_intro_title = (TextView) findViewById(R.id.tuto_text);
        tv_intro_title.setText(getResources().getString(R.string.tuto_introduction));
        tv_intro_title.setTextSize(20);
        tv_intro_title.setTypeface(Typeface.DEFAULT_BOLD);
        tv_intro_title.setPaintFlags(tv_intro_title.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);*/

        /*Spannable s = getTextWithImages(tv_intro_title.getContext(),getResources().getString(R.string.intro_text), tv_intro_text);
        tv_intro_text.setText(s, TextView.BufferType.SPANNABLE);*/

        /******** INTRODUCTION TEXT *******/
        tv_intro = new TextView(Tutorial.this);
        tv_intro.setText(Html.fromHtml(getResources().getString(R.string.tuto_introduction)));
        tv_intro.append(getResources().getString(R.string.tuto_intro_text));
        layout.setBackgroundColor(Color.TRANSPARENT);
        layout.addView(tv_intro);

        /******** reglages *******/

        /******** Tutorial ******/
        TextView tv_tuto = new TextView(Tutorial.this);

        String title = getResources().getString(R.string.tuto_tutorial_title) + "\n\n";
        SpannableString stuto_1 = new SpannableString(title);
        stuto_1.setSpan(new StyleSpan(Typeface.BOLD), 0, title.length(), 0);
        stuto_1.setSpan(new RelativeSizeSpan(1.2f), 0, title.length(), 0);

        Spannable stuto_2 = getTextWithImages(tv_tuto.getContext(),getResources().getString(R.string.tuto_tuto_text));
        tv_tuto.setText(TextUtils.concat(stuto_1, stuto_2));
        layout.setBackgroundColor(Color.TRANSPARENT);
        layout.addView(tv_tuto);


        /******** test1 *******/
        tv_test1 = new TextView(Tutorial.this);

        title = getResources().getString(R.string.tuto_test1) + "\n\n";
        SpannableString st1_0 = new SpannableString(title);
        st1_0.setSpan(new StyleSpan(Typeface.BOLD), 0, title.length(), 0);
        st1_0.setSpan(new RelativeSizeSpan(1.2f), 0, title.length(), 0);

        Spannable st1_1 = getTextWithImages(tv_tuto.getContext(),getResources().getString(R.string.tuto_test1_text1));
        Spannable st1_2 = getTextWithImages(tv_tuto.getContext(),getResources().getString(R.string.tuto_test1_text2));
        Spannable st1_3 = getTextWithImages(tv_tuto.getContext(),getResources().getString(R.string.tuto_test1_text3));
        Spannable st1_4 = getTextWithImages(tv_tuto.getContext(),getResources().getString(R.string.tuto_test1_text4));

        tv_test1.setText(TextUtils.concat(st1_0, span_ration, st1_1, span_admin, st1_2, span_instruct, st1_3, span_quote, st1_4));

        /*
        s = getTextWithImages(tv_intro_title.getContext(),getResources().getString(R.string.tuto_test1_text1), tv_test1_text);
        tv_test1_text.setText(s, TextView.BufferType.SPANNABLE);
        s.setSpan("Tutoriel\n\n", 0, 0, Spannable.SPAN_INCLUSIVE_INCLUSIVE);*/
        layout.setBackgroundColor(Color.TRANSPARENT);
        layout.addView(tv_test1);

        /******** test2 *******/
        tv_test2 = new TextView(Tutorial.this);

        title = getResources().getString(R.string.tuto_test2) + "\n\n";
        SpannableString st2_0 = new SpannableString(title);
        st2_0.setSpan(new StyleSpan(Typeface.BOLD), 0, title.length(), 0);
        st2_0.setSpan(new RelativeSizeSpan(1.2f), 0, title.length(), 0);

        Spannable st2_1 = getTextWithImages(tv_tuto.getContext(),getResources().getString(R.string.tuto_test2_text1));
        Spannable st2_2 = getTextWithImages(tv_tuto.getContext(),getResources().getString(R.string.tuto_test2_text2));
        Spannable st2_3 = getTextWithImages(tv_tuto.getContext(),getResources().getString(R.string.tuto_test2_text3));
        Spannable st2_4 = getTextWithImages(tv_tuto.getContext(),getResources().getString(R.string.tuto_test2_text4));

        tv_test2.setText(TextUtils.concat(st2_0, span_ration, st2_1, span_admin, st2_2, span_instruct, st2_3, span_quote, st2_4));

        layout.setBackgroundColor(Color.TRANSPARENT);
        layout.addView(tv_test2);

        /******** test3 *******/
        tv_test3 = new TextView(Tutorial.this);

        title = getResources().getString(R.string.tuto_test3) + "\n\n";
        SpannableString st3_0 = new SpannableString(title);
        st3_0.setSpan(new StyleSpan(Typeface.BOLD), 0, title.length(), 0);
        st3_0.setSpan(new RelativeSizeSpan(1.2f), 0, title.length(), 0);
        Spannable st3_1 = getTextWithImages(tv_tuto.getContext(),getResources().getString(R.string.tuto_test3_text1));
        Spannable st3_2 = getTextWithImages(tv_tuto.getContext(),getResources().getString(R.string.tuto_test3_text2));
        Spannable st3_3 = getTextWithImages(tv_tuto.getContext(),getResources().getString(R.string.tuto_test3_text3));
        Spannable st3_4 = getTextWithImages(tv_tuto.getContext(),getResources().getString(R.string.tuto_test3_text4));
        tv_test3.setText(TextUtils.concat(st3_0, span_ration, st3_1, span_admin, st3_2, span_instruct, st3_3, span_quote, st3_4));
        layout.setBackgroundColor(Color.TRANSPARENT);
        layout.addView(tv_test3);
/******** test4 *******/
        tv_test4 = new TextView(Tutorial.this);
        title = getResources().getString(R.string.tuto_test4) + "\n\n";
        SpannableString st4_0 = new SpannableString(title);
        st4_0.setSpan(new StyleSpan(Typeface.BOLD), 0, title.length(), 0);
        st4_0.setSpan(new RelativeSizeSpan(1.2f), 0, title.length(), 0);
        Spannable st4_1 = getTextWithImages(tv_tuto.getContext(),getResources().getString(R.string.tuto_test4_text1));
        Spannable st4_2 = getTextWithImages(tv_tuto.getContext(),getResources().getString(R.string.tuto_test4_text2));
        Spannable st4_3 = getTextWithImages(tv_tuto.getContext(),getResources().getString(R.string.tuto_test4_text3));
        Spannable st4_4 = getTextWithImages(tv_tuto.getContext(),getResources().getString(R.string.tuto_test4_text4));
        tv_test4.setText(TextUtils.concat(st4_0, span_ration, st4_1, span_admin, st4_2, span_instruct, st4_3, span_quote, st4_4));
        layout.setBackgroundColor(Color.TRANSPARENT);
        layout.addView(tv_test4);

        /******** test5 *******/
        tv_test5 = new TextView(Tutorial.this);
        title = getResources().getString(R.string.tuto_test5) + "\n\n";
        SpannableString st5_0 = new SpannableString(title);
        st5_0.setSpan(new StyleSpan(Typeface.BOLD), 0, title.length(), 0);
        st5_0.setSpan(new RelativeSizeSpan(1.2f), 0, title.length(), 0);
        Spannable st5_1 = getTextWithImages(tv_tuto.getContext(),getResources().getString(R.string.tuto_test5_text1));
        Spannable st5_2 = getTextWithImages(tv_tuto.getContext(),getResources().getString(R.string.tuto_test5_text2));
        Spannable st5_3 = getTextWithImages(tv_tuto.getContext(),getResources().getString(R.string.tuto_test5_text3));
        Spannable st5_4 = getTextWithImages(tv_tuto.getContext(),getResources().getString(R.string.tuto_test5_text4));
        tv_test5.setText(TextUtils.concat(st5_0, span_ration, st5_1, span_admin, st5_2, span_instruct, st5_3, span_quote, st5_4));
        layout.setBackgroundColor(Color.TRANSPARENT);
        layout.addView(tv_test5);
/******** test6 *******/
        tv_test6 = new TextView(Tutorial.this);
        title = getResources().getString(R.string.tuto_test6) + "\n\n";
        SpannableString st6_0 = new SpannableString(title);
        st6_0.setSpan(new StyleSpan(Typeface.BOLD), 0, title.length(), 0);
        st6_0.setSpan(new RelativeSizeSpan(1.2f), 0, title.length(), 0);
        Spannable st6_1 = getTextWithImages(tv_tuto.getContext(),getResources().getString(R.string.tuto_test6_text1));
        Spannable st6_2 = getTextWithImages(tv_tuto.getContext(),getResources().getString(R.string.tuto_test6_text2));
        Spannable st6_3 = getTextWithImages(tv_tuto.getContext(),getResources().getString(R.string.tuto_test6_text3));
        Spannable st6_4 = getTextWithImages(tv_tuto.getContext(),getResources().getString(R.string.tuto_test6_text4));
        tv_test6.setText(TextUtils.concat(st6_0, span_ration, st6_1, span_admin, st6_2, span_instruct, st6_3, span_quote, st6_4));
        layout.setBackgroundColor(Color.TRANSPARENT);
        layout.addView(tv_test6);
/******** test7 *******/
        tv_test7 = new TextView(Tutorial.this);
        title = getResources().getString(R.string.tuto_test7) + "\n\n";
        SpannableString st7_0 = new SpannableString(title);
        st7_0.setSpan(new StyleSpan(Typeface.BOLD), 0, title.length(), 0);
        st7_0.setSpan(new RelativeSizeSpan(1.2f), 0, title.length(), 0);
        Spannable st7_1 = getTextWithImages(tv_tuto.getContext(),getResources().getString(R.string.tuto_test7_text1));
        Spannable st7_2 = getTextWithImages(tv_tuto.getContext(),getResources().getString(R.string.tuto_test7_text2));
        Spannable st7_3 = getTextWithImages(tv_tuto.getContext(),getResources().getString(R.string.tuto_test7_text3));
        Spannable st7_4 = getTextWithImages(tv_tuto.getContext(),getResources().getString(R.string.tuto_test7_text4));
        tv_test7.setText(TextUtils.concat(st7_0, span_ration, st7_1, span_admin, st7_2, span_instruct, st7_3, span_quote, st7_4));
        layout.setBackgroundColor(Color.TRANSPARENT);
        layout.addView(tv_test7);
/******** test8 *******/
        tv_test8 = new TextView(Tutorial.this);
        title = getResources().getString(R.string.tuto_test8) + "\n\n";
        SpannableString st8_0 = new SpannableString(title);
        st8_0.setSpan(new StyleSpan(Typeface.BOLD), 0, title.length(), 0);
        st8_0.setSpan(new RelativeSizeSpan(1.2f), 0, title.length(), 0);
        Spannable st8_1 = getTextWithImages(tv_tuto.getContext(),getResources().getString(R.string.tuto_test8_text1));
        Spannable st8_2 = getTextWithImages(tv_tuto.getContext(),getResources().getString(R.string.tuto_test8_text2));
        Spannable st8_3 = getTextWithImages(tv_tuto.getContext(),getResources().getString(R.string.tuto_test8_text3));
        Spannable st8_4 = getTextWithImages(tv_tuto.getContext(),getResources().getString(R.string.tuto_test8_text4));
        tv_test8.setText(TextUtils.concat(st8_0, span_ration, st8_1, span_admin, st8_2, span_instruct, st8_3, span_quote, st8_4));
        layout.setBackgroundColor(Color.TRANSPARENT);
        layout.addView(tv_test8);
/******** test9 *******/
        tv_test9 = new TextView(Tutorial.this);
        title = getResources().getString(R.string.tuto_test9) + "\n\n";
        SpannableString st9_0 = new SpannableString(title);
        st9_0.setSpan(new StyleSpan(Typeface.BOLD), 0, title.length(), 0);
        st9_0.setSpan(new RelativeSizeSpan(1.2f), 0, title.length(), 0);
        Spannable st9_1 = getTextWithImages(tv_tuto.getContext(),getResources().getString(R.string.tuto_test9_text1));
        Spannable st9_2 = getTextWithImages(tv_tuto.getContext(),getResources().getString(R.string.tuto_test9_text2));
        Spannable st9_3 = getTextWithImages(tv_tuto.getContext(),getResources().getString(R.string.tuto_test9_text3));
        Spannable st9_4 = getTextWithImages(tv_tuto.getContext(),getResources().getString(R.string.tuto_test9_text4));
        tv_test9.setText(TextUtils.concat(st9_0, span_ration, st9_1, span_admin, st9_2, span_instruct, st9_3, span_quote, st9_4));
        layout.setBackgroundColor(Color.TRANSPARENT);
        layout.addView(tv_test9);
/******** test10 *******/
        tv_test10 = new TextView(Tutorial.this);
        title = getResources().getString(R.string.tuto_test10) + "\n\n";
        SpannableString st10_0 = new SpannableString(title);
        st10_0.setSpan(new StyleSpan(Typeface.BOLD), 0, title.length(), 0);
        st10_0.setSpan(new RelativeSizeSpan(1.2f), 0, title.length(), 0);
        Spannable st10_1 = getTextWithImages(tv_tuto.getContext(),getResources().getString(R.string.tuto_test10_text1));
        Spannable st10_2 = getTextWithImages(tv_tuto.getContext(),getResources().getString(R.string.tuto_test10_text2));
        Spannable st10_4 = getTextWithImages(tv_tuto.getContext(),getResources().getString(R.string.tuto_test10_text4));
        tv_test10.setText(TextUtils.concat(st10_0, span_ration, st10_1, span_admin, st10_2, span_quote, st10_4));
        layout.setBackgroundColor(Color.TRANSPARENT);
        layout.addView(tv_test10);


        /******** results *******/


        //return button
        btuto_back = (ImageButton) findViewById(R.id.tuto_back);
        btuto_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btuto_1 = (Button) findViewById(R.id.tuto_bt1);
        btuto_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scrollView.post(new Runnable() {
                    @Override
                    public void run() {
                        scrollView.scrollTo(0, tv_test1.getTop());
                    }
                });
            }
        });
        btuto_2 = (Button) findViewById(R.id.tuto_bt2);
        btuto_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scrollView.post(new Runnable() {
                    @Override
                    public void run() {
                        scrollView.scrollTo(0, tv_test2.getTop());
                    }
                });
            }
        });
        btuto_3 = (Button) findViewById(R.id.tuto_bt3);
        btuto_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scrollView.post(new Runnable() {
                    @Override
                    public void run() {
                        scrollView.scrollTo(0, tv_test3.getTop());
                    }
                });
            }
        });
        btuto_4 = (Button) findViewById(R.id.tuto_bt4);
        btuto_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scrollView.post(new Runnable() {
                    @Override
                    public void run() {
                        scrollView.scrollTo(0, tv_test4.getTop());
                    }
                });
            }
        });
        btuto_5 = (Button) findViewById(R.id.tuto_bt5);
        btuto_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scrollView.post(new Runnable() {
                    @Override
                    public void run() {
                        scrollView.scrollTo(0, tv_test5.getTop());
                    }
                });
            }
        });
        btuto_6 = (Button) findViewById(R.id.tuto_bt6);
        btuto_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scrollView.post(new Runnable() {
                    @Override
                    public void run() {
                        scrollView.scrollTo(0, tv_test6.getTop());
                    }
                });
            }
        });
        btuto_7 = (Button) findViewById(R.id.tuto_bt7);
        btuto_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scrollView.post(new Runnable() {
                    @Override
                    public void run() {
                        scrollView.scrollTo(0, tv_test7.getTop());
                    }
                });
            }
        });
        btuto_8 = (Button) findViewById(R.id.tuto_bt8);
        btuto_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scrollView.post(new Runnable() {
                    @Override
                    public void run() {
                        scrollView.scrollTo(0, tv_test8.getTop());
                    }
                });
            }
        });
        btuto_9 = (Button) findViewById(R.id.tuto_bt9);
        btuto_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scrollView.post(new Runnable() {
                    @Override
                    public void run() {
                        scrollView.scrollTo(0, tv_test9.getTop());
                    }
                });
            }
        });
        btuto_10 = (Button) findViewById(R.id.tuto_bt10);
        btuto_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scrollView.post(new Runnable() {
                    @Override
                    public void run() {
                        scrollView.scrollTo(0, tv_test10.getTop());
                    }
                });
            }
        });
        //onclick-entzat
        /*
        scrollView.post(new Runnable() {
            @Override
            public void run() {
                scrollView.scrollTo(0,tv_test1.getTop());
            }
        });
        */



    }//end onCreate

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
            icon.setBounds(0, 0, tv_intro.getLineHeight(), tv_intro.getLineHeight());
            if (set)
            {
                hasChanges = true;
                /*spannable.setSpan(new ImageSpan(context, id),
                        matcher.start(),
                        matcher.end(),
                        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);*/
                spannable.setSpan(new ImageSpan(icon,ImageSpan.ALIGN_BASELINE),
                        matcher.start(),
                        matcher.end(),
                        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            }
        }
        return hasChanges;
    }

}
