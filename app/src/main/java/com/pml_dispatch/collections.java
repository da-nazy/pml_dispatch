package com.pml_dispatch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class collections extends AppCompatActivity {

    private ArrayList<collectionModel> mCollectionModel;
    private RecyclerView mRecyclerView;

    // The adapter is the bridge between our data and the recyclerview
    private collection_adapter mCollectionAdapter;
    // responsible for arranging item in our list
    private RecyclerView.LayoutManager mLayoutManger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collections);
        populateAdapter();
        buildRecyclerView();
    }

    public void buildRecyclerView(){
        mRecyclerView=findViewById(R.id.collection_Recycler);
        // if recycler view won't change in sizae
        mRecyclerView.setHasFixedSize(true);
        mLayoutManger=new LinearLayoutManager(this);
        mCollectionAdapter=new collection_adapter(mCollectionModel);
        mRecyclerView.setLayoutManager(mLayoutManger);
        mRecyclerView.setAdapter(mCollectionAdapter);
    }

    public void populateAdapter(){
        mCollectionModel = new ArrayList<>();
        mCollectionModel.add(new collectionModel(R.mipmap.delivered,"Collection"));
        mCollectionModel.add(new collectionModel(R.mipmap.pending_hd,"Collection"));
    }

}