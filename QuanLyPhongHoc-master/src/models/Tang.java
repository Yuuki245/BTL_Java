/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author DELL Latitude 5570
 */
public class Tang {

    private String maTang;
    private String tenTang;
    private String maDayNha;

    public Tang() {

    }

    public Tang(String maTang, String tenTang, String maDayNha) {
        this.maTang = maTang;
        this.tenTang = tenTang;
        this.maDayNha = maDayNha;
    }

    public String getMaTang() {
        return maTang;
    }

    public void setMaTang(String maTang) {
        this.maTang = maTang;
    }

    public String getTenTang() {
        return tenTang;
    }

    public void setTenTang(String tenTang) {
        this.tenTang = tenTang;
    }

    public String getMaDayNha() {
        return maDayNha;
    }

    public void setMaDayNha(String maDayNha) {
        this.maDayNha = maDayNha;
    }

}