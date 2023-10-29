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

public class MyArrayAdapter extends ArrayAdapter<LoaiMonAn> {
    Activity context;
    int IdLayout;
    ArrayList <LoaiMonAn> myList;

    public MyArrayAdapter(Activity context, int idLayout, ArrayList<LoaiMonAn> myList) {
        super(context, idLayout,  myList);
        this.context = context;
        IdLayout = idLayout;
        this.myList = myList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater myFlater = context.getLayoutInflater();
        convertView = myFlater.inflate(IdLayout,null);
        LoaiMonAn LMA = myList.get(position);
        ImageView image_main1 = convertView.findViewById(R.id.image_chitiet);
        image_main1.setImageResource(LMA.getImage1());


        ImageView image_main2 = convertView.findViewById(R.id.image_main2);
        image_main2.setImageResource(LMA.getImage2());

        ImageView image_main3 = convertView.findViewById(R.id.image_main3);
        image_main3.setImageResource(LMA.getImage3());

        TextView TenLoaiMonAn = convertView.findViewById(R.id.txt_loaimon);
        TenLoaiMonAn.setText(LMA.getTenLoaiMonAn());

        TextView sl_giamgia = convertView.findViewById(R.id.txt_sl_giamgia);
        sl_giamgia.setText(LMA.getSl_giamgia());

        TextView sl_sanpham = convertView.findViewById((R.id.txt_sl_sanpham));
        sl_sanpham.setText(LMA.getSl_sanpham());
        return convertView;
    }
}
