package co.infinum.workshop_3.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ivankocijan on 08.03.2014..
 */
public class ApiResponse {

    @SerializedName("cod")
    private String cod;

    @SerializedName("message")
    private float message;

    @SerializedName("city")
    private City city;

    @SerializedName("population")
    private int population;


    @SerializedName("list")
    private List<Day> dayList;

    @SerializedName("cnt")
    private int cnt;


    public String getCod () {
        return cod;
    }

    public float getMessage () {
        return message;
    }

    public City getCity () {
        return city;
    }

    public int getPopulation () {
        return population;
    }

    public List<Day> getDayList () {
        return dayList;
    }

    public int getCnt () {
        return cnt;
    }
}
