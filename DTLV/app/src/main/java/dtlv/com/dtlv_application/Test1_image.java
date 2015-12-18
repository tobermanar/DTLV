package dtlv.com.dtlv_application;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Test1_image extends Activity {

    private ImageButton btest1_image1_back = null;
    private ImageView image = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test1_image);

        image = (ImageView) findViewById(R.id.test1_image1_full);
        image.setImageResource(R.drawable.test1_image2);

        int value = getIntent().getExtras().getInt("key");
        if (value == 1)
        { image.setImageResource(R.drawable.test1_image1);}
        if (value == 2)
        { image.setImageResource(R.drawable.test1_image2);}
        if (value == 3)
        { image.setImageResource(R.drawable.test1_image3);}
        if (value == 4)
        { image.setImageResource(R.drawable.test1_image4);}
        if (value == 5)
        { image.setImageResource(R.drawable.test1_image5);}
        if (value == 6)
        { image.setImageResource(R.drawable.test1_image6);}

        btest1_image1_back = (ImageButton) findViewById(R.id.test1_image1_back);
        btest1_image1_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

}
