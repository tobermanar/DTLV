package dtlv.com.dtlv_application;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;

import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;


/**
 * Created by Utilisateur on 2015-12-05.
 */
public class Test2 extends Activity {

    private GestionPoint gestPts;

    public Test2(){
        gestPts = Menu.gestPts;
    }

    private ImageButton btest2_play11 = null;
    private boolean quotation_11 = false;
    private ImageButton btest2_validate11 = null;
    private ImageButton btest2_refuse11 = null;

    private ImageButton btest2_play12  = null;
    private boolean quotation_12 = false;
    private ImageButton btest2_validate12 = null;
    private ImageButton btest2_refuse12 = null;

    private ImageButton btest2_play13  = null;
    private boolean quotation_13 = false;
    private ImageButton btest2_validate13 = null;
    private ImageButton btest2_refuse13 = null;

    private ImageButton btest2_play21  = null;
    private boolean quotation_21 = false;
    private ImageButton btest2_validate21 = null;
    private ImageButton btest2_refuse21 = null;

    private ImageButton btest2_play22  = null;
    private boolean quotation_22 = false;
    private ImageButton btest2_validate22 = null;
    private ImageButton btest2_refuse22 = null;

    private ImageButton btest2_play23  = null;
    private boolean quotation_23 = false;
    private ImageButton btest2_validate23 = null;
    private ImageButton btest2_refuse23 = null;

    private ImageButton btest2_play31  = null;
    private boolean quotation_31 = false;
    private ImageButton btest2_validate31 = null;
    private ImageButton btest2_refuse31 = null;

    private ImageButton btest2_play32  = null;
    private boolean quotation_32 = false;
    private ImageButton btest2_validate32 = null;
    private ImageButton btest2_refuse32 = null;

    private ImageButton btest2_play33  = null;
    private boolean quotation_33 = false;
    private ImageButton btest2_validate33 = null;
    private ImageButton btest2_refuse33 = null;

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




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test2);

        final MediaPlayer mp;

        btest2_play11 = (ImageButton) findViewById(R.id.test2_play11);
        btest2_validate11 = (ImageButton) findViewById(R.id.test2_validate11);
        btest2_validate11.setEnabled(false);
        btest2_validate11.setClickable(false);
        btest2_validate11.setImageResource(R.drawable.validate_grey);
        btest2_refuse11 = (ImageButton) findViewById(R.id.test2_refuse11);
        btest2_refuse11.setEnabled(false);
        btest2_refuse11.setClickable(false);
        btest2_refuse11.setImageResource(R.drawable.refuse_grey);


        /*btest2_play12 = (ImageButton) findViewById(R.id.test2_play12);
        btest2_play12.setEnabled(false);
        btest2_play12.setClickable(false);
        btest2_validate12 = (ImageButton) findViewById(R.id.test2_validate12);
        btest2_validate12.setEnabled(false);
        btest2_validate12.setClickable(false);
        btest2_refuse12 = (ImageButton) findViewById(R.id.test2_refuse12);
        btest2_refuse12.setEnabled(false);
        btest2_refuse12.setClickable(false);

        btest2_play13 = (ImageButton) findViewById(R.id.test2_play13);
        btest2_play13.setEnabled(false);
        btest2_play13.setClickable(false);
        btest2_validate13 = (ImageButton) findViewById(R.id.test2_validate13);
        btest2_validate13.setEnabled(false);
        btest2_validate13.setClickable(false);
        btest2_refuse13 = (ImageButton) findViewById(R.id.test2_refuse13);
        btest2_refuse13.setEnabled(false);
        btest2_refuse13.setClickable(false);

        btest2_play21 = (ImageButton) findViewById(R.id.test2_play21);
        btest2_play21.setEnabled(false);
        btest2_play21.setClickable(false);
        btest2_validate21 = (ImageButton) findViewById(R.id.test2_validate21);
        btest2_validate21.setEnabled(false);
        btest2_validate21.setClickable(false);
        btest2_refuse21 = (ImageButton) findViewById(R.id.test2_refuse21);
        btest2_refuse21.setEnabled(false);
        btest2_refuse21.setClickable(false);

        btest2_play22 = (ImageButton) findViewById(R.id.test2_play22);
        btest2_play22.setEnabled(false);
        btest2_play22.setClickable(false);
        btest2_validate22 = (ImageButton) findViewById(R.id.test2_validate22);
        btest2_validate22.setEnabled(false);
        btest2_validate22.setClickable(false);
        btest2_refuse22 = (ImageButton) findViewById(R.id.test2_refuse22);
        btest2_refuse22.setEnabled(false);
        btest2_refuse22.setClickable(false);

        btest2_play23 = (ImageButton) findViewById(R.id.test2_play23);
        btest2_play22.setEnabled(false);
        btest2_play22.setClickable(false);
        btest2_validate23 = (ImageButton) findViewById(R.id.test2_validate23);
        btest2_validate23.setEnabled(false);
        btest2_validate23.setClickable(false);
        btest2_refuse23 = (ImageButton) findViewById(R.id.test2_refuse23);
        btest2_refuse22.setEnabled(false);
        btest2_refuse22.setClickable(false);

        btest2_play31 = (ImageButton) findViewById(R.id.test2_play31);
        btest2_play31.setEnabled(false);
        btest2_play31.setClickable(false);
        btest2_validate31 = (ImageButton) findViewById(R.id.test2_validate31);
        btest2_validate31.setEnabled(false);
        btest2_validate31.setClickable(false);
        btest2_refuse31 = (ImageButton) findViewById(R.id.test2_refuse31);
        btest2_refuse31.setEnabled(false);
        btest2_refuse31.setClickable(false);

        btest2_play32 = (ImageButton) findViewById(R.id.test2_play32);
        btest2_play32.setEnabled(false);
        btest2_play32.setClickable(false);
        btest2_validate32 = (ImageButton) findViewById(R.id.test2_validate32);
        btest2_refuse32 = (ImageButton) findViewById(R.id.test2_refuse32);
        btest2_refuse32.setEnabled(false);
        btest2_refuse32.setClickable(false);

        btest2_play33 = (ImageButton) findViewById(R.id.test2_play33);
        btest2_play33.setEnabled(false);
        btest2_play33.setClickable(false);
        btest2_validate33 = (ImageButton) findViewById(R.id.test2_validate33);
        btest2_validate33.setEnabled(false);
        btest2_validate33.setClickable(false);
        btest2_refuse33 = (ImageButton) findViewById(R.id.test2_refuse33);
        btest2_refuse33.setEnabled(false);
        btest2_refuse33.setClickable(false);


        btest2_next = (ImageButton) findViewById(R.id.test2_next);
        btest2_next.setEnabled(false);
        btest2_next.setClickable(false);*/

        mp = MediaPlayer.create(this, R.raw.test2_sound3_part1);
        btest2_play11.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

                if(count11 <2) {
                     //garder le bouton appuyé le temps de l'écoute
                    //btest2_play11.setPressed(true);
                    //btest2_play11.setSelected(true);

                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            btest2_play11.setPressed(false);
                            btest2_play11.setSelected(false);

                            if (count11 == 0) {
                                //si c'est la première fois remplacer par bouton replay
                                btest2_validate11.setEnabled(true);
                                btest2_validate11.setClickable(true);
                                btest2_validate11.setImageResource(R.drawable.validate);

                                btest2_refuse11.setEnabled(true);
                                btest2_refuse11.setClickable(true);
                                btest2_refuse11.setImageResource(R.drawable.refuse);

                            }
                            if (count11 == 1) {
                                btest2_play11.setEnabled(false);
                                btest2_play11.setClickable(false);
                                btest2_play11.setImageResource(R.drawable.play_blue);

                            }
                            count11++;

                        }
                    });

                    mp.start();

                }
            }
        });

        /*mp = MediaPlayer.create(this, R.raw.test2_sound1_part2);
        btest2_play12.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                //mp.prepare();
                mp.start();
            }
        });

        mp = MediaPlayer.create(this, R.raw.test2_sound1_part3);
        btest2_play13.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                mp.start();
            }
        });

        mp = MediaPlayer.create(this, R.raw.test2_sound2_part1);
        btest2_play21.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                mp.start();
            }
        });

        mp = MediaPlayer.create(this, R.raw.test2_sound2_part2);
        btest2_play22.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                mp.start();
            }
        });

        mp = MediaPlayer.create(this, R.raw.test2_sound2_part3);
        btest2_play23.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                mp.start();
            }
        });

        mp = MediaPlayer.create(this, R.raw.test2_sound3_part1);
        btest2_play31.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                mp.start();
            }
        });

        mp = MediaPlayer.create(this, R.raw.test2_sound3_part2);
        btest2_play32.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                mp.start();
            }
        });

        mp = MediaPlayer.create(this, R.raw.test2_sound3_part3);
        btest2_play33.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                mp.start();
            }
        });*/

    }
    /*MediaPlayer media = MediaPlayer.create(getContext(), R.raw.file);
// public static MediaPlayer create (Context context, Uri uri)
    media = MediaPlayer.create(getContext(), Uri.parse("file://android_asset/fichier.mp4");
    media = MediaPlayer.create(getContext(), Uri.parse("file://sdcard/music/fichier.mp3");
    void setDataSource(String path);
    void prepare();
      // juste un test à suppr ou à utiliser si besoin */





    /**
     * Obtain the point manager
     * @param gestPtsF
     */
    public void giveGestPts(GestionPoint gestPtsF){
        this.gestPts = gestPtsF;
    }

}
