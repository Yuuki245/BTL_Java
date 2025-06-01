/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

public class Phong {
    private String maPhong;
    private String tenPhong;
    private String maTang;

    public Phong() {
    }
    
    public Phong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public Phong(String maPhong, String tenPhong, String maTang) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.maTang = maTang;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }
     public String getMaTang() {
        return maTang;
    }

    public void setMaTang(String maTang) {
        this.maTang = maTang;
    }
    
}
