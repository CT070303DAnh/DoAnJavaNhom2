/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.actvn.java06.mavenproject1;

import java.util.Calendar;

/**
 *
 * @author Admin
 */
public class SachDangDuocMuon extends Sach {

    private String maSVmuon;
    private Calendar thoiGianMuonSach;
    private Calendar thoiGianTraSach;

    public SachDangDuocMuon(String maSVmuon, Calendar thoiGianMuonSach, Calendar thoiGianTraSach, String maSach, String tenSach, String tacGia, String theLoai, int soLuong, String NXB) {
        super(maSach, tenSach, tacGia, theLoai, 1, NXB);
        this.maSVmuon = maSVmuon;
        this.thoiGianMuonSach = thoiGianMuonSach;
        this.thoiGianTraSach = thoiGianTraSach;
    }

    public SachDangDuocMuon(String maSVmuon, Calendar thoiGianMuonSach, Calendar thoiGianTraSach) {
        this.maSVmuon = maSVmuon;
        this.thoiGianMuonSach = thoiGianMuonSach;
        this.thoiGianTraSach = thoiGianTraSach;
    }

    public SachDangDuocMuon(String maSach, String tenSach, String tacGia, String theLoai, int soLuong, String NXB) {
        super(maSach, tenSach, tacGia, theLoai, 1, NXB);
    }

    public SachDangDuocMuon() {
    }

    public String getMaSVmuon() {
        return maSVmuon;
    }

    public void setMaSVmuon(String maSVmuon) {
        this.maSVmuon = maSVmuon;
    }

    public Calendar getThoiGianMuonSach() {
        return thoiGianMuonSach;
    }

    public Calendar getThoiGianTraSach() {
        return thoiGianTraSach;
    }

    public void setThoiGianMuonSach(Calendar thoiGianMuonSach) {
        this.thoiGianMuonSach = thoiGianMuonSach;
    }

    public void setThoiGianTraSach(Calendar thoiGianTraSach) {
        this.thoiGianTraSach = thoiGianTraSach;
    }

    @Override
    public String toString() {
        String t = String.format("Ma SV muon: " + maSVmuon + ", Thoi gian muon sach: " + thoiGianMuonSach.getTime() + ", Thoi gian tra sach: " + thoiGianTraSach.getTime());
        return t;
    }
}
