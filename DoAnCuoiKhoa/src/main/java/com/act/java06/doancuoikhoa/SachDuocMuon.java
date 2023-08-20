/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.act.java06.doancuoikhoa;

import java.time.LocalDate;

/**
 *
 * @author ADMIN
 */
public class SachDuocMuon {
     private String maSinhVien;
    private LocalDate ngayMuon;
    private LocalDate ngayTra;

    public SachDuocMuon(String maSinhVien) {
        this.maSinhVien = maSinhVien;
        this.ngayMuon = LocalDate.now();
        this.ngayTra = ngayMuon.plusMonths(3);
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public LocalDate getNgayMuon() {
        return ngayMuon;
    }

    public LocalDate getNgayTra() {
        return ngayTra;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public void setNgayMuon(LocalDate ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public void setNgayTra(LocalDate ngayTra) {
        this.ngayTra = ngayTra;
    }
}

