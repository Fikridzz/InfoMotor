package com.example.fikridzakwan.infomotor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailMotorActivity extends AppCompatActivity {

    @BindView(R.id.imgMotor)
    ImageView imgMotor;
    @BindView(R.id.txtTitle)
    TextView txtTitle;
    @BindView(R.id.txtDetail)
    TextView txtDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_motor);
        ButterKnife.bind(this);

        txtTitle.setText(getIntent().getStringExtra("NM"));
        txtDetail.setText(getIntent().getStringExtra("DM"));
        Glide.with(this).load(getIntent().getIntExtra("GM", 0)).into(imgMotor);
    }
}
