package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Context;

import java.util.ArrayList;

public class Create_teams extends AppCompatActivity {

    ImageView back_arrow;
    ImageView clock, team1_country_flag, team2_country_flag;
    TextView countdown_timer, players, team1_country_name, team2_country_name, credits, number_of_players,
            team1_score, team2_score, credit_score;
    TextView player1, player2, player3, player4, player5, player6, player7, player8, player9,
            player10, player11;
    TextView wicket_score, bow_score, all_score, bat_score;
    TextView preview_team, continue_game;
    Context mactivityContext;
    RecyclerView team_recyclerView;
    ArrayList<String> team_list = new ArrayList<>();
    ArrayList<Integer> team_imageList = new ArrayList<>();
    Create_team_adapter team_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_teams);
        mactivityContext = this;

        team_recyclerView = findViewById(R.id.team_recyclerView);

        back_arrow = findViewById(R.id.bck_arrow);
        clock = findViewById(R.id.img_clock);
        countdown_timer = findViewById(R.id.txt_count_down_timer);
        players = findViewById(R.id.txt_players);

        team1_country_name = findViewById(R.id.txt_team1_country_name);
        team2_country_name = findViewById(R.id.txt_team2_country_name);
        credits = findViewById(R.id.txt_credits_left);
        number_of_players = findViewById(R.id.txt_total_number_of_players);
        team1_country_flag = findViewById(R.id.img_team1_countryflag);
        team2_country_flag = findViewById(R.id.img_team2_countryflag);
        team1_score = findViewById(R.id.txt_team1_score);
        team2_score = findViewById(R.id.txt_team2_score);
        credit_score = findViewById(R.id.txt_credit_score);


        player1 = findViewById(R.id.txt_player1);
        player2 = findViewById(R.id.txt_player2);
        player3 = findViewById(R.id.txt_player3);
        player4 = findViewById(R.id.txt_player4);
        player5 = findViewById(R.id.txt_player5);
        player6 = findViewById(R.id.txt_player6);
        player7 = findViewById(R.id.txt_player7);
        player8 = findViewById(R.id.txt_player8);
        player9 = findViewById(R.id.txt_player9);
        player10 = findViewById(R.id.txt_player10);
        player11 = findViewById(R.id.txt_player11);

        wicket_score = findViewById(R.id.txt_wickets);
        bat_score = findViewById(R.id.txt_bat);
        all_score = findViewById(R.id.txt_All);
        bow_score = findViewById(R.id.txt_bow);


        preview_team = findViewById(R.id.txt_preview_team);
        continue_game = findViewById(R.id.txt_continue);

        Intent intnt_team_preview = new Intent(Create_teams.this,Team_Preview.class); //launch_team_preview

        Intent intnt_refer_and_earn = new Intent(Create_teams.this,Refer_and_Earn.class);



        preview_team.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(intnt_team_preview);
            }
        });

        continue_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intnt_refer_and_earn);
            }
        });
        

        wicket_score.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                wicket_score.setBackground(mactivityContext.getResources().getDrawable(R.drawable.red_rectangle));
                wicket_score.setTextColor(mactivityContext.getResources().getColor(R.color.white_789));
                bat_score.setBackgroundColor(mactivityContext.getResources().getColor(R.color.light_pink));
                bat_score.setTextColor(mactivityContext.getResources().getColor(R.color.black_2));
                bat_score.setBackground(mactivityContext.getResources().getDrawable(R.drawable.light_pinkish_rectangle));
                bow_score.setBackgroundColor(mactivityContext.getResources().getColor(R.color.white_789));
                bow_score.setTextColor(mactivityContext.getResources().getColor(R.color.black_2));
                bow_score.setBackground(mactivityContext.getResources().getDrawable(R.drawable.light_pinkish_rectangle));
                wicket_score.setBackground(mactivityContext.getResources().getDrawable(R.drawable.red_rectangle));
                all_score.setBackground(mactivityContext.getResources().getDrawable(R.drawable.light_pinkish_rectangle));
                all_score.setTextColor(mactivityContext.getResources().getColor(R.color.black_2));
            }
        });

        bat_score.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bat_score.setBackground(mactivityContext.getResources().getDrawable(R.drawable.light_pinkish_rectangle));
                bat_score.setTextColor(mactivityContext.getResources().getColor(R.color.white_789));
                wicket_score.setBackgroundColor(mactivityContext.getResources().getColor(R.color.light_pink));
                wicket_score.setTextColor(mactivityContext.getResources().getColor(R.color.black_2));
                wicket_score.setBackground(mactivityContext.getResources().getDrawable(R.drawable.light_pinkish_rectangle));
                bow_score.setBackgroundColor(mactivityContext.getResources().getColor(R.color.light_pink));
                bow_score.setTextColor(mactivityContext.getResources().getColor(R.color.black_2));
                bow_score.setBackground(mactivityContext.getResources().getDrawable(R.drawable.light_pinkish_rectangle));
                bat_score.setBackground(mactivityContext.getResources().getDrawable(R.drawable.red_rectangle));
                all_score.setBackground(mactivityContext.getResources().getDrawable(R.drawable.light_pinkish_rectangle));
                all_score.setTextColor(mactivityContext.getResources().getColor(R.color.black_2));
            }
        });

        all_score.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                all_score.setBackground(mactivityContext.getResources().getDrawable(R.drawable.light_pinkish_rectangle));
                all_score.setTextColor(mactivityContext.getResources().getColor(R.color.white_789));
                wicket_score.setBackgroundColor(mactivityContext.getResources().getColor(R.color.light_pink));
                wicket_score.setTextColor(mactivityContext.getResources().getColor(R.color.black_2));
                wicket_score.setBackground(mactivityContext.getResources().getDrawable(R.drawable.light_pinkish_rectangle));
                bow_score.setBackgroundColor(mactivityContext.getResources().getColor(R.color.light_pink));
                bow_score.setTextColor(mactivityContext.getResources().getColor(R.color.black_2));
                bow_score.setBackground(mactivityContext.getResources().getDrawable(R.drawable.light_pinkish_rectangle));
                all_score.setBackground(mactivityContext.getResources().getDrawable(R.drawable.red_rectangle));
                bat_score.setBackground(mactivityContext.getResources().getDrawable(R.drawable.light_pinkish_rectangle));
                bat_score.setTextColor(mactivityContext.getResources().getColor(R.color.black_2));
            }
        });

        bow_score.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bow_score.setBackground(mactivityContext.getResources().getDrawable(R.drawable.light_pinkish_rectangle));
                bow_score.setTextColor(mactivityContext.getResources().getColor(R.color.white_789));
                wicket_score.setBackgroundColor(mactivityContext.getResources().getColor(R.color.light_pink));
                wicket_score.setTextColor(mactivityContext.getResources().getColor(R.color.black_2));
                wicket_score.setBackground(mactivityContext.getResources().getDrawable(R.drawable.light_pinkish_rectangle));
                bat_score.setBackgroundColor(mactivityContext.getResources().getColor(R.color.light_pink));
                bat_score.setTextColor(mactivityContext.getResources().getColor(R.color.black_2));
                bat_score.setBackground(mactivityContext.getResources().getDrawable(R.drawable.light_pinkish_rectangle));
                bow_score.setBackground(mactivityContext.getResources().getDrawable(R.drawable.red_rectangle));
                all_score.setBackground(mactivityContext.getResources().getDrawable(R.drawable.light_pinkish_rectangle));
                all_score.setTextColor(mactivityContext.getResources().getColor(R.color.black_2));

            }
        });

        team_list.add("txt_playerone_name");
        //team_list.add("txt_gained_points");
        team_list.add("txt_gained_credits");
        team_list.add("txt_not_confirmed");

        team_imageList.add(R.drawable.team_player_1);
        team_imageList.add(R.drawable.team_player_2);
        //team_imageList.add(R.drawable.team_player_3);
        team_imageList.add(R.drawable.team_plus_icon);


        team_adapter = new Create_team_adapter(team_list, team_imageList, this);
        //RecyclerView team_recyclerview;
        team_recyclerView.setLayoutManager(new LinearLayoutManager(Create_teams.this));
        team_recyclerView.setHasFixedSize(true);
        team_recyclerView.setLayoutManager(new LinearLayoutManager(mactivityContext));
        team_recyclerView.setAdapter(team_adapter);


    }
}



