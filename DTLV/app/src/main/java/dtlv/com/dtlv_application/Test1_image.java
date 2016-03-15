package dtlv.com.dtlv_application;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Test1_image extends Activity {

    private ImageButton btest1_image1_back = null;
    private ImageView image = null;
    private ImageButton test1_image1_next = null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test1_image);

        test1_image1_next = (ImageButton) findViewById(R.id.test1_image1_bnext);
        image = (ImageView) findViewById(R.id.test1_image1_full);
        image.setImageResource(R.drawable.test1_image1);
        final int[] value = {getIntent().getExtras().getInt("key")};
        if (value[0] == 1) {
            image.setImageResource(R.drawable.test1_image1);
            Config.compt.setTest1_1(1);
        }
        if (value[0] == 2) {
            image.setImageResource(R.drawable.test1_image2);
            Config.compt.setTest1_2(1);
        }
        if (value[0] == 3) {
            image.setImageResource(R.drawable.test1_image3);
            Config.compt.setTest1_3(1);
        }
        if (value[0] == 4) {
            image.setImageResource(R.drawable.test1_image4);
            Config.compt.setTest1_4(1);
        }
        if (value[0] == 5) {
            image.setImageResource(R.drawable.test1_image5);
            Config.compt.setTest1_5(1);
        }
        if (value[0] == 6) {
            image.setImageResource(R.drawable.test1_image6);
            test1_image1_next.setVisibility(View.INVISIBLE);
            Config.compt.setTest1_6(1);
        }
        test1_image1_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value[0]++;
                if (value[0] == 1) {
                    image.setImageResource(R.drawable.test1_image1);
                    Config.compt.setTest1_1(1);
                }
                if (value[0] == 2) {
                    image.setImageResource(R.drawable.test1_image2);
                    Config.compt.setTest1_2(1);
                }
                if (value[0] == 3) {
                    image.setImageResource(R.drawable.test1_image3);
                    Config.compt.setTest1_3(1);
                }
                if (value[0] == 4) {
                    image.setImageResource(R.drawable.test1_image4);
                    Config.compt.setTest1_4(1);
                }
                if (value[0] == 5) {
                    image.setImageResource(R.drawable.test1_image5);
                    Config.compt.setTest1_5(1);
                }
                if (value[0] == 6) {
                    image.setImageResource(R.drawable.test1_image6);
                    test1_image1_next.setVisibility(View.INVISIBLE);
                    Config.compt.setTest1_6(1);
                }

            }
        });
            btest1_image1_back = (ImageButton) findViewById(R.id.test1_image1_back);
            btest1_image1_back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    finish();
                }
            });
    }


}
