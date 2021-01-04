package com.pml_dispatch;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class pickup_fragment extends Fragment {

    private ArrayList<pickup_model> mPickupmodel;
    private RecyclerView mRecyclerView;

    // Thea dapte ris the bridge between our data and the recyclerview
    private pickup_adapter pickup_adapter;

    // responsible for arranging itme inour list
    private RecyclerView.LayoutManager mLayoutManger;

    public pickup_fragment(){

    }

    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        // Inflate the laout for this fragment
     View view=inflater.inflate(R.layout.pickup_fragment,container,false);
    mPickupmodel=new ArrayList<>();
      mPickupmodel.add(new pickup_model("Ani Daniel"));
      mPickupmodel.add(new pickup_model("James Ibori"));
      buildRecyclerView(view);
     return view;
    }

    public void buildRecyclerView(View v){
       mRecyclerView=v.findViewById(R.id.pickup_recycler);
       // if recycler view won't change in size
        mRecyclerView.setHasFixedSize(true);
        mLayoutManger=new LinearLayoutManager(getActivity());
        pickup_adapter=new pickup_adapter(mPickupmodel);
        mRecyclerView.setLayoutManager(mLayoutManger);
        mRecyclerView.setAdapter(pickup_adapter);
    }

}
