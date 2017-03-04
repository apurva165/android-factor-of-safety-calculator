package surya.project_10;

import android.support.v7.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

public class other_calculations extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_calculations);
        addListenerOnButton();
    }
    private void addListenerOnButton() {
        final Context context = this;

        final Button home = (Button)findViewById(R.id.button5);
        home.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, home_page.class);
                startActivity(intent);
            }
        });

    }
}
