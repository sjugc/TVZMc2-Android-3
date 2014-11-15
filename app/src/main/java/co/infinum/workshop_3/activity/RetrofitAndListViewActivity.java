package co.infinum.workshop_3.activity;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import co.infinum.workshop_3.R;
import co.infinum.workshop_3.adapter.WeatherAdapter;
import co.infinum.workshop_3.model.ApiResponse;
import co.infinum.workshop_3.model.Day;
import co.infinum.workshop_3.service.APIManager;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class RetrofitAndListViewActivity extends Activity {

    private ProgressDialog pd;
    private List<Day> dayArrayList = new ArrayList<Day>();
    private WeatherAdapter adapter;
    private ListView retrofitListView;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit_and_list_view);

        retrofitListView = (ListView) findViewById(R.id.retrofit_list);

        pd = new ProgressDialog(this);
        pd.setMessage("Please wait...");
        pd.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        pd.show();


        APIManager.getApiService().getWeatherInfo("45.811572", "15.952148", weatherCallback);

    }

    private Callback<ApiResponse> weatherCallback = new Callback<ApiResponse>() {
        @Override
        public void success (ApiResponse weather, Response response) {

            dayArrayList.addAll(weather.getDayList());

            adapter = new WeatherAdapter(RetrofitAndListViewActivity.this, dayArrayList);
            retrofitListView.setAdapter(adapter);
            adapter.notifyDataSetChanged();
            pd.cancel();

        }

        @Override
        public void failure (RetrofitError error) {
            pd.cancel();
        }
    };


}
