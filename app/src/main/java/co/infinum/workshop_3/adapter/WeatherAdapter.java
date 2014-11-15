package co.infinum.workshop_3.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.List;

import co.infinum.workshop_3.R;
import co.infinum.workshop_3.helpers.DateHelper;
import co.infinum.workshop_3.model.Day;

/**
 * Created by ivankocijan on 08.03.2014..
 */
public class WeatherAdapter extends ArrayAdapter<Day> {

    private LayoutInflater inflater;

    public WeatherAdapter (Context context, List<Day> objects) {
        super(context, 0, objects);

        this.inflater = LayoutInflater.from(context);

    }

    @Override
    public View getView (int position, View convertView, ViewGroup parent) {

        if (convertView == null) {

            convertView = inflater.inflate(R.layout.simple_list_item, parent, false);

        }

        TextView textView = (TextView) convertView.findViewById(R.id.list_item_text);

        Day day = getItem(position);

        String dateAndWeather = DateHelper.getStringDate(day.getDate());

        if(day.getWeather() != null && day.getWeather().size() > 0) {
            dateAndWeather += " " + day.getWeather().get(0).getDescription();
        }


        textView.setText(dateAndWeather);

        return convertView;

    }


}
