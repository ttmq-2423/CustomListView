package com.example.customlistview;

public class LoaiMonAn {
    private int image1, image2,image3;
    private String TenLoaiMonAn,sl_sanpham, sl_giamgia;

    public int getImage1() {
        return image1;
    }

    public void setImage1(int image1) {
        this.image1 = image1;
    }

    public int getImage2() {
        return image2;
    }

    public void setImage2(int image2) {
        this.image2 = image2;
    }

    public int getImage3() {
        return image3;
    }

    public void setImage3(int image3) {
        this.image3 = image3;
    }

    public String getTenLoaiMonAn() {
        return TenLoaiMonAn;
    }

    public void setTenLoaiMonAn(String loaiMonAn) {
        TenLoaiMonAn = loaiMonAn;
    }

    public String getSl_sanpham() {
        return sl_sanpham;
    }

    public void setSl_sanpham(String sl_sanpham) {
        this.sl_sanpham = sl_sanpham;
    }

    public String getSl_giamgia() {
        return sl_giamgia;
    }

    public void setSl_giamgia(String sl_giamgia) {
        this.sl_giamgia = sl_giamgia;
    }

    public LoaiMonAn(int image1, int image2, int image3, String loaiMonAn, String sl_sanpham, String sl_giamgia) {
        this.image1 = image1;
        this.image2 = image2;
        this.image3 = image3;
        this.TenLoaiMonAn = loaiMonAn;
        this.sl_sanpham = sl_sanpham;
        this.sl_giamgia = sl_giamgia;
    }
}
