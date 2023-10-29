package com.example.customlistview;

public class ThongTinChiTiet {
    private   int image;
    private String TenMon, Gia;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTenMon() {
        return TenMon;
    }

    public void setTenMon(String tenMon) {
        TenMon = tenMon;
    }

    public String getGia() {
        return Gia;
    }

    public void setGia(String gia) {
        Gia = gia;
    }

    public ThongTinChiTiet(int image, String tenMon, String gia) {
        this.image = image;
        TenMon = tenMon;
        Gia = gia;
    }
}
