/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

import ConnectDB.ConnectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.ChiTietPhongHoc;
import models.CoSo;
import models.DayNha;
import models.Phong;
import models.Tang;

public class PhongService {

    private ConnectionDB connectDB = new ConnectionDB();
    private Connection conn = null;
    private PreparedStatement preparedStatement = null;
    private Statement statement = null;
    private ResultSet resultSet = null;

    private ArrayList<DayNha> dsDayNha = null;
    private ArrayList<CoSo> dsCoSo = null;
    private ArrayList<Tang> dsTang = null;
    private ArrayList<Phong> dsPhong = null;
    ArrayList<Phong> dsmaphong = null;

    public ArrayList<CoSo> getDsCoSo() throws SQLException {

        try {
            dsCoSo = new ArrayList<>();
            conn = ConnectionDB.ConnectionDB();
            String sql = "select * from coso";
            statement = conn.createStatement();
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                CoSo cs = new CoSo();
                cs.setMaCoSo(resultSet.getString(1));
                cs.setTenCoSo(resultSet.getString(2));
                cs.setDiaChi(resultSet.getString(3));
                dsCoSo.add(cs);
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(PhongService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsCoSo;
    }

    public ArrayList<DayNha> getDsDayNhaTheoMaCoSo(String maCoSo) throws SQLException {

        try {
            dsDayNha = new ArrayList<>();
            conn = ConnectionDB.ConnectionDB();
            String sql = "select * from daynha where maCoSo = '" + maCoSo + "'";
            statement = conn.createStatement();
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                DayNha dn = new DayNha();
                dn.setMaDayNha(resultSet.getString(1));
                dn.setTenDayNha(resultSet.getString(2));
                dsDayNha.add(dn);
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(PhongService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsDayNha;
    }

    public ArrayList<Tang> getDsTangTheoMaDayNha(String maDayNha) throws SQLException {

        try {
            dsTang = new ArrayList<>();
            conn = ConnectionDB.ConnectionDB();
            String sql = "select * from tang where maDayNha = '" + maDayNha + "'";
            statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                Tang tang = new Tang();
                tang.setMaTang(result.getString(1));
                tang.setTenTang(result.getString(2));
                dsTang.add(tang);
            }
            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(PhongService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsTang;
    }

    public ArrayList<Phong> getDsPhongTheoTenTang(String tenTang) throws SQLException {

        try {
            dsPhong = new ArrayList<>();
            conn = ConnectionDB.ConnectionDB();
            String sql = "select * from phong where maTang = (select maTang from tang where tenTang = '" + tenTang + "') ";
            statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                Phong p = new Phong();
                p.setMaPhong(result.getString(1));
                p.setTenPhong(result.getString(2));
                dsPhong.add(p);
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(PhongService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsPhong;
    }

    public void xoa(String maPhong) throws SQLException {
        try {
            conn = ConnectionDB.ConnectionDB();
            String sqlxoa = "delete from phong where maPhong= '" + maPhong + "'";
            preparedStatement = conn.prepareStatement(sqlxoa);
            preparedStatement.execute();
            preparedStatement.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(PhongService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void sua(Phong phong) {
        String sqlsua
                = "UPDATE `phong` SET `tenPhong`= ? WHERE `maPhong`=? ";
        try {
            conn = ConnectionDB.ConnectionDB();
            preparedStatement = conn.prepareStatement(sqlsua);
            preparedStatement.setString(1, phong.getTenPhong());
            preparedStatement.setString(2, phong.getMaPhong());

            preparedStatement.executeUpdate();
            preparedStatement.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(PhongService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void them(Phong phong) {
        String sqlthem = "INSERT INTO phong (maPhong, tenPhong, maTang) VALUES (?, ?, ?)";

        try {
            conn = ConnectionDB.ConnectionDB();
            preparedStatement = conn.prepareStatement(sqlthem);
            preparedStatement.setString(1, phong.getMaPhong());
            preparedStatement.setString(2, phong.getTenPhong());
            preparedStatement.setString(3, phong.getMaTang());
            preparedStatement.execute();
            preparedStatement.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public String getMaTangTheoTenTang(String tenTang) {
        String matang = null;
        try {

            conn = ConnectionDB.ConnectionDB();
            String sql = "select maTang from tang where tenTang = '" + tenTang + "'";
            statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);
            while (result.next()) {
                matang = result.getString(1);
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(PhongService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return matang;
    }

    public static String getMaPhongFromTenPhong(String tenPhong) {
        String sqlSelectUser = "SELECT * FROM phong where tenPhong =?";

        String MaPhong = null;
        Connection conn = null;
        try {

            ConnectionDB connectDB = new ConnectionDB();
            conn = connectDB.ConnectionDB();

            PreparedStatement preparedStatement = conn.prepareStatement(sqlSelectUser);
            preparedStatement.setString(1, tenPhong);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {

                MaPhong = resultSet.getString("maPhong");
            }

            preparedStatement.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return MaPhong;
    }

    public static ArrayList<String> getTenPhongFromTenTang(String tenTang) {
        String sqlSelectUser = "SELECT tenPhong  FROM phong inner join tang on tang.maTang = phong.maTang where tenTang =?";

        ArrayList<String> listPhong = new ArrayList<String>();
        Connection conn = null;

        try {

            ConnectionDB connectDB = new ConnectionDB();
            conn = connectDB.ConnectionDB();

            PreparedStatement preparedStatement = conn.prepareStatement(sqlSelectUser);
            preparedStatement.setString(1, tenTang);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                //System.out.println("haha" + resultSet.getString("tenPhong"));
                listPhong.add(resultSet.getString("tenPhong"));
            }

            preparedStatement.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return listPhong;
    }

    public ArrayList<Phong> laymaphong() throws SQLException {
        try {
            dsmaphong = new ArrayList<>();
            conn = ConnectionDB.ConnectionDB();
            String sqllay = "select * from phong";
            statement = conn.createStatement();
            resultSet = statement.executeQuery(sqllay);

            while (resultSet.next()) {
                Phong p = new Phong();
                p.setMaPhong(resultSet.getString(1));
                dsmaphong.add(p);
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(PhongService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsmaphong;
    }
    
    public static ArrayList<Phong> getDsPhongTheoMaTang(String maTang) throws SQLException {
        ArrayList<Phong> dsPhong = new ArrayList<>();
        try {
            Connection conn = ConnectionDB.ConnectionDB();
            String sql = "select * from phong where maTang = '" + maTang + "'";

            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet result = statement.executeQuery();

            while (result.next()) {
                Phong p = new Phong();
                p.setMaPhong(result.getString(1));
                p.setTenPhong(result.getString(2));
                dsPhong.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PhongService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dsPhong;
    }

}
