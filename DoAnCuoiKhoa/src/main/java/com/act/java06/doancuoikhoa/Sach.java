/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.act.java06.doancuoikhoa;

import java.util.List;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class Sach {
    private String maSach;
    private String tenSach;
    private String tacGia;
    private int soLuong;
    private String theLoai;
    private String nxb;
    private List<String> danhSachSinhVienMuon;

    public Sach(String maSach,String tenSach, String tacGia, int soLuong, String theLoai,String nxb) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.soLuong = soLuong;
        this.theLoai = theLoai;
        this.nxb = nxb;
        this.danhSachSinhVienMuon = new ArrayList<>();
    }

    public String getTenSach() {
        return tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public String getMaSach() {
        return maSach;
    }

    public String getNxb() {
        return nxb;
    }

    public List<String> getDanhSachSinhVienMuon() {
        return danhSachSinhVienMuon;
    }

    public void muonSach(String maSinhVien) {
        if (soLuong > 0) {
            danhSachSinhVienMuon.add(maSinhVien);
            soLuong--;
        } else {
            System.out.println("Số lượng sách không đủ!");
        }
    }

    public void traSach(String maSinhVien) {
        danhSachSinhVienMuon.remove(maSinhVien);
        soLuong++;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public void setNxb(String nxb) {
        this.nxb = nxb;
    }

    public void setDanhSachSinhVienMuon(List<String> danhSachSinhVienMuon) {
        this.danhSachSinhVienMuon = danhSachSinhVienMuon;
    }

    public static List<Sach> getDanhSachSach(List<Sach> danhSachSach) {
        return danhSachSach;
    }
}

