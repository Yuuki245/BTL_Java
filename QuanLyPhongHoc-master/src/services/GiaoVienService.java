/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import ConnectDB.ConnectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import models.GiaoVien;

/**
 *
 * @author Son
 */
public class GiaoVienService {
    
    public static GiaoVien login( String email, String password ) {
        
        String sqlSelectUser = "SELECT * FROM qlphonghoc.nguoidung WHERE email = ? and password = ?";
        GiaoVien giaovien = null;
        Connection conn = null;
        try {

            ConnectionDB connectDB = new ConnectionDB();
            conn = connectDB.ConnectionDB();

            PreparedStatement preparedStatement = conn.prepareStatement(sqlSelectUser);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                giaovien = new GiaoVien();
                giaovien.setMaND(resultSet.getString("MaND"));
                giaovien.setTenND(resultSet.getString("TenND"));
                giaovien.setPassword(resultSet.getString("Password"));
                giaovien.setEmail(resultSet.getString("Email"));
                giaovien.setRole(resultSet.getInt("Role"));
            }

            preparedStatement.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return giaovien; 
    }
    
}
