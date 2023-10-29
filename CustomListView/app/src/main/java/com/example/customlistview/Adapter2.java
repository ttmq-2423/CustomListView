package com.example.customlistview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class Adapter2 extends ArrayAdapter {
    Activity context;
    int IdLayout;

    ArrayList <ThongTinChiTiet> myList;
    public Adapter2(Activity context, int idLayout, ArrayList<ThongTinChiTiet> myList) {
        super(context, idLayout, myList);
        this.context = context;
        IdLayout = idLayout;
        this.myList = myList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater myFlater = context.getLayoutInflater();
        convertView = myFlater.inflate(IdLayout,null);
        ThongTinChiTiet TTCT = myList.get(position);
        ImageView image = convertView.findViewById(R.id.image_chitiet);
        image.setImageResource(TTCT.getImage());

        TextView TenMon = convertView.findViewById(R.id.TenMon);
        TenMon.setText(TTCT.getTenMon());

        TextView Gia = convertView.findViewById(R.id.Gia);
        Gia.setText(TTCT.getGia());

        return convertView;
    }
}
