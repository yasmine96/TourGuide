package com.example.yasmine.tourguide;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class placeAdapter extends ArrayAdapter<place> {

    private static final String LOG_TAG = placeAdapter.class.getSimpleName();
    private int mColoreResourceID;

    public placeAdapter(Context context, ArrayList<place> places, int ColorResourceID) {
        super(context, 0, places);
        mColoreResourceID = ColorResourceID;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);


        }

        place trans = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID place_name
        TextView placeName = (TextView) listItemView.findViewById(R.id.place_name);
        // Get the place name from the current place object and
        // set this name on the place name TextView
        placeName.setText(trans.getPlaceName());

        // Find the TextView in the list_item.xml layout with the ID miwok word
        TextView placeLocation = (TextView) listItemView.findViewById(R.id.place_location);

        // Get the place location from the current place object and
        // set this location on the place location TextView
        placeLocation.setText(trans.getPlaceLocation());

        TextView placeWebSite = (TextView) listItemView.findViewById(R.id.place_WebSite);

        // Get the place WebSite from the current place object and
        // set this lWebSite on the place WebSite TextView
        placeWebSite.setText(trans.getmPLaceWebSite());

        //set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);


        //find the color that resource ID map to
        int color = ContextCompat.getColor(getContext(),mColoreResourceID);

        //set the background color of the text container view
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
