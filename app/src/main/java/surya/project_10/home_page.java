package surya.project_10;

import android.support.v7.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

public class home_page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        addListenerOnButton();
    }

    private void addListenerOnButton() {
        final Context context = this;

        final Button tAndFs = (Button)findViewById(R.id.button8);
        final Button otherCalc = (Button)findViewById(R.id.button9);
        tAndFs.setOnClickListener(new OnClickListener() {
        @Override
        public void onClick(View arg0) {

            Intent intent = new Intent(context, Main_page.class);
            startActivity(intent);
            }
        });
        otherCalc.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, other_calculations.class);
                startActivity(intent);
            }
        });

    }


}