/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.act.java06.doancuoikhoa;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Scanner;
/**
 *
 * @author ADMIN
 */
public class DoAnCuoiKhoa{

    public static void main(String[] args) {
        
        QuanLy quanLy = new QuanLy();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            quanLy.tongSach();
            System.out.println("-------------------------");
            System.out.println("1. Thêm sách");
            System.out.println("2. Sửa thông tin sách");
            System.out.println("3. Xóa sách");
            System.out.println("4. Mượn sách");
            System.out.println("5. Trả sách");
            System.out.println("6. In danh sách sách đang được mượn");
            System.out.println("7. In danh sách sách");
            System.out.println("0. Thoát");
            System.out.println("-------------------------");
            System.out.print("Nhập lựa chọn của bạn: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Nhập mã sách: ");
                    String maSach = scanner.nextLine();
                    System.out.print("Nhập tên sách: ");
                    String tenSach = scanner.nextLine();
                    System.out.print("Nhập tác giả: ");
                    String tacGia = scanner.nextLine();
                    System.out.print("Nhập số lượng: ");
                    int soLuong = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhập thể loại: ");
                    String theLoai = scanner.nextLine();

                    System.out.print("Nhập NXB: ");
                    String nxb = scanner.nextLine();
                    quanLy.themSach(maSach, tenSach, tacGia, soLuong, theLoai, nxb);
                    System.out.println("Sách đã được thêm thành công!");
                }
                case 2 -> {
                    System.out.print("Nhập mã sách mới: ");
                    String maSachMoi = scanner.nextLine();
                    System.out.print("Nhập tên sách cần sửa thông tin: ");
                    String tenSachSua = scanner.nextLine();
                    System.out.print("Nhập tác giả mới: ");
                    String tacGiaMoi = scanner.nextLine();
                    System.out.print("Nhập số lượng mới: ");
                    int soLuongMoi = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhập thể loại mới: ");
                    String theLoaiMoi = scanner.nextLine();
                    System.out.print("Nhập NXB mới: ");
                    String nxb = scanner.nextLine();
                    quanLy.suaSach(maSachMoi, tenSachSua, tacGiaMoi, soLuongMoi, theLoaiMoi, nxb);
                    System.out.println("Thông tin sách đã được cập nhật!");
                }
                case 3 -> {
                    System.out.print("Nhập tên sách cần xóa: ");
                    String tenSachXoa = scanner.nextLine();

                    quanLy.xoaSach(tenSachXoa);
                    System.out.println("Sách đã được xóa khỏi danh sách!");
                }
                case 4 -> {
                    System.out.print("Nhập tên sách cần mượn: ");
                    String tenSachMuon = scanner.nextLine();
                    System.out.print("Nhập mã sinh viên: ");
                    String maSinhVienMuon = scanner.nextLine();

                    quanLy.muonSach(tenSachMuon, maSinhVienMuon);

                }
                case 5 -> {
                    System.out.print("Nhập tên sách cần trả: ");
                    String tenSachTra = scanner.nextLine();
                    System.out.print("Nhập mã sinh viên: ");
                    String maSinhVienTra = scanner.nextLine();

                    quanLy.traSach(tenSachTra, maSinhVienTra);
                    System.out.println("Sách đã được trả!");
                }
                case 6 ->
                    quanLy.inDanhSachSachMuon();

                case 7 ->
                    quanLy.inDanhSachSach();
                case 0 -> {
                    System.out.println("Chương trình kết thúc!");
                    return;
                }
                default ->
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại!");
            }
        }
    }
    }
