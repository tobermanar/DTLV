package dtlv.com.dtlv_application;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.provider.Settings;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

/**
 * Created by Utilisateur on 2015-12-06.
 */
public class Config extends Activity {

    private ImageButton bconfig_next = null;
    private SeekBar sbrightness = null;
    private SeekBar svolume = null;
    private AudioManager audioManager = null;
    private Button brightness_button = null;
    private Button sound_button = null;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.config);
        setVolumeControlStream(AudioManager.STREAM_MUSIC);

        bconfig_next = (ImageButton) findViewById(R.id.config_next);
        sbrightness = (SeekBar) findViewById(R.id.brightness_seekBar);
        svolume = (SeekBar) findViewById(R.id.sound_seekBar);
        brightness_button = (Button) findViewById(R.id.config_brightness);
        sound_button = (Button) findViewById(R.id.config_sound);

        final MediaPlayer mp;

        //Get current Screen_Brightness Value
        float curBrightness = 0;
        try {
            curBrightness = android.provider.Settings.System.getInt(
                    getContentResolver(),
                    android.provider.Settings.System.SCREEN_BRIGHTNESS);
        } catch (Settings.SettingNotFoundException e) {
            e.printStackTrace();
        }
        sbrightness.setProgress((int) curBrightness);

        //set brightness
        sbrightness.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar sbrightness, int progress, boolean fromUser) {
                android.provider.Settings.System.putInt(getContentResolver(),
                        android.provider.Settings.System.SCREEN_BRIGHTNESS, progress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        //Show the image example
        brightness_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Config.this, Config_image.class);
                startActivity(intent);
            }
        });


        //set volume seek progress
        audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
        svolume.setMax(audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC));
        svolume.setProgress(audioManager.getStreamVolume(AudioManager.STREAM_MUSIC));

        //set volume
        svolume.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                audioManager.setStreamVolume(AudioManager.STREAM_MUSIC,progress,0);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });



        //play example sound
        mp = MediaPlayer.create(this, R.raw.config_sound);
        sound_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp.start();
            }
        });

        // Start first test
        bconfig_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.release();
                Intent itest1 = new Intent(Config.this, Test1.class);
                startActivity(itest1);
            }
        });

    }
}
