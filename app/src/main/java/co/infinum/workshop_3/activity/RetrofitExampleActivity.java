package co.infinum.workshop_3.activity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.widget.TextView;

import co.infinum.workshop_3.R;
import co.infinum.workshop_3.model.ApiResponse;
import co.infinum.workshop_3.service.APIManager;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;


public class RetrofitExampleActivity extends ActionBarActivity {

    private TextView retrofitText;

    private ProgressDialog pd;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit_example);

        pd = new ProgressDialog(this);
        pd.setMessage("Please wait...");
        pd.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        pd.show();

        retrofitText = (TextView) findViewById(R.id.retrofit_text_view);

        APIManager.getApiService().getWeatherInfo("45.811572", "15.952148", callback);

    }


    private Callback<ApiResponse> callback = new Callback<ApiResponse>() {
        @Override
        public void success (ApiResponse response, Response response2) {

            String text = "City name = " + response.getCity().getCityName();

            retrofitText.setText(text);

            pd.cancel();

            Log.d("koc", text);

        }

        @Override
        public void failure (RetrofitError error) {

            retrofitText.setText("Retrofit error");

            pd.cancel();

            Log.d("koc", "failure", error);

        }
    };


}
