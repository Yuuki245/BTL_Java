package ConnectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {

    private static final String DATABASE_NAME = "qlphonghoc";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/" + DATABASE_NAME + "?allowPublicKeyRetrieval=true&useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    public static Connection ConnectionDB() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
//            System.out.println("Connect to database successfully :)");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Connect database failure!");
            System.out.println(ex.getMessage());
            System.exit(0);
        }
        return conn;
    }
}
