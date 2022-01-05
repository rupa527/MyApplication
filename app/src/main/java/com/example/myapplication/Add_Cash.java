package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Context;

public class Add_Cash extends AppCompatActivity {

    TextView txt_add_deposit_cash;
    TextView txt_hundred, txt_five_hundred, txt_thousand, txt_two_thousand;
    TextView txt_enter_amount;
    TextView txt_enter_coupon_code;
    TextView txt_proceed_to_pay;
    TextView txt_close;
    ImageView img_check1, img_check2, img_check3, img_check4;
    ImageView img_pen_edit;
    Context mActivitycontext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_cash);

        txt_add_deposit_cash = findViewById(R.id.text_add_deposit_cash);
        txt_hundred = findViewById(R.id.text_hundred);
        txt_five_hundred = findViewById(R.id.text_five_hundred);
        txt_thousand = findViewById(R.id.text_thousand);
        txt_two_thousand = findViewById(R.id.text_two_thousand);
        txt_enter_amount = findViewById(R.id.text_enter_amount);
        txt_enter_coupon_code = findViewById(R.id.text_enter_coupon_code);
        txt_proceed_to_pay = findViewById(R.id.text_proceed_to_pay);
        txt_close = findViewById(R.id.text_close);
        img_check1 = findViewById(R.id.image_check1);
        img_check2 = findViewById(R.id.image_check2);
        img_check3 = findViewById(R.id.image_check3);
        img_check4 = findViewById(R.id.image_check4);
        img_pen_edit = findViewById(R.id.image_pen_edit);

        mActivitycontext = this;

        txt_hundred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              txt_hundred.setBackground(mActivitycontext.getResources().getDrawable(R.drawable.green_rectangle_boarder));
              txt_five_hundred.setBackground(mActivitycontext.getResources().getDrawable(R.drawable.shadow));
              txt_thousand.setBackground(mActivitycontext.getResources().getDrawable(R.drawable.shadow));
              txt_two_thousand.setBackground(mActivitycontext.getResources().getDrawable(R.drawable.shadow));
              img_check1.setVisibility(View.VISIBLE);
              img_check2.setVisibility(View.GONE);
              img_check3.setVisibility(View.GONE);
              img_check4.setVisibility(View.GONE);
            }
        });
        txt_five_hundred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_five_hundred.setBackground(mActivitycontext.getResources().getDrawable(R.drawable.green_rectangle_boarder));
                txt_thousand.setBackground(mActivitycontext.getResources().getDrawable(R.drawable.shadow));
                txt_two_thousand.setBackground(mActivitycontext.getResources().getDrawable(R.drawable.shadow));
                txt_hundred.setBackground(mActivitycontext.getResources().getDrawable(R.drawable.shadow));
                img_check2.setVisibility(View.VISIBLE);
                img_check1.setVisibility(View.GONE);
                img_check3.setVisibility(View.GONE);
                img_check4.setVisibility(View.GONE);
            }
        });
        txt_thousand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_thousand.setBackground(mActivitycontext.getResources().getDrawable(R.drawable.green_rectangle_boarder));
                txt_five_hundred.setBackground(mActivitycontext.getResources().getDrawable(R.drawable.shadow));
                txt_two_thousand.setBackground(mActivitycontext.getResources().getDrawable(R.drawable.shadow));
                txt_hundred.setBackground(mActivitycontext.getResources().getDrawable(R.drawable.shadow));
                img_check3.setVisibility(View.VISIBLE);
                img_check4.setVisibility(View.GONE);
                img_check2.setVisibility(View.GONE);
                img_check1.setVisibility(View.GONE);
            }
        });
        txt_two_thousand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_two_thousand.setBackground(mActivitycontext.getResources().getDrawable(R.drawable.green_rectangle_boarder));
                txt_hundred.setBackground(mActivitycontext.getResources().getDrawable(R.drawable.shadow));
                txt_five_hundred.setBackground(mActivitycontext.getResources().getDrawable(R.drawable.shadow));
                txt_thousand.setBackground(mActivitycontext.getResources().getDrawable(R.drawable.shadow));
                img_check3.setVisibility(View.GONE);
                img_check2.setVisibility(View.GONE);
                img_check1.setVisibility(View.GONE);
                img_check4.setVisibility(View.VISIBLE);
            }
            });
    }
}