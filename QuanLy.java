/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.actvn.java06.mavenproject1;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Admin
 */
public class QuanLy extends Sach {

    Scanner sc = new Scanner(System.in);
    //

    //
    private LinkedList<Sach> khoSach = new LinkedList<>();
    private LinkedList<Sach> danhSachSach = new LinkedList<>();
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

    public LinkedList<Sach> getDanhSachSach() {
        return danhSachSach;
    }

    public void setDanhSachSach(LinkedList<Sach> danhSachSach) {
        this.danhSachSach = danhSachSach;
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
    public <E> void showKhoSach(LinkedList<E> list) {
        Collections.sort(khoSach, new Comparator<Sach>() {
            @Override
            public int compare(Sach o1, Sach o2) {
                return o1.getTenSach().compareTo(o2.getTenSach());
            }
        });
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

        khoSach.add(sach);
        danhSachSach.add(sach);

        for (int i = 0; i < soLuong; i++) {
            Sach s = new Sach(maSach, tenSach, tacGia, theLoai, 1, NXB);
            sachChuaAiMuon.add(s);
        }
    }

    public void xoaSach() {
        System.out.println("Nhap ma sach muon xoa");
        String maSachMuonXoa = sc.nextLine();

        //Xoa khoi list
        if (timSTTtheomaSach(khoSach, maSachMuonXoa) == -1) {
            System.out.println("Khong tim thay sach muon xoa trong kho");
        } else {
            khoSach.remove(timSTTtheomaSach(khoSach, maSachMuonXoa));
            danhSachSach.remove(timSTTtheomaSach(danhSachSach, maSachMuonXoa));

            for (int i = 0; i < sachChuaAiMuon.size(); i++) {
                if (maSachMuonXoa.equals(sachChuaAiMuon.get(i).getMaSach())) {
                    sachChuaAiMuon.remove(i);
                    i--;
                }
            }
        }
    }

    public void suaSach() {
        System.out.println("Nhap ma sach muon sua");
        String maSachMuonSua = sc.nextLine();

        if (timSTTtheomaSach(khoSach, maSachMuonSua) == -1) {
            System.out.println("Khong tim thay sach muon sua trong kho");
        } else {
            System.out.println("Du lieu sach truoc khi sua: ");
            System.out.println("");
            System.out.println(khoSach.get(timSTTtheomaSach(khoSach, maSachMuonSua)));
            System.out.println("");

            int index = timSTTtheomaSach(khoSach, maSachMuonSua);

            System.out.println("Nhap ten sach sau: ");
            String tenSach = sc.nextLine();
            khoSach.get(index).setTenSach(tenSach);
            danhSachSach.get(index).setTenSach(tenSach);

            System.out.print("Nhap tac gia sau: \n");
            String tacGia = sc.nextLine();
            khoSach.get(index).setTacGia(tacGia);
            danhSachSach.get(index).setTacGia(tacGia);

            System.out.print("Nhap the loai sau: \n");
            String theLoai = sc.nextLine();
            khoSach.get(index).setTheLoai(theLoai);
            danhSachSach.get(index).setTacGia(tacGia);

            System.out.print("Nhap so luong sau: \n");
            int soLuong = sc.nextInt();
            sc.nextLine();
            khoSach.get(index).setSoLuong(soLuong);
            danhSachSach.get(index).setTacGia(tacGia);

            System.out.print("Nhap NXB sau: \n");
            String NXB = sc.nextLine();
            khoSach.get(index).setNXB(NXB);
            danhSachSach.get(index).setTacGia(tacGia);

            for (int i = 0; i < sachChuaAiMuon.size(); i++) {
                if (sachChuaAiMuon.get(i).getMaSach().equals(maSachMuonSua)) {
                    sachChuaAiMuon.get(i).setTenSach(tenSach);
                    sachChuaAiMuon.get(i).setTacGia(tacGia);
                    sachChuaAiMuon.get(i).setTheLoai(theLoai);
                    sachChuaAiMuon.get(i).setSoLuong(1);
                    sachChuaAiMuon.get(i).setNXB(NXB);
                }
            }
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
                int index = timSTTtheomaSach(sachChuaAiMuon, maSachChoMuon);
                if (index == -1) {
                    System.out.println("Sach da duoc muon het hoac khong ton tai!");
                } else {
                    //set thoi gian muon/tra
                    LocalDate now = LocalDate.now();
                    System.out.println("");
                    System.out.println("Ban muon thoi gian muon sach la bay gio (Y or N)?");
                    String lc;
                    do {
                        lc = sc.nextLine();
                    } while (!"Y".equals(lc) && !"N".equals(lc));

                    SachDangDuocMuon sddm = new SachDangDuocMuon();
                    sddm.setMaSVmuon(maSV);
                    sddm.setMaSach(maSachChoMuon);
                    sddm.setSoLuong(1);

                    if ("Y".equals(lc)) {
                        sddm.setThoiGianMuonSach(now);
                        sddm.setThoiGianTraSach(now.plusMonths(3));
                        sachDangDuocMuon.add(sddm);
                        //cap nhat
                        int index2 = timSTTtheomaSach(sachChuaAiMuon, maSachChoMuon);
                        sachChuaAiMuon.remove(index2);

                        int index3 = timSTTtheomaSach(danhSachSach, maSachChoMuon);
                        danhSachSach.get(index3).setSoLuong(danhSachSach.get(index3).getSoLuong() - 1);
                    } else if ("N".equals(lc)) {
                        System.out.println("Nhap ngay muon: ");
                        int day = sc.nextInt();
                        System.out.println("Thang: ");
                        int month = sc.nextInt();
                        System.out.println("Nam: ");
                        int year = sc.nextInt();
                        LocalDate tgian = LocalDate.of(year, month, day);
                        sddm.setThoiGianMuonSach(tgian);
                        sddm.setThoiGianTraSach(tgian.plusMonths(3));

                        sachDangDuocMuon.add(sddm);
                        //cap nhat
                        int index2 = timSTTtheomaSach(sachChuaAiMuon, maSachChoMuon);
                        sachChuaAiMuon.remove(index2);

                        int index3 = timSTTtheomaSach(danhSachSach, maSachChoMuon);
                        danhSachSach.get(index3).setSoLuong(danhSachSach.get(index3).getSoLuong() - 1);
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
                    Sach sachx = new Sach(sachDangDuocMuon.get(i).getMaSach(), sachDangDuocMuon.get(i).getTenSach(), sachDangDuocMuon.get(i).getTacGia(), sachDangDuocMuon.get(i).getTheLoai(), 1, sachDangDuocMuon.get(i).getNXB());
                    sachChuaAiMuon.add(sachx);
                    sachDangDuocMuon.remove(i);

                    int index3 = timSTTtheomaSach(danhSachSach, ms);
                    danhSachSach.get(index3).setSoLuong(danhSachSach.get(index3).getSoLuong() + 1);
                }
            }
        }
    }

    //Loc sach qua han tra 
    public int kiemtraMaMuon(int maMuon) {
        int k = -1;
        for (int i = 0; i < sachQuaHanTra.size(); i++) {
            if (maMuon == sachQuaHanTra.get(i).getMaMuon()) {
                k++;
            }
        }
        return k;
    }

    public void locSachQuaHanTra() {
        for (int i = 0; i < sachDangDuocMuon.size(); i++) {
            sachDangDuocMuon.get(i).setMaMuon(i);
        }
        LocalDate now = LocalDate.now();
        for (int i = 0; i < sachDangDuocMuon.size(); i++) {
            if (now.isAfter(sachDangDuocMuon.get(i).getThoiGianTraSach()) && kiemtraMaMuon(sachDangDuocMuon.get(i).getMaMuon()) == -1) {
                sachQuaHanTra.add(sachDangDuocMuon.get(i));
            }
        }
    }

    public void showSachQuaHan() {
        Collections.sort(sachQuaHanTra, new Comparator<SachDangDuocMuon>() {
            @Override
            public int compare(SachDangDuocMuon o1, SachDangDuocMuon o2) {
                return o1.getTenSach().compareTo(o2.getTenSach());
            }
        });
        System.out.println("=======================");
        for (int i = 0; i < sachQuaHanTra.size(); i++) {
            System.out.println(sachQuaHanTra.get(i).toString());
        }
    }

    //Hien sach chua ai muon
    //Loc sach NXB
    public void locSachNXB() {
        System.out.println("Nhap NXB muon loc: ");
        Collections.sort(khoSach, new Comparator<Sach>() {
            @Override
            public int compare(Sach o1, Sach o2) {
                return o1.getTenSach().compareTo(o2.getTenSach());
            }
        });
        String NXB = sc.nextLine();
        for (int i = 0; i < khoSach.size(); i++) {
            if (NXB.equals(khoSach.get(i).getNXB())) {
                System.out.println(khoSach.get(i).toString());
            }
        }
    }

    //Loc 10 dau sach con lai it nhat
    public void loc10SachConLaiItNhat() {
        Collections.sort(danhSachSach, new Comparator<Sach>() {
            @Override
            public int compare(Sach o1, Sach o2) {
                return o1.getSoLuong() > o2.getSoLuong() ? 1 : -1;
            }
        });
        if (danhSachSach.size() < 10) {
            showKhoSach(danhSachSach);
        } else {
            for (int i = 0; i < 10; i++) {
                System.out.println(danhSachSach.get(i).toString());
            }
        }
    }

    //Loc nhung sinh vien da muon voi 1 dau sach cu the
    public void locNhungSVDaMuonVoi1DauSachCuThe() {
        System.out.println("Nhap ma sach muon kiem tra: ");
        Collections.sort(sachDangDuocMuon, new Comparator<SachDangDuocMuon>() {
            @Override
            public int compare(SachDangDuocMuon o1, SachDangDuocMuon o2) {
                return o1.getTenSach().compareTo(o2.getTenSach());
            }
        });
        String ms = sc.nextLine();
        for (int i = 0; i < sachDangDuocMuon.size(); i++) {
            if (ms.equals(sachDangDuocMuon.get(i).getMaSach())) {
                System.out.println(sachDangDuocMuon.get(i).getMaSVmuon());
            }
        }
    }

    //Loc danh sach nhung dau sach da muon vao 1 ngay cu the
    public void locNhungDauSachDaMuonVao1NgayCuThe() {
        System.out.println("Nhap ngay muon kiem tra");
        System.out.println("Ngay: ");
        int ngay = sc.nextInt();
        System.out.println("Thang: ");
        int thang = sc.nextInt();
        System.out.println("Nam: ");
        int nam = sc.nextInt();
        LocalDate tgian = LocalDate.of(nam, thang, ngay);
        Collections.sort(sachDangDuocMuon, new Comparator<SachDangDuocMuon>() {
            @Override
            public int compare(SachDangDuocMuon o1, SachDangDuocMuon o2) {
                return o1.getTenSach().compareTo(o2.getTenSach());
            }
        });
        for (int i = 0; i < sachDangDuocMuon.size(); i++) {
            if (tgian.isEqual(sachDangDuocMuon.get(i).getThoiGianMuonSach())) {
                System.out.println(sachDangDuocMuon.get(i).toString());
            }
        }
    }
}
