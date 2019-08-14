package omari.hamza.android_mvvm_demo.repositories;

import android.arch.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

import omari.hamza.android_mvvm_demo.models.Place;

public class PlaceRepository {

    private static PlaceRepository sInstance;
    private ArrayList<Place> data = new ArrayList<>();

    public static PlaceRepository getInstance() {
        if (sInstance == null){
            sInstance = new PlaceRepository();
        }
        return sInstance;
    }


    public MutableLiveData<List<Place>> getPlaces(){
        
    }
}
