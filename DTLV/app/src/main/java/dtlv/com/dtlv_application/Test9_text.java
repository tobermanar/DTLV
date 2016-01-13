package dtlv.com.dtlv_application;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Test9_text extends Activity {

    private ImageButton btest9_text_back = null;
    private TextView text1 = null;
    private TextView text2 = null;
    private TextView text3 = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test9_text);
        text1 = (TextView) findViewById(R.id.test9_text1_full);
        text2 = (TextView) findViewById(R.id.test9_text2_full);
        text3 = (TextView) findViewById(R.id.test9_text3_full);
        text1.setText(R.string.test9_text1);
        text2.setText(R.string.test9_text1_part1);
        text3.setText(R.string.test9_text1_part2);

        int value = getIntent().getExtras().getInt("key");
        if (value == 1)
        {
            text1.setText(R.string.test9_text1);
            text2.setText(R.string.test9_text1_part1);
            text3.setText(R.string.test9_text1_part2);
        }
        if (value == 2)
        {
            text1.setText(R.string.test9_text2);
            text2.setText(R.string.test9_text2_part1);
            text3.setText(R.string.test9_text2_part2);
        }
        if (value == 3)
        {
            text1.setText(R.string.test9_text3);
            text2.setText(R.string.test9_text3_part1);
            text3.setText(R.string.test9_text3_part2);
        }
        if (value == 4)
        {
            text1.setText(R.string.test9_text4);
            text2.setText(R.string.test9_text4_part1);
            text3.setText(R.string.test9_text4_part2);
        }
        if (value == 5)
        {
            text1.setText(R.string.test9_text5);
            text2.setText(R.string.test9_text5_part1);
            text3.setText(R.string.test9_text5_part2);
        }

        btest9_text_back = (ImageButton) findViewById(R.id.test9_text_back);
        btest9_text_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

}
