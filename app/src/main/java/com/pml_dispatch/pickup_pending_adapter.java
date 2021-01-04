package com.pml_dispatch;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class pickup_pending_adapter extends RecyclerView.Adapter<pickup_pending_adapter.pickupViewHolder>{

    private ArrayList<pickup_fragment_model>mPickUpModel;
    // should come with out package name
    public interface OnItemClickListener{
        void onItemClick(int position);
        void onOptionClick(int position);
    }

    private OnItemClickListener mListener;

    public void setOnItemClickListener(OnItemClickListener listner){
        mListener=listner;
    }


    public class pickupViewHolder extends RecyclerView.ViewHolder{
     public ImageView pickupLogo,option;
     public TextView name;
        public pickupViewHolder(@NonNull View itemView ,final OnItemClickListener listener){
            super(itemView);
            pickupLogo=itemView.findViewById(R.id.parcel_pp);
            option=itemView.findViewById(R.id.option_pp);
            name=itemView.findViewById(R.id.text_pp);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(listener!=null){
                        int position=getAdapterPosition();
                        if(position!=RecyclerView.NO_POSITION){
                            // check if the position is actually valid
                            listener.onItemClick(position);
                        }
                    }
                }
            });
            option.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(listener!=null){
                        int position=getAdapterPosition();
                        if(position!=RecyclerView.NO_POSITION){
                            // check if the position is actually valid
                            listener.onOptionClick(position);
                        }
                    }
                }
            });

        }
    }

    public pickup_pending_adapter(ArrayList<pickup_fragment_model> pickupModel){
        mPickUpModel=pickupModel;
    }

    @NonNull
    @Override
    public pickupViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.pending_pickup,parent,false);
    pickupViewHolder pvh=new pickupViewHolder(v,mListener);
        return pvh;
    }

    @Override
    public void onBindViewHolder(@NonNull pickupViewHolder holder, int position) {
      pickup_fragment_model currentPickup=mPickUpModel.get(position);
      holder.name.setText(currentPickup.getName());
    }

    @Override
    public int getItemCount() {
        return mPickUpModel.size();
    }



}
