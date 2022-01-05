package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.CountryViewHolder> {

    ArrayList<String>countryNameList;
    ArrayList<Integer>imageList;
    Context context;

    public RecyclerAdapter(ArrayList<String> countryNameList, ArrayList<Integer> imageList, Context context) {
        this.countryNameList = countryNameList;
        this.imageList = imageList;
        this.context = context;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card,parent,false);
        return new CountryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
        holder.textViewCountryName.setText(countryNameList.get(position));
        holder.imageView.setImageResource(imageList.get(position));
    }

    @Override
    public int getItemCount() {
        return countryNameList.size();
    }

    public class CountryViewHolder extends RecyclerView.ViewHolder {

        TextView textViewCountryName;
        ImageView imageView;
        CardView cardView;

        public CountryViewHolder(@NonNull View itemView) {
            super(itemView);

           imageView = itemView.findViewById(R.id.Kol1);
           //imageView = itemView.findViewById(R.id.Kol2);
           textViewCountryName = itemView.findViewById(R.id.Russia);
           /*textViewCountryName = itemView.findViewById(R.id.Ire);
           textViewCountryName = itemView.findViewById(R.id.VS);
           textViewCountryName = itemView.findViewById(R.id.Rsa);
           textViewCountryName = itemView.findViewById(R.id.Ireland);*/
           cardView = itemView.findViewById(R.id.cardView);
        }
    }
}
