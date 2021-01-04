package com.pml_dispatch;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class pickup_adapter extends RecyclerView.Adapter<pickup_adapter.pickupHolder> {

    private ArrayList<pickup_model>mPickupModel;

    public class pickupHolder extends RecyclerView.ViewHolder{
      public ImageView pickupLogo,option;
      public TextView name;
        public pickupHolder(@NonNull View itemView){
            super (itemView);
                pickupLogo=itemView.findViewById(R.id.collection_image_ui);
                option=itemView.findViewById(R.id.collection_option_ui);
                name=itemView.findViewById(R.id.collection_name_ui);
        }
    }

    public pickup_adapter(ArrayList<pickup_model> pickupModels){
        mPickupModel=pickupModels;
    }
    @NonNull
    @Override
    public pickupHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.pickup_ui,parent,false);
        pickupHolder pvh=new pickupHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(@NonNull pickupHolder holder, int position) {
    pickup_model currentPickup=mPickupModel.get(position);
    holder.name.setText(currentPickup.getName());
    }

    @Override
    public int getItemCount() {
        return mPickupModel.size();
    }


}
