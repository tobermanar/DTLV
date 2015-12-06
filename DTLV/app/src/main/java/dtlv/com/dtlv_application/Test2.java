package dtlv.com.dtlv_application;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;

/**
 * Created by Utilisateur on 2015-12-05.
 */
public class Test2 extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test2);
    }
    /*MediaPlayer media = MediaPlayer.create(getContext(), R.raw.file);
// public static MediaPlayer create (Context context, Uri uri)
    media = MediaPlayer.create(getContext(), Uri.parse("file://android_asset/fichier.mp4");
    media = MediaPlayer.create(getContext(), Uri.parse("file://sdcard/music/fichier.mp3");
    void setDataSource(String path);
    void prepare();
      // juste un test à suppr ou à utiliser si besoin */

}
