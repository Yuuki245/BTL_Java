package views;

import ConnectDB.ConnectionDB;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;
import models.GiaoVien;
import services.AccountService;

public class DangNhap_Form extends javax.swing.JFrame {

    public DangNhap_Form() {
        initComponents();

        try {
            Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/haui-logo.jpg"));
            if (image == null) {
                throw new IllegalStateException("Không tìm thấy file logo: /images/haui-logo.jpg");
            }
            setIconImage(image);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lỗi tải logo: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(DangNhap_Form.class.getName()).log(Level.SEVERE, null, e);
        }
        this.getContentPane().setBackground(Color.white);

        cbHinhThuc.addItem("Quản trị viên");
        cbHinhThuc.addItem("Giảng viên");
    }

    public static String maNDHT;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        quanlyphonghoc = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        email_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_signin = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        quanlyphonghoc1 = new javax.swing.JLabel();
        pass_txt = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        cbHinhThuc = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng nhập");
        setBackground(new java.awt.Color(153, 255, 102));

        quanlyphonghoc.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        quanlyphonghoc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quanlyphonghoc.setText("Quản lý phòng học");

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel1.setText("Email:");

        email_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_txtActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel2.setText("Mật khẩu:");

        btn_signin.setBackground(new java.awt.Color(0, 204, 204));
        btn_signin.setForeground(new java.awt.Color(255, 255, 255));
        btn_signin.setText("Đăng nhập");
        btn_signin.setToolTipText("");
        btn_signin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signinActionPerformed(evt);
            }
        });

        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        quanlyphonghoc1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        quanlyphonghoc1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quanlyphonghoc1.setText("Đăng nhập");

        pass_txt.setToolTipText("");
        pass_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass_txtActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Hiển thị");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel4.setText("Hình thức:");

        cbHinhThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbHinhThucActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/haui-logo.jpg"))); // NOI18N
        jLabel5.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(quanlyphonghoc1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(37, 37, 37)
                            .addComponent(cbHinhThuc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                            .addGap(37, 37, 37)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pass_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_signin)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(quanlyphonghoc, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(quanlyphonghoc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel5)
                .addGap(50, 50, 50)
                .addComponent(quanlyphonghoc1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbHinhThuc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(14, 14, 14)
                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_signin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void email_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_txtActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        email_txt.setText("");
        pass_txt.setText("");
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_signinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signinActionPerformed
        String email = email_txt.getText();
        String password = String.valueOf(pass_txt.getPassword());

        try {

            if (email.isEmpty() || password.isEmpty()) {
                throw new Exception("Email hoặc mật khẩu không được để trống!");
            }

            if (password.length() < 6) {
                throw new Exception("Độ dài mật khẩu ít nhất 6 ký tự");
            }

            if (!AccountService.isEmailValid(email)) {
                throw new Exception("Email không hợp lệ, hãy thử lại");
            }

            int role = cbHinhThuc.getSelectedItem().toString().equals("Giảng viên") ? 0 : 1;
            handleSignin(email, password, role);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_signinActionPerformed

    private void pass_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pass_txtActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        if (jCheckBox1.isSelected())
            pass_txt.setEchoChar((char) 0);
        else
            pass_txt.setEchoChar('*');
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void cbHinhThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbHinhThucActionPerformed

    }//GEN-LAST:event_cbHinhThucActionPerformed

    private void handleSignin(String email, String password, int role) {
    GiaoVien giaovien = AccountService.getAccountByEmail(email, role);
    try {
        if (giaovien == null) {
            throw new Exception("Tài khoản không tồn tại");
        }

        // So sánh chuỗi trực tiếp thay vì BCrypt
        if (!password.equals(giaovien.getPassword())) {
            throw new Exception("Mật khẩu không chính xác");
        }

        maNDHT = giaovien.getMaND();

        if (role == 1) {
            MenuQuanTri_Form.displayMenu();
        } else {
            MenuGiangVien_Form.displayMenu();
        }

        dispose();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(rootPane, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
    }
}


    public static void displaySignin() throws ClassNotFoundException {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus".equals(info.getName())) {
                try {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                } catch (InstantiationException ex) {
                    Logger.getLogger(DangNhap_Form.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(DangNhap_Form.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(DangNhap_Form.class.getName()).log(Level.SEVERE, null, ex);
                }
                break;
            }
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhap_Form().setVisible(true);
            }
        });
    }

    public static void main(String args[]) throws ClassNotFoundException {

        displaySignin();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_signin;
    private javax.swing.JComboBox<String> cbHinhThuc;
    private javax.swing.JTextField email_txt;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField pass_txt;
    private javax.swing.JLabel quanlyphonghoc;
    private javax.swing.JLabel quanlyphonghoc1;
    // End of variables declaration//GEN-END:variables
}
