/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.actvn.java06.mavenproject1;

import java.awt.SystemColor;
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
        
        int a;
        do {
            System.out.println("==========================");
            System.out.println("==========================");
            System.out.printf("\tMENU\n");
            System.out.println("==" + now + "==");
            System.out.println("");
            System.out.println("SO LUONG SACH DANG SO HUU(TONG) :" + ql.tongSoSachTrongKho(ql.getKhoSach()));
            System.out.println("SO LOAI SACH KHAC NHAU: " + ql.getKhoSach().size());
            System.out.println("SO LUONG SACH DANG DUOC MUON: " + ql.getSachDangDuocMuon().size());
            System.out.println("SO LUONG SACH CHUA AI MUON: " + ql.tongSoSachTrongKho(ql.getSachChuaAiMuon()));
            System.out.println("SO LUONG SACH QUA HAN TRA: " + ql.getSachQuaHanTra().size());
            System.out.println("");
            System.out.println("1.   Them sach");
            System.out.println("2.   Xoa sach");
            System.out.println("3.   Sua sach");
            System.out.println("4.   Tao phien muon sach");
            System.out.println("6.   Hien thi kho sach");
            System.out.println("5.   Hien thi loai sach");
            System.out.println("7.   Hien thi danh sach sach da qua han tra");//LOI
            System.out.println("8.   Hien thi danh sach sach dang duoc muon");
            System.out.println("9.   Tao phien tra sach");
            System.out.println("10.  Loc sach theo NXB");
            System.out.println("11.  Loc nhung sinh vien da muon 1 cuon sach cu the");
            System.out.println("00.  Thoat khoi MENU");
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
                    ql.taoPhienMuonSach();
                case 5 ->
                    System.out.println("Chua lam @@@");
                case 6 ->
                    ql.showKhoSach(ql.getKhoSach());
                case 7 ->
                    ql.showKhoSach(ql.getSachQuaHanTra());
                case 8 ->
                    ql.showKhoSach(ql.getSachDangDuocMuon());
                case 9 ->
                    ql.taoPhienTraSach();
                case 10 ->
                    ql.locSachNXB();
                case 11 ->
                    ql.locNhungSVDaMuonVoi1DauSachCuThe();
            }
        } while (a != 00);
        
    }
}
