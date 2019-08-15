package omari.hamza.android_mvvm_demo.repositories;

import android.arch.lifecycle.MutableLiveData;

import java.util.ArrayList;
import java.util.List;

import omari.hamza.android_mvvm_demo.models.Place;

public class PlaceRepository {

    private static PlaceRepository sInstance;
    private ArrayList<Place> dataSet = new ArrayList<>();

    public static PlaceRepository getInstance() {
        if (sInstance == null) {
            sInstance = new PlaceRepository();
        }
        return sInstance;
    }

    //Pretend to get data from WebService/OnlineSource
    public MutableLiveData<List<Place>> getPlaces() {
        setPlaces();
        MutableLiveData<List<Place>> data = new MutableLiveData<>();
        data.setValue(dataSet);
        return data;
    }

    private void setPlaces() {
        dataSet.add(
                new Place("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg",
                        "Havasu Falls")
        );
        dataSet.add(
                new Place("https://i.redd.it/tpsnoz5bzo501.jpg",
                        "Trondheim")
        );
        dataSet.add(
                new Place("https://i.redd.it/qn7f9oqu7o501.jpg",
                        "Portugal")
        );
        dataSet.add(
                new Place("https://i.redd.it/j6myfqglup501.jpg",
                        "Rocky Mountain National Park")
        );
        dataSet.add(
                new Place("https://i.redd.it/0h2gm1ix6p501.jpg",
                        "Havasu Falls")
        );
        dataSet.add(
                new Place("https://i.redd.it/k98uzl68eh501.jpg",
                        "Mahahual")
        );
        dataSet.add(
                new Place("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg",
                        "Frozen Lake")
        );
        dataSet.add(
                new Place("https://i.redd.it/obx4zydshg601.jpg",
                        "Austrailia")
        );
    }
}
