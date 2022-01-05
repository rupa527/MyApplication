package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Refer_and_Earn extends AppCompatActivity {

    ImageView img_refer_your_friends, img_red_oval1, img_red_oval2, img_gift_box, img_five_hundred,
              img_bonus_details, img_coupon;

    TextView txt_coupon_code, txt_copy_code, txt_share, txt_share_now;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refer_and_earn);

        img_refer_your_friends = findViewById(R.id.image_refer_your_friends);
        img_red_oval1 = findViewById(R.id.image_red_oval1);
        img_red_oval2 = findViewById(R.id.image_red_oval2);
        img_gift_box = findViewById(R.id.image_yellowgift_box);
        img_five_hundred = findViewById(R.id.image_five_hundred);
        img_bonus_details = findViewById(R.id.image_bonus_details);
        img_coupon = findViewById(R.id.image_coupon);

        txt_coupon_code = findViewById(R.id.text_coupon_code);
        txt_copy_code = findViewById(R.id.text_copy_code);
        txt_share = findViewById(R.id.text_share);
        txt_share_now = findViewById(R.id.text_share_now);

    }
}