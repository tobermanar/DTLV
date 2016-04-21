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
    private ImageButton test9_image_next = null;

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
        test9_image_next = (ImageButton) findViewById(R.id.test9_image_bnext);

        final int[] value= {getIntent().getExtras().getInt("key")};
        if (value[0] == 1)
        {
            text1.setText(R.string.test9_text1);
            text2.setText(R.string.test9_text1_part1);
            text3.setText(R.string.test9_text1_part2);
        }
        if (value[0] == 2)
        {
            text1.setText(R.string.test9_text2);
            text2.setText(R.string.test9_text2_part1);
            text3.setText(R.string.test9_text2_part2);
        }
        if (value[0] == 3)
        {
            text1.setText(R.string.test9_text3);
            text2.setText(R.string.test9_text3_part1);
            text3.setText(R.string.test9_text3_part2);
        }
        if (value[0] == 4)
        {
            text1.setText(R.string.test9_text4);
            text2.setText(R.string.test9_text4_part1);
            text3.setText(R.string.test9_text4_part2);
        }
        if (value[0] == 5)
        {
            text1.setText(R.string.test9_text5);
            text2.setText(R.string.test9_text5_part1);
            text3.setText(R.string.test9_text5_part2);
            test9_image_next.setVisibility(View.INVISIBLE);
        }
        test9_image_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value[0]++;
                if (value[0] == 1) {
                    text1.setText(R.string.test9_text1);
                    text2.setText(R.string.test9_text1_part1);
                    text3.setText(R.string.test9_text1_part2);
                    Config.compt.setTest9_1(1);
                }
                if (value[0] == 2) {
                    text1.setText(R.string.test9_text2);
                    text2.setText(R.string.test9_text2_part1);
                    text3.setText(R.string.test9_text2_part2);
                    Config.compt.setTest9_2(1);
                }
                if (value[0] == 3) {
                    text1.setText(R.string.test9_text3);
                    text2.setText(R.string.test9_text3_part1);
                    text3.setText(R.string.test9_text3_part2);
                    Config.compt.setTest9_3(1);
                }
                if (value[0] == 4) {
                    text1.setText(R.string.test9_text4);
                    text2.setText(R.string.test9_text4_part1);
                    text3.setText(R.string.test9_text4_part2);
                    Config.compt.setTest9_4(1);
                }
                if (value[0] == 5) {
                    test9_image_next.setVisibility(View.INVISIBLE);
                    text1.setText(R.string.test9_text5);
                    text2.setText(R.string.test9_text5_part1);
                    text3.setText(R.string.test9_text5_part2);
                    Config.compt.setTest9_5(1);
                }
            }
        });
        btest9_text_back = (ImageButton) findViewById(R.id.test9_text_back);
        btest9_text_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

}
