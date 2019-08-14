package omari.hamza.android_mvvm_demo.viewmodels;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import java.util.List;

import omari.hamza.android_mvvm_demo.models.Place;

public class MainActivityViewModel extends ViewModel {


    private MutableLiveData<List<Place>> mPlaces;

    public LiveData<List<Place>> getmPlaces() {
        return mPlaces;
    }
}
