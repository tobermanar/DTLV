package dtlv.com.dtlv_application;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

/**
 * Created by Utilisateur on 2015-12-05.
 */
public class Credits extends Activity {
    private TextView credits = null;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.credits);
    }
}
