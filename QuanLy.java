/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.actvn.java06.mavenproject1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class QuanLy extends Sach {

    Scanner sc = new Scanner(System.in);
    //
    private int sachTrongKho;
    private int sachConLaiTrongKho;
    //

    //
    private LinkedList<Sach> khoSach = new LinkedList<>();
    private LinkedList<SachDangDuocMuon> sachQuaHanTra = new LinkedList<>();
    private LinkedList<SachDangDuocMuon> sachDangDuocMuon = new LinkedList<>();
    //

    //Cac ham khoi tao
    public QuanLy(int sachTrongKho, int sachConLaiTrongKho, String maSach, String tenSach, String tacGia, String theLoai, int soLuong, String NXB) {
        super(maSach, tenSach, tacGia, theLoai, soLuong, NXB);
        this.sachTrongKho = sachTrongKho;
        this.sachConLaiTrongKho = sachConLaiTrongKho;
    }

    public QuanLy(int sachTrongKho, int sachConLaiTrongKho) {
        this.sachTrongKho = sachTrongKho;
        this.sachConLaiTrongKho = sachConLaiTrongKho;
    }

    public QuanLy() {
    }

    public int getSachTrongKho() {
        return sachTrongKho;
    }

    public int getSachConLaiTrongKho() {
        return sachConLaiTrongKho;
    }

    public LinkedList<Sach> getKhoSach() {
        return khoSach;
    }

    public LinkedList<SachDangDuocMuon> getSachQuaHanTra() {
        return sachQuaHanTra;
    }

    public LinkedList<SachDangDuocMuon> getSachDangDuocMuon() {
        return sachDangDuocMuon;
    }

    public void setSachTrongKho(int sachTrongKho) {
        this.sachTrongKho = sachTrongKho;
    }

    public void setSachConLaiTrongKho(int sachConLaiTrongKho) {
        this.sachConLaiTrongKho = sachConLaiTrongKho;
    }

    public void setKhoSach(LinkedList<Sach> khoSach) {
        this.khoSach = khoSach;
    }

    public void setSachQuaHanTra(LinkedList<SachDangDuocMuon> sachQuaHanTra) {
        this.sachQuaHanTra = sachQuaHanTra;
    }

    public void setSachDangDuocMuon(LinkedList<SachDangDuocMuon> sachDangDuocMuon) {
        this.sachDangDuocMuon = sachDangDuocMuon;
    }

    //show
    public void showKhoSach(List list) {
        System.out.println("=======================");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("");
            System.out.println(list.get(i).toString());
            System.out.println("_______________________");
        }
    }

    //Ham tim kiem
    public int timSTTtheomaSach(LinkedList<Sach> list, String maSach) {
        for (int i = 0; i < list.size(); i++) {
            if (maSach == null ? list.get(i).getMaSach() == null : maSach.equals(list.get(i).getMaSach())) {
                return i;
            }
        }
        return -1;
    }

    //Tinh tong sach trong kho
    public int tongSoSachTrongKho(LinkedList<Sach> list) {
        int k = 0;
        for (int i = 0; i < list.size(); i++) {
            k = k + list.get(i).getSoLuong();
        }
        return k;
    }

    //Ghi de cac phuong thuc so sanh
    //
    //Thao tac voi kho sach Them, xoa,sua
    public void themSach() {
        Sach sach = new Sach();
        //Nhap du lieu

        System.out.println("Nhap ma sach");
        String maSach;
        do {
            maSach = sc.nextLine();
            if (timSTTtheomaSach(khoSach, maSach) != -1) {
                System.out.println("Ma sach da ton tai, vui long nhap lai ma sach");
            }
        } while (timSTTtheomaSach(khoSach, maSach) != -1);
        sach.setMaSach(maSach);

        System.out.println("Nhap ten sach");
        String tenSach = sc.nextLine();
        sach.setTenSach(tenSach);

        System.out.print("Nhap tac gia: \n");
        String tacGia = sc.nextLine();
        sach.setTacGia(tacGia);

        System.out.print("Nhap the loai: \n");
        String theLoai = sc.nextLine();
        sach.setTheLoai(theLoai);

        System.out.print("Nhap so luong: \n");
        int soLuong = sc.nextInt();
        sc.nextLine();
        sach.setSoLuong(soLuong);

        System.out.print("Nhap NXB: \n");
        String NXB = sc.nextLine();
        sach.setNXB(NXB);
        //Them vao list
        this.khoSach.add(sach);
        //Cap nhat kho
        this.sachTrongKho = khoSach.size();
        this.sachConLaiTrongKho = khoSach.size();
    }

    public void xoaSach() {
        Sach sachmuonxoa = new Sach();
        System.out.println("Nhap ma sach muon xoa");
        String maSachMuonXoa = sc.nextLine();
        sachmuonxoa.setMaSach(maSachMuonXoa);

        //Xoa khoi list
        if (timSTTtheomaSach(khoSach, maSachMuonXoa) == -1) {
            System.out.println("Khong tim thay sach muon xoa trong kho");
        } else {
            this.khoSach.remove(timSTTtheomaSach(khoSach, maSachMuonXoa));
            //Cap nhat kho
            this.sachTrongKho = khoSach.size();
            this.sachConLaiTrongKho = khoSach.size();
        }
    }

    public void suaSach() {
        Sach sachmuonsua = new Sach();
        System.out.println("Nhap ma sach muon sua");
        String maSachMuonSua = sc.nextLine();
        sachmuonsua.setMaSach(maSachMuonSua);

        if (timSTTtheomaSach(khoSach, maSachMuonSua) == -1) {
            System.out.println("Khong tim thay sach muon sua trong kho");
        } else {
            System.out.println("Du lieu sach truoc khi sua: ");
            System.out.println("");
            System.out.println(khoSach.get(timSTTtheomaSach(khoSach, maSachMuonSua)));
            System.out.println("");

            System.out.println("Nhap ten sach sau: ");
            String tenSach = sc.nextLine();
            sachmuonsua.setTenSach(tenSach);

            System.out.print("Nhap tac gia sau: \n");
            String tacGia = sc.nextLine();
            sachmuonsua.setTacGia(tacGia);

            System.out.print("Nhap the loai sau: \n");
            String theLoai = sc.nextLine();
            sachmuonsua.setTheLoai(theLoai);

            System.out.print("Nhap so luong sau: \n");
            int soLuong = sc.nextInt();
            sc.nextLine();
            sachmuonsua.setSoLuong(soLuong);

            System.out.print("Nhap NXB sau: \n");
            String NXB = sc.nextLine();
            sachmuonsua.setNXB(NXB);

            this.khoSach.set(timSTTtheomaSach(khoSach, maSachMuonSua), sachmuonsua);
        }
    }

//Tao phien muon sach
    public void taoPhienMuonSach() {

        System.out.println("Nhap maSV muon sach: ");
        String maSV = sc.nextLine();
        System.out.println("Nhap so luong sach muon: ");
        int soluong = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < soluong; i++) {
            System.out.println("Nhap ma sach cho muon: ");
            String maSachChoMuon = sc.nextLine();
            if (timSTTtheomaSach(khoSach, maSachChoMuon) == -1) {
                System.out.println("Khong tim thay sach");
            } else {
                int index = timSTTtheomaSach(khoSach, maSachChoMuon);
                if (khoSach.get(index).getSoLuong() == 0) {
                    System.out.println("Sach da duoc muon het");
                } else {
                    sachConLaiTrongKho = sachConLaiTrongKho - 1;

                    //set thoi gian muon/tra
                    Calendar now = Calendar.getInstance();
                    SimpleDateFormat kieuNgayGui = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                    SimpleDateFormat kieuNgayTra = new SimpleDateFormat("dd/MM/yyyy");
                    String thoigianmuonsach = kieuNgayGui.format(now.getTime());
                    now.add(Calendar.MONTH, 3);
                    String thoigiantrasach = kieuNgayTra.format(now.getTime());
                    //
                    SachDangDuocMuon sddm = new SachDangDuocMuon(maSV, thoigianmuonsach, thoigiantrasach, khoSach.get(index).getMaSach(), khoSach.get(index).getTenSach(), khoSach.get(index).getTacGia(), khoSach.get(index).getTheLoai(), 1, khoSach.get(index).getNXB());
                    sachDangDuocMuon.add(sddm);
                }
            }
        }
    }

    //Loc sach qua han tra 
    public void locSachQuaHanTra(List<SachDangDuocMuon> list) throws ParseException {
        for (int i = 0; i < sachDangDuocMuon.size(); i++) {
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(list.get(i).getThoiGianTraSach());
            Date now = new Date();
            if (now.compareTo(date) < 0) {
                sachQuaHanTra.add(list.get(i));
            }
        }
    }
}
