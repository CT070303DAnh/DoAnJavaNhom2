/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.actvn.java06.mavenproject1;

/**
 *
 * @author Admin
 */
public class Sach implements Comparable<Sach> {

    private String maSach;
    private String tenSach;
    private String tacGia;
    private String theLoai;
    private int soLuong;
    private String NXB;

    public Sach(String maSach, String tenSach, String tacGia, String theLoai, int soLuong, String NXB) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.theLoai = theLoai;
        this.soLuong = soLuong;
        this.NXB = NXB;
    }

    public String getMaSach() {
        return maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public String getNXB() {
        return NXB;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setNXB(String NXB) {
        this.NXB = NXB;
    }

    public Sach() {
    }

    @Override
    public String toString() {
        String t = String.format("Ma sach: " + maSach + ", Ten Sach: " + tenSach + ", Tac gia:  " + tacGia + ", The loai:  " + theLoai + ", So luong: " + soLuong + ", NXB: " + NXB);
        return t;
    }

    @Override
    public int compareTo(Sach o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

    }
}
