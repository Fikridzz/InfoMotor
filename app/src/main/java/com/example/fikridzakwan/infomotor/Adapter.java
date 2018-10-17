package com.example.fikridzakwan.infomotor;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    Context context;
    String [] namaMotor,detailMotor;
    int [] gambarMotor;

    public Adapter(Context context, int[] gambarMotor, String[] namaMotor, String[] detailMotor) {
        this.context = context;
        this.gambarMotor = gambarMotor;
        this.namaMotor = namaMotor;
        this.detailMotor = detailMotor;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_motor_sport_yamaha, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder viewHolder, final int i) {
        viewHolder.txtNamaMotor.setText(namaMotor[i]);
        Glide.with(context).load(gambarMotor[i]).into(viewHolder.imgLogoMotor);
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(context,DetailMotorActivity.class);
                pindah.putExtra("NM", namaMotor[i]);
                pindah.putExtra("DM", detailMotor[i]);
                pindah.putExtra("GM",gambarMotor[i]);
                context.startActivity(pindah);
            }
        });

    }

    @Override
    public int getItemCount() {

        return gambarMotor.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgLogoMotor;
        TextView txtNamaMotor;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgLogoMotor = itemView.findViewById(R.id.imgListSport);
            txtNamaMotor = itemView.findViewById(R.id.txtListMotorSport);
        }
    }
}

