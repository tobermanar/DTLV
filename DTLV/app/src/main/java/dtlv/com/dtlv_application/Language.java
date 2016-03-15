package dtlv.com.dtlv_application;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by Utilisateur on 2015-12-06.
 */
public class Language extends Activity{

    private ImageButton language_back = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.language);

        //return button
        language_back = (ImageButton) findViewById(R.id.language_back);
        language_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
