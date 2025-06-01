package models;

public class GiaoVien {

    private String maND;
    private String tenND;
    private String email;
    private String password;
    private int role;

    public GiaoVien() {
    }
    
    public GiaoVien(String maND, String tenND, String email, String password) {
        this.maND = maND;
        this.tenND = tenND;
        this.email = email;
        this.password = password;
    }

    public GiaoVien(String maND, String tenND, String email, String password, int role) {
        this.maND = maND;
        this.tenND = tenND;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public String getMaND() {
        return maND;
    }

    public void setMaND(String maND) {
        this.maND = maND;
    }

    public String getTenND() {
        return tenND;
    }

    public void setTenND(String tenND) {
        this.tenND = tenND;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "GiaoVien{" + "maND=" + maND + ", tenND=" + tenND + ", email=" + email + ", password=" + password + ", role=" + role + '}';
    }

}
