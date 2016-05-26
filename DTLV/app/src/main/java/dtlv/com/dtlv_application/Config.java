package dtlv.com.dtlv_application;

import android.Manifest;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v4.app.ActivityCompat;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.Log;
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
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


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

    private ImageButton config_help = null;
    private AlertDialog alertDialog = null;
    private TextView tv_config = null;

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
        cResolver = getContentResolver();

        config_help = (ImageButton) findViewById(R.id.config_bhelp);
        bconfig_next = (ImageButton) findViewById(R.id.config_bnext);
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
        try {
            //Get the current system brightness
            brightness = System.getInt(cResolver, System.SCREEN_BRIGHTNESS);
        } catch (SettingNotFoundException e) {
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
                layoutpars.screenBrightness = (float) brightness / (float) 255;
                //Apply attribute changes to this window
                window.setAttributes(layoutpars);
                // Set systemwide brightness setting.
            }
        });
        System.putInt(getContentResolver(),
                System.SCREEN_BRIGHTNESS_MODE, System.SCREEN_BRIGHTNESS_MODE_MANUAL);
        System.putInt(getContentResolver(), System.SCREEN_BRIGHTNESS, brightness);
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
                audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, progress, 0);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        //Help
        config_help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog = new AlertDialog.Builder(Config.this).create();
                alertDialog.setTitle(getResources().getString(R.string.help_config_title));
                tv_config = new TextView(Config.this);
                tv_config.setText(getTextWithImages(alertDialog.getContext(), getResources().getString(R.string.help_config_text)));
               // alertDialog.setView(tv_config);
                alertDialog.setView(tv_config, 20, 20, 20, 20);
                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                alertDialog.show();
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

                Intent iconfig = new Intent(Config.this, Test1.class);
                startActivity(iconfig);
            }
        });

    }

    public Spannable getTextWithImages(Context context, CharSequence text) {
        Spannable spannable = Spannable.Factory.getInstance().newSpannable(text);
        addImages(context, spannable);
        return spannable;
    }

    public boolean addImages(Context context, Spannable spannable) {
        Pattern refImg = Pattern.compile("\\Q[img src=\\E([a-zA-Z0-9_]+?)\\Q/]\\E");
        boolean hasChanges = false;

        Matcher matcher = refImg.matcher(spannable);
        while (matcher.find()) {
            boolean set = true;
            for (ImageSpan span : spannable.getSpans(matcher.start(), matcher.end(), ImageSpan.class)) {
                if (spannable.getSpanStart(span) >= matcher.start()
                        && spannable.getSpanEnd(span) <= matcher.end()) {
                    spannable.removeSpan(span);
                } else {
                    set = false;
                    break;
                }
            }
            String resname = spannable.subSequence(matcher.start(1), matcher.end(1)).toString().trim();
            int id = context.getResources().getIdentifier(resname, "drawable", context.getPackageName());
            Drawable icon = context.getResources().getDrawable(id);//,this.getTheme());
            icon.setBounds(0, 0, tv_config.getLineHeight(), tv_config.getLineHeight());
            if (set) {
                hasChanges = true;
                spannable.setSpan(new ImageSpan(icon, ImageSpan.ALIGN_BASELINE),
                        matcher.start(),
                        matcher.end(),
                        Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            }
        }
        return hasChanges;
    }
}