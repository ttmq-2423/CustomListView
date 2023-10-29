package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class ChiTiet_Activity extends AppCompatActivity {

    ArrayList<ThongTinChiTiet> myList;
    Adapter2 myArrayAdapter;
    ListView lv;
    Button bt_back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chi_tiet);

        Intent myIntent = getIntent();
        int image[] = myIntent.getIntArrayExtra("image");
        String TenMon[] = myIntent.getStringArrayExtra("ten");
        String Gia[] = myIntent.getStringArrayExtra("Gia");
        lv = findViewById(R.id.lv2);
        myList = new ArrayList<>();
        for (int i = 0 ; i < TenMon.length; i++)
        {
            myList.add(new ThongTinChiTiet(image[i],TenMon[i],Gia[i]));
            myArrayAdapter = new Adapter2(ChiTiet_Activity.this,R.layout.layout_item_chitiet,myList);
            lv.setAdapter(myArrayAdapter);
        }
        bt_back = findViewById(R.id.button_back);
        bt_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               onBackPressed();
            }
        });


    }
}