package dtlv.com.dtlv_application;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by Utilisateur on 2015-12-05.
 */
public class Test2 extends Activity {
    private ImageButton btest2_next = null;

    private int ptsT2 = 0;
    private GestionPoint gestPts;

    public Test2(){
        gestPts = Menu.gestPts;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test2);
        btest2_next = (ImageButton) findViewById(R.id.test2_bnext);
        //btest2_next.setEnabled(false);
        //btest2_next.setClickable(false);
        //btest2_next.setImageResource(R.drawable.next_grey);

        btest2_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Au click sur le bouton, on passe au test suivant et on envoit le score a la gestion des points
                gestPts.setT1(ptsT2);
                Intent itest2 = new Intent(Test2.this, Test3.class);
                startActivity(itest2);
            }
        });

    }
    /*MediaPlayer media = MediaPlayer.create(getContext(), R.raw.file);
// public static MediaPlayer create (Context context, Uri uri)
    media = MediaPlayer.create(getContext(), Uri.parse("file://android_asset/fichier.mp4");
    media = MediaPlayer.create(getContext(), Uri.parse("file://sdcard/music/fichier.mp3");
    void setDataSource(String path);
    void prepare();
      // juste un test à suppr ou à utiliser si besoin */

    /**
     * Obtain the point manager
     * @param gestPtsF
     */
    public void giveGestPts(GestionPoint gestPtsF){
        this.gestPts = gestPtsF;
    }

}
