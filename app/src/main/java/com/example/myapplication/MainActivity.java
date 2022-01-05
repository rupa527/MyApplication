package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Context;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView Recyclerview;
    RecyclerAdapter adapter;
    TextView upcoming;
    TextView matches;
    TextView Special;
    TextView fantasy;
    ImageView wallet;
    ImageView back_btn;
    ImageView img_cricket_banner;
    Context  mActivityContext;
    ArrayList<String>countryNameList = new ArrayList<>();
    ArrayList<Integer>imageList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mActivityContext = this;

        wallet = findViewById(R.id.Wallet);
        Recyclerview = findViewById(R.id.Recyclerview);
        fantasy = findViewById(R.id.text_Fantasy);
        upcoming = findViewById(R.id.cntst);
        matches = findViewById(R.id.matches);
        Special= findViewById(R.id.Special);
        back_btn = findViewById(R.id.img_back_btn);
        img_cricket_banner = findViewById(R.id.image_cricket_banner);

        Recyclerview.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        Intent intnt_Mtchs_Dtls_Scrn = new Intent(MainActivity.this, DetailsScreen.class); //launch detailscreen

        Intent intnt_create_team = new Intent(MainActivity.this, Create_teams.class);//Create_team

        Intent intnt_add_cash = new Intent(MainActivity.this,Add_Cash.class); //launch_add_cash



        wallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intnt_add_cash); // launch Add_cash

            }
        });
        

        countryNameList.add("IRELAND");
        countryNameList.add("RUSSIA");
        countryNameList.add("AUSTRALIA");
        countryNameList.add("ENGLAND");
        countryNameList.add("Russia");
        countryNameList.add("Kolkatta");

        imageList.add(R.drawable.australia);
        imageList.add(R.drawable.chennai);
        imageList.add(R.drawable.england);
        imageList.add(R.drawable.ireland);
        imageList.add(R.drawable.kolkatta);
        imageList.add(R.drawable.russia);


        matches.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {

                matches.setBackgroundColor(mActivityContext.getResources().getColor(R.color.red));
                matches.setTextColor(mActivityContext.getResources().getColor(R.color.white_789));
                Special.setBackgroundColor(mActivityContext.getResources().getColor(R.color.white_789));
                Special.setTextColor(mActivityContext.getResources().getColor(R.color.black_2));
                Special.setBackground(mActivityContext.getResources().getDrawable(R.drawable.white_rectangle));
                upcoming.setBackgroundColor(mActivityContext.getResources().getColor(R.color.white_789));
                upcoming.setTextColor(mActivityContext.getResources().getColor(R.color.black_2));
                upcoming.setBackground(mActivityContext.getResources().getDrawable(R.drawable.white_rectangle));
                matches.setBackground(mActivityContext.getResources().getDrawable(R.drawable.red_rectangle));

                startActivity(intnt_Mtchs_Dtls_Scrn);//launch detailscreen
                // Toast Message
                //Toast.makeText(getApplicationContext(), "Coming Soon", Toast.LENGTH_LONG).show();
            }
        });
        Special.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Special.setBackgroundColor(mActivityContext.getResources().getColor(R.color.red));
                Special.setTextColor(mActivityContext.getResources().getColor(R.color.white_789));
                matches.setBackgroundColor(mActivityContext.getResources().getColor(R.color.white_789));
                matches.setTextColor(mActivityContext.getResources().getColor(R.color.black_2));
                matches.setBackground(mActivityContext.getResources().getDrawable(R.drawable.white_rectangle));
                upcoming.setBackgroundColor(mActivityContext.getResources().getColor(R.color.white_789));
                upcoming.setTextColor(mActivityContext.getResources().getColor(R.color.black_2));
                upcoming.setBackground(mActivityContext.getResources().getDrawable(R.drawable.white_rectangle));
                Special.setBackground(mActivityContext.getResources().getDrawable(R.drawable.red_rectangle));

                startActivity(intnt_create_team); //launch Create_team

            }
        });
        upcoming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                upcoming.setBackgroundColor(mActivityContext.getResources().getColor(R.color.red));
                upcoming.setTextColor(mActivityContext.getResources().getColor(R.color.white_789));
                matches.setBackgroundColor(mActivityContext.getResources().getColor(R.color.white_789));
                matches.setTextColor(mActivityContext.getResources().getColor(R.color.black_2));
                matches.setBackground(mActivityContext.getResources().getDrawable(R.drawable.white_rectangle));
                Special.setBackgroundColor(mActivityContext.getResources().getColor(R.color.white_789));
                Special.setTextColor(mActivityContext.getResources().getColor(R.color.black_2));
                Special.setBackground(mActivityContext.getResources().getDrawable(R.drawable.white_rectangle));
                upcoming.setBackground(mActivityContext.getResources().getDrawable(R.drawable.red_rectangle));

                adapter = new RecyclerAdapter(countryNameList,imageList,MainActivity.this);
                Recyclerview.setAdapter(adapter);
            }
        });

    }
}