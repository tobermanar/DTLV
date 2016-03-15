package dtlv.com.dtlv_application;

import android.app.Activity;
import android.content.ContentResolver;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.SeekBar;

public class Config_image extends Activity {

    private ImageButton config_back = null;
    private SeekBar sbrightness = null;
    private int brightness;
    private Window window;

    //Content resolver used as a handle to the system's settings
    private ContentResolver cResolver;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.config_image);
        //Get the content resolver
        cResolver =  getContentResolver();

        sbrightness = (SeekBar) findViewById(R.id.brightness_seekBar);
        //sets the range between 0 and 255
        sbrightness.setMax(255);
        //set the seek bar progress to 1
        sbrightness.setKeyProgressIncrement(1);

        //Get the current window
        window = getWindow();


            //Get current Screen_Brightness Value
            try
            {
                //Get the current system brightness
                brightness = Settings.System.getInt(cResolver, Settings.System.SCREEN_BRIGHTNESS);
            }
            catch (Settings.SettingNotFoundException e)
            {
                //Throw an error case it couldn't be retrieved
                e.printStackTrace();
            }
            sbrightness.setProgress(brightness);
            //set brightness
            sbrightness.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
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
                Settings.System.putInt(cResolver, Settings.System.SCREEN_BRIGHTNESS, brightness);
                //Get the current window attributes
                WindowManager.LayoutParams layoutpars = window.getAttributes();
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


        config_back = (ImageButton) findViewById(R.id.config_back);
        config_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
