/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import ConnectDB.ConnectionDB;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.CoSo;

/**
 *
 * @author NguyenHuyen
 */
public class CoSoService {
    public static void insertRecord(CoSo coSo) {
        String sqlInsert = "INSERT INTO `coso` (`maCoSo`, `tenCoSo`, `diaChi`) VALUES (?, ?, ?)";
        
        try {
            Connection conn = ConnectionDB.ConnectionDB();
            PreparedStatement preparedStatement = conn.prepareStatement(sqlInsert);
            preparedStatement.setString(1, coSo.getMaCoSo());
            preparedStatement.setString(2, coSo.getTenCoSo());
            preparedStatement.setString(3, coSo.getDiaChi());

            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println("Error: "+ e.getMessage());
        }
    }
    
    public static List<CoSo> readAllCoSo() {
        List<CoSo> coSos= new ArrayList<>();
        String sql = "select * from coso";
        try {
            Connection conn = ConnectionDB.ConnectionDB();
            PreparedStatement statement= conn.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()) {
                CoSo tb = new CoSo(
                        resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(3)
                );

                coSos.add(tb);
            }
                 
            conn.close();
            statement.close();
            resultSet.close();
        } catch (SQLException e) {
            System.out.println("Error: read all tables fail");
        }
        return coSos;
    }
    
    public static void deleteRecord(String maCoSo) {
        String sqlDelete = "delete from coso where maCoSo="+maCoSo;
       
        try {
            Connection conn = ConnectionDB.ConnectionDB();
            PreparedStatement statement= conn.prepareStatement(sqlDelete);
            statement.execute();
            
            conn.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void updateRecord(CoSo coSo) {
        String sqlUpdate =
                "UPDATE `coso` SET `tenCoSo`= ?,`diaChi`= ? WHERE `maCoSo`=? ";
        try {
            Connection conn = ConnectionDB.ConnectionDB();
            PreparedStatement preparedStatement = conn.prepareStatement(sqlUpdate);
            preparedStatement.setString(1, coSo.getTenCoSo());
            preparedStatement.setString(2, coSo.getDiaChi());
            preparedStatement.setString(3, coSo.getMaCoSo());

            preparedStatement.executeUpdate();
            conn.close();
            preparedStatement.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}