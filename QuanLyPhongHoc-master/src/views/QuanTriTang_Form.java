package views;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Tang;
import services.TangService;
import services.CoSoService;
import models.CoSo;
import models.DayNha;
import services.DayNhaService;
import services.PhongService;

public class QuanTriTang_Form extends javax.swing.JFrame {

    DefaultTableModel model = new DefaultTableModel();
    List<Tang> tangs = new ArrayList<>();
    List<Tang> tangTimKiem;
    String maTangChon;

    public QuanTriTang_Form() {
        initComponents();
        List<CoSo> cosos = CoSoService.readAllCoSo();

        for (CoSo a : cosos) {
            cbMaCoSo.addItem(a.getMaCoSo() + "");
        }

        model = (DefaultTableModel) tbTang.getModel();
        tangs = TangService.readAllTang();
        render("A1");

        Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/haui-logo.jpg"));
        setIconImage(image);
        this.getContentPane().setBackground(Color.getHSBColor(0.0f, 0.0f, 0.9f));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbTang = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbMaDayNha = new javax.swing.JComboBox<>();
        txttenTang = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cbMaCoSo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtMaTang = new javax.swing.JTextField();
        btnHome = new javax.swing.JButton();
        txtTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản trị tầng");

        btnSua.setBackground(new java.awt.Color(244, 244, 244));
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Edit.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(244, 244, 244));
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Delete.png"))); // NOI18N
        btnXoa.setText("Xoá");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnLamMoi.setBackground(new java.awt.Color(244, 244, 244));
        btnLamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Refresh.png"))); // NOI18N
        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        tbTang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã tầng", "Tên tầng", "Mã dãy nhà"
            }
        ));
        tbTang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbTang);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("Quản trị tầng");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Mã cơ sở:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Mã tầng:");

        cbMaDayNha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMaDayNhaActionPerformed(evt);
            }
        });

        txttenTang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttenTangActionPerformed(evt);
            }
        });

        btnThem.setBackground(new java.awt.Color(244, 244, 244));
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Add.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Mã dãy nhà:");

        cbMaCoSo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMaCoSoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Tên tầng:");

        txtMaTang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaTangActionPerformed(evt);
            }
        });

        btnHome.setBackground(new java.awt.Color(244, 244, 244));
        btnHome.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Home.png"))); // NOI18N
        btnHome.setText("Trang chủ");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnTimKiem.setBackground(new java.awt.Color(244, 244, 244));
        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Search.png"))); // NOI18N
        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnHome)
                        .addGap(168, 168, 168)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnLamMoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(19, 19, 19))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(27, 27, 27))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cbMaDayNha, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbMaCoSo, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txttenTang, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMaTang, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnTimKiem, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtTimKiem))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(btnHome)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbMaCoSo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbMaDayNha, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtMaTang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txttenTang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed

        int row = tbTang.getSelectedRow();
        try {
            if (row == -1) {
                throw new Exception("Hãy chọn một tầng để sửa");
            }

            String tenTangSua = txttenTang.getText();
            String maDayNha = cbMaDayNha.getSelectedItem().toString();

            if ("".equals(tenTangSua.trim())) {
                throw new Exception("Tên tầng không được bỏ trống");
            }
            Tang t = new Tang(maTangChon, tenTangSua, maDayNha);
            TangService.updateRecord(t);

            JOptionPane.showMessageDialog(null, "Sửa thông tin tầng thành công", "Thành công", JOptionPane.INFORMATION_MESSAGE);

            tangs.get(row).setTenTang(tenTangSua);
            tbTang.setValueAt(tenTangSua, row, 1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        int row = tbTang.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa chọn tầng nào để xóa", "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Object[] options = {"Hủy", "Đồng ý"};
        int confirm = JOptionPane.showOptionDialog(null, "Bạn có chắc chắn muốn xóa", "Warning",
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null,
                options, options[0]);

        if (confirm == 1) {
            try {
                if (!PhongService.getDsPhongTheoMaTang(maTangChon).isEmpty()) {
                    throw new Exception("Bạn không được phép xóa tầng này.");
                }

                TangService.deleteRecord(maTangChon);
                tangs.remove(row);
                model.removeRow(row);

                JOptionPane.showMessageDialog(null, "Xóa tầng thành công", "Thành công", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        txtMaTang.setText("");
        txttenTang.setText("");
        cbMaCoSo.setSelectedIndex(0);
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void tbTangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTangMouseClicked
        int row = tbTang.getSelectedRow();
        maTangChon = tbTang.getValueAt(row, 0).toString();
        String tenTangChon = (String) tbTang.getValueAt(row, 1);
        txtMaTang.setText(String.valueOf(maTangChon));
        txttenTang.setText(tenTangChon);

    }//GEN-LAST:event_tbTangMouseClicked

    private void cbMaDayNhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMaDayNhaActionPerformed
        if (cbMaDayNha.getSelectedItem() != null) {
            String maDayNha = cbMaDayNha.getSelectedItem().toString();
            render(maDayNha);
        }
    }//GEN-LAST:event_cbMaDayNhaActionPerformed

    private void txttenTangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttenTangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttenTangActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        try {
            String maDayNha = cbMaDayNha.getSelectedItem().toString();
            String maTang = txtMaTang.getText();
            String tenTang = txttenTang.getText();

            if ("".equals(maTang) || "".equals(tenTang)) {
                throw new Exception("Mã tầng hoặc tên tầng không được để trống");
            } else {
                Tang t = new Tang(maTang, tenTang, maDayNha);
                boolean check = TangService.checkFloorExisting(maTang);

                if (!check) {
                    throw new Exception("Mã tầng đã tồn tại, vui lòng chọn mã tầng khác");
                } else {

                    tangs.add(t);
                    TangService.insertRecord(t);
                    JOptionPane.showMessageDialog(null, "Thêm tầng thành công", "Thành công", JOptionPane.INFORMATION_MESSAGE);

                    model.addRow(new Object[]{
                        maTang,
                        tenTang,
                        maDayNha
                    });
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnThemActionPerformed

    private void cbMaCoSoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMaCoSoActionPerformed

        cbMaDayNha.removeAllItems();
        String maCoSo = cbMaCoSo.getSelectedItem().toString();
        List<DayNha> daynhas = DayNhaService.readAllDayNhaTheoCoSo(maCoSo);

        for (DayNha a : daynhas) {
            cbMaDayNha.addItem(a.getMaDayNha() + "");
        }

    }//GEN-LAST:event_cbMaCoSoActionPerformed

    private void txtMaTangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaTangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaTangActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed

        MenuQuanTri_Form qtMenu = new MenuQuanTri_Form();
        this.dispose();
        qtMenu.setVisible(true);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed

        try {
            tangTimKiem = new ArrayList<>();
            String tenTangTim = txtTimKiem.getText();
            for (Tang t : tangs) {
                if (t.getTenTang().contains(tenTangTim)) {
                    tangTimKiem.add(t);
                }
            }
            if (tangTimKiem.isEmpty()) {
                throw new Exception("Không tìm thấy.");
            }
            model.setRowCount(0);
            for (Tang t : tangTimKiem) {
                model.addRow(new Object[]{
                    t.getMaTang(),
                    t.getTenTang(),
                    t.getMaDayNha()
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "Thông báo", JOptionPane.OK_OPTION);
        }
    }//GEN-LAST:event_btnTimKiemActionPerformed

    public static void displayMenu() {
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
            java.util.logging.Logger.getLogger(QuanTriTang_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanTriTang_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanTriTang_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanTriTang_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanTriTang_Form().setVisible(true);
            }
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        displayMenu();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbMaCoSo;
    private javax.swing.JComboBox<String> cbMaDayNha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbTang;
    private javax.swing.JTextField txtMaTang;
    private javax.swing.JTextField txtTimKiem;
    private javax.swing.JTextField txttenTang;
    // End of variables declaration//GEN-END:variables

    private void render(String i) {
        model.setRowCount(0);
        for (Tang t : tangs) {
            if (t.getMaDayNha().compareTo(i) == 0) {
                model.addRow(new Object[]{
                    t.getMaTang(),
                    t.getTenTang(),
                    t.getMaDayNha()
                });
            }
        }
    }
}
