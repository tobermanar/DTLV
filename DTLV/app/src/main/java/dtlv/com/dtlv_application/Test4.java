package dtlv.com.dtlv_application;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.os.Bundle;

import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Utilisateur on 2015-12-06.
 */
public class Test4 extends Activity{

    private ImageButton btest4_play01 = null;
    private boolean quotation_01 = false;
    private ImageButton btest4_validate01 = null;
    private ImageButton btest4_refuse01 = null;
    private LinearLayout test4_layout1 = null;

    private ImageButton btest4_play02 = null;
    private boolean quotation_02 = false;
    private ImageButton btest4_validate02 = null;
    private ImageButton btest4_refuse02 = null;
    private LinearLayout test4_layout2 = null;

    private ImageButton btest4_play11 = null;
    private ImageButton btest4_validate11 = null;
    private ImageButton btest4_refuse11 = null;
    private LinearLayout test4_layout3 = null;

    private ImageButton btest4_next = null;

    private int count01=0;
    private int count02=0;
    private int count11=0;

    //Variables de quotation
    private int q01 = 0;
    private int q02 = 0;
    private int q1 = 0;

    private GestionPoint gestPts;

    private ImageButton btest4_help = null;
    private AlertDialog alertDialog = null;
    private TextView tv_test4 = null;

    private AlertDialog.Builder replayAlert = null;

    private Button tuto_bt1 = null;
    private Button tuto_bt2 = null;
    private Button tuto_bt3 = null;
    private Button tuto_bt4 = null;

    public Test4(){
        gestPts = Menu.gestPts;
    }
    @Override
    public void onBackPressed() {
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test4);
        btest4_next = (ImageButton) findViewById(R.id.test4_bnext);
        btest4_next.setEnabled(false);
        btest4_next.setClickable(false);
        btest4_next.setImageResource(R.drawable.next_grey);

        tuto_bt1 = (Button) findViewById(R.id.tuto_bt1);
        tuto_bt1.setBackgroundColor(Color.GREEN);
        tuto_bt2 = (Button) findViewById(R.id.tuto_bt2);
        tuto_bt2.setBackgroundColor(Color.GREEN);
        tuto_bt3 = (Button) findViewById(R.id.tuto_bt3);
        tuto_bt3.setBackgroundColor(Color.GREEN);
        tuto_bt4 = (Button) findViewById(R.id.tuto_bt4);
        tuto_bt4.setBackgroundColor(Color.YELLOW);

        final MediaPlayer mp01,mp02,mp11;

        btest4_play01 = (ImageButton) findViewById(R.id.test4_ex1_bplay);
        btest4_play01.setEnabled(true);
        btest4_play01.setClickable(true);
        btest4_validate01 = (ImageButton) findViewById(R.id.test4_ex1_bvalid);
        btest4_validate01.setEnabled(false);
        btest4_validate01.setClickable(false);
        btest4_validate01.setImageResource(R.drawable.validate_grey);
        btest4_refuse01 = (ImageButton) findViewById(R.id.test4_ex1_brefuse);
        btest4_refuse01.setEnabled(false);
        btest4_refuse01.setClickable(false);
        btest4_refuse01.setImageResource(R.drawable.refuse_grey);
        test4_layout1 = (LinearLayout) findViewById(R.id.test4_layout1);
        test4_layout1.setBackgroundColor(getResources().getColor(R.color.yellow));

        btest4_play02 = (ImageButton) findViewById(R.id.test4_ex2_bplay);
        btest4_play02.setEnabled(false);
        btest4_play02.setClickable(false);
        btest4_play02.setImageResource(R.drawable.play_grey);
        btest4_validate02 = (ImageButton) findViewById(R.id.test4_ex2_bvalid);
        btest4_validate02.setEnabled(false);
        btest4_validate02.setClickable(false);
        btest4_validate02.setImageResource(R.drawable.validate_grey);
        btest4_refuse02 = (ImageButton) findViewById(R.id.test4_ex2_brefuse);
        btest4_refuse02.setEnabled(false);
        btest4_refuse02.setClickable(false);
        btest4_refuse02.setImageResource(R.drawable.refuse_grey);
        test4_layout2 = (LinearLayout) findViewById(R.id.test4_layout2);

        btest4_play11 = (ImageButton) findViewById(R.id.test4_ex_bplay);
        btest4_play11.setEnabled(false);
        btest4_play11.setClickable(false);
        btest4_play11.setImageResource(R.drawable.play_grey);
        btest4_validate11 = (ImageButton) findViewById(R.id.test4_ex_bvalid);
        btest4_validate11.setEnabled(false);
        btest4_validate11.setClickable(false);
        btest4_validate11.setImageResource(R.drawable.validate_grey);
        btest4_refuse11 = (ImageButton) findViewById(R.id.test4_ex_brefuse);
        btest4_refuse11.setEnabled(false);
        btest4_refuse11.setClickable(false);
        btest4_refuse11.setImageResource(R.drawable.refuse_grey);
        test4_layout3 = (LinearLayout) findViewById(R.id.test4_layout3);

        btest4_help = (ImageButton) findViewById(R.id.test4_bhelp);

        //create pop-up for replay alert
        replayAlert = new AlertDialog.Builder(Test4.this);
        replayAlert.setTitle(getResources().getString(R.string.replay_title));
        replayAlert.setMessage(getResources().getString(R.string.replay_msg));

        replayAlert.setNegativeButton(getResources().getString(R.string.replay_no),
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });

        // Exemple Word 1
        mp01 = MediaPlayer.create(this, R.raw.test4_sound1_ex1);
        btest4_play01.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                test4_layout1.setBackgroundColor(Color.TRANSPARENT);
                mp01.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        if (count01 == 0) {

                            //si c'est la première fois remplacer par bouton replay
                            btest4_play01.setImageResource(R.drawable.replay);

                            btest4_validate01.setEnabled(true);
                            btest4_validate01.setClickable(true);
                            btest4_validate01.setImageResource(R.drawable.validate);

                            btest4_refuse01.setEnabled(true);
                            btest4_refuse01.setClickable(true);
                            btest4_refuse01.setImageResource(R.drawable.refuse);

                            // Activate next play button
                            btest4_play02.setEnabled(true);
                            btest4_play02.setClickable(true);
                            btest4_play02.setImageResource(R.drawable.play_blue);
                            test4_layout2.setBackgroundColor(getResources().getColor(R.color.yellow));
                        }
                        if (count01 == 1) {
                            btest4_play01.setEnabled(false);
                            btest4_play01.setClickable(false);
                            btest4_play01.setImageResource(R.drawable.play_grey);
                        }
                        count01++;
                    }
                });
                if(count01==1)
                {
                    replayAlert.setPositiveButton(getResources().getString(R.string.replay_yes),
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    mp01.start();
                                }
                            });
                    replayAlert.show();
                }
                else
                {
                    mp01.start();
                }
            }
        });// Fin play01

        // Exemple Word 2
        mp02 = MediaPlayer.create(this, R.raw.test4_sound1_ex2);
        btest4_play02.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                test4_layout2.setBackgroundColor(Color.TRANSPARENT);
                    mp02.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            if (count02 == 0) {
                                //si c'est la première fois remplacer par bouton replay
                                btest4_play02.setImageResource(R.drawable.replay);

                                btest4_validate02.setEnabled(true);
                                btest4_validate02.setClickable(true);
                                btest4_validate02.setImageResource(R.drawable.validate);

                                btest4_refuse02.setEnabled(true);
                                btest4_refuse02.setClickable(true);
                                btest4_refuse02.setImageResource(R.drawable.refuse);

                                // Activate next play button
                                btest4_play11.setEnabled(true);
                                btest4_play11.setClickable(true);
                                btest4_play11.setImageResource(R.drawable.play_blue);
                                test4_layout3.setBackgroundColor(getResources().getColor(R.color.yellow));
                            }
                            if (count02 == 1) {
                                btest4_play02.setEnabled(false);
                                btest4_play02.setClickable(false);
                                btest4_play02.setImageResource(R.drawable.play_grey);
                            }

                            count02++;

                        }
                    });
                if(count02==1)
                {
                    replayAlert.setPositiveButton(getResources().getString(R.string.replay_yes),
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    mp02.start();
                                }
                            });
                    replayAlert.show();
                }
                else
                {
                    mp02.start();
                }
            }
        });// Fin play02

        // Word 1
        mp11 = MediaPlayer.create(this, R.raw.test4_sound1_ex);
        btest4_play11.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                test4_layout3.setBackgroundColor(Color.TRANSPARENT);
                mp11.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        if (count11 == 0) {
                            //si c'est la première fois remplacer par bouton replay
                            btest4_play11.setImageResource(R.drawable.replay);

                            btest4_validate11.setEnabled(true);
                            btest4_validate11.setClickable(true);
                            btest4_validate11.setImageResource(R.drawable.validate);

                            btest4_refuse11.setEnabled(true);
                            btest4_refuse11.setClickable(true);
                            btest4_refuse11.setImageResource(R.drawable.refuse);

                        }
                        if (count11 == 1) {
                            btest4_play11.setEnabled(false);
                            btest4_play11.setClickable(false);
                            btest4_play11.setImageResource(R.drawable.play_grey);

                        }

                        count11++;

                    }
                });
                if(count11==1)
                {
                    replayAlert.setPositiveButton(getResources().getString(R.string.replay_yes),
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    mp11.start();
                                }
                            });
                    replayAlert.show();
                }
                else
                {
                    mp11.start();
                }
            }
        });// Fin play11

        //Gestion des notations
        btest4_validate01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (quotation_02 == false && (count02 == 0 || count11 == 0))
                {
                    test4_layout2.setBackgroundColor(Color.TRANSPARENT);
                    test4_layout3.setBackgroundColor(Color.YELLOW);
                    btest4_play02.setImageResource(R.drawable.play_blue);
                    btest4_play02.setEnabled(true);
                    btest4_play02.setClickable(true);
                    btest4_play11.setEnabled(true);
                    btest4_play11.setClickable(true);
                    btest4_play11.setImageResource(R.drawable.play_blue);
                }
                test4_layout1.setBackgroundColor(getResources().getColor(R.color.green));
                quotation_01 = true;
                q01 = 1;//only to handle colors, not for the result
            }
        });
        btest4_refuse01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count11 == 0)
                {
                    test4_layout3.setBackgroundColor(Color.TRANSPARENT);
                    test4_layout2.setBackgroundColor(Color.YELLOW);
                    btest4_play02.setImageResource(R.drawable.play_blue);
                    btest4_play02.setEnabled(true);
                    btest4_play02.setClickable(true);
                    btest4_play11.setEnabled(false);
                    btest4_play11.setClickable(false);
                    btest4_play11.setImageResource(R.drawable.play_grey);
                }
                test4_layout1.setBackgroundColor(getResources().getColor(R.color.red));
                quotation_01 = true;
                q01 = 0;//only to handle colors, not for the result
                //if the examples are both wrong
                if(quotation_01 == true && quotation_02 == true && q01 == 0 && q02 == 0) {
                    q1 = 0;
                    test4_layout3.setBackgroundColor(getResources().getColor(R.color.red));
                    btest4_next.setEnabled(true);
                    btest4_next.setClickable(true);
                    btest4_next.setImageResource(R.drawable.next);
                }
            }
        });
        btest4_validate02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test4_layout2.setBackgroundColor(getResources().getColor(R.color.green));
                btest4_play11.setEnabled(true);
                btest4_play11.setClickable(true);
                btest4_play11.setImageResource(R.drawable.play_blue);
                if(count11 == 0) {
                    test4_layout3.setBackgroundColor(Color.YELLOW);
                }
                quotation_02 = true;
                q02 = 1;//only to handle colors, not for the result
            }
        });
        btest4_refuse02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test4_layout2.setBackgroundColor(getResources().getColor(R.color.red));

                btest4_play11.setEnabled(false);
                btest4_play11.setClickable(false);
                btest4_play11.setImageResource(R.drawable.play_grey);

                quotation_02 = true;
                q02 = 0;
                //if the examples are both wrong
                if(quotation_01 == true && quotation_02 == true && q01 == 0 && q02 == 0) {
                    q1 = 0;
                    test4_layout3.setBackgroundColor(getResources().getColor(R.color.red));
                    btest4_next.setEnabled(true);
                    btest4_next.setClickable(true);
                    btest4_next.setImageResource(R.drawable.next);
                }
            }
        });
        btest4_validate11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test4_layout3.setBackgroundColor(getResources().getColor(R.color.green));
                q1=1;
                btest4_next.setEnabled(true);
                btest4_next.setClickable(true);
                btest4_next.setImageResource(R.drawable.next);
            }
        });
        btest4_refuse11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test4_layout3.setBackgroundColor(getResources().getColor(R.color.red));
                q1=0;
                btest4_next.setEnabled(true);
                btest4_next.setClickable(true);
                btest4_next.setImageResource(R.drawable.next);
                }
        });

        btest4_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp01.release();
                mp02.release();
                mp11.release();
                // Au click sur le bouton, on passe au test suivant et on envoit le score a la gestion des points
                gestPts.setT4(q1);
                Intent itest4 = new Intent(Test4.this, Test5.class);
                startActivity(itest4);
            }
        });

        btest4_help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog = new AlertDialog.Builder(Test4.this).create();
                alertDialog.setTitle(getResources().getString(R.string.help_test4_title));
                String admin = getResources().getString(R.string.help_admin);
                String quote = getResources().getString(R.string.help_quote);

                tv_test4 = new TextView(Test4.this);

                Spannable st4_1 = getTextWithImages(alertDialog.getContext(), getResources().getString(R.string.help_test4_text1));
                Spannable st4_2 = getTextWithImages(alertDialog.getContext(), getResources().getString(R.string.help_test4_text2));

                tv_test4.setText(TextUtils.concat(admin, st4_1, quote, st4_2));

                alertDialog.setView(tv_test4);

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
            icon.setBounds(0, 0, tv_test4.getLineHeight(), tv_test4.getLineHeight());
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
