package dtlv.com.dtlv_application;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by Utilisateur on 2015-12-05.
 */
public class Credits extends Activity {

    private ImageButton credits_back = null;

    private TextView credits = null;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.credits);
        //return button
        credits_back = (ImageButton) findViewById(R.id.credits_back);
        credits_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
