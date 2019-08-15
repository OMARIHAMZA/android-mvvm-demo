package omari.hamza.android_mvvm_demo.viewmodels;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import java.util.List;

import omari.hamza.android_mvvm_demo.models.Place;
import omari.hamza.android_mvvm_demo.repositories.PlaceRepository;

public class MainActivityViewModel extends ViewModel {

    private PlaceRepository mRepo;

    private MutableLiveData<List<Place>> mPlaces;

    public void init(){
        if (mPlaces != null){
            return;
        }

        mRepo = PlaceRepository.getInstance();

        mPlaces = mRepo.getPlaces();
    }

    public LiveData<List<Place>> getmPlaces() {
        return mPlaces;
    }
}
