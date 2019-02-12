package com.example.yasmine.tourguide;

public class place {

    private String mPlaceName;
    private String mPlaceLocation;
    private String mPLaceWebSite;

    public place(String PlaceName , String PlaceLocation, String PLaceWebSite){

        mPlaceName = PlaceName;
        mPlaceLocation = PlaceLocation;
        mPLaceWebSite = PLaceWebSite;

    }

    public String getPlaceName(){
        return mPlaceName;
    }

    public String getPlaceLocation(){
        return mPlaceLocation;
    }

    public String getmPLaceWebSite(){
        return mPLaceWebSite;
    }
}
