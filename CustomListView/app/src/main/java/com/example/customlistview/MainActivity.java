package com.example.customlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    int image1[] = {R.drawable.monman,R.drawable.moncanh,R.drawable.monxao};


    int image2 = R.drawable.image_1;
    int image3 = R.drawable.sale_image;

    String TenLoai[] = {"Món mặn","Món canh","Món xào"};
    String sl_sanpham[] = {"5 sản phẩm","2 sản phẩm", "3 sản phẩm"};
    String sl_giamgia[] = {"2 dang giam giá", "1 dang giảm gia" , "1 đang giảm gia"};
    String MonManArr[] = {"Sườn nướng", "Cá kho", "Sườn xào chua ngọt", "Cá chiên", "Trứng"};
    int imageMan[] = {R.drawable.suonnuong, R.drawable.cakho, R.drawable.xaochuangot,R.drawable.cachien,R.drawable.trungchien };
    String GiaMonManArr[] = {"12000", "11000","10000","9000","16000"};

    String MonCanhArr[] = {"Canh chua" , "Canh khổ qua"};
    int imageCanh[] = {R.drawable.canhchua, R.drawable.canhkhoqua};
    String GiaMonCanhArr[] = {"6000", "5000"};

    String MonxaoArr[] = {"Rau muống xào", "Cải xào", "Giá xào"};
    int imageXao[] = {R.drawable.raumuongxao, R.drawable.caixao,R.drawable.giaxao};
    String GiaMonXaoArr[] = {"6000", "5000", "8000"};
    ArrayList<LoaiMonAn> myList;
    MyArrayAdapter myArrayAdapter;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        lv = findViewById(R.id.lv2);
        myList = new ArrayList<>();
        for (int i = 0; i < TenLoai.length; i++)
        {
            myList.add(new LoaiMonAn(image1[i],image2,image3,TenLoai[i],sl_sanpham[i],sl_giamgia[i]));
            myArrayAdapter = new MyArrayAdapter(MainActivity.this,R.layout.layout_item_main,myList);
            lv.setAdapter(myArrayAdapter);
            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Intent myintent = new Intent(getApplicationContext(), ChiTiet_Activity.class);


                    if (position == 0)
                    {
                        myintent.putExtra("image",imageMan);
                        myintent.putExtra("ten",MonManArr);
                        myintent.putExtra("Gia",GiaMonManArr);
                    }
                    else if (position == 1)
                    {
                        myintent.putExtra("image",imageCanh);
                        myintent.putExtra("ten", MonCanhArr);
                        myintent.putExtra("Gia",GiaMonCanhArr);
                    }
                    else
                    {
                        myintent.putExtra("image",imageXao);
                        myintent.putExtra("ten",MonxaoArr);
                        myintent.putExtra("Gia",GiaMonXaoArr);
                    }


                    startActivity(myintent);

                }
            });
        }

    }
}