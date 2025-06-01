/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.Date;

/**
 *
 * @author DELL Latitude 5570
 */
public class ChiTietPhongHoc {
    private String maPhong;
    private String maND;
    private Date ngay;
    private int tietHocBatDau;
    private int tietHocKetThuc;
    private int tinhTrang; // 0: trong 1: hoc
    private String tenND;
    private String tenPhong;

    public ChiTietPhongHoc() {
    }

    public ChiTietPhongHoc(String maPhong, String maND, Date ngay, int tietHocBatDau, int tietHocKetThuc) {
        this.maPhong = maPhong;
        this.maND = maND;
        this.ngay = ngay;
        this.tietHocBatDau = tietHocBatDau;
        this.tietHocKetThuc = tietHocKetThuc;
    }

    public ChiTietPhongHoc(int tietHocBatDau, int tietHocKetThuc) {
        this.tietHocBatDau = tietHocBatDau;
        this.tietHocKetThuc = tietHocKetThuc;
        this.tinhTrang = 0;
    }

    
    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getMaND() {
        return maND;
    }

    public void setMaND(String maND) {
        this.maND = maND;
    }

    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }

    public int getTietHocBatDau() {
        return tietHocBatDau;
    }

    public void setTietHocBatDau(int tietHocBatDau) {
        this.tietHocBatDau = tietHocBatDau;
    }

    public int getTietHocKetThuc() {
        return tietHocKetThuc;
    }

    public void setTietHocKetThuc(int tietHocKetThuc) {
        this.tietHocKetThuc = tietHocKetThuc;
    }

    public int getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public String getTenND() {
        return tenND;
    }

    public void setTenND(String tenND) {
        this.tenND = tenND;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }
    
    
    
    
    
    public String inDL() {
        if(tinhTrang == 0) {
            return "";
        }
        String tiets = "(";
        for(int i=tietHocBatDau;i<=tietHocKetThuc;++i) {
            tiets += i;
            if(i != tietHocKetThuc) {
                tiets += ", ";
            }
            else {
                tiets += ")";
            }
        }
        String rs = "<html><body style='text-align: center;'><br /> Giáo viên đăng ký: " + "<br />" +tenND+"<br />" +tiets+" </body></html>";
        return rs;
    }
}
