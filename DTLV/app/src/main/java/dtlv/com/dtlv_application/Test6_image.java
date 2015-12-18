package dtlv.com.dtlv_application;

import android.app.Activity;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Test6_image extends Activity {

    private ImageButton btest6_play1 = null;
    private ImageButton btest6_play2 = null;
    private ImageButton btest6_play3 = null;

    private int count1 =0;
    private int count2 =0;
    private int count3 =0;
    private ImageButton btest6_image1_back = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test6_image);

        final MediaPlayer mp1,mp2,mp3;

        btest6_play1 = (ImageButton) findViewById(R.id.test6_sound1_bplay);
        btest6_play2 = (ImageButton) findViewById(R.id.test6_sound2_bplay);
        btest6_play3 = (ImageButton) findViewById(R.id.test6_sound3_bplay);

        btest6_image1_back = (ImageButton) findViewById(R.id.test6_image1_back);
        btest6_image1_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        // Sentence 1
        mp1 = MediaPlayer.create(this, R.raw.test6_sound1);
        btest6_play1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        if (count1 == 0) {
                            btest6_play1.setImageResource(R.drawable.play_green);
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
        btest6_play2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        if (count2 == 0) {
                            btest6_play2.setImageResource(R.drawable.play_green);
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
        btest6_play3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        if (count3 == 0) {
                            btest6_play3.setImageResource(R.drawable.play_green);
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

    }

}
