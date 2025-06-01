/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author DELL Latitude 5570
 */
public class CoSo {
    private String maCoSo;
    private String tenCoSo;
    private String diaChi;

    public CoSo() {
    }

    
    
    public CoSo(String maCoSo, String tenCoSo, String diaChi) {
        this.maCoSo = maCoSo;
        this.tenCoSo = tenCoSo;
        this.diaChi = diaChi;
    }

    public String getMaCoSo() {
        return maCoSo;
    }

    public void setMaCoSo(String maCoSo) {
        this.maCoSo = maCoSo;
    }

    public String getTenCoSo() {
        return tenCoSo;
    }

    public void setTenCoSo(String tenCoSo) {
        this.tenCoSo = tenCoSo;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    
}
