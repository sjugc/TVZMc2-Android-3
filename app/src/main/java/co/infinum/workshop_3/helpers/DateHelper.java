package co.infinum.workshop_3.helpers;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ivankocijan on 09.03.2014..
 */
public class DateHelper {

    public static String getStringDate (Date calendar) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy. HH:mm:ss");
        String string = sdf.format(calendar);
        return string;


    }

}
