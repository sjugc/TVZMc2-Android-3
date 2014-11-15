package co.infinum.workshop_3.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import co.infinum.workshop_3.R;


public class MainActivity extends Activity {

    private Button retrofitExample;
    private Button retrofitAndListViewExample;
    private Button javaHttpExample;


    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        retrofitExample = (Button) findViewById(R.id.button_retrofit_eg);
        retrofitAndListViewExample = (Button) findViewById(R.id.button_retrofit_and_list_eg);
        javaHttpExample = (Button) findViewById(R.id.button_java_http_example);

        retrofitExample.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {

                startActivity(new Intent(MainActivity.this, RetrofitExampleActivity.class));

            }
        });

        retrofitAndListViewExample.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                startActivity(new Intent(MainActivity.this, RetrofitAndListViewActivity.class));

            }
        });

        javaHttpExample.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                startActivity(new Intent(MainActivity.this, JavaHttpEgActivity.class));
            }
        });

    }


}
