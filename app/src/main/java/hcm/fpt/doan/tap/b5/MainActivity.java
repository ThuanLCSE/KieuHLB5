package hcm.fpt.doan.tap.b5;

import android.app.ActionBar;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.FILL_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        LinearLayout linear = new LinearLayout(this);
        linear.setOrientation(LinearLayout.VERTICAL);
        TextView txt = new TextView(this);
        txt.setId(R.string.txt_id);
        txt.setText("Dynamic ahi hi");

        Button btn = new Button(this);
        btn.setLayoutParams(params);
        txt.setLayoutParams(params);
        btn.setText("Dynamic buttn");
        linear.addView(txt);
        linear.addView(btn);
        this.addContentView(linear,params);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txt = (TextView) findViewById();
            }
        });
    }
}
