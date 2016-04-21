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

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Created by Utilisateur on 2015-12-05.
 */
public class Test2 extends Activity {

    private int ptsT2 = 0;
    private GestionPoint gestPts;

    private ImageButton btest2_play11 = null;
    private boolean quotation_11 = false;
    private ImageButton btest2_validate11 = null;
    private ImageButton btest2_refuse11 = null;
    private LinearLayout test2_layout11 = null;

    private ImageButton btest2_play12 = null;
    private boolean quotation_12 = false;
    private ImageButton btest2_validate12 = null;
    private ImageButton btest2_refuse12 = null;
    private LinearLayout test2_layout12 = null;


    private ImageButton btest2_play13 = null;
    private boolean quotation_13 = false;
    private ImageButton btest2_validate13 = null;
    private ImageButton btest2_refuse13 = null;
    private LinearLayout test2_layout13 = null;

    private ImageButton btest2_play21 = null;
    private boolean quotation_21 = false;
    private ImageButton btest2_validate21 = null;
    private ImageButton btest2_refuse21 = null;
    private LinearLayout test2_layout21 = null;

    private ImageButton btest2_play22 = null;
    private boolean quotation_22 = false;
    private ImageButton btest2_validate22 = null;
    private ImageButton btest2_refuse22 = null;
    private LinearLayout test2_layout22 = null;

    private ImageButton btest2_play23 = null;
    private boolean quotation_23 = false;
    private ImageButton btest2_validate23 = null;
    private ImageButton btest2_refuse23 = null;
    private LinearLayout test2_layout23 = null;

    private ImageButton btest2_play31 = null;
    private boolean quotation_31 = false;
    private ImageButton btest2_validate31 = null;
    private ImageButton btest2_refuse31 = null;
    private LinearLayout test2_layout31 = null;

    private ImageButton btest2_play32 = null;
    private boolean quotation_32 = false;
    private ImageButton btest2_validate32 = null;
    private ImageButton btest2_refuse32 = null;
    private LinearLayout test2_layout32 = null;

    private ImageButton btest2_play33 = null;
    private boolean quotation_33 = false;
    private ImageButton btest2_validate33 = null;
    private ImageButton btest2_refuse33 = null;
    private LinearLayout test2_layout33 = null;

    private ImageButton btest2_next = null;

    private int count11 = 0;
    private int count12 = 0;
    private int count13 = 0;
    private int count21 = 0;
    private int count22 = 0;
    private int count23 = 0;
    private int count31 = 0;
    private int count32 = 0;
    private int count33 = 0;

    //Variables de quotation
    private int q11 = 0;
    private int q12 = 0;
    private int q13 = 0;
    private int q21 = 0;
    private int q22 = 0;
    private int q23 = 0;
    private int q31 = 0;
    private int q32 = 0;
    private int q33 = 0;

    private ImageButton btest2_help = null;
    private AlertDialog alertDialog = null;
    private TextView tv_test2 = null;

    private AlertDialog.Builder replayAlert = null;

    private Button tuto_bt1 = null;
    private Button tuto_bt2 = null;

    public Test2() {
        gestPts = Menu.gestPts;
    }

    MediaPlayer mp = null;
    @Override
    public void onBackPressed() {
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.test2);

        final MediaPlayer mp111, mp112, mp121, mp122, mp131, mp132, mp211, mp212, mp221, mp222, mp231, mp232, mp311, mp312, mp321, mp322, mp331, mp332;
        btest2_play11 = (ImageButton) findViewById(R.id.test2_word1_bplay);
        btest2_play11.setImageResource(R.drawable.play_blue);
        btest2_play11.setEnabled(true);
        btest2_play11.setClickable(true);
        btest2_validate11 = (ImageButton) findViewById(R.id.test2_word1_bvalid);
        btest2_validate11.setEnabled(false);
        btest2_validate11.setClickable(false);
        btest2_validate11.setImageResource(R.drawable.validate_grey);
        btest2_refuse11 = (ImageButton) findViewById(R.id.test2_word1_brefuse);
        btest2_refuse11.setEnabled(false);
        btest2_refuse11.setClickable(false);
        btest2_refuse11.setImageResource(R.drawable.refuse_grey);
        test2_layout11 = (LinearLayout) findViewById(R.id.test2_layout11);


        btest2_play12 = (ImageButton) findViewById(R.id.test2_word2_bplay);
        btest2_play12.setImageResource(R.drawable.play_grey);
        btest2_play12.setEnabled(false);
        btest2_play12.setClickable(false);
        btest2_validate12 = (ImageButton) findViewById(R.id.test2_word2_bvalid);
        btest2_validate12.setEnabled(false);
        btest2_validate12.setClickable(false);
        btest2_validate12.setImageResource(R.drawable.validate_grey);
        btest2_refuse12 = (ImageButton) findViewById(R.id.test2_word2_brefuse);
        btest2_refuse12.setEnabled(false);
        btest2_refuse12.setClickable(false);
        btest2_refuse12.setImageResource(R.drawable.refuse_grey);
        test2_layout12 = (LinearLayout) findViewById(R.id.test2_layout12);

        btest2_play13 = (ImageButton) findViewById(R.id.test2_word3_bplay);
        btest2_play13.setImageResource(R.drawable.play_grey);
        btest2_play13.setEnabled(false);
        btest2_play13.setClickable(false);
        btest2_validate13 = (ImageButton) findViewById(R.id.test2_word3_bvalid);
        btest2_validate13.setImageResource(R.drawable.validate_grey);
        btest2_validate13.setEnabled(false);
        btest2_validate13.setClickable(false);
        btest2_refuse13 = (ImageButton) findViewById(R.id.test2_word3_brefuse);
        btest2_refuse13.setImageResource(R.drawable.refuse_grey);
        btest2_refuse13.setEnabled(false);
        btest2_refuse13.setClickable(false);
        test2_layout13 = (LinearLayout) findViewById(R.id.test2_layout13);

        btest2_play21 = (ImageButton) findViewById(R.id.test2_nonword1_bplay);
        btest2_play21.setImageResource(R.drawable.play_grey);
        btest2_play21.setEnabled(false);
        btest2_play21.setClickable(false);
        btest2_validate21 = (ImageButton) findViewById(R.id.test2_nonword1_bvalid);
        btest2_validate21.setImageResource(R.drawable.validate_grey);
        btest2_validate21.setEnabled(false);
        btest2_validate21.setClickable(false);
        btest2_refuse21 = (ImageButton) findViewById(R.id.test2_nonword1_brefuse);
        btest2_refuse21.setImageResource(R.drawable.refuse_grey);
        btest2_refuse21.setEnabled(false);
        btest2_refuse21.setClickable(false);
        test2_layout21 = (LinearLayout) findViewById(R.id.test2_layout21);

        btest2_play22 = (ImageButton) findViewById(R.id.test2_nonword2_bplay);
        btest2_play22.setImageResource(R.drawable.play_grey);
        btest2_play22.setEnabled(false);
        btest2_play22.setClickable(false);
        btest2_validate22 = (ImageButton) findViewById(R.id.test2_nonword2_bvalid);
        btest2_validate22.setImageResource(R.drawable.validate_grey);
        btest2_validate22.setEnabled(false);
        btest2_validate22.setClickable(false);
        btest2_refuse22 = (ImageButton) findViewById(R.id.test2_nonword2_brefuse);
        btest2_refuse22.setImageResource(R.drawable.refuse_grey);
        btest2_refuse22.setEnabled(false);
        btest2_refuse22.setClickable(false);
        test2_layout22 = (LinearLayout) findViewById(R.id.test2_layout22);

        btest2_play23 = (ImageButton) findViewById(R.id.test2_nonword3_bplay);
        btest2_play23.setImageResource(R.drawable.play_grey);
        btest2_play23.setEnabled(false);
        btest2_play23.setClickable(false);
        btest2_validate23 = (ImageButton) findViewById(R.id.test2_nonword3_bvalid);
        btest2_validate23.setImageResource(R.drawable.validate_grey);
        btest2_validate23.setEnabled(false);
        btest2_validate23.setClickable(false);
        btest2_refuse23 = (ImageButton) findViewById(R.id.test2_nonword3_brefuse);
        btest2_refuse23.setImageResource(R.drawable.refuse_grey);
        btest2_refuse23.setEnabled(false);
        btest2_refuse23.setClickable(false);
        test2_layout23 = (LinearLayout) findViewById(R.id.test2_layout23);

        btest2_play31 = (ImageButton) findViewById(R.id.test2_phrase1_bplay);
        btest2_play31.setImageResource(R.drawable.play_grey);
        btest2_play31.setEnabled(false);
        btest2_play31.setClickable(false);
        btest2_validate31 = (ImageButton) findViewById(R.id.test2_phrase1_bvalid);
        btest2_validate31.setImageResource(R.drawable.validate_grey);
        btest2_validate31.setEnabled(false);
        btest2_validate31.setClickable(false);
        btest2_refuse31 = (ImageButton) findViewById(R.id.test2_phrase1_brefuse);
        btest2_refuse31.setImageResource(R.drawable.refuse_grey);
        btest2_refuse31.setEnabled(false);
        btest2_refuse31.setClickable(false);
        test2_layout31 = (LinearLayout) findViewById(R.id.test2_layout31);

        btest2_play32 = (ImageButton) findViewById(R.id.test2_phrase2_bplay);
        btest2_play32.setImageResource(R.drawable.play_grey);
        btest2_play32.setEnabled(false);
        btest2_play32.setClickable(false);
        btest2_validate32 = (ImageButton) findViewById(R.id.test2_phrase2_bvalid);
        btest2_validate32.setImageResource(R.drawable.validate_grey);
        btest2_validate32.setEnabled(false);
        btest2_validate32.setClickable(false);
        btest2_refuse32 = (ImageButton) findViewById(R.id.test2_phrase2_brefuse);
        btest2_refuse32.setImageResource(R.drawable.refuse_grey);
        btest2_refuse32.setEnabled(false);
        btest2_refuse32.setClickable(false);
        test2_layout32 = (LinearLayout) findViewById(R.id.test2_layout32);

        btest2_play33 = (ImageButton) findViewById(R.id.test2_phrase3_bplay);
        btest2_play33.setImageResource(R.drawable.play_grey);
        btest2_play33.setEnabled(false);
        btest2_play33.setClickable(false);
        btest2_validate33 = (ImageButton) findViewById(R.id.test2_phrase3_bvalid);
        btest2_validate33.setImageResource(R.drawable.validate_grey);
        btest2_validate33.setEnabled(false);
        btest2_validate33.setClickable(false);
        btest2_refuse33 = (ImageButton) findViewById(R.id.test2_phrase3_brefuse);
        btest2_refuse33.setImageResource(R.drawable.refuse_grey);
        btest2_refuse33.setEnabled(false);
        btest2_refuse33.setClickable(false);
        test2_layout33 = (LinearLayout) findViewById(R.id.test2_layout33);


        btest2_next = (ImageButton) findViewById(R.id.test2_bnext);
        btest2_next.setEnabled(false);
        btest2_next.setClickable(false);
        btest2_next.setImageResource(R.drawable.next_grey);
        test2_layout11.setBackgroundColor(getResources().getColor(R.color.yellow));

        btest2_help = (ImageButton) findViewById(R.id.test2_bhelp);

        tuto_bt1 = (Button) findViewById(R.id.tuto_bt1);
        tuto_bt1.setBackgroundColor(getResources().getColor(R.color.green));
        tuto_bt2 = (Button) findViewById(R.id.tuto_bt2);
        tuto_bt2.setBackgroundColor(getResources().getColor(R.color.yellow));

        //create pop-up for replay alert
        replayAlert = new AlertDialog.Builder(Test2.this);
        replayAlert.setTitle(getResources().getString(R.string.replay_title));
        replayAlert.setMessage(getResources().getString(R.string.replay_msg));

        replayAlert.setNegativeButton(getResources().getString(R.string.replay_no),
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });



        /*************  Word 1  **************/
        mp111 = MediaPlayer.create(this, R.raw.test2_sound1_part1);
        mp112 = MediaPlayer.create(this, R.raw.test2_sound1_part1);
        btest2_play11.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count11 == 0) {
                    test2_layout11.setBackgroundColor(Color.TRANSPARENT);
                    mp111.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        public void onCompletion(MediaPlayer mp) {
                            //si c'est la première fois remplacer par bouton replay
                            btest2_play11.setImageResource(R.drawable.replay);

                            btest2_validate11.setEnabled(true);
                            btest2_validate11.setClickable(true);
                            btest2_validate11.setImageResource(R.drawable.validate);
                            btest2_refuse11.setEnabled(true);
                            btest2_refuse11.setClickable(true);
                            btest2_refuse11.setImageResource(R.drawable.refuse);

                            // Activate next play button
                            btest2_play12.setEnabled(true);
                            btest2_play12.setClickable(true);
                            btest2_play12.setImageResource(R.drawable.play_blue);
                            mp.release();
                            count11++;

                            test2_layout12.setBackgroundColor(getResources().getColor(R.color.yellow));
                        }
                    });

                    mp111.start();

                } else if (count11 == 1) {
                    mp112.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        public void onCompletion(MediaPlayer mp) {
                            btest2_play11.setEnabled(false);
                            btest2_play11.setClickable(false);
                            btest2_play11.setImageResource(R.drawable.play_grey);
                            mp.release();
                            count11++;

                        }
                    });

                    replayAlert.setPositiveButton(getResources().getString(R.string.replay_yes),
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    mp112.start();
                                }
                            });
                    replayAlert.show();
                }

            }
        });


        btest2_validate11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test2_layout11.setBackgroundColor(getResources().getColor(R.color.green));//si on fixe une couleur :
                quotation_11 = true;
                q11 = 1;
                activateNext();
            }
        });

        btest2_refuse11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test2_layout11.setBackgroundColor(getResources().getColor(R.color.red));// si on fixe une couleur : getResources().getColor(R.color.red)
                quotation_11 = true;
                q11 = 0;
                activateNext();
            }
        });


        /************  Word 2  **************/
        mp121 = MediaPlayer.create(this, R.raw.test2_sound1_part2);
        mp122 = MediaPlayer.create(this, R.raw.test2_sound1_part2);
        btest2_play12.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (count12 == 0) {
                    test2_layout12.setBackgroundColor(Color.TRANSPARENT);
                    mp121.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            //si c'est la première fois remplacer par bouton replay
                            btest2_play12.setImageResource(R.drawable.replay);

                            btest2_validate12.setEnabled(true);
                            btest2_validate12.setClickable(true);
                            btest2_validate12.setImageResource(R.drawable.validate);

                            btest2_refuse12.setEnabled(true);
                            btest2_refuse12.setClickable(true);
                            btest2_refuse12.setImageResource(R.drawable.refuse);

                            // Activate next play button
                            btest2_play13.setEnabled(true);
                            btest2_play13.setClickable(true);
                            btest2_play13.setImageResource(R.drawable.play_blue);
                            mp.release();
                            count12++;

                            test2_layout13.setBackgroundColor(getResources().getColor(R.color.yellow));

                        }
                    });
                    mp121.start();
                } else if (count12 == 1) {

                    mp122.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            btest2_play12.setImageResource(R.drawable.play_grey);
                            btest2_play12.setEnabled(false);
                            btest2_play12.setClickable(false);
                            mp.release();

                            count12++;
                        }
                    });
                    replayAlert.setPositiveButton(getResources().getString(R.string.replay_yes),
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    mp122.start();
                                }
                            });
                    replayAlert.show();                }
            }
        });


        btest2_validate12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test2_layout12.setBackgroundColor(getResources().getColor(R.color.green));// si on fixe une couleur : getResources().getColor(R.getResources().getColor(R.color.red))
                quotation_12 = true;
                q12 = 1;
                activateNext();
            }
        });
        btest2_refuse12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test2_layout12.setBackgroundColor(getResources().getColor(R.color.red));// si on fixe une couleur : getResources().getColor(R.getResources().getColor(R.color.red))
                quotation_12 = true;
                q12 = 0;
                activateNext();
            }
        });


        /***************  Word 3  ************/
        mp131 = MediaPlayer.create(this, R.raw.test2_sound1_part3);
        mp132 = MediaPlayer.create(this, R.raw.test2_sound1_part3);
        btest2_play13.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (count13 == 0) {
                    test2_layout13.setBackgroundColor(Color.TRANSPARENT);
                    mp131.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {

                            //si c'est la première fois remplacer par bouton replay
                            btest2_play13.setImageResource(R.drawable.replay);

                            btest2_validate13.setEnabled(true);
                            btest2_validate13.setClickable(true);
                            btest2_validate13.setImageResource(R.drawable.validate);

                            btest2_refuse13.setEnabled(true);
                            btest2_refuse13.setClickable(true);
                            btest2_refuse13.setImageResource(R.drawable.refuse);

                            // Activate next play button
                            btest2_play21.setEnabled(true);
                            btest2_play21.setClickable(true);
                            btest2_play21.setImageResource(R.drawable.play_blue);

                            mp.release();


                            count13++;

                            test2_layout21.setBackgroundColor(getResources().getColor(R.color.yellow));
                        }
                    });
                    mp131.start();
                } else if (count13 == 1) {
                    mp132.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            btest2_play13.setImageResource(R.drawable.play_grey);
                            btest2_play13.setEnabled(false);
                            btest2_play13.setClickable(false);
                            mp.release();
                            count13++;
                        }
                    });
                    replayAlert.setPositiveButton(getResources().getString(R.string.replay_yes),
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    mp132.start();
                                }
                            });
                    replayAlert.show();
                }
            }
        });


        btest2_validate13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test2_layout13.setBackgroundColor(getResources().getColor(R.color.green));// si on fixe une couleur : getResources().getColor(R.getResources().getColor(R.color.red))
                quotation_13 = true;
                q13 = 1;
                activateNext();
            }
        });
        btest2_refuse13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test2_layout13.setBackgroundColor(getResources().getColor(R.color.red));// si on fixe une couleur : getResources().getColor(R.getResources().getColor(R.color.red))
                quotation_13 = true;
                q13 = 0;
                activateNext();
            }
        });

        /**************  NonWord 1  *****************/
        mp211 = MediaPlayer.create(this, R.raw.test2_sound2_part1);
        mp212 = MediaPlayer.create(this, R.raw.test2_sound2_part1);

        btest2_play21.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (count21 == 0) {
                    test2_layout21.setBackgroundColor(Color.TRANSPARENT);
                    mp211.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            //si c'est la première fois remplacer par bouton replay
                            btest2_play21.setImageResource(R.drawable.replay);

                            btest2_validate21.setEnabled(true);
                            btest2_validate21.setClickable(true);
                            btest2_validate21.setImageResource(R.drawable.validate);

                            btest2_refuse21.setEnabled(true);
                            btest2_refuse21.setClickable(true);
                            btest2_refuse21.setImageResource(R.drawable.refuse);

                            // Activate next play button
                            btest2_play22.setEnabled(true);
                            btest2_play22.setClickable(true);
                            btest2_play22.setImageResource(R.drawable.play_blue);
                            mp.release();
                            count21++;

                            test2_layout22.setBackgroundColor(getResources().getColor(R.color.yellow));

                        }
                    });
                    mp211.start();
                } else if (count21 == 1) {
                    mp212.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {

                            btest2_play21.setImageResource(R.drawable.play_grey);
                            btest2_play21.setEnabled(false);
                            btest2_play21.setClickable(false);
                            mp.release();
                            count21++;
                        }
                    });
                    replayAlert.setPositiveButton(getResources().getString(R.string.replay_yes),
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    mp212.start();
                                }
                            });
                    replayAlert.show();                }
            }
        });
        btest2_validate21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test2_layout21.setBackgroundColor(getResources().getColor(R.color.green));// si on fixe une couleur : getResources().getColor(R.getResources().getColor(R.color.red))
                quotation_21 = true;
                q21 = 1;
                activateNext();
            }
        });
        btest2_refuse21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test2_layout21.setBackgroundColor(getResources().getColor(R.color.red));// si on fixe une couleur : getResources().getColor(R.getResources().getColor(R.color.red))
                quotation_21 = true;
                q21 = 0;
                activateNext();
            }
        });

        /***************  NonWord 2  *****************/
        mp221 = MediaPlayer.create(this, R.raw.test2_sound2_part2);
        mp222 = MediaPlayer.create(this, R.raw.test2_sound2_part2);
        btest2_play22.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (count22 == 0) {
                    test2_layout22.setBackgroundColor(Color.TRANSPARENT);
                    mp221.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            //si c'est la première fois remplacer par bouton replay
                            btest2_play22.setImageResource(R.drawable.replay);

                            btest2_validate22.setEnabled(true);
                            btest2_validate22.setClickable(true);
                            btest2_validate22.setImageResource(R.drawable.validate);

                            btest2_refuse22.setEnabled(true);
                            btest2_refuse22.setClickable(true);
                            btest2_refuse22.setImageResource(R.drawable.refuse);

                            // Activate next play button
                            btest2_play23.setEnabled(true);
                            btest2_play23.setClickable(true);
                            btest2_play23.setImageResource(R.drawable.play_blue);
                            mp.release();
                            count22++;

                            test2_layout23.setBackgroundColor(getResources().getColor(R.color.yellow));
                        }
                    });
                    mp221.start();
                } else if (count22 == 1) {
                    mp222.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            btest2_play22.setImageResource(R.drawable.play_grey);
                            btest2_play22.setEnabled(false);
                            btest2_play22.setClickable(false);
                            mp.release();
                            count22++;
                        }
                    });
                    replayAlert.setPositiveButton(getResources().getString(R.string.replay_yes),
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    mp222.start();
                                }
                            });
                    replayAlert.show();
                }
            }
        });


        btest2_validate22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test2_layout22.setBackgroundColor(getResources().getColor(R.color.green));// si on fixe une couleur : getResources().getColor(R.getResources().getColor(R.color.red))
                quotation_22 = true;
                q22 = 1;
                activateNext();
            }
        });
        btest2_refuse22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test2_layout22.setBackgroundColor(getResources().getColor(R.color.red));// si on fixe une couleur : getResources().getColor(R.getResources().getColor(R.color.red))
                quotation_22 = true;
                q22 = 0;
                activateNext();
            }
        });


        /************** NonWord 3 **************/
        mp231 = MediaPlayer.create(this, R.raw.test2_sound2_part3);
        mp232 = MediaPlayer.create(this, R.raw.test2_sound2_part3);

        btest2_play23.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (count23 == 0) {
                    test2_layout23.setBackgroundColor(Color.TRANSPARENT);
                    mp231.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            //si c'est la première fois remplacer par bouton replay
                            btest2_play23.setImageResource(R.drawable.replay);

                            btest2_validate23.setEnabled(true);
                            btest2_validate23.setClickable(true);
                            btest2_validate23.setImageResource(R.drawable.validate);

                            btest2_refuse23.setEnabled(true);
                            btest2_refuse23.setClickable(true);
                            btest2_refuse23.setImageResource(R.drawable.refuse);

                            // Activate next play button
                            btest2_play31.setEnabled(true);
                            btest2_play31.setClickable(true);
                            btest2_play31.setImageResource(R.drawable.play_blue);
                            mp.release();
                            count23++;

                            test2_layout31.setBackgroundColor(getResources().getColor(R.color.yellow));
                        }
                    });
                    mp231.start();
                } else if (count23 == 1) {
                    mp232.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            btest2_play23.setImageResource(R.drawable.play_grey);
                            btest2_play23.setEnabled(false);
                            btest2_play23.setClickable(false);
                            mp.release();
                            count23++;
                        }
                    });
                    replayAlert.setPositiveButton(getResources().getString(R.string.replay_yes),
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    mp232.start();
                                }
                            });
                    replayAlert.show();                }
            }
        });


        btest2_validate23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test2_layout23.setBackgroundColor(getResources().getColor(R.color.green));// si on fixe une couleur : getResources().getColor(R.getResources().getColor(R.color.red))
                quotation_23 = true;
                q23 = 1;
                activateNext();
            }
        });
        btest2_refuse23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test2_layout23.setBackgroundColor(getResources().getColor(R.color.red));// si on fixe une couleur : getResources().getColor(R.getResources().getColor(R.color.red))
                quotation_23 = true;
                q23 = 0;
                activateNext();
            }
        });


        /************ Sentence 1 *************/
        mp311 = MediaPlayer.create(this, R.raw.test2_sound3_part1);
        mp312 = MediaPlayer.create(this, R.raw.test2_sound3_part1);
        btest2_play31.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

                if (count31 == 0) {
                    test2_layout31.setBackgroundColor(Color.TRANSPARENT);
                    mp311.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            //si c'est la première fois remplacer par bouton replay
                            btest2_play31.setImageResource(R.drawable.replay);

                            btest2_validate31.setEnabled(true);
                            btest2_validate31.setClickable(true);
                            btest2_validate31.setImageResource(R.drawable.validate);

                            btest2_refuse31.setEnabled(true);
                            btest2_refuse31.setClickable(true);
                            btest2_refuse31.setImageResource(R.drawable.refuse);

                            // Activate next play button
                            btest2_play32.setEnabled(true);
                            btest2_play32.setClickable(true);
                            btest2_play32.setImageResource(R.drawable.play_blue);
                            mp.release();
                            count31++;

                            test2_layout32.setBackgroundColor(getResources().getColor(R.color.yellow));
                        }
                    });
                    mp311.start();
                } else if (count31 == 1) {
                    mp312.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            btest2_play31.setImageResource(R.drawable.play_grey);
                            btest2_play31.setEnabled(false);
                            btest2_play31.setClickable(false);
                            mp.release();
                            count31++;
                        }
                    });
                    replayAlert.setPositiveButton(getResources().getString(R.string.replay_yes),
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    mp312.start();
                                }
                            });
                    replayAlert.show();                }
            }
        });


        btest2_validate31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test2_layout31.setBackgroundColor(getResources().getColor(R.color.green));
                quotation_31 = true;
                q31 = 1;
                activateNext();
            }
        });
        btest2_refuse31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test2_layout31.setBackgroundColor(getResources().getColor(R.color.red));
                quotation_31 = true;
                q31 = 0;
                activateNext();
            }
        });


        /************ Sentence 2 ***********/
        mp321 = MediaPlayer.create(this, R.raw.test2_sound3_part2);
        mp322 = MediaPlayer.create(this, R.raw.test2_sound3_part2);

        btest2_play32.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (count32 == 0) {
                    test2_layout32.setBackgroundColor(Color.TRANSPARENT);
                    mp321.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            //si c'est la première fois remplacer par bouton replay
                            btest2_play32.setImageResource(R.drawable.replay);

                            btest2_validate32.setEnabled(true);
                            btest2_validate32.setClickable(true);
                            btest2_validate32.setImageResource(R.drawable.validate);

                            btest2_refuse32.setEnabled(true);
                            btest2_refuse32.setClickable(true);
                            btest2_refuse32.setImageResource(R.drawable.refuse);

                            // Activate next play button
                            btest2_play33.setEnabled(true);
                            btest2_play33.setClickable(true);
                            btest2_play33.setImageResource(R.drawable.play_blue);
                            mp.release();
                            count32++;

                            test2_layout33.setBackgroundColor(getResources().getColor(R.color.yellow));
                        }
                    });
                    mp321.start();
                } else if (count32 == 1) {
                    mp322.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            btest2_play32.setImageResource(R.drawable.play_grey);
                            btest2_play32.setEnabled(false);
                            btest2_play32.setClickable(false);
                            mp.release();
                            count32++;
                        }
                    });
                    replayAlert.setPositiveButton(getResources().getString(R.string.replay_yes),
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    mp322.start();
                                }
                            });
                    replayAlert.show();
                }
            }
        });

        btest2_validate32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test2_layout32.setBackgroundColor(getResources().getColor(R.color.green));// si on fixe une couleur : getResources().getColor(R.getResources().getColor(R.color.red))
                quotation_32 = true;
                q32 = 1;
                activateNext();
            }
        });
        btest2_refuse32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test2_layout32.setBackgroundColor(getResources().getColor(R.color.red));// si on fixe une couleur : getResources().getColor(R.getResources().getColor(R.color.red))
                quotation_32 = true;
                q32 = 0;
                activateNext();
            }
        });


        /************ Sentence 3 *************/
        mp331 = MediaPlayer.create(this, R.raw.test2_sound3_part3);
        mp332 = MediaPlayer.create(this, R.raw.test2_sound3_part3);
        btest2_play33.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (count33 == 0) {
                    test2_layout33.setBackgroundColor(Color.TRANSPARENT);
                    mp331.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            //si c'est la première fois remplacer par bouton replay
                            btest2_play33.setImageResource(R.drawable.replay);

                            btest2_validate33.setEnabled(true);
                            btest2_validate33.setClickable(true);
                            btest2_validate33.setImageResource(R.drawable.validate);

                            btest2_refuse33.setEnabled(true);
                            btest2_refuse33.setClickable(true);
                            btest2_refuse33.setImageResource(R.drawable.refuse);
                            mp.release();
                            count33++;

                        }
                    });
                    mp331.start();
                } else if (count33 == 1) {
                    mp332.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {

                            btest2_play33.setImageResource(R.drawable.play_grey);
                            btest2_play33.setEnabled(false);
                            btest2_play33.setClickable(false);
                            mp.release();
                            count33++;
                        }
                    });
                    replayAlert.setPositiveButton(getResources().getString(R.string.replay_yes),
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    mp332.start();
                                }
                            });
                    replayAlert.show();
                }
            }
        });

        btest2_validate33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test2_layout33.setBackgroundColor(getResources().getColor(R.color.green));// si on fixe une couleur : getResources().getColor(R.getResources().getColor(R.color.red))
                quotation_33 = true;
                q33 = 1;
                activateNext();
            }
        });
        btest2_refuse33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test2_layout33.setBackgroundColor(getResources().getColor(R.color.red));// si on fixe une couleur : getResources().getColor(R.getResources().getColor(R.color.red))
                quotation_33 = true;
                q33 = 0;
                activateNext();
            }
        });


        /******** NEXT ***********/
        btest2_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on passe au test suivant et on envoit le score a la gestion des points
                gestPts.setT2(q11 + q12 + q13 + q21 + q22 + q23 + q31 + q32 + q33);
                Intent itest2 = new Intent(Test2.this, Test3.class);
                startActivity(itest2);
            }
        });


        // AlertDialog
        btest2_help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog = new AlertDialog.Builder(Test2.this).create();
                alertDialog.setTitle(getResources().getString(R.string.help_test2_title));
                String admin = getResources().getString(R.string.help_admin);
                String quote = getResources().getString(R.string.help_quote);

                tv_test2 = new TextView(Test2.this);

                Spannable st2_1 = getTextWithImages(alertDialog.getContext(), getResources().getString(R.string.help_test2_text1));
                Spannable st2_2 = getTextWithImages(alertDialog.getContext(), getResources().getString(R.string.help_test2_text2));

                tv_test2.setText(TextUtils.concat(admin, st2_1, quote, st2_2));

                alertDialog.setView(tv_test2, 20, 20, 20, 20);

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


    //Check if everything is quoted to unlock the button to the next test
    public void activateNext() {
        if (this.quotation_11 == true && this.quotation_12 == true && this.quotation_13 == true &&
                quotation_21 == true && quotation_22 == true && quotation_23 == true &&
                quotation_31 == true && quotation_32 == true && quotation_33 == true) {
            btest2_next.setEnabled(true);
            btest2_next.setClickable(true);
            btest2_next.setImageResource(R.drawable.next);
        }
    }


    /**
     * Obtain the point manager
     *
     * @param gestPtsF
     */
    public void giveGestPts(GestionPoint gestPtsF) {
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
            icon.setBounds(0, 0, tv_test2.getLineHeight(), tv_test2.getLineHeight());
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
