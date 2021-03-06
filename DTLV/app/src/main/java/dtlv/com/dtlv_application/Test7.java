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
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Utilisateur on 2015-12-06.
 */
public class Test7 extends Activity{

    private GestionPoint gestPts;

    private ImageButton btest7_play1 = null;
    private boolean quotation_text1 = false;
    private ImageButton btest7_validate1 = null;
    private ImageButton btest7_refuse1 = null;
    private LinearLayout test7_layout1 = null;
    private ImageButton btest7_play2 = null;
    private boolean quotation_text2 = false;
    private ImageButton btest7_validate2 = null;
    private ImageButton btest7_refuse2 = null;
    private LinearLayout test7_layout2 = null;
    private ImageButton btest7_play3 = null;
    private boolean quotation_text3 = false;
    private ImageButton btest7_validate3 = null;
    private ImageButton btest7_refuse3 = null;
    private LinearLayout test7_layout3 = null;
    private ImageButton btest7_play4 = null;
    private boolean quotation_text4 = false;
    private ImageButton btest7_validate4 = null;
    private ImageButton btest7_refuse4 = null;
    private LinearLayout test7_layout4 = null;
    private ImageButton btest7_play5 = null;
    private boolean quotation_text5 = false;
    private ImageButton btest7_validate5 = null;
    private ImageButton btest7_refuse5 = null;
    private LinearLayout test7_layout5 = null;
    private ImageButton btest7_play6 = null;
    private boolean quotation_text6 = false;
    private ImageButton btest7_validate6 = null;
    private ImageButton btest7_refuse6 = null;
    private LinearLayout test7_layout6 = null;
    private ImageButton btest7_next = null;

    private int count1=0;
    private int count2=0;
    private int count3=0;
    private int count4=0;
    private int count5=0;
    private int count6=0;

    //Variables de quotation
    private int q1 = 0;
    private int q2 = 0;
    private int q3 = 0;
    private int q4 = 0;
    private int q5 = 0;
    private int q6 = 0;

    private ImageButton btest7_help = null;
    private AlertDialog alertDialog = null;
    private TextView tv_test7 = null;

    private AlertDialog.Builder replayAlert = null;

    private Button tuto_bt1 = null;
    private Button tuto_bt2 = null;
    private Button tuto_bt3 = null;
    private Button tuto_bt4 = null;
    private Button tuto_bt5 = null;
    private Button tuto_bt6 = null;
    private Button tuto_bt7 = null;

    public Test7(){
        //Recuperation du systeme de gestion des points
        gestPts = Menu.gestPts;
    }
    @Override
    public void onBackPressed() {
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test7);

        final MediaPlayer mp1,mp2,mp3,mp4,mp5,mp6;
        btest7_play1 = (ImageButton) findViewById(R.id.test7_bplay1);
        btest7_play1.setEnabled(true);
        btest7_play1.setClickable(true);
        btest7_validate1 = (ImageButton) findViewById(R.id.test7_validate1);
        btest7_validate1.setEnabled(false);
        btest7_validate1.setClickable(false);
        btest7_validate1.setImageResource(R.drawable.validate_grey);
        btest7_refuse1 = (ImageButton) findViewById(R.id.test7_refuse1);
        btest7_refuse1.setEnabled(false);
        btest7_refuse1.setClickable(false);
        btest7_refuse1.setImageResource(R.drawable.refuse_grey);
        test7_layout1 = (LinearLayout) findViewById(R.id.test7_layout1);
        test7_layout1.setBackgroundColor(getResources().getColor(R.color.yellow));
        btest7_play2 = (ImageButton) findViewById(R.id.test7_bplay2);
        btest7_play2.setEnabled(false);
        btest7_play2.setClickable(false);
        btest7_play2.setImageResource(R.drawable.play_grey);
        btest7_validate2 = (ImageButton) findViewById(R.id.test7_validate2);
        btest7_validate2.setEnabled(false);
        btest7_validate2.setClickable(false);
        btest7_validate2.setImageResource(R.drawable.validate_grey);
        btest7_refuse2 = (ImageButton) findViewById(R.id.test7_refuse2);
        btest7_refuse2.setEnabled(false);
        btest7_refuse2.setClickable(false);
        btest7_refuse2.setImageResource(R.drawable.refuse_grey);
        test7_layout2 = (LinearLayout) findViewById(R.id.test7_layout2);
        btest7_play3 = (ImageButton) findViewById(R.id.test7_bplay3);
        btest7_play3.setEnabled(false);
        btest7_play3.setClickable(false);
        btest7_play3.setImageResource(R.drawable.play_grey);
        btest7_validate3 = (ImageButton) findViewById(R.id.test7_validate3);
        btest7_validate3.setEnabled(false);
        btest7_validate3.setClickable(false);
        btest7_validate3.setImageResource(R.drawable.validate_grey);
        btest7_refuse3 = (ImageButton) findViewById(R.id.test7_refuse3);
        btest7_refuse3.setEnabled(false);
        btest7_refuse3.setClickable(false);
        btest7_refuse3.setImageResource(R.drawable.refuse_grey);
        test7_layout3 = (LinearLayout) findViewById(R.id.test7_layout3);
        btest7_play4 = (ImageButton) findViewById(R.id.test7_bplay4);
        btest7_play4.setEnabled(false);
        btest7_play4.setClickable(false);
        btest7_play4.setImageResource(R.drawable.play_grey);
        btest7_validate4 = (ImageButton) findViewById(R.id.test7_validate4);
        btest7_validate4.setEnabled(false);
        btest7_validate4.setClickable(false);
        btest7_validate4.setImageResource(R.drawable.validate_grey);
        btest7_refuse4 = (ImageButton) findViewById(R.id.test7_refuse4);
        btest7_refuse4.setEnabled(false);
        btest7_refuse4.setClickable(false);
        btest7_refuse4.setImageResource(R.drawable.refuse_grey);
        test7_layout4 = (LinearLayout) findViewById(R.id.test7_layout4);
        btest7_play5 = (ImageButton) findViewById(R.id.test7_bplay5);
        btest7_play5.setEnabled(false);
        btest7_play5.setClickable(false);
        btest7_play5.setImageResource(R.drawable.play_grey);
        btest7_validate5 = (ImageButton) findViewById(R.id.test7_validate5);
        btest7_validate5.setEnabled(false);
        btest7_validate5.setClickable(false);
        btest7_validate5.setImageResource(R.drawable.validate_grey);
        btest7_refuse5 = (ImageButton) findViewById(R.id.test7_refuse5);
        btest7_refuse5.setEnabled(false);
        btest7_refuse5.setClickable(false);
        btest7_refuse5.setImageResource(R.drawable.refuse_grey);
        test7_layout5 = (LinearLayout) findViewById(R.id.test7_layout5);
        btest7_play6 = (ImageButton) findViewById(R.id.test7_bplay6);
        btest7_play6.setEnabled(false);
        btest7_play6.setClickable(false);
        btest7_play6.setImageResource(R.drawable.play_grey);
        btest7_validate6 = (ImageButton) findViewById(R.id.test7_validate6);
        btest7_validate6.setEnabled(false);
        btest7_validate6.setClickable(false);
        btest7_validate6.setImageResource(R.drawable.validate_grey);
        btest7_refuse6 = (ImageButton) findViewById(R.id.test7_refuse6);
        btest7_refuse6.setEnabled(false);
        btest7_refuse6.setClickable(false);
        btest7_refuse6.setImageResource(R.drawable.refuse_grey);
        test7_layout6 = (LinearLayout) findViewById(R.id.test7_layout6);

        btest7_next = (ImageButton) findViewById(R.id.test7_bnext);
        btest7_next.setEnabled(false);
        btest7_next.setClickable(false);
        btest7_next.setImageResource(R.drawable.next_grey);

        btest7_help = (ImageButton) findViewById(R.id.test7_bhelp);

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
        tuto_bt7.setBackgroundColor(getResources().getColor(R.color.yellow));

        //create pop-up for replay alert
        replayAlert = new AlertDialog.Builder(Test7.this);
        replayAlert.setTitle(getResources().getString(R.string.replay_title));
        replayAlert.setMessage(getResources().getString(R.string.replay_msg));

        replayAlert.setNegativeButton(getResources().getString(R.string.replay_no),
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });


        // Word 1
        mp1 = MediaPlayer.create(this, R.raw.test7_sound1_part1);
        btest7_play1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                test7_layout1.setBackgroundColor(Color.TRANSPARENT);
                mp1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        if (count1 == 0) {
                            //si c'est la première fois remplacer par bouton replay
                            btest7_play1.setImageResource(R.drawable.replay);

                            btest7_validate1.setEnabled(true);
                            btest7_validate1.setClickable(true);
                            btest7_validate1.setImageResource(R.drawable.validate);

                            btest7_refuse1.setEnabled(true);
                            btest7_refuse1.setClickable(true);
                            btest7_refuse1.setImageResource(R.drawable.refuse);

                            // Activate next play button
                            btest7_play2.setEnabled(true);
                            btest7_play2.setClickable(true);
                            btest7_play2.setImageResource(R.drawable.play_blue);
                            test7_layout2.setBackgroundColor(getResources().getColor(R.color.yellow));
                        }
                        if (count1 == 1) {
                            btest7_play1.setEnabled(false);
                            btest7_play1.setClickable(false);
                            btest7_play1.setImageResource(R.drawable.play_grey);
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
        });// Fin play1

        btest7_validate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test7_layout1.setBackgroundColor(getResources().getColor(R.color.green));
                quotation_text1 = true;
                q1=1;
                activateNext();
            }
        });
        btest7_refuse1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test7_layout1.setBackgroundColor(getResources().getColor(R.color.red));
                quotation_text1 = true;
                q1=0;
                activateNext();
            }
        });
        // Word 2
        mp2 = MediaPlayer.create(this, R.raw.test7_sound1_part2);
        btest7_play2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                test7_layout2.setBackgroundColor(Color.TRANSPARENT);
                mp2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        if (count2 == 0) {
                            //si c'est la première fois remplacer par bouton replay
                            btest7_play2.setImageResource(R.drawable.replay);

                            btest7_validate2.setEnabled(true);
                            btest7_validate2.setClickable(true);
                            btest7_validate2.setImageResource(R.drawable.validate);

                            btest7_refuse2.setEnabled(true);
                            btest7_refuse2.setClickable(true);
                            btest7_refuse2.setImageResource(R.drawable.refuse);

                            // Activate next play button
                            btest7_play3.setEnabled(true);
                            btest7_play3.setClickable(true);
                            btest7_play3.setImageResource(R.drawable.play_blue);
                            test7_layout3.setBackgroundColor(getResources().getColor(R.color.yellow));
                        }
                        if (count2 == 1) {
                            btest7_play2.setEnabled(false);
                            btest7_play2.setClickable(false);
                            btest7_play2.setImageResource(R.drawable.play_grey);
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
        });// Fin play2

        btest7_validate2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test7_layout2.setBackgroundColor(getResources().getColor(R.color.green));
                quotation_text2 = true;
                q2=1;
                activateNext();
            }
        });
        btest7_refuse2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test7_layout2.setBackgroundColor(getResources().getColor(R.color.red));
                quotation_text2 = true;
                q2=0;
                activateNext();
            }
        });

        // Word 3
        mp3 = MediaPlayer.create(this, R.raw.test7_sound1_part3);
        btest7_play3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                test7_layout3.setBackgroundColor(Color.TRANSPARENT);
                mp3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        if (count3 == 0) {
                            //si c'est la première fois remplacer par bouton replay
                            btest7_play3.setImageResource(R.drawable.replay);

                            btest7_validate3.setEnabled(true);
                            btest7_validate3.setClickable(true);
                            btest7_validate3.setImageResource(R.drawable.validate);

                            btest7_refuse3.setEnabled(true);
                            btest7_refuse3.setClickable(true);
                            btest7_refuse3.setImageResource(R.drawable.refuse);

                            // Activate next play button
                            btest7_play4.setEnabled(true);
                            btest7_play4.setClickable(true);
                            btest7_play4.setImageResource(R.drawable.play_blue);
                            test7_layout4.setBackgroundColor(getResources().getColor(R.color.yellow));
                        }
                        if (count3 == 1) {
                            btest7_play3.setEnabled(false);
                            btest7_play3.setClickable(false);
                            btest7_play3.setImageResource(R.drawable.play_grey);
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
        });// Fin play3

        btest7_validate3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test7_layout3.setBackgroundColor(getResources().getColor(R.color.green));
                quotation_text3 = true;
                q3=1;
                activateNext();
            }
        });
        btest7_refuse3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test7_layout3.setBackgroundColor(getResources().getColor(R.color.red));
                quotation_text3 = true;
                q3=0;
                activateNext();
            }
        });
        // Word 4
        mp4 = MediaPlayer.create(this, R.raw.test7_sound2_part1);
        btest7_play4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                test7_layout4.setBackgroundColor(Color.TRANSPARENT);
                mp4.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        if (count4 == 0) {
                            //si c'est la première fois remplacer par bouton replay
                            btest7_play4.setImageResource(R.drawable.replay);

                            btest7_validate4.setEnabled(true);
                            btest7_validate4.setClickable(true);
                            btest7_validate4.setImageResource(R.drawable.validate);

                            btest7_refuse4.setEnabled(true);
                            btest7_refuse4.setClickable(true);
                            btest7_refuse4.setImageResource(R.drawable.refuse);

                            // Activate next play button
                            btest7_play5.setEnabled(true);
                            btest7_play5.setClickable(true);
                            btest7_play5.setImageResource(R.drawable.play_blue);
                            test7_layout5.setBackgroundColor(getResources().getColor(R.color.yellow));
                        }
                        if (count4 == 1) {
                            btest7_play4.setEnabled(false);
                            btest7_play4.setClickable(false);
                            btest7_play4.setImageResource(R.drawable.play_grey);
                        }
                        count4++;
                    }
                });
                if(count4==1)
                {
                    replayAlert.setPositiveButton(getResources().getString(R.string.replay_yes),
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    mp4.start();
                                }
                            });
                    replayAlert.show();
                }
                else
                {
                    mp4.start();
                }
            }
        });// Fin play4

        btest7_validate4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test7_layout4.setBackgroundColor(getResources().getColor(R.color.green));
                quotation_text4 = true;
                q4=1;
                activateNext();
            }
        });
        btest7_refuse4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test7_layout4.setBackgroundColor(getResources().getColor(R.color.red));
                quotation_text4 = true;
                q4=0;
                activateNext();
            }
        });

        // Word 5
        mp5 = MediaPlayer.create(this, R.raw.test7_sound2_part2);
        btest7_play5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                test7_layout5.setBackgroundColor(Color.TRANSPARENT);
                mp5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        if (count5 == 0) {
                            //si c'est la première fois remplacer par bouton replay
                            btest7_play5.setImageResource(R.drawable.replay);

                            btest7_validate5.setEnabled(true);
                            btest7_validate5.setClickable(true);
                            btest7_validate5.setImageResource(R.drawable.validate);

                            btest7_refuse5.setEnabled(true);
                            btest7_refuse5.setClickable(true);
                            btest7_refuse5.setImageResource(R.drawable.refuse);

                            // Activate next play button
                            btest7_play6.setEnabled(true);
                            btest7_play6.setClickable(true);
                            btest7_play6.setImageResource(R.drawable.play_blue);
                            test7_layout6.setBackgroundColor(getResources().getColor(R.color.yellow));
                        }
                        if (count5 == 1) {
                            btest7_play5.setEnabled(false);
                            btest7_play5.setClickable(false);
                            btest7_play5.setImageResource(R.drawable.play_grey);
                        }
                        count5++;
                    }
                });
                if(count5==1)
                {
                    replayAlert.setPositiveButton(getResources().getString(R.string.replay_yes),
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    mp5.start();
                                }
                            });
                    replayAlert.show();
                }
                else
                {
                    mp5.start();
                }
            }
        });// Fin play5

        btest7_validate5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test7_layout5.setBackgroundColor(getResources().getColor(R.color.green));
                quotation_text5 = true;
                q5=1;
                activateNext();
            }
        });
        btest7_refuse5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test7_layout5.setBackgroundColor(getResources().getColor(R.color.red));
                quotation_text5 = true;
                q5=0;
                activateNext();
            }
        });
        // Word 6
        mp6 = MediaPlayer.create(this, R.raw.test7_sound2_part3);
        btest7_play6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                test7_layout6.setBackgroundColor(Color.TRANSPARENT);
                mp6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        if (count6 == 0) {
                            //si c'est la première fois remplacer par bouton replay
                            btest7_play6.setImageResource(R.drawable.replay);

                            btest7_validate6.setEnabled(true);
                            btest7_validate6.setClickable(true);
                            btest7_validate6.setImageResource(R.drawable.validate);

                            btest7_refuse6.setEnabled(true);
                            btest7_refuse6.setClickable(true);
                            btest7_refuse6.setImageResource(R.drawable.refuse);
                        }
                        if (count6 == 1) {
                            btest7_play6.setEnabled(false);
                            btest7_play6.setClickable(false);
                            btest7_play6.setImageResource(R.drawable.play_grey);
                        }
                        count6++;
                    }
                });
                if(count6==1)
                {
                    replayAlert.setPositiveButton(getResources().getString(R.string.replay_yes),
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    mp6.start();
                                }
                            });
                    replayAlert.show();
                }
                else
                {
                    mp6.start();
                }
            }
        });// Fin play6

        btest7_validate6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test7_layout6.setBackgroundColor(getResources().getColor(R.color.green));
                quotation_text6 = true;
                q6=1;
                activateNext();
            }
        });
        btest7_refuse6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test7_layout6.setBackgroundColor(getResources().getColor(R.color.red));
                quotation_text6 = true;
                q6=0;
                activateNext();
            }
        });

        btest7_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp1.release();
                mp2.release();
                mp3.release();
                mp4.release();
                mp5.release();
                mp6.release();
                // Au click sur le bouton, on passe au test suivant et on envoit le score a la gestion des points
                gestPts.setT7(q1+q2+q3+q4+q5+q6);
                Intent itest7 = new Intent(Test7.this, Test8.class);
                startActivity(itest7);
            }
        });

        btest7_help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog = new AlertDialog.Builder(Test7.this).create();
                alertDialog.setTitle(getResources().getString(R.string.help_test7_title));
                String admin = getResources().getString(R.string.help_admin);
                String quote = getResources().getString(R.string.help_quote);

                tv_test7 = new TextView(Test7.this);

                Spannable st7_1 = getTextWithImages(alertDialog.getContext(), getResources().getString(R.string.help_test7_text1));
                Spannable st7_2 = getTextWithImages(alertDialog.getContext(), getResources().getString(R.string.help_test7_text2));

                tv_test7.setText(TextUtils.concat(admin, st7_1, quote, st7_2));

                alertDialog.setView(tv_test7, 20, 20, 20, 20);

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

    //Check if everything is quoted to unlock the button to the next test
    public void activateNext() {
        if (this.quotation_text1 == true && this.quotation_text2 == true && this.quotation_text3 == true &&
                this.quotation_text4 == true && this.quotation_text5 == true && this.quotation_text6 == true) {
            btest7_next.setEnabled(true);
            btest7_next.setClickable(true);
            btest7_next.setImageResource(R.drawable.next);
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
            icon.setBounds(0, 0, tv_test7.getLineHeight(), tv_test7.getLineHeight());
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
