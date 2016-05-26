package dtlv.com.dtlv_application;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.CursorJoiner;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.support.v4.app.ActivityCompat;
import android.util.Log;
import android.view.View.OnClickListener;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


/**
 * Created by Utilisateur on 2015-12-05.
 */

public class Menu extends Activity{


    private Button tutorial = null;
    private Button credits = null;
    private Button start = null;
    private Button language = null;
    private Button exit = null;
    private static final String TAG = Menu.class.getSimpleName();

    public static GestionPoint gestPts;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        //Disable screen touch sounds. But they stay disabled after closing the app
        /*Settings.System.putInt(getContentResolver(),
                Settings.System.SOUND_EFFECTS_ENABLED,
                0);*/
        //Settings.System.canWrite();
        //Creation de la gestion de point
        gestPts = new GestionPoint();

        tutorial = (Button) findViewById(R.id.b_tutorial);
        credits = (Button) findViewById(R.id.b_credits);
        start = (Button) findViewById(R.id.b_start);
        language = (Button) findViewById(R.id.b_language);
        exit = (Button) findViewById(R.id.b_exit);
        tutorial.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                // Au click sur le bouton, une nouvelle activit é est lancé.
                Intent itutorial = new Intent(Menu.this, Tutorial.class);
                startActivity(itutorial);
            }
        });
        credits.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                // Au click sur le bouton, une nouvelle activité est lancé.
                Intent icredits = new Intent(Menu.this, Credits.class);
                //dezgzgz
                startActivity(icredits);
            }
        });
        start.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    if (Settings.System.canWrite(getApplicationContext())) {
                        if (ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
                            askForPermission();
                        } else if (ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED) {
                            // Au click sur le bouton, une nouvelle activité est lancé.
                            Intent istart = new Intent(Menu.this, Config.class);
                            startActivity(istart);
                        }
                    }else {
                        Intent intent = new Intent(android.provider.Settings.ACTION_MANAGE_WRITE_SETTINGS);
                        intent.setData(Uri.parse("package:" + getPackageName()));
                        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                    }
                }else
                {
                    // Au click sur le bouton, une nouvelle activité est lancé.
                    Intent istart = new Intent(Menu.this, Config.class);
                    startActivity(istart);
                }
            }
        });
        language.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                // Au click sur le bouton, une nouvelle activité est lancé.
                Intent ilanguage = new Intent(Menu.this, Language.class);
                startActivity(ilanguage);
            }
        });
        exit.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                // Au click sur le bouton, l'application se ferme.
                //System.exit(0);
                Intent startLauncher = new Intent(Intent.ACTION_MAIN);
                startLauncher.addCategory(Intent.CATEGORY_HOME);
                startLauncher.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(startLauncher);
            }
        });

    }
    private void askForPermission()
    {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            requestPermissions(new String[] { Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);;
        }
    }
    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults)
    {
        if(requestCode == 1) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                // Au click sur le bouton, une nouvelle activité est lancé.
                Intent istart = new Intent(Menu.this, Config.class);
                startActivity(istart);
            }
            else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                if(shouldShowRequestPermissionRationale(permissions[0]) == false)
                {
                    final Intent intent = new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
                    final Uri uri = Uri.fromParts("package", getPackageName(), null);
                    intent.setData(uri);
                    startActivity(intent);
                }
            }
        }
            super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }
}

