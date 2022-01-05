package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class DetailsScreen extends AppCompatActivity {

    RecyclerView recyclerview;
    DetailAdapter detailAdapter;
    TextView cntst;
    TextView join;
    TextView myteam;
    ImageView dtal_medal;
    ArrayList<String>detailsList = new ArrayList<>();
    ArrayList<Integer>imageList = new ArrayList<>();
    Context  mActivityContext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_screen);
        mActivityContext = this;

        recyclerview = findViewById(R.id.detailrecyclerview);
        cntst = findViewById(R.id.cntst);
        join = findViewById(R.id.joined);
        myteam = findViewById(R.id.teams);
        dtal_medal= findViewById(R.id.dtal_medal);


        detailsList.add("Prize pool");
        detailsList.add("Entry");
        detailsList.add("₹12 Crores");
        detailsList.add("Winners");
        detailsList.add("20000");
        detailsList.add("Max 4 Teams");
        detailsList.add("Win % 80");
        detailsList.add("8000/16000 Joined");
        detailsList.add("₹ 49");
        imageList.add(R.drawable.medal);


        // Initialize detailAdapter Object
        detailAdapter = new DetailAdapter(detailsList, imageList, this);
        RecyclerView detailrecyclerview;
        recyclerview.setLayoutManager(new LinearLayoutManager(DetailsScreen.this));
        recyclerview.setHasFixedSize(true);
        recyclerview.setLayoutManager(new LinearLayoutManager(mActivityContext));
        recyclerview.setAdapter(detailAdapter);

        // Initiate RecycleView Adapter for  DetailAdapter
    }

}



