package co.infinum.workshop_3.helpers;

import android.util.Log;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import co.infinum.workshop_3.interfaces.HttpCallback;
import co.infinum.workshop_3.model.ApiResponse;

/**
 * Created by ivankocijan on 08.03.2014..
 */
public class JavaHttpCallExample {

    private static final String WEATHER_URL = "http://api.openweathermap.org/data/2.5/forecast";

    public static void getWeather (final HttpCallback callback) {

        new Thread(new Runnable() {
            @Override
            public void run () {
                BufferedReader in = null;
                try {
                    String query = "lat=45&lon=15";
                    URL urlObj = new URL(WEATHER_URL + "?" + query);
                    HttpURLConnection con = (HttpURLConnection) urlObj.openConnection();
                    con.setRequestMethod("GET");

                    in = new BufferedReader(
                            new InputStreamReader(con.getInputStream()));
                    String inputLine;
                    StringBuffer JSONresponse = new StringBuffer();
                    while ((inputLine = in.readLine()) != null) {
                        JSONresponse.append(inputLine);
                    }
                    ApiResponse response1 = new Gson().fromJson(JSONresponse.toString(),
                            ApiResponse.class);

                    Log.d("koc", "success");

                    callback.onSuccess(response1);
                } catch (IOException e) {
                    callback.onFailure(e.toString());


                    Log.d("koc", "failure");

                } finally {

                    if (in != null) {

                        try {

                            in.close();

                        } catch (IOException e) {
                            //well at least I tried
                        }


                    }
                }


            }
        }).start();


    }


}
