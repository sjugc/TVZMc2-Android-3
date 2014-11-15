package co.infinum.workshop_3.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by ivankocijan on 08.03.2014..
 */
public class Day {

    @SerializedName("dt")
    private long date;

    @SerializedName("main")
    private MainWeatherInformation mainWeatherInformation;

    @SerializedName("weather")
    private ArrayList<Weather> weather;

    @SerializedName("clouds")
    private CloudInformation cloudInformation;

    @SerializedName("wind")
    private WindInformation windInformation;

    @SerializedName("rain")
    private RainInformation rainInformation;


    public class RainInformation {

        @SerializedName("rain")
        private float next3Hours;


        public float getNext3Hours () {
            return next3Hours;
        }
    }

    public class CloudInformation {

        @SerializedName("all")
        private int all;

        public int getAll () {
            return all;
        }
    }

    public class WindInformation {

        @SerializedName("speed")
        private float windSpeed;

        @SerializedName("deg")
        private float windDeg;

        public float getWindSpeed () {
            return windSpeed;
        }

        public float getWindDeg () {
            return windDeg;
        }
    }

    public class Weather {

        @SerializedName("id")
        private int id;

        @SerializedName("main")
        private String descriptionName;

        @SerializedName("description")
        private String description;

        @SerializedName("icon")
        private String icon;

        public int getId () {
            return id;
        }

        public String getDescriptionName () {
            return descriptionName;
        }

        public String getDescription () {
            return description;
        }

        public String getIcon () {
            return icon;
        }
    }


    public static class MainWeatherInformation {

        @SerializedName("temp")
        private float temp;

        @SerializedName("temp_min")
        private float tempMin;

        @SerializedName("temp_max")
        private float tempMax;

        @SerializedName("pressure")
        private float pressure;

        @SerializedName("sea_level")
        private float seaLevel;

        @SerializedName("grnd_level")
        private float groundLevel;

        @SerializedName("humidity")
        private int humidity;

        @SerializedName("temp_kf")
        private float tempKf;


        public float getTemp () {
            return temp;
        }

        public void setTemp (float temp) {
            this.temp = temp;
        }

        public float getTempMin () {
            return tempMin;
        }

        public void setTempMin (float tempMin) {
            this.tempMin = tempMin;
        }

        public float getTempMax () {
            return tempMax;
        }

        public void setTempMax (float tempMax) {
            this.tempMax = tempMax;
        }

        public float getPressure () {
            return pressure;
        }

        public void setPressure (float pressure) {
            this.pressure = pressure;
        }

        public float getSeaLevel () {
            return seaLevel;
        }

        public void setSeaLevel (float seaLevel) {
            this.seaLevel = seaLevel;
        }

        public float getGroundLevel () {
            return groundLevel;
        }

        public void setGroundLevel (float groundLevel) {
            this.groundLevel = groundLevel;
        }

        public int getHumidity () {
            return humidity;
        }

        public void setHumidity (int humidity) {
            this.humidity = humidity;
        }

        public float getTempKf () {
            return tempKf;
        }

        public void setTempKf (float tempKf) {
            this.tempKf = tempKf;
        }
    }

    public Date getDate () {

        //!IMPORTANT! date is in milliseconds and the timestamp is in seconds
        Date dateObject = new Date(date * 1000);

        return dateObject;


    }

    public MainWeatherInformation getMainWeatherInformation () {
        return mainWeatherInformation;
    }

    public ArrayList<Weather> getWeather () {
        return weather;
    }

    public CloudInformation getCloudInformation () {
        return cloudInformation;
    }

    public WindInformation getWindInformation () {
        return windInformation;
    }

    public RainInformation getRainInformation () {
        return rainInformation;
    }
}
