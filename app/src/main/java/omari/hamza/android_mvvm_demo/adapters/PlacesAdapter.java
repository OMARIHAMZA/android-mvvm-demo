package omari.hamza.android_mvvm_demo.adapters;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;

import java.util.ArrayList;
import java.util.List;

import omari.hamza.android_mvvm_demo.R;
import omari.hamza.android_mvvm_demo.databinding.LayoutListitemBinding;
import omari.hamza.android_mvvm_demo.models.Place;

public class PlacesAdapter extends RecyclerView.Adapter<PlacesAdapter.MyViewHolder> {

    private Context mContext;
    private List<Place> places;

    public PlacesAdapter(List<Place> places, Context mContext) {
        this.places = places;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public PlacesAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutListitemBinding mBinding = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), R.layout.layout_listitem, viewGroup, false);
        return new MyViewHolder(mBinding.getRoot());
    }

    @Override
    public void onBindViewHolder(@NonNull PlacesAdapter.MyViewHolder viewHolder, int i) {
        viewHolder.mBinding.imageName.setText(places.get(i).getName());
        Glide.with(mContext)
        .load(places.get(i).getImageUrl())
        .into(viewHolder.mBinding.image);
    }

    @Override
    public int getItemCount() {
        return places.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        LayoutListitemBinding mBinding;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mBinding = DataBindingUtil.bind(itemView);
        }
    }
}
