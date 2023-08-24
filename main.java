/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.actvn.java06.mavenproject1;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class main extends QuanLy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLy ql = new QuanLy();
        Date now = new Date();

        //CHU Y FIX SACH CHUA AI MUON
        int a;
        do {
            ql.locSachQuaHanTra();

            System.out.println("==========================");
            System.out.println("==========================");
            System.out.printf("\tMENU\n");
            System.out.println("==" + now + "==");
            System.out.println("");
            System.out.println("SO LUONG SACH DANG SO HUU(TONG) :" + ql.tongSoSachTrongKho(ql.getKhoSach()));
            System.out.println("SO LOAI SACH KHAC NHAU: " + ql.getKhoSach().size());
            System.out.println("SO LUONG SACH CHUA AI MUON: " + ql.getSachChuaAiMuon().size());
            System.out.println("SO LUONG SACH DANG DUOC MUON: " + ql.getSachDangDuocMuon().size());
            System.out.println("SO LUONG SACH QUA HAN TRA NGAY HOM NAY: " + ql.getSachQuaHanTra().size());
            System.out.println("");
            System.out.println("");
            System.out.println("1.   Them sach");
            System.out.println("2.   Xoa sach");
            System.out.println("3.   Sua sach");
            System.out.println("\tHIEN THI");
            System.out.println("4.   Hien thi kho sach");
            System.out.println("5.   Hien sach chua ai muon");
            System.out.println("6.   Hien thi danh sach sach dang duoc muon");
            System.out.println("7.   Hien thi danh sach sach qua han tra ngay hom nay");
            System.out.println("\tMUON/TRA/LOC");
            System.out.println("8.   Tao phien muon sach");
            System.out.println("9.   Tao phien tra sach");
            System.out.println("\tLOC");//Chua hoan thien 
            System.out.println("10.  Loc sach theo NXB");
            System.out.println("11.  Loc nhung sinh vien da muon 1 cuon sach voi ten cu the");
            System.out.println("12.  Loc nhung dau sach duoc muon vao 1 ngay cu the");
            System.out.println("13.  Loc 10 dau sach con lai trong kho voi so luong it nhat");
            System.out.println("0.  Thoat khoi MENU");
            System.out.println("");
            System.out.println("");
            System.out.print("NHAP LUA CHON CUA BAN: \n");
            a = sc.nextInt();
            sc.nextLine();
            switch (a) {
                case 1 ->
                    ql.themSach();
                case 2 ->
                    ql.xoaSach();
                case 3 ->
                    ql.suaSach();
                case 4 ->
                    ql.showKhoSach(ql.getKhoSach());
                case 5 ->
                    ql.showKhoSach(ql.getSachChuaAiMuon());
                case 6 ->
                    ql.showKhoSach(ql.getSachDangDuocMuon());
                case 7 ->
                    ql.showSachQuaHan();
                case 8 ->
                    ql.taoPhienMuonSach();
                case 9 ->
                    ql.taoPhienTraSach();
                case 10 ->
                    ql.locSachNXB();
                case 11 ->
                    ql.locNhungSVDaMuonVoi1DauSachCuThe();
                case 12 ->
                    ql.locNhungDauSachDaMuonVao1NgayCuThe();
                case 13 ->
                    ql.loc10SachConLaiItNhat();
            }
        } while (a != 0);

    }
}
