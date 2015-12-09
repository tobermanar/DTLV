package dtlv.com.dtlv_application;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.SeekBar;

/**
 * Created by Utilisateur on 2015-12-06.
 */
public class Config extends Activity {

        private ImageButton bconfig_next = null;
        private SeekBar sbrightness = null;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.config);
            bconfig_next = (ImageButton) findViewById(R.id.config_next);
            sbrightness = (SeekBar) findViewById(R.id.brightness);


            WindowManager.LayoutParams lp = getWindow().getAttributes();
            lp.screenBrightness = 1.0f; // 0.0 - 1.0
            getWindow().setAttributes(lp);


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
