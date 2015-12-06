package dtlv.com.dtlv_application;

import android.view.View.OnClickListener;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by Utilisateur on 2015-12-05.
 */

public class Menu extends Activity {

    private Button b = null;
    private Button b2 = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
    }
    /*
        b = (Button) findViewById(R.id.b_tutorial);
        b.setOnClickListener(this);
        b2 = (Button) findViewById(R.id.b_credits);
        b2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
    // Réagir au clic
    }
*/
}