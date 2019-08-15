package omari.hamza.android_mvvm_demo;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.Adapter;

import java.util.ArrayList;
import java.util.List;

import omari.hamza.android_mvvm_demo.adapters.PlacesAdapter;
import omari.hamza.android_mvvm_demo.databinding.ActivityMainBinding;
import omari.hamza.android_mvvm_demo.models.Place;
import omari.hamza.android_mvvm_demo.viewmodels.MainActivityViewModel;

public class MainActivity extends AppCompatActivity {

    private MainActivityViewModel mViewModel;
    private ActivityMainBinding mBinding;
    private PlacesAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        mViewModel = ViewModelProviders.of(this).get(MainActivityViewModel.class);

        mViewModel.init();

        mViewModel.getmPlaces().observe(this, new Observer<List<Place>>() {
            @Override
            public void onChanged(@Nullable List<Place> places) {
                mAdapter.notifyDataSetChanged();
            }
        });

        initRecyclerView();

    }

    private void initRecyclerView() {
        mAdapter = new PlacesAdapter(mViewModel.getmPlaces().getValue(), this);
        mBinding.placesRecyclerView.setAdapter(mAdapter);
    }
}
