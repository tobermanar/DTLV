package dtlv.com.dtlv_application;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Test5_text extends Activity {

    private ImageButton btest5_text1_back = null;
    private TextView text = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test5_text);

        text = (TextView) findViewById(R.id.test5_text1_full);
        text.setText("@string/test5_text1_part2");

        int value = getIntent().getExtras().getInt("key");
        if (value == 1)
        { text.setText("@string/test5_text1_part1");}
        if (value == 2)
        { text.setText("@string/test5_text1_part2");}
        if (value == 3)
        { text.setText("@string/test5_text1_part3");}
        if (value == 4)
        { text.setText("@string/test5_text2_part1");}
        if (value == 5)
        { text.setText("@string/test5_text2_part2");}
        if (value == 6)
        { text.setText("@string/test5_text2_part3");}

        btest5_text1_back = (ImageButton) findViewById(R.id.test5_text1_back);
        btest5_text1_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

}
