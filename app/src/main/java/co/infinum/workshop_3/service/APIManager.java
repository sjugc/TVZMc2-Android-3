package co.infinum.workshop_3.service;


import co.infinum.workshop_3.model.ApiResponse;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by ivankocijan on 08.03.2014..
 */
public class APIManager {

    private static Mc2Service mc2Service;
    private static final String URL = "http://api.openweathermap.org/data/2.5";


    public interface Mc2Service {

        @GET("/forecast")
        void getWeatherInfo (@Query("lat") String latitude,
                             @Query("lon") String longitude,
                             Callback<ApiResponse> cb);
    }

    public static Mc2Service getApiService () {

        RestAdapter restAdapter = new RestAdapter.Builder().
                setEndpoint(URL).build();

        mc2Service = restAdapter.create(Mc2Service.class);


        return mc2Service;


    }

}
