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



public class HotelsFragment extends Fragment {

    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create a list of words
        final ArrayList<place> places = new ArrayList<place>();
        places.add(new place("Kempinski", "Location" , "WebSite or Fb"));
        places.add(new place("Le Meridien", "Location" , "WebSite or Fb"));
        places.add(new place("Cairo Marriott", "Location" , "WebSite or Fb"));
        places.add(new place("Dusit Thani LakeView Cairo", "Location" , "WebSite or Fb"));
        places.add(new place("Hilton Ramsis", "Location" , "WebSite or Fb"));
        places.add(new place("InterContinental Cairo Citystars", "Location" , "WebSite or Fb"));
        places.add(new place("Conrad", "Location" , "WebSite or Fb"));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        placeAdapter adapter = new placeAdapter(getActivity(), places, R.color.category_hotels);

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