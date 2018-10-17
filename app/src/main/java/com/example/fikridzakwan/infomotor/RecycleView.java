package com.example.fikridzakwan.infomotor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecycleView extends AppCompatActivity {

    @BindView(R.id.my_recycler_view)
    RecyclerView myRecyclerView;

    String[] namaMotorSport,namaMotorNaked,detailMotorNaked,detailMotorSport;
    int[] gamabrMotorNaked,gamabrMotorSport;

    Adapter adapterMotor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);
        ButterKnife.bind(this);

        namaMotorSport = getResources().getStringArray(R.array.nama_motor_naked_yamaha);
        namaMotorNaked = getResources().getStringArray(R.array.nama_motor_sport_yamaha);
        detailMotorNaked = getResources().getStringArray(R.array.detail_motor_naked_yamaha);
        detailMotorSport = getResources().getStringArray(R.array.detail_motor_sport_yamaha);
        gamabrMotorNaked = new int[]{R.drawable.mt10, R.drawable.mt09, R.drawable.vixion, R.drawable.xaber};
        gamabrMotorSport = new int[]{R.drawable.r1m, R.drawable.r1, R.drawable.r6, R.drawable.r25, R.drawable.r15};

        String tanda = getIntent().getStringExtra("tanda");

        if (tanda.equals("naked")) {
            adapterMotor = new Adapter(RecycleView.this, gamabrMotorNaked, namaMotorNaked, detailMotorNaked);
        } else {
            adapterMotor = new Adapter(RecycleView.this, gamabrMotorSport,namaMotorSport,detailMotorSport);
        }
        myRecyclerView.setHasFixedSize(true);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(RecycleView.this));
        myRecyclerView.setAdapter(adapterMotor);
    }
}
