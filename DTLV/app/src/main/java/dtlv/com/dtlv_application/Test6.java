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
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Utilisateur on 2015-12-06.
 */
public class Test6 extends Activity{

    private ImageButton btest6_image1 = null;

    private ImageButton btest6_play1 = null;
    private boolean quotation_1 = false;
    private ImageButton btest6_validate1 = null;
    private ImageButton btest6_refuse1 = null;
    private LinearLayout test6_layout1 = null;

    private ImageButton btest6_play2 = null;
    private boolean quotation_2 = false;
    private ImageButton btest6_validate2 = null;
    private ImageButton btest6_refuse2 = null;
    private LinearLayout test6_layout2 = null;

    private ImageButton btest6_play3 = null;
    private boolean quotation_3 = false;
    private ImageButton btest6_validate3 = null;
    private ImageButton btest6_refuse3 = null;
    private LinearLayout test6_layout3 = null;

    private ImageButton btest6_next = null;

    private int count1 =0;
    private int count2 =0;
    private int count3 =0;

    //Variables de quotation
    private int q1 = 0;
    private int q2 = 0;
    private int q3 = 0;

    private ImageButton btest6_help = null;
    private AlertDialog alertDialog = null;
    private TextView tv_test6 = null;

    private AlertDialog.Builder replayAlert = null;



    private GestionPoint gestPts;

    public Test6(){
        gestPts = Menu.gestPts;
    }
    @Override
    public void onBackPressed() {
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test6);

        btest6_image1 = (ImageButton) findViewById(R.id.test6_image1);

        btest6_next = (ImageButton) findViewById(R.id.test6_bnext);
        btest6_next.setEnabled(true);
        btest6_next.setClickable(true);
        btest6_next.setImageResource(R.drawable.next_grey);

        final MediaPlayer mp1,mp2,mp3;

        btest6_play1 = (ImageButton) findViewById(R.id.test6_text1_bplay);
        btest6_play1.setEnabled(true);
        btest6_play1.setClickable(true);
        btest6_validate1 = (ImageButton) findViewById(R.id.test6_text1_bvalid);
        btest6_validate1.setEnabled(false);
        btest6_validate1.setClickable(false);
        btest6_validate1.setImageResource(R.drawable.validate_grey);
        btest6_refuse1 = (ImageButton) findViewById(R.id.test6_text1_brefuse);
        btest6_refuse1.setEnabled(false);
        btest6_refuse1.setClickable(false);
        btest6_refuse1.setImageResource(R.drawable.refuse_grey);
        test6_layout1 = (LinearLayout) findViewById(R.id.test6_layout1);
        test6_layout1.setBackgroundColor(getResources().getColor(R.color.yellow));

        btest6_play2 = (ImageButton) findViewById(R.id.test6_text2_bplay);
        btest6_play2.setEnabled(false);
        btest6_play2.setClickable(false);
        btest6_play2.setImageResource(R.drawable.play_grey);
        btest6_validate2 = (ImageButton) findViewById(R.id.test6_text2_bvalid);
        btest6_validate2.setEnabled(false);
        btest6_validate2.setClickable(false);
        btest6_validate2.setImageResource(R.drawable.validate_grey);
        btest6_refuse2 = (ImageButton) findViewById(R.id.test6_text2_brefuse);
        btest6_refuse2.setEnabled(false);
        btest6_refuse2.setClickable(false);
        btest6_refuse2.setImageResource(R.drawable.refuse_grey);
        test6_layout2 = (LinearLayout) findViewById(R.id.test6_layout2);

        btest6_play3 = (ImageButton) findViewById(R.id.test6_text3_bplay);
        btest6_play3.setEnabled(false);
        btest6_play3.setClickable(false);
        btest6_play3.setImageResource(R.drawable.play_grey);
        btest6_validate3 = (ImageButton) findViewById(R.id.test6_text3_bvalid);
        btest6_validate3.setEnabled(false);
        btest6_validate3.setClickable(false);
        btest6_validate3.setImageResource(R.drawable.validate_grey);
        btest6_refuse3 = (ImageButton) findViewById(R.id.test6_text3_brefuse);
        btest6_refuse3.setEnabled(false);
        btest6_refuse3.setClickable(false);
        btest6_refuse3.setImageResource(R.drawable.refuse_grey);
        test6_layout3 = (LinearLayout) findViewById(R.id.test6_layout3);

        btest6_help = (ImageButton) findViewById(R.id.test6_bhelp);

        //create pop-up for replay alert
        replayAlert = new AlertDialog.Builder(Test6.this);
        replayAlert.setTitle(getResources().getString(R.string.replay_title));
        replayAlert.setMessage(getResources().getString(R.string.replay_msg));

        replayAlert.setNegativeButton(getResources().getString(R.string.replay_no),
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });


        // Sentence 1
        mp1 = MediaPlayer.create(this, R.raw.test6_sound1);
        btest6_play1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                mp1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        if (count1 == 0) {
                            //si c'est la première fois remplacer par bouton replay
                            btest6_play1.setImageResource(R.drawable.replay);

                            btest6_validate1.setEnabled(true);
                            btest6_validate1.setClickable(true);
                            btest6_validate1.setImageResource(R.drawable.validate);

                            btest6_refuse1.setEnabled(true);
                            btest6_refuse1.setClickable(true);
                            btest6_refuse1.setImageResource(R.drawable.refuse);

                            // Activate next play button
                            btest6_play2.setEnabled(true);
                            btest6_play2.setClickable(true);
                            btest6_play2.setImageResource(R.drawable.play_blue);
                            test6_layout1.setBackgroundColor(Color.TRANSPARENT);
                            test6_layout2.setBackgroundColor(getResources().getColor(R.color.yellow));

                        }
                        if (count1 == 1) {
                            btest6_play1.setEnabled(false);
                            btest6_play1.setClickable(false);
                            btest6_play1.setImageResource(R.drawable.play_grey);
                        }
                        count1++;
                    }
                });
                if(count1==1)
                {
                    replayAlert.setPositiveButton(getResources().getString(R.string.replay_yes),
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    mp1.start();
                                }
                            });
                    replayAlert.show();
                }
                else
                {
                    mp1.start();
                }
            }
        });// End sentence 1

        // Sentence 2
        mp2 = MediaPlayer.create(this, R.raw.test6_sound2);
        btest6_play2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                mp2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        if (count2 == 0) {
                            //si c'est la première fois remplacer par bouton replay
                            btest6_play2.setImageResource(R.drawable.replay);

                            btest6_validate2.setEnabled(true);
                            btest6_validate2.setClickable(true);
                            btest6_validate2.setImageResource(R.drawable.validate);

                            btest6_refuse2.setEnabled(true);
                            btest6_refuse2.setClickable(true);
                            btest6_refuse2.setImageResource(R.drawable.refuse);

                            // Activate next play button
                            btest6_play3.setEnabled(true);
                            btest6_play3.setClickable(true);
                            btest6_play3.setImageResource(R.drawable.play_blue);
                            test6_layout2.setBackgroundColor(Color.TRANSPARENT);
                            test6_layout3.setBackgroundColor(getResources().getColor(R.color.yellow));

                        }
                        if (count2 == 1) {
                            btest6_play2.setEnabled(false);
                            btest6_play2.setClickable(false);
                            btest6_play2.setImageResource(R.drawable.play_grey);

                        }

                        count2++;

                    }
                });
                if(count2==1)
                {
                    replayAlert.setPositiveButton(getResources().getString(R.string.replay_yes),
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    mp2.start();
                                }
                            });
                    replayAlert.show();
                }
                else
                {
                    mp2.start();
                }
            }
        });// End Sentence 2

        // Sentence 3
        mp3 = MediaPlayer.create(this, R.raw.test6_sound3);
        btest6_play3.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                mp3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        if (count3 == 0) {
                            //si c'est la première fois remplacer par bouton replay
                            btest6_play3.setImageResource(R.drawable.replay);

                            btest6_validate3.setEnabled(true);
                            btest6_validate3.setClickable(true);
                            btest6_validate3.setImageResource(R.drawable.validate);

                            btest6_refuse3.setEnabled(true);
                            btest6_refuse3.setClickable(true);
                            btest6_refuse3.setImageResource(R.drawable.refuse);
                            test6_layout3.setBackgroundColor(Color.TRANSPARENT);

                        }
                        if (count3 == 1) {
                            btest6_play3.setEnabled(false);
                            btest6_play3.setClickable(false);
                            btest6_play3.setImageResource(R.drawable.play_grey);

                        }

                        count3++;

                    }
                });
                if(count3==1)
                {
                    replayAlert.setPositiveButton(getResources().getString(R.string.replay_yes),
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    mp3.start();
                                }
                            });
                    replayAlert.show();
                }
                else
                {
                    mp3.start();
                }
            }
        });// End sentence 3

        //Image
        btest6_image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Test6.this, Test6_image.class);
                Bundle count = new Bundle();
                count.putInt("c1", count1);
                count.putInt("c2", count2);
                count.putInt("c3", count3);
                intent.putExtras(count);
                System.out.println("0");
                startActivityForResult(intent, 123);
                System.out.println("3");
            }
        });



        //Gestion des notations
        btest6_validate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test6_layout1.setBackgroundColor(getResources().getColor(R.color.green));
                quotation_1 = true;
                q1=1;
                activateNext();
            }
        });
        btest6_refuse1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test6_layout1.setBackgroundColor(getResources().getColor(R.color.red));
                quotation_1 = true;
                q2=0;
                activateNext();
            }
        });
        btest6_validate2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test6_layout2.setBackgroundColor(getResources().getColor(R.color.green));
                quotation_2 = true;
                q2=1;
                activateNext();
            }
        });
        btest6_refuse2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test6_layout2.setBackgroundColor(getResources().getColor(R.color.red));
                quotation_2 = true;
                q2=0;
                activateNext();
            }
        });
        btest6_validate3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test6_layout3.setBackgroundColor(getResources().getColor(R.color.green));
                quotation_3 = true;
                q3=1;
                activateNext();
            }
        });
        btest6_refuse3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test6_layout3.setBackgroundColor(getResources().getColor(R.color.green));
                quotation_3 = true;
                q3=0;
                activateNext();
            }
        });

        btest6_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp1.release();
                mp2.release();
                mp3.release();
                // Au click sur le bouton, on passe au test suivant et on envoit le score a la gestion des points
                gestPts.setT6(q1+q2+q3);
                Intent itest6 = new Intent(Test6.this, Test7.class);
                startActivity(itest6);
            }
        });

        btest6_help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog = new AlertDialog.Builder(Test6.this).create();
                alertDialog.setTitle(getResources().getString(R.string.help_test6_title));
                String admin = getResources().getString(R.string.help_admin);
                String quote = getResources().getString(R.string.help_quote);

                tv_test6 = new TextView(Test6.this);

                Spannable st6_1 = getTextWithImages(alertDialog.getContext(), getResources().getString(R.string.help_test6_text1));
                Spannable st6_2 = getTextWithImages(alertDialog.getContext(), getResources().getString(R.string.help_test6_text2));

                tv_test6.setText(TextUtils.concat(admin, st6_1, quote, st6_2));

                alertDialog.setView(tv_test6);

                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                alertDialog.show();
            }
        });



    }//end onCreate



    /**
     * Obtain the point manager
     * @param gestPtsF
     */
    public void giveGestPts(GestionPoint gestPtsF){
        this.gestPts = gestPtsF;
    }

    //Check if everything is quoted to unlock the button to the next test
    public void activateNext() {
        if (this.quotation_1 == true && this.quotation_2 == true) {
            btest6_next.setEnabled(true);
            btest6_next.setClickable(true);
            btest6_next.setImageResource(R.drawable.next);
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode,resultCode,data);
        System.out.println("4");
        if(requestCode==123 && resultCode==Activity.RESULT_OK){
            System.out.println("5");

            this.count1 = data.getExtras().getInt("c1");
            this.count2 = data.getExtras().getInt("c2");
            this.count3 = data.getExtras().getInt("c3");
            //Check if they have been played in the previous layout
            //if it hasn't been played, set true
            if (this.count1 == 0) {
                btest6_play1.setImageResource(R.drawable.play_blue);
            }
            if (this.count1 > 0) {

                btest6_validate1.setEnabled(true);
                btest6_validate1.setClickable(true);
                btest6_validate1.setImageResource(R.drawable.validate);

                btest6_refuse1.setEnabled(true);
                btest6_refuse1.setClickable(true);
                btest6_refuse1.setImageResource(R.drawable.refuse);

                // Activate next play button
                btest6_play2.setEnabled(true);
                btest6_play2.setClickable(true);
                btest6_play2.setImageResource(R.drawable.play_blue);
                //if it has been played once, set true/replay
                if (this.count1 == 1) {
                    btest6_play1.setImageResource(R.drawable.replay);
                }
                //if it has been played twice, disable
                if (this.count1 == 2) {
                    btest6_play1.setImageResource(R.drawable.play_grey);
                    btest6_play1.setClickable(false);
                    btest6_play1.setEnabled(false);
                }
            }
            if (this.count2 == 0) {
                btest6_play2.setImageResource(R.drawable.play_blue);
            }
            if (this.count2 > 0)
            {
                btest6_validate2.setEnabled(true);
                btest6_validate2.setClickable(true);
                btest6_validate2.setImageResource(R.drawable.validate);

                btest6_refuse2.setEnabled(true);
                btest6_refuse2.setClickable(true);
                btest6_refuse2.setImageResource(R.drawable.refuse);

                // Activate next play button
                btest6_play3.setEnabled(true);
                btest6_play3.setClickable(true);
                btest6_play3.setImageResource(R.drawable.play_blue);

                if (this.count2 == 1) {
                    btest6_play2.setImageResource(R.drawable.replay);
                }
                if (this.count2 == 2){
                    btest6_play2.setImageResource(R.drawable.play_grey);
                    btest6_play2.setClickable(false);
                    btest6_play2.setEnabled(false);
                }
            }

            if (this.count3 == 0) {
                btest6_play3.setImageResource(R.drawable.play_blue);
            }
            if (this.count3 >0)
            {
                btest6_validate3.setEnabled(true);
                btest6_validate3.setClickable(true);
                btest6_validate3.setImageResource(R.drawable.validate);

                btest6_refuse3.setEnabled(true);
                btest6_refuse3.setClickable(true);
                btest6_refuse3.setImageResource(R.drawable.refuse);

                if (this.count3 == 1) {
                    btest6_play3.setImageResource(R.drawable.replay);
                }
                if (this.count3 == 2){
                    btest6_play3.setImageResource(R.drawable.play_grey);
                    btest6_play3.setClickable(false);
                    btest6_play3.setEnabled(false);
                }
            }

            System.out.println("6");

        }
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
            icon.setBounds(0, 0, tv_test6.getLineHeight(), tv_test6.getLineHeight());
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
