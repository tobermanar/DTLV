package dtlv.com.dtlv_application;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.content.ContentResolver;
import android.provider.Settings.SettingNotFoundException;
import android.provider.Settings.System;
import android.view.Window;
import android.view.WindowManager.LayoutParams;


/**
 * Created by Utilisateur on 2015-12-06.
 */
public class Config extends Activity {

    private ImageButton bconfig_next = null;
    private SeekBar sbrightness = null;
    private int brightness;
    private SeekBar svolume = null;
    private AudioManager audioManager = null;
    private Button brightness_button = null;
    private Button sound_button = null;
    private Window window;

    //Déclaration d'une variable pour les tests 1, 5, 6 et 9
    public static Test_compt compt = new Test_compt();
    //Content resolver used as a handle to the system's settings
    private ContentResolver cResolver;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.config);
        setVolumeControlStream(AudioManager.STREAM_MUSIC);

        //Get the content resolver
        cResolver =  getContentResolver();

        bconfig_next = (ImageButton) findViewById(R.id.config_next);
        sbrightness = (SeekBar) findViewById(R.id.brightness_seekBar);
        //sets the range between 0 and 255
        sbrightness.setMax(255);
        //set the seek bar progress to 1
        sbrightness.setKeyProgressIncrement(1);
        svolume = (SeekBar) findViewById(R.id.sound_seekBar);
        brightness_button = (Button) findViewById(R.id.config_brightness);
        sound_button = (Button) findViewById(R.id.config_sound);

        //Get the current window
        window = getWindow();

        final MediaPlayer mp;

        //Get current Screen_Brightness Value
        try
        {
            //Get the current system brightness
            brightness = System.getInt(cResolver, System.SCREEN_BRIGHTNESS);
        }
        catch (SettingNotFoundException e)
        {
            //Throw an error case it couldn't be retrieved
            e.printStackTrace();
        }
        sbrightness.setProgress(brightness);
        //set brightness
        sbrightness.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                brightness = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //Set the system brightness using the brightness variable value
                System.putInt(cResolver, System.SCREEN_BRIGHTNESS, brightness);
                //Get the current window attributes
                LayoutParams layoutpars = window.getAttributes();
                //Set the brightness of this window
                layoutpars.screenBrightness = brightness / (float) 255;
                //Apply attribute changes to this window
                window.setAttributes(layoutpars);
                // Set systemwide brightness setting.
            }
        });
        Settings.System.putInt(getContentResolver(),
        Settings.System.SCREEN_BRIGHTNESS_MODE, Settings.System.SCREEN_BRIGHTNESS_MODE_MANUAL);
        Settings.System.putInt(getContentResolver(), Settings.System.SCREEN_BRIGHTNESS, brightness);
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
