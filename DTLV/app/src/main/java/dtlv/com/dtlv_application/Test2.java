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

    private ImageButton btest2_play12  = null;
    private boolean quotation_12 = false;
    private ImageButton btest2_validate12 = null;
    private ImageButton btest2_refuse12 = null;
    private LinearLayout test2_layout12 = null;


    private ImageButton btest2_play13  = null;
    private boolean quotation_13 = false;
    private ImageButton btest2_validate13 = null;
    private ImageButton btest2_refuse13 = null;
    private LinearLayout test2_layout13 = null;

    private ImageButton btest2_play21  = null;
    private boolean quotation_21 = false;
    private ImageButton btest2_validate21 = null;
    private ImageButton btest2_refuse21 = null;
    private LinearLayout test2_layout21 = null;

    private ImageButton btest2_play22  = null;
    private boolean quotation_22 = false;
    private ImageButton btest2_validate22 = null;
    private ImageButton btest2_refuse22 = null;
    private LinearLayout test2_layout22 = null;

    private ImageButton btest2_play23  = null;
    private boolean quotation_23 = false;
    private ImageButton btest2_validate23 = null;
    private ImageButton btest2_refuse23 = null;
    private LinearLayout test2_layout23 = null;

    private ImageButton btest2_play31  = null;
    private boolean quotation_31 = false;
    private ImageButton btest2_validate31 = null;
    private ImageButton btest2_refuse31 = null;
    private LinearLayout test2_layout31 = null;

    private ImageButton btest2_play32  = null;
    private boolean quotation_32 = false;
    private ImageButton btest2_validate32 = null;
    private ImageButton btest2_refuse32 = null;
    private LinearLayout test2_layout32 = null;

    private ImageButton btest2_play33  = null;
    private boolean quotation_33 = false;
    private ImageButton btest2_validate33 = null;
    private ImageButton btest2_refuse33 = null;
    private LinearLayout test2_layout33 = null;

    private ImageButton btest2_next = null;

    private int count11=0;
    private int count12=0;
    private int count13=0;
    private int count21=0;
    private int count22=0;
    private int count23=0;
    private int count31=0;
    private int count32=0;
    private int count33=0;
    
    public Test2(){
        gestPts = Menu.gestPts;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.test2);


        final MediaPlayer mp11,mp12,mp13,mp21,mp22,mp23,mp31,mp32,mp33;

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
        btest2_play22.setEnabled(false);
        btest2_play22.setClickable(false);
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


        // Word 1
        mp11 = MediaPlayer.create(this, R.raw.test2_sound1_part1);
        mp12 = MediaPlayer.create(this, R.raw.test2_sound1_part2);
        btest2_play11.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

                if (count11 < 2) {
                    //garder le bouton appuyé le temps de l'écoute
                    //btest2_play11.setPressed(true);
                    //btest2_play11.setSelected(true);

                    mp11.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            //btest2_play11.setPressed(false);
                            //btest2_play11.setSelected(false);

                            if (count11 == 0) {
                                //si c'est la première fois remplacer par bouton replay
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

                            }
                            if (count11 == 1) {
                                //TODO pop-up

                                btest2_play11.setEnabled(false);
                                btest2_play11.setClickable(false);
                                btest2_play11.setImageResource(R.drawable.play_grey);

                            }

                            count11++;

                        }


                    });

                    mp11.start();
                    mp11.setNextMediaPlayer(mp12);
                    //mp11.release();
                }
            }
        });
        //mp11.release();

        btest2_validate11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO choisir une couleur precise et la mettre dans color.xml
                test2_layout11.setBackgroundColor(Color.GREEN);//si on fixe une couleur : getResources().getColor(R.color.red)
                quotation_11 = true;
                //On incremente les points
                ptsT2++;
                //Check if all pictures are coted to unluck the button to the next test
                if (quotation_11 && quotation_12  && quotation_13 &&
                        quotation_21  && quotation_22 && quotation_23 &&
                        quotation_31 && quotation_32  && quotation_33 ) {
                    btest2_next.setEnabled(true);
                    btest2_next.setClickable(true);
                    btest2_next.setImageResource(R.drawable.next);
                }

            }
        });

        btest2_refuse11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO choisir une couleur precise et la mettre dans color.xml
                test2_layout11.setBackgroundColor(Color.RED);// si on fixe une couleur : getResources().getColor(R.color.red)
                quotation_11 = true;
                //Check if all pictures are coted to unluck the button to the next test
                if (quotation_11 && quotation_12  && quotation_13 &&
                        quotation_21  && quotation_22 && quotation_23 &&
                        quotation_31 && quotation_32  && quotation_33 ) {
                    btest2_next.setEnabled(true);
                    btest2_next.setClickable(true);
                    btest2_next.setImageResource(R.drawable.next);
                }

            }
        });


        // Word 2

        btest2_play11.setOnClickListener(new OnClickListener() {
                public void onClick(View v) {

                    if (count12 < 2) {
                        //garder le bouton appuyé le temps de l'écoute
                        //btest2_play11.setPressed(true);
                        //btest2_play11.setSelected(true);

                        mp12.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            @Override
                            public void onCompletion(MediaPlayer mp) {
                                //btest2_play11.setPressed(false);
                                //btest2_play11.setSelected(false);

                                if (count12 == 0) {
                                    //si c'est la première fois remplacer par bouton replay
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
                                }
                                if (count12 == 1) {

                                    btest2_play12.setImageResource(R.drawable.play_grey);
                                    btest2_play12.setEnabled(false);
                                    btest2_play12.setClickable(false);
                                }

                                count12++;

                            }
                        });

                        mp12.start();
                        //mp12.release();

                    }
                }
            });
        mp12.release();


            btest2_validate12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    test2_layout12.setBackgroundColor(Color.GREEN);// si on fixe une couleur : getResources().getColor(R.color.red)
                    quotation_11 = true;
                    ptsT2++;
                    //Check if all pictures are coted to unluck the button to the next test
                    if(quotation_11 && quotation_12 && quotation_13 &&
                            quotation_21 && quotation_22 && quotation_23 &&
                            quotation_31 && quotation_32 && quotation_33 )
                    {
                        btest2_next.setEnabled(true);
                        btest2_next.setClickable(true);
                        btest2_next.setImageResource(R.drawable.next);
                    }


                }
            });
            btest2_refuse12.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    test2_layout12.setBackgroundColor(Color.RED);// si on fixe une couleur : getResources().getColor(R.color.red)
                    quotation_11 = true;
                    //Check if all pictures are coted to unluck the button to the next test
                    if(quotation_11 == true && quotation_12 == true && quotation_13 == true &&
                            quotation_21 == true && quotation_22 == true && quotation_23 == true &&
                            quotation_31 == true && quotation_32 == true && quotation_33 == true)
                    {
                        btest2_next.setEnabled(true);
                        btest2_next.setClickable(true);
                        btest2_next.setImageResource(R.drawable.next);
                    }

                }
            });


        btest2_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on passe au test suivant et on envoit le score a la gestion des points
                gestPts.setT1(ptsT2);
                Intent itest2 = new Intent(Test2.this, Test3.class);
                startActivity(itest2);
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
