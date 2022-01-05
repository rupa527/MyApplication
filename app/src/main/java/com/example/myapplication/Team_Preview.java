package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Team_Preview extends AppCompatActivity {

    TextView txt_wicket_keeper, txt_Batsman, txt_All_Rounder, txt_Bowler;
    ImageView img_cricket_ground;
    ImageView img_wk_one, img_wk_two, img_batsman_one, img_batsman_two, img_batsman_three,
            img_All_rounder_one, img_All_rounder_two, img_bowler_one,
            img_bowler_two,  img_bowler_three,  img_bowler_four;
    Context mactivityContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_preview);

        mactivityContext = this;
        txt_wicket_keeper = findViewById(R.id.text_wicket_keeper);
        txt_Batsman = findViewById(R.id.text_Bats_man_label);
        txt_All_Rounder = findViewById(R.id.text_All_Rounder);
        txt_Bowler = findViewById(R.id.text_Bowler);

        img_cricket_ground = findViewById(R.id.image_cricket_ground);

        img_wk_one = findViewById(R.id.image_wk_one);
        img_wk_two = findViewById(R.id.image_wk_two);
        img_batsman_one = findViewById(R.id.image_batsman_one);
        img_batsman_two = findViewById(R.id.image_batsman_two);
        img_batsman_three = findViewById(R.id.image_batsman_three);
        img_All_rounder_one = findViewById(R.id.image_All_rounder_one);
        img_All_rounder_two = findViewById(R.id.image_All_rounder_two);
        img_bowler_one = findViewById(R.id.image_bowler_one);
        img_bowler_two = findViewById(R.id.image_bowler_two);
        img_bowler_three = findViewById(R.id.image_bowler_three);
        img_bowler_four = findViewById(R.id.image_bowler_four);

    }
}