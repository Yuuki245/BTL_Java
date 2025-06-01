package services;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import ConnectDB.ConnectionDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.regex.Pattern;
import models.GiaoVien;

public class AccountService {

    public static void createAdminAccount(GiaoVien giaovien) {

        String sqlCreateNewUser = "INSERT INTO qlphonghoc.nguoidung VALUES(?, ?, ?, ?, 0)";
        Connection conn = null;
        try {

            giaovien.setPassword(giaovien.getPassword());
            ConnectionDB connectDB = new ConnectionDB();
            conn = connectDB.ConnectionDB();

            PreparedStatement preparedStatement = conn.prepareStatement(sqlCreateNewUser);
            preparedStatement.setString(1, giaovien.getMaND());
            preparedStatement.setString(2, giaovien.getTenND());
            preparedStatement.setString(3, giaovien.getEmail());
            preparedStatement.setString(4, giaovien.getPassword());

            preparedStatement.execute();
            preparedStatement.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static GiaoVien getAccountByEmail(String email) {

        String sqlSelectUser = "SELECT * FROM qlphonghoc.nguoidung WHERE email = ?";
        GiaoVien giaovien = null;
        Connection conn = null;
        try {

            ConnectionDB connectDB = new ConnectionDB();
            conn = connectDB.ConnectionDB();

            PreparedStatement preparedStatement = conn.prepareStatement(sqlSelectUser);
            preparedStatement.setString(1, email);

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

    public static int checkRedirect(String email) {

        String sql = "SELECT * FROM nguoidung WHERE email='" + email + "'";

        try {
            Connection conn = ConnectionDB.ConnectionDB();
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                return resultSet.getInt("role");
            }

        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }

        return 0;
    }

    public static String getTenNDByMaND(String maND) {

        String sql = "SELECT tenND FROM qlphonghoc.nguoidung WHERE maND = '" + maND + "'";
        Connection conn = null;
        try {
            conn = ConnectionDB.ConnectionDB();
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                return resultSet.getString(1);
            }

        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return null;
    }

    public static GiaoVien getAccountByEmail(String email, int role) {

        String sqlSelectUser = "SELECT * FROM qlphonghoc.nguoidung WHERE email = ? AND role = ?";
        GiaoVien giaovien = null;
        Connection conn = null;
        try {

            ConnectionDB connectDB = new ConnectionDB();
            conn = connectDB.ConnectionDB();

            PreparedStatement preparedStatement = conn.prepareStatement(sqlSelectUser);
            preparedStatement.setString(1, email);
            preparedStatement.setInt(2, role);

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

    public static GiaoVien getAccountByMaND(String maND) {

        String sqlSelectUser = "SELECT * FROM qlphonghoc.nguoidung WHERE  maND = ?";
        GiaoVien giaovien = null;
        Connection conn = null;
        try {

            ConnectionDB connectDB = new ConnectionDB();
            conn = connectDB.ConnectionDB();

            PreparedStatement preparedStatement = conn.prepareStatement(sqlSelectUser);
            preparedStatement.setString(1, maND);

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

    public static boolean isEmailValid(String email) {
        final Pattern EMAIL_REGEX = Pattern.compile("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])", Pattern.CASE_INSENSITIVE);
        return EMAIL_REGEX.matcher(email).matches();
    }
}
