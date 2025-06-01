package views;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.CoSo;
import models.DayNha;
import models.Phong;
import models.Tang;
import services.PhongService;

public class QuanTriPhong_Form extends javax.swing.JFrame {

    DefaultTableModel tableModel;
    PhongService phongservice = new PhongService();
    String maPhongchon;
    List<Phong> phongs = new ArrayList<>();

    public QuanTriPhong_Form() throws SQLException {
        initComponents();
        tableModel = (DefaultTableModel) tbview.getModel();
        showComboData();

        Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/haui-logo.jpg"));
        setIconImage(image);
        this.getContentPane().setBackground(Color.getHSBColor(0.0f, 0.0f, 0.9f));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbCoso = new javax.swing.JComboBox<>();
        cbDaynha = new javax.swing.JComboBox<>();
        cbTang = new javax.swing.JComboBox<>();
        btnXem = new javax.swing.JButton();
        them = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        txttenphongsua = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtmaphongsua = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbview = new javax.swing.JTable();
        btnHome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản trị phòng");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Quản Trị Phòng");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Cơ sở:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Dãy Nhà:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Tầng:");

        cbCoso.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cbCoso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCosoActionPerformed(evt);
            }
        });

        cbDaynha.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cbDaynha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDaynhaActionPerformed(evt);
            }
        });

        cbTang.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnXem.setBackground(new java.awt.Color(244, 244, 244));
        btnXem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/eye-icon.png"))); // NOI18N
        btnXem.setText("Xem");
        btnXem.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnXem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXemActionPerformed(evt);
            }
        });

        them.setBackground(new java.awt.Color(244, 244, 244));
        them.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Add.png"))); // NOI18N
        them.setText("Thêm");
        them.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(244, 244, 244));
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Edit.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(244, 244, 244));
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Delete.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Mã Phòng");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Tên Phòng");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txttenphongsua, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtmaphongsua, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(51, 51, 51)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbCoso, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbDaynha, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbTang, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                            .addComponent(btnXem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(them, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))))
                .addGap(70, 70, 70))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCoso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbDaynha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtmaphongsua, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttenphongsua, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(them, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(btnXem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tbview.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Phòng", "Tên Phòng"
            }
        ));
        tbview.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbviewMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbview);

        btnHome.setBackground(new java.awt.Color(244, 244, 244));
        btnHome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Home.png"))); // NOI18N
        btnHome.setText("Trang chủ");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnHome)
                        .addGap(189, 189, 189)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(btnHome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbCosoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCosoActionPerformed
        try {
            cbDaynha.removeAllItems();
            String selectedItemMaCoSo = (String) cbCoso.getSelectedItem();
            ArrayList<DayNha> dsDayNha = phongservice.getDsDayNhaTheoMaCoSo(selectedItemMaCoSo);
            for (DayNha dayNha : dsDayNha) {
                cbDaynha.addItem(dayNha.getMaDayNha());
            }
        } catch (SQLException ex) {
            Logger.getLogger(PhongService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbCosoActionPerformed

    private void cbDaynhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDaynhaActionPerformed
        try {
            cbTang.removeAllItems();
            String selectedItemMaDayNha = (String) cbDaynha.getSelectedItem();
            ArrayList<Tang> dsTang = phongservice.getDsTangTheoMaDayNha(selectedItemMaDayNha);
            for (Tang tang : dsTang) {
                cbTang.addItem(tang.getTenTang());
            }
        } catch (SQLException ex) {
            Logger.getLogger(PhongService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cbDaynhaActionPerformed

    private void btnXemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXemActionPerformed
        try {
            tableModel.setRowCount(0);
            String selectedItemMaTang = (String) cbTang.getSelectedItem();
            ArrayList<Phong> dsphong = phongservice.getDsPhongTheoTenTang(selectedItemMaTang);
            for (Phong phong1 : dsphong) {
                tableModel.addRow(new Object[]{
                    phong1.getMaPhong(), phong1.getTenPhong()
                });
            }
        } catch (SQLException ex) {
            Logger.getLogger(PhongService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnXemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        try {

            String selectedItemMaTang = (String) cbTang.getSelectedItem();
            ArrayList<Phong> dsphong = phongservice.getDsPhongTheoTenTang(selectedItemMaTang);
            String tenPhongSua = txttenphongsua.getText();
            String maTang = (String) cbTang.getSelectedItem();
            int row = tbview.getSelectedRow();
            if (row == -1) {
                JOptionPane.showMessageDialog(null, "Hãy chọn một dòng để sửa", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                throw new Exception("co loi xay ra");
            } else {
                maPhongchon = tbview.getValueAt(row, 0).toString();
                Phong p = new Phong(maPhongchon, tenPhongSua, maTang);
                phongservice.sua(p);
                dsphong.get(row).setTenPhong(tenPhongSua);
                tbview.setValueAt(tenPhongSua, row, 1);
            }
        } catch (Exception ex) {
            Logger.getLogger(PhongService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        try {
            String selectedItemMaTang = (String) cbTang.getSelectedItem();
            ArrayList<Phong> dsphong = phongservice.getDsPhongTheoTenTang(selectedItemMaTang);
            int row = tbview.getSelectedRow();
            if (row == -1) {
                JOptionPane.showMessageDialog(rootPane, "Hãy chọn một dòng để xóa", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            } else {
                int response = JOptionPane.showConfirmDialog(this, "Bạn chắc chắn muốn xóa chứ?", "xác nhận", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (response == JOptionPane.YES_OPTION) {
                    maPhongchon = tbview.getValueAt(row, 0).toString();
                    phongservice.xoa(maPhongchon);
                    dsphong.remove(row);
                    tableModel.removeRow(row);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void tbviewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbviewMouseClicked
        int row = tbview.getSelectedRow();
        maPhongchon = tbview.getValueAt(row, 0).toString();
        String tenPhongChon = (String) tbview.getValueAt(row, 1);
        txtmaphongsua.setText(String.valueOf(maPhongchon));
        txttenphongsua.setText(tenPhongChon);
    }//GEN-LAST:event_tbviewMouseClicked

    private void themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themActionPerformed

        try {
            String selectedItemMaTang = (String) cbTang.getSelectedItem();
            ArrayList<Phong> dsphong = phongservice.getDsPhongTheoTenTang(selectedItemMaTang);
            String maPhong = txtmaphongsua.getText();
            String tenPhong = txttenphongsua.getText();
            String tentang = (String) cbTang.getSelectedItem();
            String maTang = phongservice.getMaTangTheoTenTang(tentang);
            ArrayList<Phong> dsmaphong = phongservice.laymaphong();
            int dem = 0;
            for (Phong p : dsmaphong) {
                if (maPhong.compareTo(p.getMaPhong()) == 0) {
                    dem++;
                }
            }

            if (dem != 0) {
                JOptionPane.showMessageDialog(rootPane, "Mã này đã có vui lòng nhập mã khác");
            } else {
                Phong p = new Phong(maPhong, tenPhong, maTang);
                dsphong.add(p);
                phongservice.them(p);

                tableModel.addRow(new Object[]{
                    maPhong,
                    tenPhong
                });
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_themActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        MenuQuanTri_Form qtMenu = new MenuQuanTri_Form();
        this.dispose();
        qtMenu.setVisible(true);
    }//GEN-LAST:event_btnHomeActionPerformed

    public void refresh() {
        try {
            String selectedItemMaTang = (String) cbTang.getSelectedItem();
            ArrayList<Phong> dsphong = phongservice.getDsPhongTheoTenTang(selectedItemMaTang);
            for (Phong phong1 : dsphong) {
                tableModel.addRow(new Object[]{
                    phong1.getMaPhong(), phong1.getTenPhong()
                });
            }
        } catch (SQLException ex) {
            Logger.getLogger(PhongService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(QuanTriPhong_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanTriPhong_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanTriPhong_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanTriPhong_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new QuanTriPhong_Form().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(QuanTriPhong_Form.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnXem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbCoso;
    private javax.swing.JComboBox<String> cbDaynha;
    private javax.swing.JComboBox<String> cbTang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbview;
    private javax.swing.JButton them;
    private javax.swing.JTextField txtmaphongsua;
    private javax.swing.JTextField txttenphongsua;
    // End of variables declaration//GEN-END:variables
    private void showComboData() throws SQLException {
        ArrayList<CoSo> dsCoSo = phongservice.getDsCoSo();
        for (CoSo coSo : dsCoSo) {
            cbCoso.addItem(coSo.getMaCoSo());
        }
    }
}
