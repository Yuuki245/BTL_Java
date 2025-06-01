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
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.UnitValue;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;

/**
 *
 * @author DELL Latitude 5570
 */
public class ChiTietPhongService {
    
    
    public static ArrayList<ChiTietPhongHoc> getDsCTPhongHocTheoTenPhong(String tenPhong) throws SQLException {
        ArrayList<ChiTietPhongHoc> dsCTPhong = new ArrayList<>();
        Connection conn = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            conn = ConnectionDB.ConnectionDB();
            String sql
                    = "select maPhong, chitietphonghoc.maND, ngay, tietHocBatDau, tietHocKetThuc, tenND "
                    + "from chitietphonghoc inner join nguoidung on nguoidung.maND = chitietphonghoc.maND  "
                    + "where maPhong = (select maPhong from phong where tenPhong = '" + tenPhong + "')";
            statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                ChiTietPhongHoc ct = new ChiTietPhongHoc();
                ct.setMaPhong(result.getString(1));
                ct.setMaND(result.getString(2));
                ct.setNgay(result.getDate(3));
                ct.setTietHocBatDau(result.getInt(4));
                ct.setTietHocKetThuc(result.getInt(5));
                ct.setTenND(result.getString(6));
                dsCTPhong.add(ct);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ChiTietPhongService.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ChiTietPhongService.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ChiTietPhongService.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ChiTietPhongService.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return dsCTPhong;
    }

    public static ArrayList<ChiTietPhongHoc> getDsCTPhongHocTheoNgayVaTenPhong(String ngay, String tenPhong) throws SQLException {
        ArrayList<ChiTietPhongHoc> dsCTPhong = new ArrayList<>();
        Connection conn = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            conn = ConnectionDB.ConnectionDB();
            String sql
                    = "select maPhong, chitietphonghoc.maND, ngay, tietHocBatDau, tietHocKetThuc, tenND "
                    + "from chitietphonghoc inner join nguoidung on nguoidung.maND = chitietphonghoc.maND  "
                    + "where ngay = '" + ngay + "' "
                    + "and maPhong = (select maPhong from phong where tenPhong = '" + tenPhong + "')";
            statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);

            while (result.next()) {
                ChiTietPhongHoc ct = new ChiTietPhongHoc();
                ct.setMaPhong(result.getString(1));
                ct.setMaND(result.getString(2));
                ct.setNgay(result.getDate(3));
                ct.setTietHocBatDau(result.getInt(4));
                ct.setTietHocKetThuc(result.getInt(5));
                ct.setTenND(result.getString(6));
                ct.setTinhTrang(1);
                dsCTPhong.add(ct);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ChiTietPhongService.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ChiTietPhongService.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ChiTietPhongService.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ChiTietPhongService.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return dsCTPhong;
    }

    public static ArrayList<ChiTietPhongHoc> getDsCTPhongGomCaTietTrong(ArrayList<ChiTietPhongHoc> ds) {
        // Sắp xếp danh sách theo tiết bắt đầu
        ds.sort(new Comparator<ChiTietPhongHoc>() {
            @Override
            public int compare(ChiTietPhongHoc o1, ChiTietPhongHoc o2) {
                return Integer.compare(o1.getTietHocBatDau(), o2.getTietHocBatDau());
            }
        });

        ArrayList<ChiTietPhongHoc> rs = new ArrayList<>();

        // Logic tạo danh sách ct phòng đã đăng ký và rỗng
        for (int i = 0; i < ds.size(); ++i) {
            ChiTietPhongHoc curr = ds.get(i);
            if (i == 0) {
                if (curr.getTietHocBatDau() != 1) {
                    ChiTietPhongHoc ct = new ChiTietPhongHoc(1, curr.getTietHocBatDau() - 1);
                    rs.add(ct);
                }
            } else if (curr.getTietHocBatDau() != ds.get(i - 1).getTietHocKetThuc() + 1) {
                ChiTietPhongHoc ct = new ChiTietPhongHoc(ds.get(i - 1).getTietHocKetThuc() + 1, curr.getTietHocBatDau() - 1);
                rs.add(ct);
            }
            rs.add(curr);
            if (i == ds.size() - 1 && curr.getTietHocKetThuc() != 16) {
                ChiTietPhongHoc ct = new ChiTietPhongHoc(curr.getTietHocKetThuc() + 1, 16);
                rs.add(ct);
            }
        }
        return rs;
    }
    
    public static ArrayList<Integer> getTietBatDau(String maPhong, String ngay) {
        
        String sqlSelectUser = "SELECT * FROM chitietphonghoc where maPhong = ? and ngay = ? ";
        ArrayList<Integer> listTietBatDau = new ArrayList<Integer>();
        Connection conn = null;
        
        try {

            ConnectionDB connectDB = new ConnectionDB();
            conn = connectDB.ConnectionDB();

            PreparedStatement preparedStatement = conn.prepareStatement(sqlSelectUser);
            preparedStatement.setString(1,maPhong);
            preparedStatement.setString(2,ngay);
            

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                listTietBatDau.add(resultSet.getInt("tietHocBatDau"));
            }

            preparedStatement.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return listTietBatDau;
    }
    
    public static ArrayList<Integer> getTietKetThuc(String maPhong, String ngay) {
        
        String sqlSelectUser = "SELECT * FROM chitietphonghoc where maPhong = ? and ngay = ? ";
        ArrayList<Integer> listTietKetThuc = new ArrayList<Integer>();
        Connection conn = null;
        
        try {

            ConnectionDB connectDB = new ConnectionDB();
            conn = connectDB.ConnectionDB();

            PreparedStatement preparedStatement = conn.prepareStatement(sqlSelectUser);
            preparedStatement.setString(1,maPhong);
            preparedStatement.setString(2,ngay);
            

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                listTietKetThuc.add(resultSet.getInt("tietHocKetThuc"));
            }

            preparedStatement.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return listTietKetThuc;
    }
    
    public static ArrayList<ChiTietPhongHoc> getChiTietPhongTheoMaND(String maND) {
        
        String sqlSelectUser = "Select tenPhong,ngay,tietHocBatDau,tietHocKetThuc from chitietphonghoc inner join phong on chitietphonghoc.maPhong = phong.maPhong where maND = ? ";
        
        ArrayList<ChiTietPhongHoc> listChiTietPhong = new ArrayList<ChiTietPhongHoc>();
        Connection conn = null;
        
        try {

            ConnectionDB connectDB = new ConnectionDB();
            conn = connectDB.ConnectionDB();

            PreparedStatement preparedStatement = conn.prepareStatement(sqlSelectUser);
            
            preparedStatement.setString(1,maND);
           
            

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                ChiTietPhongHoc chiTietPhong1 = new ChiTietPhongHoc();
                chiTietPhong1.setTenPhong(resultSet.getString("tenPhong"));
                chiTietPhong1.setNgay(resultSet.getDate("ngay"));
                chiTietPhong1.setTietHocBatDau(resultSet.getInt("tietHocBatDau"));
                chiTietPhong1.setTietHocKetThuc(resultSet.getInt("tietHocKetThuc"));
               
                
                listChiTietPhong.add(chiTietPhong1);
            }

            preparedStatement.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
       
        return listChiTietPhong;
    }
    public static void xoaChiTietPhong (String maPhong, String ngay, int tietBatDau, int tietKetThuc) {
        
        String sqlSelectUser = " Delete from chitietphonghoc where maPhong = ? and ngay = ? and tietHocBatDau = ? and tietHocKetThuc = ?";
        
        //ArrayList<ChiTietPhongHoc> listChiTietPhong = new ArrayList<ChiTietPhongHoc>();
        Connection conn = null;
        
        try {

            ConnectionDB connectDB = new ConnectionDB();
            conn = connectDB.ConnectionDB();

            PreparedStatement preparedStatement = conn.prepareStatement(sqlSelectUser);
            
            preparedStatement.setString(1,maPhong);
            preparedStatement.setString(2,ngay);
            preparedStatement.setInt(3,tietBatDau);
            preparedStatement.setInt(4,tietKetThuc);

            preparedStatement.executeUpdate();
           
            preparedStatement.close();
            
            conn.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }   
    }
    
    public static void exportScheduleToPDF(String tenPhong, ArrayList<ChiTietPhongHoc> dsCTPhong, String filePath) throws FileNotFoundException {
        if (dsCTPhong == null || dsCTPhong.isEmpty()) {
            throw new IllegalStateException("Không có lịch sử dụng phòng học để in.");
        }

        PdfWriter writer = new PdfWriter(filePath);
        PdfDocument pdf = new PdfDocument(writer);
        Document document = new Document(pdf);

        // Tiêu đề
        document.add(new Paragraph("Lịch Sử Dụng Phòng Học: " + tenPhong)
                .setFontSize(16)
                .setBold());

        // Tạo bảng PDF
        float[] columnWidths = {1, 2, 1, 1, 2};
        Table table = new Table(UnitValue.createPercentArray(columnWidths));
        table.addHeaderCell("Phòng");
        table.addHeaderCell("Ngày");
        table.addHeaderCell("Tiết Bắt Đầu");
        table.addHeaderCell("Tiết Kết Thúc");
        table.addHeaderCell("Giáo Viên");

        // Định dạng ngày
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        // Thêm dữ liệu vào bảng
        for (ChiTietPhongHoc ct : dsCTPhong) {
            table.addCell(ct.getMaPhong() != null ? ct.getMaPhong() : tenPhong); // Sử dụng tên phòng nếu mã phòng trống
            table.addCell(dateFormat.format(ct.getNgay()));
            table.addCell(String.valueOf(ct.getTietHocBatDau()));
            table.addCell(String.valueOf(ct.getTietHocKetThuc()));
            table.addCell(ct.getTenND() != null ? ct.getTenND() : "Chưa có");
        }

        document.add(table);
        document.close();
    }

}
