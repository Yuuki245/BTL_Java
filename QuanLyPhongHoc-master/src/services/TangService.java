package services;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import ConnectDB.ConnectionDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Tang;
import models.DayNha;

public class TangService {

    public static List<Tang> readAllTang() {
        List<Tang> tangs = new ArrayList<>();
        String sql = "SELECT * FROM tang";

        try {
            Connection conn = ConnectionDB.ConnectionDB();
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                Tang tb = new Tang(
                        resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(3)
                );

                tangs.add(tb);
            }

            conn.close();
            statement.close();
            resultSet.close();
        } catch (SQLException e) {
            System.out.println("Error: read all tables fail");
        }
        return tangs;
    }

    

    public static void insertRecord(Tang tang) {
        String sqlInsert = "INSERT INTO `tang`(`maTang`, `tenTang`, `maDayNha`) VALUES (?, ?, ?)";

        try {
            Connection conn = ConnectionDB.ConnectionDB();
            PreparedStatement preparedStatement = conn.prepareStatement(sqlInsert);
            preparedStatement.setString(1, tang.getMaTang());
            preparedStatement.setString(2, tang.getTenTang());
            preparedStatement.setString(3, tang.getMaDayNha());

            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public static boolean checkFloorExisting(String maTang) {
        String sql = "SELECT * FROM tang WHERE maTang='" + maTang + "'";
        
        try {
            Connection conn = ConnectionDB.ConnectionDB();
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) return false;
               
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return true;
    }

    public static void deleteRecord(String maTang) {
        String sqlDelete = "delete from tang where maTang= '" + maTang + "'";
        System.out.println("sql: " + sqlDelete);
        try {
            Connection conn = ConnectionDB.ConnectionDB();
            PreparedStatement statement = conn.prepareStatement(sqlDelete);
            statement.execute();

            conn.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateRecord(Tang tang) {
        String sqlUpdate
                = "UPDATE `tang` SET `tenTang`= ? WHERE `maTang`=? ";
        try {
            Connection conn = ConnectionDB.ConnectionDB();
            PreparedStatement preparedStatement = conn.prepareStatement(sqlUpdate);
            preparedStatement.setString(1, tang.getTenTang());
            preparedStatement.setString(2, tang.getMaTang());
            
            preparedStatement.executeUpdate();
            conn.close();
            preparedStatement.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static List<Tang> readAllTangTheoDayNha(String maDayNha) {
        List<Tang> tangs = new ArrayList<>();
        String sql = "SELECT * FROM tang WHERE maDayNha = '" + maDayNha + "'";
        
        try {
            Connection conn = ConnectionDB.ConnectionDB();
            PreparedStatement statement= conn.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()) {
                Tang t = new Tang(
                        resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(3)
                );

                tangs.add(t);
            }
                 
            conn.close();
            statement.close();
            resultSet.close();
        } catch (SQLException e) {
            System.out.println("Error: read all tables fail");
        }
        return tangs;
    }
    
    public ArrayList<Tang> getDsTangTheoMaDayNha(String maDayNha) throws SQLException {
        ArrayList<Tang> dsTang = new ArrayList<>();
        Connection conn = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
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

        } catch (SQLException ex) {
            Logger.getLogger(TangService.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(TangService.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException ex) {
                    Logger.getLogger(TangService.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(TangService.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return dsTang;
    }
    
    public static ArrayList<String> getTangFromMaDayNha (String maDayNha) {
        String sqlSelectUser = "SELECT * FROM tang where maDayNha = ?";
        
        ArrayList<String> listTang = new ArrayList<String>();
        Connection conn = null;
        
        
        try {

            ConnectionDB connectDB = new ConnectionDB();
            conn = connectDB.ConnectionDB();

            PreparedStatement preparedStatement = conn.prepareStatement(sqlSelectUser);
            preparedStatement.setString(1,maDayNha);

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                listTang.add(resultSet.getString("tenTang"));
            }

            preparedStatement.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return listTang;
    }
}
