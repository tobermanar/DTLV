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
public class Test6 extends Activity{

    private ImageButton btest6_image = null;

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

    private LinearLayout test6_layout_image = null;

    private ImageButton btest6_next = null;

    //Variables de quotation
    private int q1 = 0;
    private int q2 = 0;
    private int q3 = 0;

    private ImageButton btest6_help = null;
    private AlertDialog alertDialog = null;
    private TextView tv_test6 = null;

    private AlertDialog.Builder replayAlert = null;

    private Button tuto_bt1 = null;
    private Button tuto_bt2 = null;
    private Button tuto_bt3 = null;
    private Button tuto_bt4 = null;
    private Button tuto_bt5 = null;
    private Button tuto_bt6 = null;

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

        btest6_image = (ImageButton) findViewById(R.id.test6_image);
        btest6_next = (ImageButton) findViewById(R.id.test6_bnext);
        btest6_next.setEnabled(false);
        btest6_next.setClickable(false);
        btest6_next.setImageResource(R.drawable.next_grey);

        final MediaPlayer mp1,mp11,mp2,mp22,mp3,mp33;

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
        tuto_bt6.setBackgroundColor(getResources().getColor(R.color.yellow));

        test6_layout_image = (LinearLayout) findViewById(R.id.test6_layout_image);
        test6_layout_image.setBackgroundColor(getResources().getColor(R.color.yellow));

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

        //TODO Optimiser le lancement de  l'image --> Au clic sur play on ouvre l'image et lance le son. (à faire pour les trois play)
        /*************  Word 1  **************/
        mp1 = MediaPlayer.create(this, R.raw.test6_sound1);
        mp11 = MediaPlayer.create(this, R.raw.test6_sound1);
        btest6_play1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Config.compt.getTest6_1() == 0) {
                    test6_layout1.setBackgroundColor(Color.TRANSPARENT);
                    mp1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        public void onCompletion(MediaPlayer mp) {
                            activatePictures();
                        }
                    });
                    mp1.start();
                    Config.compt.setTest6_1(1);
                } else if (Config.compt.getTest6_1() == 1) {
                    mp11.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                        }
                    });

                    replayAlert.setPositiveButton(getResources().getString(R.string.replay_yes),
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    mp11.start();
                                    Config.compt.setTest6_1(2);
                                    activatePictures();
                                }
                            });
                    replayAlert.show();
                }

            }
        });

        /*************  Word 2  **************/
        mp2 = MediaPlayer.create(this, R.raw.test6_sound2);
        mp22 = MediaPlayer.create(this, R.raw.test6_sound2);
        btest6_play2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Config.compt.getTest6_2() == 0) {
                    test6_layout2.setBackgroundColor(Color.TRANSPARENT);
                    mp2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        public void onCompletion(MediaPlayer mp) {
                            activatePictures();
                        }
                    });
                    mp2.start();
                    Config.compt.setTest6_2(1);

                } else if (Config.compt.getTest6_2() == 1) {
                    mp22.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                        }
                    });

                    replayAlert.setPositiveButton(getResources().getString(R.string.replay_yes),
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    mp22.start();
                                    Config.compt.setTest6_2(2);
                                    activatePictures();
                                }
                            });
                    replayAlert.show();
                }

            }
        });

        /*************  Word 3  **************/
        mp3 = MediaPlayer.create(this, R.raw.test6_sound3);
        mp33 = MediaPlayer.create(this, R.raw.test6_sound3);
        btest6_play3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Config.compt.getTest6_3() == 0) {
                    test6_layout3.setBackgroundColor(Color.TRANSPARENT);
                    mp3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        public void onCompletion(MediaPlayer mp) {
                            activatePictures();
                        }
                    });
                    mp3.start();
                    Config.compt.setTest6_3(1);
                } else if (Config.compt.getTest6_3() == 1) {
                    mp11.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                        }
                    });

                    replayAlert.setPositiveButton(getResources().getString(R.string.replay_yes),
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    mp33.start();
                                    Config.compt.setTest6_3(2);
                                    activatePictures();
                                }
                            });
                    replayAlert.show();
                }

            }
        });

        //Image
        btest6_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Config.compt.getTest6_1() == 0)
                {
                    test6_layout1.setBackgroundColor(Color.TRANSPARENT);
                }
                else if(Config.compt.getTest6_2() == 0)
                {
                    test6_layout2.setBackgroundColor(Color.TRANSPARENT);
                }
                else if(Config.compt.getTest6_3() == 0)
                {
                    test6_layout3.setBackgroundColor(Color.TRANSPARENT);
                }
                Intent intent = new Intent(Test6.this, Test6_image.class);
                startActivity(intent);
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

                alertDialog.setView(tv_test6, 20, 20, 20, 20);

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

    @Override
    public void onResume()
    {
        activatePictures();
        super.onResume();
    }

    //Deal with the color and the unlocking of buttons and pictures
    public void activatePictures() {
        // Au click sur le bouton, on débloque les boutons valider et refuser et on affiche le suivant en Jaune
        if (Config.compt.getTest6_1() == 0)
        {
            test6_layout1.setBackgroundColor(getResources().getColor(R.color.yellow));
        }
        if(Config.compt.getTest6_1()== 1) {
            btest6_play1.setImageResource(R.drawable.replay);
            btest6_validate1.setEnabled(true);
            btest6_validate1.setClickable(true);
            btest6_validate1.setImageResource(R.drawable.validate);
            btest6_refuse1.setEnabled(true);
            btest6_refuse1.setClickable(true);
            btest6_refuse1.setImageResource(R.drawable.refuse);
            if (Config.compt.getTest6_2() == 0)
            {
                test6_layout2.setBackgroundColor(getResources().getColor(R.color.yellow));
                btest6_play2.setImageResource(R.drawable.play_blue);
                btest6_play2.setEnabled(true);
                btest6_play2.setClickable(true);
            }
        }
        if (Config.compt.getTest6_1() == 2) {
            btest6_play1.setImageResource(R.drawable.play_grey);
            btest6_play1.setEnabled(false);
            btest6_play1.setClickable(false);
        }
        if (Config.compt.getTest6_2() == 1) {
            btest6_play2.setImageResource(R.drawable.replay);
            btest6_validate2.setEnabled(true);
            btest6_validate2.setClickable(true);
            btest6_validate2.setImageResource(R.drawable.validate);
            btest6_refuse2.setEnabled(true);
            btest6_refuse2.setClickable(true);
            btest6_refuse2.setImageResource(R.drawable.refuse);
            if (Config.compt.getTest6_3() == 0)
            {
                test6_layout3.setBackgroundColor(getResources().getColor(R.color.yellow));
                btest6_play3.setImageResource(R.drawable.play_blue);
                btest6_play3.setEnabled(true);
                btest6_play3.setClickable(true);
            }
        }
        if (Config.compt.getTest6_2() == 2) {
            btest6_play2.setImageResource(R.drawable.play_grey);
            btest6_play2.setEnabled(false);
            btest6_play2.setClickable(false);
        }
        if (Config.compt.getTest6_3() == 1) {
            btest6_play3.setImageResource(R.drawable.replay);
            btest6_validate3.setEnabled(true);
            btest6_validate3.setClickable(true);
            btest6_validate3.setImageResource(R.drawable.validate);
            btest6_refuse3.setEnabled(true);
            btest6_refuse3.setClickable(true);
            btest6_refuse3.setImageResource(R.drawable.refuse);

        }
        if (Config.compt.getTest6_3() == 2)
        {
            btest6_play3.setImageResource(R.drawable.play_grey);
            btest6_play3.setEnabled(false);
            btest6_play3.setClickable(false);
        }
    }


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
