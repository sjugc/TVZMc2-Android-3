package co.infinum.workshop_3.activity;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.widget.TextView;

import co.infinum.workshop_3.R;
import co.infinum.workshop_3.helpers.JavaHttpCallExample;
import co.infinum.workshop_3.interfaces.HttpCallback;
import co.infinum.workshop_3.model.ApiResponse;


public class JavaHttpEgActivity extends ActionBarActivity {

    private TextView cityName;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_http_eg);

        cityName = (TextView) findViewById(R.id.java_http_city_name);

        JavaHttpCallExample.getWeather(callback);

    }

    private HttpCallback callback = new HttpCallback() {
        @Override
        public void onSuccess (final ApiResponse response) {

            runOnUiThread(new Runnable() {
                @Override
                public void run () {
                    cityName.setText("City name = " + response.getCity().getCityName());
                }
            });

            Log.d("koc", "success");

        }

        @Override
        public void onFailure (String error) {
            Log.d("koc", "error");

        }
    };

}
