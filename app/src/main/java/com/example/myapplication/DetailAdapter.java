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


public class DetailAdapter extends RecyclerView.Adapter<DetailAdapter.CountryViewHolder1> {
    ArrayList<String> detailsList;
    ArrayList<Integer> imageList;
    Context mActivitycontext;

    // Declare 7 String Array

    // Declare Constructor with 7 String Array as Input
    /*public DetailAdapter(ArrayList<String> lst_price_pool, ArrayList<String> lst_joined, ArrayList<String> lst_percentage,
                         ArrayList<String> lst_price_winners, ArrayList<String> lst_price_prize, ArrayList<String> lst_price_team_sz,
                         ArrayList<String> lst_win_prob, ArrayList<Integer> img_lst_medal, ArrayList<Integer> img_lst_star, Context context)
    {
        return;
    }*/
    public DetailAdapter(ArrayList<String> detailsList, ArrayList<Integer> imageList, Context context) {
        this.detailsList = detailsList;
        this.imageList = imageList;
        this.mActivitycontext = context;
    }

    @NonNull
    @Override
    public CountryViewHolder1 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.detailcard,parent,false);
        return new CountryViewHolder1(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder1 holder, int position) {
        //holder.txtView_pool.setText(detailsList.get(position));
        //holder.txtView_prize.setText(detailsList.get(position));
       // holder.imageView.setImageResource(imageList.get(position));
    }

    @Override
    public int getItemCount()
    {

        return detailsList.size();
    }

    public class CountryViewHolder1 extends RecyclerView.ViewHolder {
        TextView txtView_pool;
        TextView txtView_prize;
        CardView cardView;

        public CountryViewHolder1(@NonNull View itemView) {
            super(itemView);


            txtView_pool = itemView.findViewById(R.id.txt_pool);
            txtView_prize = itemView.findViewById(R.id.winning_amount);
            cardView = itemView.findViewById(R.id.card);

        }


    }
}





