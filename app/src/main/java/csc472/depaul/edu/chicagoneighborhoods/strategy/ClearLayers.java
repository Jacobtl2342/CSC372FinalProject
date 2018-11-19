package csc472.depaul.edu.chicagoneighborhoods.strategy;

import android.content.Context;

import com.google.android.gms.maps.GoogleMap;

public class ClearLayers implements MapDisplayStrategy {
    @Override
    public void displaySelectedData(Context context, GoogleMap googleMap) {
        googleMap.clear();
    }
}
