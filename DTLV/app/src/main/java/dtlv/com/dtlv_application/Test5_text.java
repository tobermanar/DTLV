package dtlv.com.dtlv_application;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Test5_text extends Activity {

    private ImageButton btest5_text1_back = null;
    private TextView text = null;
    private ImageButton test5_image1_next = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test5_text);

        test5_image1_next = (ImageButton) findViewById(R.id.test5_image1_bnext);
        text = (TextView) findViewById(R.id.test5_text_full);
        text.setText("@string/test5_text1_part1");

        final int[] value = {getIntent().getExtras().getInt("key")};
        if (value[0] == 1)
        {
            text.setText(R.string.test5_text1_part1);
            Config.compt.setTest5_1(1);
        }
        if (value[0] == 2)
        {
            text.setText(R.string.test5_text1_part2);
            Config.compt.setTest5_2(1);
        }
        if (value[0] == 3)
        {
            text.setText(R.string.test5_text1_part3);
            Config.compt.setTest5_3(1);
        }
        if (value[0] == 4)
        {
            text.setText(R.string.test5_text2_part1);
            Config.compt.setTest5_4(1);
        }
        if (value[0] == 5)
        {
            text.setText(R.string.test5_text2_part2);
            Config.compt.setTest5_5(1);
        }
        if (value[0] == 6)
        {
            text.setText(R.string.test5_text2_part3);
            test5_image1_next.setVisibility(View.INVISIBLE);
            Config.compt.setTest5_6(1);
        }
        test5_image1_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value[0]++;
                if (value[0] == 1) {
                    text.setText(R.string.test5_text1_part1);
                    Config.compt.setTest5_1(1);
                }
                if (value[0] == 2) {
                    text.setText(R.string.test5_text1_part2);
                    Config.compt.setTest5_2(1);
                }
                if (value[0] == 3) {
                    text.setText(R.string.test5_text1_part3);
                    Config.compt.setTest5_3(1);
                }
                if (value[0] == 4) {
                    text.setText(R.string.test5_text2_part1);
                    Config.compt.setTest5_4(1);
                }
                if (value[0] == 5) {
                    text.setText(R.string.test5_text2_part2);
                    Config.compt.setTest5_5(1);
                }
                if (value[0] == 6) {
                    text.setText(R.string.test5_text2_part3);
                    test5_image1_next.setVisibility(View.INVISIBLE);
                    Config.compt.setTest5_6(1);
                }
            }
        });

        btest5_text1_back = (ImageButton) findViewById(R.id.test5_text_back);
        btest5_text1_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

}
