/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.actvn.java06.mavenproject1;

/**
 *
 * @author Admin
 */
public class SachDangDuocMuon extends Sach {

    private String maSVmuon;
    private String thoiGianMuonSach;
    private String thoiGianTraSach;

    public SachDangDuocMuon(String maSVmuon, String thoiGianMuonSach, String thoiGianTraSach, String maSach, String tenSach, String tacGia, String theLoai, int soLuong, String NXB) {
        super(maSach, tenSach, tacGia, theLoai, soLuong, NXB);
        this.maSVmuon = maSVmuon;
        this.thoiGianMuonSach = thoiGianMuonSach;
        this.thoiGianTraSach = thoiGianTraSach;
    }

    public SachDangDuocMuon(String maSVmuon, String thoiGianMuonSach, String thoiGianTraSach) {
        this.maSVmuon = maSVmuon;
        this.thoiGianMuonSach = thoiGianMuonSach;
        this.thoiGianTraSach = thoiGianTraSach;
    } 

    public SachDangDuocMuon(String maSach, String tenSach, String tacGia, String theLoai, int soLuong, String NXB) {
        super(maSach, tenSach, tacGia, theLoai, soLuong, NXB);
    }

    public SachDangDuocMuon() {
    }

    public String getMaSVmuon() {
        return maSVmuon;
    }

    public void setMaSVmuon(String maSVmuon) {
        this.maSVmuon = maSVmuon;
    }

    public String getThoiGianMuonSach() {
        return thoiGianMuonSach;
    }

    public String getThoiGianTraSach() {
        return thoiGianTraSach;
    }

    public void setThoiGianMuonSach(String thoiGianMuonSach) {
        this.thoiGianMuonSach = thoiGianMuonSach;
    }

    public void setThoiGianTraSach(String thoiGianTraSach) {
        this.thoiGianTraSach = thoiGianTraSach;
    }

    @Override
    public String toString() {
        return "SachDangDuocMuon{" + " maSVmuon = " + maSVmuon + ", thoiGianMuonSach = " + thoiGianMuonSach + ", thoiGianTraSach = " + thoiGianTraSach + '}';
    }

    
    
    

}
