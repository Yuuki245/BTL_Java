package views;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;
import models.GiaoVien;
import services.AccountService;

public class DangKy_Form extends javax.swing.JFrame {

    public DangKy_Form() {
        initComponents();

        Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/haui-logo.jpg"));
        setIconImage(image);
        this.getContentPane().setBackground(Color.white);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        quanlyphonghoc = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        email_txt = new javax.swing.JTextField();
        pass_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_signup = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        magv_txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tengv_txt = new javax.swing.JTextField();
        quanlyphonghoc1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng ký");

        quanlyphonghoc.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        quanlyphonghoc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quanlyphonghoc.setText("Quản lý phòng học");

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel1.setText("Email:");

        email_txt.setName("txt_email"); // NOI18N
        email_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_txtActionPerformed(evt);
            }
        });
        email_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                email_txtKeyPressed(evt);
            }
        });

        pass_txt.setName("txt_pass"); // NOI18N
        pass_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pass_txtKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel2.setText("Mật khẩu:");

        btn_signup.setText("Đăng ký");
        btn_signup.setToolTipText("");
        btn_signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signupActionPerformed(evt);
            }
        });

        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel3.setText("Mã GV:");

        magv_txt.setName("txt_magv"); // NOI18N
        magv_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ma_gvtxtKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        jLabel4.setText("Tên GV:");

        tengv_txt.setName("txt_tengv"); // NOI18N
        tengv_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tengv_txtActionPerformed(evt);
            }
        });
        tengv_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tengv_txtKeyPressed(evt);
            }
        });

        quanlyphonghoc1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        quanlyphonghoc1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quanlyphonghoc1.setText("Đăng ký");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(quanlyphonghoc, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(63, 63, 63)
                                .addComponent(tengv_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(63, 63, 63)
                                .addComponent(magv_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(email_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btn_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(44, 44, 44)
                        .addComponent(pass_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(95, 95, 95))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(quanlyphonghoc1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(quanlyphonghoc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quanlyphonghoc1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(magv_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tengv_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(email_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pass_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_signup)
                    .addComponent(btn_reset))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void email_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_txtActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        magv_txt.setText("");
        tengv_txt.setText("");
        email_txt.setText("");
        pass_txt.setText("");
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signupActionPerformed
        String email = email_txt.getText();
        String password = pass_txt.getText();
        String magv = magv_txt.getText();
        String tengv = tengv_txt.getText();

        try {
            if (email.isEmpty() || password.isEmpty() || magv.isEmpty() || tengv.isEmpty()) {
                throw new Exception("Không được bỏ trống các trường dữ liệu!");
            }

            if (password.length() < 6) {
                throw new Exception("Độ dài mật khẩu ít nhất 6 ký tự");
            }

            if (!AccountService.isEmailValid(email)) {
                throw new Exception("Email không hợp lệ, hãy thử lại");
            }

            GiaoVien gv;
            gv = AccountService.getAccountByMaND(magv);
            if (gv != null) {
                throw new Exception("Tài khoản đã tồn tại");
            }

            gv = new GiaoVien(magv, tengv, email, password);
            AccountService.createAdminAccount(gv);

            JOptionPane.showMessageDialog(this, "Đăng ký thành công!");
            DangNhap_Form.displaySignin();

            dispose();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_signupActionPerformed

    private void tengv_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tengv_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tengv_txtActionPerformed

    private void ma_gvtxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ma_gvtxtKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ma_gvtxtKeyPressed

    private void tengv_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tengv_txtKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tengv_txtKeyPressed

    private void email_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_email_txtKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_txtKeyPressed

    private void pass_txtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pass_txtKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_pass_txtKeyPressed

    public static void main(String args[]) throws ClassNotFoundException {

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
                new DangKy_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_signup;
    private javax.swing.JTextField email_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField magv_txt;
    private javax.swing.JTextField pass_txt;
    private javax.swing.JLabel quanlyphonghoc;
    private javax.swing.JLabel quanlyphonghoc1;
    private javax.swing.JTextField tengv_txt;
    // End of variables declaration//GEN-END:variables
}
