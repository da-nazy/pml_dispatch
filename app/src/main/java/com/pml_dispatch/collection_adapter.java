package com.pml_dispatch;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class collection_adapter  extends RecyclerView.Adapter<collection_adapter.collectionHolder> {

    private ArrayList<collectionModel>mCollectionModel;

    public collection_adapter(ArrayList<collectionModel> collection_model){
        mCollectionModel=collection_model;
    }


    public class collectionHolder extends RecyclerView.ViewHolder{
      public ImageView option,dev_pending;
      public TextView name;
        public collectionHolder(@NonNull View itemView) {
            super(itemView);
            option=itemView.findViewById(R.id.collection_option_ui);
            dev_pending=itemView.findViewById(R.id.collection_dev_pending);
            name=itemView.findViewById(R.id.collection_name_ui);
        }
    }

    @NonNull
    @Override
    public collectionHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.collection_ui_compoonent,parent,false);
        collectionHolder ch= new collectionHolder(v);
        return ch;
    }

    @Override
    public void onBindViewHolder(@NonNull collectionHolder holder, int position) {

    collectionModel currentCollection =mCollectionModel.get(position);
    holder.name.setText(currentCollection.getName());
    holder.dev_pending.setImageResource(currentCollection.getDev_pending());
    }

    @Override
    public int getItemCount() {
        return mCollectionModel.size();
    }


}
