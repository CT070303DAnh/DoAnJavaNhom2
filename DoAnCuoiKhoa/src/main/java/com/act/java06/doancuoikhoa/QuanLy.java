/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.act.java06.doancuoikhoa;

import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class QuanLy{
     private List<Sach> danhSachSach;
    private List<LocalDate> danhSachNgayMuon;
    private List<LocalDate> danhSachNgayTra;

    public QuanLy() {
        this.danhSachSach = new ArrayList<>();
        this.danhSachNgayMuon = new ArrayList<>();
        this.danhSachNgayTra = new ArrayList<>();
    }

    public void themSach(String maSach,String tenSach, String tacGia, int soLuong, String theLoai,String nxb) {
        Sach sach = new Sach(maSach,tenSach, tacGia, soLuong, theLoai,nxb);
        danhSachSach.add(sach);
    }

    public void suaSach(String maSach,String tenSach, String tacGia, int soLuong, String theLoai,String nxb) {
        for (Sach sach : danhSachSach) {
            if (sach.getTenSach().equals(tenSach)) {
                sach.setMaSach(maSach);
                sach.setTacGia(tacGia);
                sach.setSoLuong(soLuong);
                sach.setTheLoai(theLoai);
                sach.setNxb(nxb);
                break;
            }
        }
    }

    public void xoaSach(String tenSach) {
        for (Sach sach : danhSachSach) {
            if (sach.getTenSach().equals(tenSach)) {
                danhSachSach.remove(sach);
                break;
            }
        }
    }

    public void muonSach(String tenSach, String maSinhVien) {
        for (Sach sach : danhSachSach) {
            if (sach.getTenSach().equals(tenSach)) {
                sach.muonSach(maSinhVien);

                break;
            }
        }
    }

    public void tongSach() {
        
        System.out.println("Số lượng sách khác nhau là : " + danhSachSach.size());

    }
    
    
    

    public void traSach(String tenSach, String maSinhVien) {
        for (Sach sach : danhSachSach) {
            if (sach.getTenSach().equals(tenSach)) {
                sach.traSach(maSinhVien);
                break;
            }
        }
    }

    public void inDanhSachSach() {
        for (Sach sach : danhSachSach) {
            
            System.out.println("Mã sách: "+ sach.getMaSach());
            
            System.out.println("Tên sách: " + sach.getTenSach());
            System.out.println("Tác giả: " + sach.getTacGia());

            System.out.println("Số lượng: " + sach.getSoLuong());
            System.out.println("Thể loại: " + sach.getTheLoai());

            System.out.println("NXB : "+ sach.getNxb());
            
            System.out.println("----------------------");
            
        }

    }

    public void inDanhSachSachMuon() {
        List<Sach> sachDangMuon = new ArrayList<>();
        int sum = 0;
        for (Sach sach : danhSachSach) {
            if (sach.getDanhSachSinhVienMuon().size() > 0) {
                sachDangMuon.add(sach);
                sum++;
            }
            
        }
       
        danhSachNgayMuon.add(LocalDate.now());
        danhSachNgayTra.add(LocalDate.now().plusMonths(3));
        int index = danhSachNgayMuon.size() - 1;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String ngayMuon = danhSachNgayMuon.get(index).format(formatter);
        String ngayTra = danhSachNgayTra.get(index).format(formatter);
        System.out.println("Danh sách sách đang được mượn:");
        for (Sach sach : sachDangMuon) {
            System.out.println("Mã sách: "+sach.getMaSach());
            System.out.println("Tên sách: " + sach.getTenSach());
            System.out.println("Tác giả: " + sach.getTacGia());

            System.out.println("Số lượng sách đang mượn: " + sum);
            System.out.println("Thể loại: " + sach.getTheLoai());

            System.out.println("NXB: "+ sach.getNxb());
            List<String> danhSachSinhVienMuon = sach.getDanhSachSinhVienMuon();
            System.out.println("Danh sách sinh viên mượn:");
            for (String maSinhVien : danhSachSinhVienMuon) {
                System.out.println("Mã sinh viên: " + maSinhVien);
                System.out.println("Ngày mượn :" + ngayMuon);
                System.out.println("Ngày mượn :" + ngayTra);

            }

            System.out.println("-------------------------");
        }
    }
}

