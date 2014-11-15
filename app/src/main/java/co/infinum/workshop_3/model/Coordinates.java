package co.infinum.workshop_3.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ivankocijan on 08.03.2014..
 */
public class Coordinates {

    @SerializedName("latitude")
    private float latitude;

    @SerializedName("longitude")
    private float longitude;

    public float getLatitude () {
        return latitude;
    }

    public void setLatitude (float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude () {
        return longitude;
    }

    public void setLongitude (float longitude) {
        this.longitude = longitude;
    }
}
