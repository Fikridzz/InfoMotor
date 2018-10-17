package com.example.fikridzakwan.infomotor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MenuMerekMotor extends AppCompatActivity {

    @BindView(R.id.imgYamaha)
    ImageView imgYamaha;
    @BindView(R.id.btnYamaha)
    Button btnYamaha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_merek_motor);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.btnYamaha)
    public void onViewClicked() {
        Intent pindah = new Intent(MenuMerekMotor.this, ChoseVersion.class);
        startActivity(pindah);
    }
}
