package com.example.yasmine.tourguide;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */



public class ClubsFragment extends Fragment {

    public ClubsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of words
        final ArrayList<place> places = new ArrayList<place>();

        places.add(new place ("El Ahly" , "Location" , "WebSite or Fb"));
        places.add(new place ("El Zohor" , "Location" , "WebSite or Fb"));
        places.add(new place ("Wady Degla" , "Location" , "WebSite or Fb"));
        places.add(new place ("Petro Sport" , "Location" , "WebSite or Fb"));
        places.add(new place ("El Gouna" , "Location" , "WebSite or Fb"));
        places.add(new place ("Nasr City" , "Location" , "WebSite or Fb"));
        places.add(new place ("El Zamalek" , "Location" , "WebSite or Fb"));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        placeAdapter adapter = new placeAdapter(getActivity(), places, R.color.category_clubs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }

}