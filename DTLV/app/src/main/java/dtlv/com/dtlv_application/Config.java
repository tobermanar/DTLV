package dtlv.com.dtlv_application;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

/**
 * Created by Utilisateur on 2015-12-06.
 */
public class Config extends Activity {

        private ImageButton bconfig_next = null;
        private SeekBar sbrightness = null;
        float brightnessSetting = 0;
        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.config);
            bconfig_next = (ImageButton) findViewById(R.id.config_next);
            sbrightness = (SeekBar) findViewById(R.id.brightness);

            sbrightness.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar sbrightness, int progress, boolean fromUser) {
                    WindowManager.LayoutParams lp = getWindow().getAttributes();
                    brightnessSetting = (float)progress/100;
                    lp.screenBrightness = brightnessSetting; // 0.0 - 1.0
                    getWindow().setAttributes(lp);
                }
                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {
                }
                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {
                }
            });
                bconfig_next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        // Au click sur le bouton, on passe au test suivant
                        Intent itest1 = new Intent(Config.this, Test1.class);
                        startActivity(itest1);
                    }
                });

            }
        }
