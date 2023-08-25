/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.actvn.java06.mavenproject1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Admin
 */
public class SachDangDuocMuon extends Sach {

    private String maSVmuon;
    private LocalDate thoiGianMuonSach;
    private LocalDate thoiGianTraSach;
    private int maMuon;//K co ma muon khi loc sach qua han se bi loc nhieu lan dan den hien sai kqua.

    public SachDangDuocMuon(String maSVmuon, LocalDate thoiGianMuonSach, LocalDate thoiGianTraSach, String maSach, String tenSach, String tacGia, String theLoai, int soLuong, String NXB) {
        super(maSach, tenSach, tacGia, theLoai, 1, NXB);
        this.maSVmuon = maSVmuon;
        this.thoiGianMuonSach = thoiGianMuonSach;
        this.thoiGianTraSach = thoiGianTraSach;
    }

    public void setMaMuon(int maMuon) {
        this.maMuon = maMuon;
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

    public LocalDate getThoiGianMuonSach() {
        return thoiGianMuonSach;
    }

    public LocalDate getThoiGianTraSach() {
        return thoiGianTraSach;
    }

    public void setThoiGianMuonSach(LocalDate thoiGianMuonSach) {
        this.thoiGianMuonSach = thoiGianMuonSach;
    }

    public void setThoiGianTraSach(LocalDate thoiGianTraSach) {
        this.thoiGianTraSach = thoiGianTraSach;
    }

    public int getMaMuon() {
        return maMuon;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String thoigian1Formatted = thoiGianMuonSach.format(formatter);
        String thoigian2Formatted = thoiGianTraSach.format(formatter);

        String t = String.format("Ma SV muon: " + maSVmuon + "Ma sach muon: " + getMaSach() + " Thoi gian muon sach: " + thoigian1Formatted + ", Thoi gian tra sach: " + thoigian2Formatted);
        return t;
    }
}
