package com.pml_dispatch;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class pending_fragment extends Fragment {

    private ArrayList<pickup_fragment_model> mPickupModel;
    private RecyclerView mRecyclerView;

    // The adapter is the bridge between our data and the recyclerview
    private pickup_pending_adapter pAdapter;
    // responsible for arranging item in our list
    private RecyclerView.LayoutManager mLayoutManger;

    public pending_fragment(){

    }
    @Override

    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        // Inflate the laout for this fragment
        View view=inflater.inflate(R.layout.pending_fragment,container,false);
        mPickupModel=new ArrayList<>();
        mPickupModel.add(new pickup_fragment_model("Ani Daniel"));
        mPickupModel.add(new pickup_fragment_model("Akpan Eugen"));
        mPickupModel.add(new pickup_fragment_model("Ani Daniel"));
        mPickupModel.add(new pickup_fragment_model("Akpan Eugen"));
        buildRecyclerView(view);
        pAdapter.setOnItemClickListener(new pickup_pending_adapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Toast.makeText(getContext(),"Clicked on an Item",Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onOptionClick(int position) {
             detailDialog();
            }
        });
        return view;
    }

    public void buildRecyclerView(View v){
        mRecyclerView= v.findViewById(R.id.pp_recycler);
        // if recycler view wont'change in size
        mRecyclerView.setHasFixedSize(true);
        mLayoutManger=new LinearLayoutManager(getActivity());
        pAdapter=new pickup_pending_adapter(mPickupModel);
        mRecyclerView.setLayoutManager(mLayoutManger);
        mRecyclerView.setAdapter(pAdapter);
    }

        public void detailDialog(){
            final Dialog dialog = new Dialog(getContext());
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            dialog.setContentView(R.layout.pending_dialog);
            //.setBackgroundDrawableResource(android.R.color.transparent);
            dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
            final Button createParcel=dialog.findViewById(R.id.create_parcel_but);
            createParcel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialog.dismiss();
                    Intent intent=new Intent(getContext(), createParcel.class);
                    startActivity(intent);
                }
            });
            dialog.show();

        }
}
