package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Context;
import android.service.autofill.VisibilitySetterAction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

  public class Create_team_adapter extends RecyclerView.Adapter<Create_team_adapter.ViewHolder>  {

      ArrayList<String> team_list;
      ArrayList<Integer> team_imageList;
      Context context;


    public Create_team_adapter(ArrayList<String> team_list, ArrayList<Integer> team_imageList, Context context) {
        this.team_list = team_list;
        this.team_imageList = team_imageList;
        this.context = context;
    }

      @NonNull
      @Override
      public Create_team_adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
          View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.team_card,parent,false);
          return new ViewHolder(view);
      }

      @Override
      public void onBindViewHolder(@NonNull Create_team_adapter.ViewHolder holder, int position) {

    }

      @Override
      public int getItemCount()
      {
          return team_list.size();
      }

      public class ViewHolder extends RecyclerView.ViewHolder {
        TextView player1_name;
        TextView gained_points;
        TextView gained_credits;
        ImageView image_player_one;
        ImageView team_minus_icon;
        ImageView team_plus_icon;
        CardView team_card;

        @SuppressLint("ResourceType")
          public ViewHolder(@NonNull View itemView) {
            super(itemView);
            player1_name = itemView.findViewById(R.id.txt_playerone_name);
            gained_points = itemView.findViewById(R.id.txt_gained_points);
            gained_credits = itemView.findViewById(R.id.txt_gained_points);
            image_player_one = itemView.findViewById(R.id.img_playerone);
            team_plus_icon = itemView.findViewById(R.id.img_plus_icon);
            team_minus_icon = itemView.findViewById(R.id.team_minus_icon);
            team_card = itemView.findViewById(R.id.team_cardview);

            team_plus_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    team_plus_icon.setVisibility(View.GONE);
                    team_minus_icon.setVisibility(View.VISIBLE);
                }
            });
            team_minus_icon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    team_minus_icon.setVisibility(View.GONE);
                    team_plus_icon.setVisibility(View.VISIBLE);
                }
            });

        }
    }

  }

