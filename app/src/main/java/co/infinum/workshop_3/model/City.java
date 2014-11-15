package co.infinum.workshop_3.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ivankocijan on 08.03.2014..
 */
public class City {

    @SerializedName("id")
    private long cityId;

    @SerializedName("name")
    private String cityName;

    @SerializedName("coord")
    private Coordinates coordinates;

    @SerializedName("country")
    private String country;

    @SerializedName("population")
    private int population;

    public long getCityId () {
        return cityId;
    }

    public String getCityName () {
        return cityName;
    }

    public Coordinates getCoordinates () {
        return coordinates;
    }

    public String getCountry () {
        return country;
    }

    public int getPopulation () {
        return population;
    }
}
