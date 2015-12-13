package dtlv.com.dtlv_application;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RadioButton;


/**
 * Created by Utilisateur on 2015-12-06.
 */
public class Tutorial extends Activity{


    /**
     * Idee: Pour l'appuis sur un bouton, changer l'image correspondante dans le "tuto_scroll" qui est un scroll_view
     * Soit changer la source de l'image dans le Image view? Ou alors carrement switcher entre les images view?
     */

    private RadioButton r1 = null;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tutorial);
    }

}
