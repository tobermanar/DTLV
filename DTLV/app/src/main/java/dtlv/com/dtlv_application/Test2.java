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

import java.io.IOException;


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

    public Test2() {
        gestPts = Menu.gestPts;
    }

    MediaPlayer mp = null;

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
        btest2_next.setEnabled(true);
        btest2_next.setClickable(true);
        btest2_next.setImageResource(R.drawable.next_grey);


        /*************  Word 1  **************/
        mp111 = MediaPlayer.create(this, R.raw.test2_sound1_part1);
        mp112 = MediaPlayer.create(this, R.raw.test2_sound1_part1);
        btest2_play11.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count11 == 0) {
                    mp111.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        public void onCompletion(MediaPlayer mp) {
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
                            mp.release();
                            count11++;
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
                    mp112.start();
                }

            }
        });


        btest2_validate11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO choisir une couleur precise et la mettre dans color.xml
                test2_layout11.setBackgroundColor(Color.GREEN);//si on fixe une couleur : getResources().getColor(R.color.red)
                quotation_11 = true;
                //On incremente les points
                ptsT2++;
                activateNext();
            }
        });

        btest2_refuse11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO choisir une couleur precise et la mettre dans color.xml
                test2_layout11.setBackgroundColor(Color.RED);// si on fixe une couleur : getResources().getColor(R.color.red)
                quotation_11 = true;
                activateNext();
            }
        });


        /************  Word 2  **************/
        mp121 = MediaPlayer.create(this, R.raw.test2_sound1_part2);
        mp122 = MediaPlayer.create(this, R.raw.test2_sound1_part2);
        btest2_play12.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (count12 == 0) {
                    mp121.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
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
                            mp.release();
                            count12++;

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
                    mp122.start();
                }
            }
        });


        btest2_validate12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test2_layout12.setBackgroundColor(Color.GREEN);// si on fixe une couleur : getResources().getColor(R.color.red)
                quotation_12 = true;
                ptsT2++;
                activateNext();
            }
        });
        btest2_refuse12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test2_layout12.setBackgroundColor(Color.RED);// si on fixe une couleur : getResources().getColor(R.color.red)
                quotation_12 = true;
                activateNext();
            }
        });


        /***************  Word 3  ************/
        mp131 = MediaPlayer.create(this, R.raw.test2_sound1_part3);
        mp132 = MediaPlayer.create(this, R.raw.test2_sound1_part3);
        btest2_play13.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (count13 == 0) {
                    mp131.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {

                            //si c'est la première fois remplacer par bouton replay
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
                    mp132.start();
                }
            }
        });


        btest2_validate13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test2_layout13.setBackgroundColor(Color.GREEN);// si on fixe une couleur : getResources().getColor(R.color.red)
                quotation_13 = true;
                ptsT2++;
                activateNext();
            }
        });
        btest2_refuse13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test2_layout13.setBackgroundColor(Color.RED);// si on fixe une couleur : getResources().getColor(R.color.red)
                quotation_13 = true;
                activateNext();
            }
        });

        /**************  NonWord 1  *****************/
        mp211 = MediaPlayer.create(this, R.raw.test2_sound2_part1);
        mp212 = MediaPlayer.create(this, R.raw.test2_sound2_part1);

        btest2_play21.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (count21 == 0) {
                    mp211.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            //si c'est la première fois remplacer par bouton replay
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
                    mp212.start();
                }
            }
        });
        btest2_validate21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test2_layout21.setBackgroundColor(Color.GREEN);// si on fixe une couleur : getResources().getColor(R.color.red)
                quotation_21 = true;
                ptsT2++;
                activateNext();
            }
        });
        btest2_refuse21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test2_layout21.setBackgroundColor(Color.RED);// si on fixe une couleur : getResources().getColor(R.color.red)
                quotation_21 = true;
                activateNext();
            }
        });

        /***************  NonWord 2  *****************/
        mp221 = MediaPlayer.create(this, R.raw.test2_sound2_part2);
        mp222 = MediaPlayer.create(this, R.raw.test2_sound2_part2);
        btest2_play22.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (count22 == 0) {
                    mp221.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            //si c'est la première fois remplacer par bouton replay
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
                    mp222.start();

                }
            }
        });


        btest2_validate22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test2_layout22.setBackgroundColor(Color.GREEN);// si on fixe une couleur : getResources().getColor(R.color.red)
                quotation_22 = true;
                ptsT2++;
                activateNext();
            }
        });
        btest2_refuse22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test2_layout22.setBackgroundColor(Color.RED);// si on fixe une couleur : getResources().getColor(R.color.red)
                quotation_22 = true;
                activateNext();
            }
        });


        /************** NonWord 3 **************/
        mp231 = MediaPlayer.create(this, R.raw.test2_sound2_part3);
        mp232 = MediaPlayer.create(this, R.raw.test2_sound2_part3);

        btest2_play23.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (count23 == 0) {
                    mp231.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            //si c'est la première fois remplacer par bouton replay
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
                    mp232.start();

                }
            }
        });


        btest2_validate23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test2_layout23.setBackgroundColor(Color.GREEN);// si on fixe une couleur : getResources().getColor(R.color.red)
                quotation_23 = true;
                ptsT2++;
                activateNext();
            }
        });
        btest2_refuse23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test2_layout23.setBackgroundColor(Color.RED);// si on fixe une couleur : getResources().getColor(R.color.red)
                quotation_23 = true;
                activateNext();
            }
        });


        /************ Sentence 1 *************/
        mp311 = MediaPlayer.create(this, R.raw.test2_sound3_part1);
        mp312 = MediaPlayer.create(this, R.raw.test2_sound3_part1);
        btest2_play31.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (count31 == 0) {
                    mp311.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            //si c'est la première fois remplacer par bouton replay
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
                    mp312.start();
                }
            }
        });


        btest2_validate31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test2_layout31.setBackgroundColor(Color.GREEN);// si on fixe une couleur : getResources().getColor(R.color.red)
                quotation_31 = true;
                ptsT2++;
                activateNext();
            }
        });
        btest2_refuse31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test2_layout31.setBackgroundColor(Color.RED);// si on fixe une couleur : getResources().getColor(R.color.red)
                quotation_31 = true;
                activateNext();
            }
        });


        /************ Sentence 2 ***********/
        mp321 = MediaPlayer.create(this, R.raw.test2_sound3_part2);
        mp322 = MediaPlayer.create(this, R.raw.test2_sound3_part2);

        btest2_play32.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (count32 == 0) {
                    mp321.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            //si c'est la première fois remplacer par bouton replay
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
                    mp322.start();

                }
            }
        });

        btest2_validate32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test2_layout32.setBackgroundColor(Color.GREEN);// si on fixe une couleur : getResources().getColor(R.color.red)
                quotation_32 = true;
                ptsT2++;
                activateNext();
            }
        });
        btest2_refuse32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test2_layout32.setBackgroundColor(Color.RED);// si on fixe une couleur : getResources().getColor(R.color.red)
                quotation_32 = true;
                activateNext();
            }
        });


        /************ Sentence 3 *************/
        mp331 = MediaPlayer.create(this, R.raw.test2_sound3_part3);
        mp332 = MediaPlayer.create(this, R.raw.test2_sound3_part3);
        btest2_play33.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (count33 == 0) {
                    mp331.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            //si c'est la première fois remplacer par bouton replay
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
                    mp332.start();

                }
            }
        });


        btest2_validate33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test2_layout33.setBackgroundColor(Color.GREEN);// si on fixe une couleur : getResources().getColor(R.color.red)
                quotation_33 = true;
                ptsT2++;
                activateNext();
            }
        });
        btest2_refuse33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test2_layout33.setBackgroundColor(Color.RED);// si on fixe une couleur : getResources().getColor(R.color.red)
                quotation_33 = true;
                activateNext();
            }
        });


        /******** NEXT ***********/

        btest2_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on passe au test suivant et on envoit le score a la gestion des points
                gestPts.setT2(ptsT2);
                Intent itest2 = new Intent(Test2.this, Test3.class);
                startActivity(itest2);
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

}
