package com.example.fikridzakwan.infomotor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ChoseVersion extends AppCompatActivity {

    @BindView(R.id.btnNaked)
    Button btnNaked;
    @BindView(R.id.btnSport)
    Button btnSport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chose_version);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btnNaked, R.id.btnSport})
    public void onViewClicked(View view) {
        Intent pindah;
        switch (view.getId()) {
            case R.id.btnNaked:
                pindah = new Intent(this, RecycleView.class);
                pindah.putExtra("tanda", "naked");
                startActivity(pindah);
                break;
            case R.id.btnSport:
                pindah = new Intent(this, RecycleView.class);
                pindah.putExtra("tanda","sport");
                startActivity(pindah);
                break;
        }
    }
}
