package dtlv.com.dtlv_application;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.LinearLayout;

/**
 * Created by Utilisateur on 2015-12-06.
 */
public class Test4 extends Activity{

    private ImageButton btest4_play01 = null;
    private boolean quotation_01 = false;
    private ImageButton btest4_validate01 = null;
    private ImageButton btest4_refuse01 = null;
    private LinearLayout test4_layout01 = null;

    private ImageButton btest4_play02 = null;
    private boolean quotation_02 = false;
    private ImageButton btest4_validate02 = null;
    private ImageButton btest4_refuse02 = null;
    private LinearLayout test4_layout02 = null;

    private ImageButton btest4_play11 = null;
    private ImageButton btest4_validate11 = null;
    private ImageButton btest4_refuse11 = null;
    private LinearLayout test4_layout11 = null;

    private ImageButton btest4_next = null;

    private int count01=0;
    private int count02=0;
    private int count11=0;

    private int ptsT4 = 0;
    private GestionPoint gestPts;

    public Test4(){
        gestPts = Menu.gestPts;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test4);
        btest4_next = (ImageButton) findViewById(R.id.test4_bnext);
        btest4_next.setEnabled(false);
        btest4_next.setClickable(false);
        btest4_next.setImageResource(R.drawable.next_grey);

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

        // Exemple Word 1
        mp01 = MediaPlayer.create(this, R.raw.test4_sound1_ex1);
        btest4_play01.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                mp01.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        if (count01 == 0) {
                            //si c'est la première fois remplacer par bouton replay
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

                        }
                        if (count01 == 1) {
                            btest4_play01.setEnabled(false);
                            btest4_play01.setClickable(false);
                            btest4_play01.setImageResource(R.drawable.play_grey);
                        }
                        count01++;
                    }
                });
                mp01.start();
            }
        });// Fin play01

        // Exemple Word 2
        mp02 = MediaPlayer.create(this, R.raw.test4_sound1_ex2);
        btest4_play02.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                    mp02.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            if (count02 == 0) {
                                //si c'est la première fois remplacer par bouton replay
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

                            }
                            if (count02 == 1) {
                                btest4_play02.setEnabled(false);
                                btest4_play02.setClickable(false);
                                btest4_play02.setImageResource(R.drawable.play_grey);

                            }

                            count02++;

                        }
                    });
                    mp02.start();
            }
        });// Fin play02

        // Word 1
        mp11 = MediaPlayer.create(this, R.raw.test4_sound1_ex);
        btest4_play11.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                mp11.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        if (count11 == 0) {
                            //si c'est la première fois remplacer par bouton replay
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
                mp11.start();
            }
        });// Fin play11

        btest4_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on passe au test suivant et on envoit le score a la gestion des points
                gestPts.setT1(ptsT4);
                Intent itest4 = new Intent(Test4.this, Test5.class);
                startActivity(itest4);
            }
        });

        //Gestion des notations
        btest4_validate01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btest4_refuse01.setImageResource(R.drawable.refuse_grey);
                btest4_validate01.setImageResource(R.drawable.validate);
                quotation_01 = false;
                //On incremente les points
                ptsT4++;
            }
        });
        btest4_refuse01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btest4_validate01.setImageResource(R.drawable.validate_grey);
                btest4_refuse01.setImageResource(R.drawable.refuse);
                quotation_01 = true;
                if(quotation_01 == true && quotation_02 == true)
                {
                    btest4_next.setEnabled(true);
                    btest4_next.setClickable(true);
                    btest4_next.setImageResource(R.drawable.next);
                }
            }
        });
        btest4_validate02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btest4_refuse02.setImageResource(R.drawable.refuse_grey);
                btest4_validate02.setImageResource(R.drawable.validate);
                quotation_02 = false;
                //On incremente les points
                ptsT4++;
            }
        });
        btest4_refuse02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btest4_validate02.setImageResource(R.drawable.validate_grey);
                btest4_refuse02.setImageResource(R.drawable.refuse);
                quotation_02 = true;
                if(quotation_01 == true && quotation_02 == true)
                {
                    btest4_next.setEnabled(true);
                    btest4_next.setClickable(true);
                    btest4_next.setImageResource(R.drawable.next);
                }
            }
        });
        btest4_validate11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btest4_refuse11.setImageResource(R.drawable.refuse_grey);
                btest4_validate11.setImageResource(R.drawable.validate);
                //On incremente les points
                ptsT4++;
                btest4_next.setEnabled(true);
                btest4_next.setClickable(true);
                btest4_next.setImageResource(R.drawable.next);
            }
        });
        btest4_refuse11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btest4_validate11.setImageResource(R.drawable.validate_grey);
                btest4_refuse11.setImageResource(R.drawable.refuse);
                    btest4_next.setEnabled(true);
                    btest4_next.setClickable(true);
                    btest4_next.setImageResource(R.drawable.next);
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
