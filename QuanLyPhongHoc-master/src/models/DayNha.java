/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author DELL Latitude 5570
 */
public class DayNha {
    private String maDayNha;
    private String tenDayNha;
    private String maCoSo;

    public String getMaDayNha() {
        return maDayNha;
    }

    public void setMaDayNha(String maDayNha) {
        this.maDayNha = maDayNha;
    }

    public String getTenDayNha() {
        return tenDayNha;
    }

    public void setTenDayNha(String tenDayNha) {
        this.tenDayNha = tenDayNha;
    }

    public String getMaCoSo() {
        return maCoSo;
    }

    public void setMaCoSo(String maCoSo) {
        this.maCoSo = maCoSo;
    }

    public DayNha() {
    }

    public DayNha(String maDayNha, String tenDayNha) {
        this.maDayNha = maDayNha;
        this.tenDayNha = tenDayNha;
    }

    public DayNha(String maDayNha, String tenDayNha, String maCoSo) {
        this.maDayNha = maDayNha;
        this.tenDayNha = tenDayNha;
        this.maCoSo = maCoSo;
    }
    
}
