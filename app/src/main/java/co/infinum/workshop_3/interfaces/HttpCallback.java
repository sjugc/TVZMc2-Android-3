package co.infinum.workshop_3.interfaces;


import co.infinum.workshop_3.model.ApiResponse;

/**
 * Created by ivankocijan on 16.03.2014..
 */
public interface HttpCallback {

    public void onSuccess (ApiResponse response);

    public void onFailure (String error);

}
