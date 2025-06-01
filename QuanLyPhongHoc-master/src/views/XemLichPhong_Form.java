/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import models.ChiTietPhongHoc;
import services.ChiTietPhongService;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tunga
 */
public class XemLichPhong_Form extends javax.swing.JDialog {


    public XemLichPhong_Form(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        this.setLocationRelativeTo(null);

        Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/haui-logo.jpg"));
        setIconImage(image);
        this.getContentPane().setBackground(Color.getHSBColor(0.0f, 0.0f, 0.9f));
    }

    // Hàm render dữ liệu lên form lịch 
    public void LoadLich(String tenPhong) {
        try {
            addSubject(panelT2, 2, tenPhong);
            addSubject(panelT3, 3, tenPhong);
            addSubject(panelT4, 4, tenPhong);
            addSubject(panelT5, 5, tenPhong);
            addSubject(panelT6, 6, tenPhong);
            addSubject(panelT7, 7, tenPhong);
            addSubject(panelCN, 8, tenPhong);
        } catch (SQLException ex) {
            Logger.getLogger(XemLichPhong_Form.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Hàm render dữ liệu lên panel
    private void addSubject(JPanel panelThu, int thu, String tenPhong) throws SQLException {

        // Logic tính toán thứ, ngày trong tuần hiện tại
        Calendar c = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        Date day = c.getTime();
        if (thu < dayOfWeek) {
            c.add(Calendar.DATE, -(dayOfWeek - thu));
            day = c.getTime();
        } else if (thu > dayOfWeek) {
            c.add(Calendar.DATE, +(thu - dayOfWeek));
            day = c.getTime();
        }

        // Lấy danh sách chi tiết phòng theo logic
        ArrayList<ChiTietPhongHoc> tmp = ChiTietPhongService.getDsCTPhongHocTheoNgayVaTenPhong(formatter.format(day), tenPhong);
        ArrayList<ChiTietPhongHoc> dsTiet = ChiTietPhongService.getDsCTPhongGomCaTietTrong(tmp);

        // Render thông tin vê tiêu đề và ngày
        lblTieuDe.setText("Lịch đăng ký phòng " + tenPhong + " trong tuần");
        switch (thu) {
            case 2:
                lblNgayT2.setText(formatter.format(day));
                break;
            case 3:
                lblNgayT3.setText(formatter.format(day));
                break;
            case 4:
                lblNgayT4.setText(formatter.format(day));
                break;
            case 5:
                lblNgayT5.setText(formatter.format(day));
                break;
            case 6:
                lblNgayT6.setText(formatter.format(day));
                break;
            case 7:
                lblNgayT7.setText(formatter.format(day));
                break;
            case 8:
                lblNgayCN.setText(formatter.format(day));
                break;
            default:
                throw new AssertionError();
        }
        // Tạo group layout cho panel
        javax.swing.GroupLayout panelT2Layout = new javax.swing.GroupLayout(panelThu);
        GroupLayout.SequentialGroup gr2 = panelT2Layout.createSequentialGroup();
        GroupLayout.ParallelGroup gr1 = panelT2Layout.createParallelGroup();

        // Logic tính khoảng cách, tạo viền 
        gr1.addGap(36, 36, 36);
        for (int i = 0; i < dsTiet.size(); ++i) {
            ChiTietPhongHoc curr = dsTiet.get(i);
            int height = (curr.getTietHocKetThuc() - curr.getTietHocBatDau() + 1) * 39 + 3 * (curr.getTietHocKetThuc() - curr.getTietHocBatDau());
            JLabel mon = new JLabel();
            mon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            mon.setFont(new java.awt.Font("Segoe UI", 0, 14));
            mon.setText(curr.inDL()); // Nhận lại chuỗi HTML
            if (curr.getTinhTrang() == 1) {
                mon.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
            }

            gr1.addComponent(mon, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE);

            gr2.addGap(3, 3, 3);
            gr2.addComponent(mon, javax.swing.GroupLayout.PREFERRED_SIZE, height, javax.swing.GroupLayout.PREFERRED_SIZE);
        }
        // Render dữ liệu lên panel
        gr2.addGap(3, 3, 3);
        panelThu.setLayout(panelT2Layout);
        panelT2Layout.setHorizontalGroup(
                panelT2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelT2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(gr1)
                                .addContainerGap())
        );

        panelT2Layout.setVerticalGroup(
                panelT2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(gr2)
        );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelChinh = new javax.swing.JPanel();
        panelT2 = new javax.swing.JPanel();
        panelT3 = new javax.swing.JPanel();
        panelT4 = new javax.swing.JPanel();
        panelT5 = new javax.swing.JPanel();
        panelT6 = new javax.swing.JPanel();
        panelT7 = new javax.swing.JPanel();
        panelCN = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblTieuDe = new javax.swing.JLabel();
        lblNgayT3 = new javax.swing.JLabel();
        lblNgayT2 = new javax.swing.JLabel();
        lblNgayT5 = new javax.swing.JLabel();
        lblNgayT4 = new javax.swing.JLabel();
        lblNgayT7 = new javax.swing.JLabel();
        lblNgayT6 = new javax.swing.JLabel();
        lblNgayCN = new javax.swing.JLabel();
        btnDong = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Lịch giảng dạy");

        panelChinh.setPreferredSize(new java.awt.Dimension(1345, 764));

        panelT2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(176, 168, 185), 2, true));
        panelT2.setToolTipText("Thời khóa biểu");
        panelT2.setPreferredSize(new java.awt.Dimension(220, 612));

        javax.swing.GroupLayout panelT2Layout = new javax.swing.GroupLayout(panelT2);
        panelT2.setLayout(panelT2Layout);
        panelT2Layout.setHorizontalGroup(
            panelT2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 181, Short.MAX_VALUE)
        );
        panelT2Layout.setVerticalGroup(
            panelT2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelT3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(176, 168, 185), 2, true));
        panelT3.setPreferredSize(new java.awt.Dimension(220, 612));

        javax.swing.GroupLayout panelT3Layout = new javax.swing.GroupLayout(panelT3);
        panelT3.setLayout(panelT3Layout);
        panelT3Layout.setHorizontalGroup(
            panelT3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 181, Short.MAX_VALUE)
        );
        panelT3Layout.setVerticalGroup(
            panelT3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelT4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(176, 168, 185), 2, true));
        panelT4.setPreferredSize(new java.awt.Dimension(220, 612));

        javax.swing.GroupLayout panelT4Layout = new javax.swing.GroupLayout(panelT4);
        panelT4.setLayout(panelT4Layout);
        panelT4Layout.setHorizontalGroup(
            panelT4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 181, Short.MAX_VALUE)
        );
        panelT4Layout.setVerticalGroup(
            panelT4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelT5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(176, 168, 185), 2, true));
        panelT5.setPreferredSize(new java.awt.Dimension(220, 612));

        javax.swing.GroupLayout panelT5Layout = new javax.swing.GroupLayout(panelT5);
        panelT5.setLayout(panelT5Layout);
        panelT5Layout.setHorizontalGroup(
            panelT5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 181, Short.MAX_VALUE)
        );
        panelT5Layout.setVerticalGroup(
            panelT5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelT6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(176, 168, 185), 2, true));
        panelT6.setPreferredSize(new java.awt.Dimension(220, 612));

        javax.swing.GroupLayout panelT6Layout = new javax.swing.GroupLayout(panelT6);
        panelT6.setLayout(panelT6Layout);
        panelT6Layout.setHorizontalGroup(
            panelT6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 181, Short.MAX_VALUE)
        );
        panelT6Layout.setVerticalGroup(
            panelT6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelT7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(176, 168, 185), 2, true));
        panelT7.setPreferredSize(new java.awt.Dimension(220, 612));

        javax.swing.GroupLayout panelT7Layout = new javax.swing.GroupLayout(panelT7);
        panelT7.setLayout(panelT7Layout);
        panelT7Layout.setHorizontalGroup(
            panelT7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 181, Short.MAX_VALUE)
        );
        panelT7Layout.setVerticalGroup(
            panelT7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panelCN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(176, 168, 185), 2));
        panelCN.setPreferredSize(new java.awt.Dimension(220, 612));

        javax.swing.GroupLayout panelCNLayout = new javax.swing.GroupLayout(panelCN);
        panelCN.setLayout(panelCNLayout);
        panelCNLayout.setHorizontalGroup(
            panelCNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 181, Short.MAX_VALUE)
        );
        panelCNLayout.setVerticalGroup(
            panelCNLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Thứ 2");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Thứ 3");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Thứ 4");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Thứ 5");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Thứ 6");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Thứ 7");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Chủ nhật");

        lblTieuDe.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTieuDe.setText("Lịch đăng ký phòng trong tuần");

        lblNgayT3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNgayT3.setText("jLabel8");

        lblNgayT2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNgayT2.setText("jLabel8");

        lblNgayT5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNgayT5.setText("jLabel8");

        lblNgayT4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNgayT4.setText("jLabel8");

        lblNgayT7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNgayT7.setText("jLabel8");

        lblNgayT6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNgayT6.setText("jLabel8");

        lblNgayCN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNgayCN.setText("jLabel8");

        btnDong.setBackground(new java.awt.Color(244, 244, 244));
        btnDong.setText("Đóng");
        btnDong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelChinhLayout = new javax.swing.GroupLayout(panelChinh);
        panelChinh.setLayout(panelChinhLayout);
        panelChinhLayout.setHorizontalGroup(
            panelChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChinhLayout.createSequentialGroup()
                .addGroup(panelChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelChinhLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelT2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelT3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelT4, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelChinhLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(151, 151, 151)
                        .addComponent(jLabel3)
                        .addGap(75, 75, 75)))
                .addGroup(panelChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelChinhLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(151, 151, 151)
                        .addComponent(jLabel6)
                        .addGap(138, 138, 138)
                        .addComponent(jLabel7)
                        .addGap(75, 75, 75))
                    .addGroup(panelChinhLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(panelT5, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelT6, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelT7, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelCN, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(14, Short.MAX_VALUE))))
            .addGroup(panelChinhLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDong)
                .addGap(438, 438, 438)
                .addComponent(lblTieuDe)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelChinhLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(lblNgayT2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(lblNgayT3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(lblNgayT4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(lblNgayT5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblNgayT6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(lblNgayT7, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102)
                .addComponent(lblNgayCN, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        panelChinhLayout.setVerticalGroup(
            panelChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChinhLayout.createSequentialGroup()
                .addGroup(panelChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelChinhLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTieuDe))
                    .addComponent(btnDong))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNgayT3)
                    .addComponent(lblNgayT2)
                    .addComponent(lblNgayT5)
                    .addComponent(lblNgayT7)
                    .addComponent(lblNgayCN)
                    .addComponent(lblNgayT6)
                    .addComponent(lblNgayT4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelChinhLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelCN, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
                    .addComponent(panelT7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
                    .addComponent(panelT6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
                    .addComponent(panelT5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
                    .addComponent(panelT4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
                    .addComponent(panelT3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
                    .addComponent(panelT2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelChinh, javax.swing.GroupLayout.PREFERRED_SIZE, 1351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelChinh, javax.swing.GroupLayout.DEFAULT_SIZE, 769, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDongActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnDongActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(XemLichPhong_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XemLichPhong_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XemLichPhong_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XemLichPhong_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                XemLichPhong_Form dialog = new XemLichPhong_Form(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblNgayCN;
    private javax.swing.JLabel lblNgayT2;
    private javax.swing.JLabel lblNgayT3;
    private javax.swing.JLabel lblNgayT4;
    private javax.swing.JLabel lblNgayT5;
    private javax.swing.JLabel lblNgayT6;
    private javax.swing.JLabel lblNgayT7;
    private javax.swing.JLabel lblTieuDe;
    private javax.swing.JPanel panelCN;
    private javax.swing.JPanel panelChinh;
    private javax.swing.JPanel panelT2;
    private javax.swing.JPanel panelT3;
    private javax.swing.JPanel panelT4;
    private javax.swing.JPanel panelT5;
    private javax.swing.JPanel panelT6;
    private javax.swing.JPanel panelT7;
    // End of variables declaration//GEN-END:variables
}
