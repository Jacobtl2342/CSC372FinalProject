package csc472.depaul.edu.chicagoneighborhoods.strategy;

import android.content.Context;

import com.google.android.gms.maps.GoogleMap;


public interface MapDisplayStrategy {
    public void displaySelectedData(Context context, GoogleMap googleMap);
}
