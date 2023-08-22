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

    //
    private LinkedList<Sach> khoSach = new LinkedList<>();
    private LinkedList<Sach> sachChuaAiMuon = new LinkedList<>();
    private LinkedList<SachDangDuocMuon> sachQuaHanTra = new LinkedList<>();
    private LinkedList<SachDangDuocMuon> sachDangDuocMuon = new LinkedList<>();
    //

    //Cac ham khoi tao
    public QuanLy(String maSach, String tenSach, String tacGia, String theLoai, int soLuong, String NXB) {
        super(maSach, tenSach, tacGia, theLoai, soLuong, NXB);
    }
    
    public QuanLy() {
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
    
    public void setKhoSach(LinkedList<Sach> khoSach) {
        this.khoSach = khoSach;
    }
    
    public void setSachQuaHanTra(LinkedList<SachDangDuocMuon> sachQuaHanTra) {
        this.sachQuaHanTra = sachQuaHanTra;
    }
    
    public void setSachDangDuocMuon(LinkedList<SachDangDuocMuon> sachDangDuocMuon) {
        this.sachDangDuocMuon = sachDangDuocMuon;
    }
    
    public LinkedList<Sach> getSachChuaAiMuon() {
        return sachChuaAiMuon;
    }
    
    public void setSachChuaAiMuon(LinkedList<Sach> sachChuaAiMuon) {
        this.sachChuaAiMuon = sachChuaAiMuon;
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
    
    public int timSTTtheomaSachDangDuocMuon(LinkedList<SachDangDuocMuon> list, String maSach) {
        for (int i = 0; i < list.size(); i++) {
            if (maSach.equals(list.get(i).getMaSach()) == true) {
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

    //
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
        for (int i = 0; i < soLuong; i++) {
            sach.setSoLuong(1);
            this.sachChuaAiMuon.add(sach);
        }
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
            this.sachChuaAiMuon.remove(timSTTtheomaSach(sachChuaAiMuon, maSachMuonXoa));
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
            this.sachChuaAiMuon.set(timSTTtheomaSach(khoSach, maSachMuonSua), sachmuonsua);
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
                    System.out.println("Sach da duoc muon het hoac khong ton tai!");
                } else {
                    //set thoi gian muon/tra
                    Calendar now = Calendar.getInstance();
                    System.out.println("");
                    System.out.println("Ban muon thoi gian muon sach la bay gio (Y or N)?");
                    String lc;
                    do {
                        lc = sc.nextLine();
                    } while (!"Y".equals(lc) && !"N".equals(lc));
                    
                    SachDangDuocMuon sddm = new SachDangDuocMuon();
                    sddm.setMaSVmuon(maSV);
                    sddm.setMaSach(maSachChoMuon);
                    if ("Y".equals(lc)) {
                        sddm.setThoiGianMuonSach(now);
                        now.add(Calendar.MONTH, 3);
                        sddm.setThoiGianTraSach(now);
                        sachDangDuocMuon.add(sddm);
                        //cap nhat
                        int index2 = timSTTtheomaSach(sachChuaAiMuon, maSachChoMuon);
                        sachChuaAiMuon.remove(index2);
                    } else if ("N".equals(lc)) {
                        System.out.println("Nhap ngay muon: ");
                        int day = sc.nextInt();
                        System.out.println("Thang: ");
                        int month = sc.nextInt();
                        System.out.println("Nam: ");
                        int year = sc.nextInt();
                        Calendar ngayMuon = Calendar.getInstance();
                        ngayMuon.set(year, month + 1, day);
                        sddm.setThoiGianMuonSach(ngayMuon);
                        Calendar ngayTra = Calendar.getInstance();
                        ngayTra.set(year, month + 4, day);
                        sddm.setThoiGianTraSach(ngayTra);
                        
                        sachDangDuocMuon.add(sddm);
                        //cap nhat
                        int index2 = timSTTtheomaSach(sachChuaAiMuon, maSachChoMuon);
                        sachChuaAiMuon.remove(index2);
                    }
                }
            }
        }
    }

    //trasach
    public void taoPhienTraSach() {
        System.out.println("Nhap ma sach muon tra: ");
        String ms = sc.nextLine();
        //Kiem tra xem sach nay co dang duoc muon khong
        if (timSTTtheomaSachDangDuocMuon(sachDangDuocMuon, ms) == -1) {
            System.out.println("Sach nay chua duoc ai muon hoac khong ton tai.");
        } else {
            System.out.println("");
            System.out.println("Danh sach sinh vien dang muon sach nay");
            
            System.out.println(sachDangDuocMuon.get(timSTTtheomaSachDangDuocMuon(sachDangDuocMuon, ms)).getMaSVmuon());
            
            System.out.println("");
            System.out.println("Nhap ma SV muon sach: ");
            String sv = sc.nextLine();
            
            for (int i = 0; i < sachDangDuocMuon.size(); i++) {
                if (sachDangDuocMuon.get(i).getMaSVmuon().equals(sv) == true) {
                    sachDangDuocMuon.remove(i);
                    Sach sachx = new Sach(sachDangDuocMuon.get(i).getMaSach(), sachDangDuocMuon.get(i).getTacGia(), sachDangDuocMuon.get(i).getTacGia(), sachDangDuocMuon.get(i).getTheLoai(), 1, sachDangDuocMuon.get(i).getNXB());
                    sachChuaAiMuon.add(sachx);
                }
            }
        }
    }

    //Loc sach qua han tra 
    public void locSachQuaHanTra(List<SachDangDuocMuon> list) throws ParseException {
        Calendar now = Calendar.getInstance();
        for (int i = 0; i < sachDangDuocMuon.size(); i++) {
            if (now.compareTo(sachDangDuocMuon.get(i).getThoiGianMuonSach()) > 0) {
                System.out.println(sachQuaHanTra.add(list.get(i)));
            }
        }
    }

    //Loc sach NXB
    public void locSachNXB() {
        System.out.println("Nhap NXB muon loc: ");
        String NXB = sc.nextLine();
        for (int i = 0; i < khoSach.size(); i++) {
            if (NXB == null ? khoSach.get(i).getNXB() == null : NXB.equals(khoSach.get(i).getNXB())) {
                System.out.println(khoSach.get(i).toString());
            }
        }
    }

    //Loc 10 dau sach con lai it nhat
    public void locSachConLaiItNhat() {
        
    }

    //Loc nhung sinh vien da muon voi 1 dau sach cu the
    public void locNhungSVDaMuonVoi1DauSachCuThe() {
        System.out.println("Nhap ma sach muon kiem tra: ");
        String ms = sc.nextLine();
        for (int i = 0; i < sachDangDuocMuon.size(); i++) {
            if (ms == null ? sachDangDuocMuon.get(i).getMaSach() == null : ms.equals(sachDangDuocMuon.get(i).getMaSach())) {
                System.out.println(sachDangDuocMuon.get(i).getMaSVmuon());
            }
        }
    }

    //Loc danh sach nhung dau sach da muon vao 1 ngay cu the
    public void locNhungDauSachDaMuonVao1NgayCuThe() {
        System.out.println("Nhap ngay muon kiem tra");
        System.out.print("Ngay: ");
        int ngay = sc.nextInt();
        System.out.println("Thang: ");
        int thang = sc.nextInt();
        System.out.println("Nam: ");
        int nam = sc.nextInt();
        
    }
    
}
