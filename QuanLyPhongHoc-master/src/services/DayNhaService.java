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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.DayNha;

/**
 *
 * @author NguyenHuyen
 */
public class DayNhaService {
    public static List<DayNha> readAllDayNha() {
        List<DayNha> dayNhas = new ArrayList<>();
        String sql = "SELECT * FROM daynha";
        
        try {
            Connection conn = ConnectionDB.ConnectionDB();
            PreparedStatement statement= conn.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()) {
                DayNha tb = new DayNha(
                        resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(3)
                );

                dayNhas.add(tb);
            }
                 
            conn.close();
            statement.close();
            resultSet.close();
        } catch (SQLException e) {
            System.out.println("Error: read all tables fail");
        }
        return dayNhas;
    }
    
    public static List<DayNha> readAllDayNhaTheoCoSo(String maCoSo) {
        List<DayNha> dayNhas = new ArrayList<>();
        String sql = "SELECT * FROM daynha WHERE maCoSo = '" + maCoSo + "'";
        
        try {
            Connection conn = ConnectionDB.ConnectionDB();
            PreparedStatement statement= conn.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()) {
                DayNha tb = new DayNha(
                        resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(3)
                );

                dayNhas.add(tb);
            }
                 
            conn.close();
            statement.close();
            resultSet.close();
        } catch (SQLException e) {
            System.out.println("Error: read all tables fail");
        }
        return dayNhas;
    }
    
    public static void insertRecord(DayNha dayNha) {
        String sqlInsert = "INSERT INTO `daynha`(`maDayNha`, `tenDayNha`, `maCoSo`) VALUES (?, ?, ?)";
        
        try {
            Connection conn = ConnectionDB.ConnectionDB();
            PreparedStatement preparedStatement = conn.prepareStatement(sqlInsert);
            preparedStatement.setString(1, dayNha.getMaDayNha());
            preparedStatement.setString(2, dayNha.getTenDayNha());
            preparedStatement.setString(3, dayNha.getMaCoSo());

            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println("Error: "+ e.getMessage());
        }
    }
    
    public static void deleteRecord(String maDayNha) {
        String sqlDelete = "delete from daynha where maDayNha= '"+maDayNha + "'";
        System.out.println("sql: "+ sqlDelete);
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
    
    public static void updateRecord(DayNha dayNha) {
        String sqlUpdate =
                "UPDATE `daynha` SET `tenDayNha`= ? WHERE `maDayNha`=? ";
        try {
            Connection conn = ConnectionDB.ConnectionDB();
            PreparedStatement preparedStatement = conn.prepareStatement(sqlUpdate);
            preparedStatement.setString(1, dayNha.getTenDayNha());
            preparedStatement.setString(2, dayNha.getMaDayNha());

            preparedStatement.executeUpdate();
            conn.close();
            preparedStatement.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<DayNha> getDsDayNhaTheoMaCoSo(String maCoSo) throws SQLException {
        ArrayList<DayNha> dsDayNha = new ArrayList<>();
        Connection conn = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
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

        } catch (SQLException ex) {
            Logger.getLogger(DayNhaService.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DayNhaService.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DayNhaService.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DayNhaService.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return dsDayNha;
    }
    
    public static ArrayList<String> getDayNhaFromMaCoSo(String maCoSo) {
        String sqlSelectUser = "SELECT * FROM daynha where maCoSo = ?";
        ArrayList<String> listDayNha = new ArrayList<String>();
        Connection conn = null;
        
        try {

            ConnectionDB connectDB = new ConnectionDB();
            conn = connectDB.ConnectionDB();

            PreparedStatement preparedStatement = conn.prepareStatement(sqlSelectUser);
            preparedStatement.setString(1,maCoSo);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                listDayNha.add(resultSet.getString("maDayNha"));
            }

            preparedStatement.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return listDayNha;
    }
}
