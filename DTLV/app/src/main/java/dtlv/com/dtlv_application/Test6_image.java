package dtlv.com.dtlv_application;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class Test6_image extends Activity {

    private ImageButton btest6_play1 = null;
    private ImageButton btest6_play2 = null;
    private ImageButton btest6_play3 = null;
    private LinearLayout test6_layout1 = null;
    private LinearLayout test6_layout2 = null;
    private LinearLayout test6_layout3 = null;

    private int count1 =0;
    private int count2 =0;
    private int count3 =0;
    private ImageButton btest6_image1_back = null;

    private AlertDialog.Builder replayAlert = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test6_image);
        final MediaPlayer mp1,mp11,mp2,mp22,mp3,mp33;

        btest6_play1 = (ImageButton) findViewById(R.id.test6_sound1_bplay);
        btest6_play1.setEnabled(true);
        btest6_play1.setClickable(true);

        test6_layout1 = (LinearLayout) findViewById(R.id.test6_layout1);
        btest6_play2 = (ImageButton) findViewById(R.id.test6_sound2_bplay);
        btest6_play2.setEnabled(true);
        btest6_play2.setClickable(true);
        test6_layout2 = (LinearLayout) findViewById(R.id.test6_layout2);
        btest6_play3 = (ImageButton) findViewById(R.id.test6_sound3_bplay);
        btest6_play3.setEnabled(true);
        btest6_play3.setClickable(true);
        test6_layout3 = (LinearLayout) findViewById(R.id.test6_layout3);
        activatePictures();
        //create pop-up for replay alert
        replayAlert = new AlertDialog.Builder(Test6_image.this);
        replayAlert.setTitle(getResources().getString(R.string.replay_title));
        replayAlert.setMessage(getResources().getString(R.string.replay_msg));

        replayAlert.setNegativeButton(getResources().getString(R.string.replay_no),
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });


        mp1 = MediaPlayer.create(this, R.raw.test6_sound1);
        mp11 = MediaPlayer.create(this, R.raw.test6_sound1);
        btest6_play1.setOnClickListener(new View.OnClickListener() {
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
        btest6_play2.setOnClickListener(new View.OnClickListener() {
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
        btest6_play3.setOnClickListener(new View.OnClickListener() {
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

                //return button
                btest6_image1_back = (ImageButton) findViewById(R.id.test6_image1_back);
                btest6_image1_back.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mp1.release();
                        mp2.release();
                        mp3.release();
                        finish();
                    }
                });


    }//end onCreate

    //Deal with the color and the unlocking of buttons and pictures
    public void activatePictures() {
        // Au click sur le bouton, on débloque les boutons valider et refuser et on affiche le suivant en Jaune
        if (Config.compt.getTest6_1() == 0)
        {
            test6_layout1.setBackgroundColor(getResources().getColor(R.color.yellow));
            btest6_play2.setImageResource(R.drawable.play_blue);
            btest6_play2.setEnabled(true);
            btest6_play2.setClickable(true);
        }
        if(Config.compt.getTest6_1()== 1) {
            btest6_play1.setImageResource(R.drawable.replay);
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
        }
        if (Config.compt.getTest6_3() == 2)
        {
            btest6_play3.setImageResource(R.drawable.play_grey);
            btest6_play3.setEnabled(false);
            btest6_play3.setClickable(false);
        }
    }

}