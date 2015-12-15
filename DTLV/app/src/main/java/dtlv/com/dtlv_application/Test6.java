package dtlv.com.dtlv_application;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

/**
 * Created by Utilisateur on 2015-12-06.
 */
public class Test6 extends Activity{

    private ImageButton btest6_image1 = null;

    private ImageButton btest6_play1 = null;
    private boolean quotation_1 = false;
    private ImageButton btest6_validate1 = null;
    private ImageButton btest6_refuse1 = null;

    private ImageButton btest6_play2 = null;
    private boolean quotation_2 = false;
    private ImageButton btest6_validate2 = null;
    private ImageButton btest6_refuse2 = null;

    private ImageButton btest6_play3 = null;
    private ImageButton btest6_validate3 = null;
    private ImageButton btest6_refuse3 = null;

    private ImageButton btest6_next = null;

    private int count1 =0;
    private int count2 =0;
    private int count3 =0;

    //Variables de quotation
    private int q1 = 0;
    private int q2 = 0;
    private int q3 = 0;

    private GestionPoint gestPts;

    public Test6(){
        gestPts = Menu.gestPts;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test6);

        btest6_image1 = (ImageButton) findViewById(R.id.test6_image1);

        btest6_next = (ImageButton) findViewById(R.id.test6_bnext);
        btest6_next.setEnabled(false);
        btest6_next.setClickable(false);
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

        // Sentence 1
        mp1 = MediaPlayer.create(this, R.raw.test6_sound1);
        btest6_play1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                mp1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        if (count1 == 0) {
                            //si c'est la première fois remplacer par bouton replay
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

                        }
                        if (count1 == 1) {
                            btest6_play1.setEnabled(false);
                            btest6_play1.setClickable(false);
                            btest6_play1.setImageResource(R.drawable.play_grey);
                        }
                        count1++;
                    }
                });
                mp1.start();
            }
        });// Fin sentence 1

        // Sentence 2
        mp2 = MediaPlayer.create(this, R.raw.test6_sound2);
        btest6_play2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                mp2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        if (count2 == 0) {
                            //si c'est la première fois remplacer par bouton replay
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

                        }
                        if (count2 == 1) {
                            btest6_play2.setEnabled(false);
                            btest6_play2.setClickable(false);
                            btest6_play2.setImageResource(R.drawable.play_grey);

                        }

                        count2++;

                    }
                });
                mp2.start();
            }
        });// Fin Sentence 2

        // Sentence 3
        mp3 = MediaPlayer.create(this, R.raw.test6_sound3);
        btest6_play3.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                mp3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        if (count3 == 0) {
                            //si c'est la première fois remplacer par bouton replay
                            btest6_validate3.setEnabled(true);
                            btest6_validate3.setClickable(true);
                            btest6_validate3.setImageResource(R.drawable.validate);

                            btest6_refuse3.setEnabled(true);
                            btest6_refuse3.setClickable(true);
                            btest6_refuse3.setImageResource(R.drawable.refuse);

                        }
                        if (count3 == 1) {
                            btest6_play3.setEnabled(false);
                            btest6_play3.setClickable(false);
                            btest6_play3.setImageResource(R.drawable.play_grey);

                        }

                        count3++;

                    }
                });
                mp3.start();
            }
        });// Fin play11

        //Gestion des notations
        btest6_validate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btest6_refuse1.setImageResource(R.drawable.refuse_grey);
                btest6_validate1.setImageResource(R.drawable.validate);
                quotation_1 = false;
                q1=1;
            }
        });
        btest6_refuse1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btest6_validate1.setImageResource(R.drawable.validate_grey);
                btest6_refuse1.setImageResource(R.drawable.refuse);
                quotation_1 = true;
                q2=0;
                if (quotation_1 == true && quotation_2 == true) {
                    btest6_next.setEnabled(true);
                    btest6_next.setClickable(true);
                    btest6_next.setImageResource(R.drawable.next);
                }
            }
        });
        btest6_validate2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btest6_refuse2.setImageResource(R.drawable.refuse_grey);
                btest6_validate2.setImageResource(R.drawable.validate);
                quotation_2 = false;
                q2=1;
            }
        });
        btest6_refuse2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btest6_validate2.setImageResource(R.drawable.validate_grey);
                btest6_refuse2.setImageResource(R.drawable.refuse);
                quotation_2 = true;
                q2=0;
                if (quotation_1 == true && quotation_2 == true) {
                    btest6_next.setEnabled(true);
                    btest6_next.setClickable(true);
                    btest6_next.setImageResource(R.drawable.next);
                }
            }
        });
        btest6_validate3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btest6_refuse3.setImageResource(R.drawable.refuse_grey);
                btest6_validate3.setImageResource(R.drawable.validate);
                q3=1;
                btest6_next.setEnabled(true);
                btest6_next.setClickable(true);
                btest6_next.setImageResource(R.drawable.next);
            }
        });
        btest6_refuse3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btest6_validate3.setImageResource(R.drawable.validate_grey);
                btest6_refuse3.setImageResource(R.drawable.refuse);
                q3=0;
                btest6_next.setEnabled(true);
                btest6_next.setClickable(true);
                btest6_next.setImageResource(R.drawable.next);
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
    }

    /**
     * Obtain the point manager
     * @param gestPtsF
     */
    public void giveGestPts(GestionPoint gestPtsF){
        this.gestPts = gestPtsF;
    }
}
