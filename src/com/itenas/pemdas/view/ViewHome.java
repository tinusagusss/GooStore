/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itenas.pemdas.view;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author LENOVO
 */
public class ViewHome extends javax.swing.JFrame {

    /**
     * Creates new form viewStore
     */
    Color blue = new Color(7, 71, 166);
    int i = 0;

    public ViewHome() {
        initComponents();
        try {
            ImageIcon image = new ImageIcon(getClass().getResource("/com/itenas/pemdas/image/icons8_a_30px_2.png"));
            setIconImage(image.getImage());
            setTitle("GooStore");
        } catch (Exception e) {
            System.out.println("Gambar Tidak Ada");
        }
        setResizable(false);
        setLocationRelativeTo(this);
        Home.setVisible(true);
        
            JPanel viewEmployee = new ViewEmployee();
        try {
            add(viewEmployee, BorderLayout.CENTER);
            Home.setVisible(false);
        } catch (Exception e) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sideBar = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnAbout = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btmRegion = new javax.swing.JButton();
        btnEmployee = new javax.swing.JButton();
        btnStore = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Home = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1920, 1280));
        setMinimumSize(new java.awt.Dimension(1250, 700));

        sideBar.setBackground(new java.awt.Color(7, 71, 166));
        sideBar.setMaximumSize(new java.awt.Dimension(320, 700));
        sideBar.setMinimumSize(new java.awt.Dimension(290, 700));
        sideBar.setPreferredSize(new java.awt.Dimension(300, 700));
        sideBar.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(6, 63, 149));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/itenas/pemdas/image/icons8_a_30px.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setDefaultCapable(false);
        jButton1.setFocusPainted(false);
        jButton1.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton1.setVerifyInputWhenFocusTarget(false);

        btnAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/itenas/pemdas/image/icons8_user_24px.png"))); // NOI18N
        btnAbout.setBorderPainted(false);
        btnAbout.setContentAreaFilled(false);
        btnAbout.setDefaultCapable(false);
        btnAbout.setFocusPainted(false);
        btnAbout.setPreferredSize(new java.awt.Dimension(40, 40));
        btnAbout.setVerifyInputWhenFocusTarget(false);
        btnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/itenas/pemdas/image/icons8_search_30px.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setDefaultCapable(false);
        jButton3.setFocusPainted(false);
        jButton3.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton3.setVerifyInputWhenFocusTarget(false);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/itenas/pemdas/image/icons8_menu_30px.png"))); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setDefaultCapable(false);
        jButton4.setFocusPainted(false);
        jButton4.setPreferredSize(new java.awt.Dimension(40, 40));
        jButton4.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAbout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAbout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        sideBar.add(jPanel1, java.awt.BorderLayout.WEST);

        jPanel4.setBackground(new java.awt.Color(7, 71, 166));
        jPanel4.setMaximumSize(new java.awt.Dimension(230, 32767));
        jPanel4.setOpaque(false);
        jPanel4.setRequestFocusEnabled(false);

        btnHome.setBackground(new java.awt.Color(7, 71, 166));
        btnHome.setFont(new java.awt.Font("Open Sans", 0, 22)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/itenas/pemdas/image/icons8_home_24px.png"))); // NOI18N
        btnHome.setText("Home");
        btnHome.setBorder(null);
        btnHome.setBorderPainted(false);
        btnHome.setContentAreaFilled(false);
        btnHome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnHome.setDefaultCapable(false);
        btnHome.setFocusPainted(false);
        btnHome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnHome.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnHome.setIconTextGap(10);
        btnHome.setMargin(new java.awt.Insets(0, 14, 0, 14));
        btnHome.setPreferredSize(null);
        btnHome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnHomeFocusGained(evt);
            }
        });
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btmRegion.setBackground(new java.awt.Color(7, 71, 166));
        btmRegion.setFont(new java.awt.Font("Open Sans", 0, 22)); // NOI18N
        btmRegion.setForeground(new java.awt.Color(255, 255, 255));
        btmRegion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/itenas/pemdas/image/icons8_online_store_24px.png"))); // NOI18N
        btmRegion.setText("Region");
        btmRegion.setBorder(null);
        btmRegion.setBorderPainted(false);
        btmRegion.setContentAreaFilled(false);
        btmRegion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btmRegion.setDefaultCapable(false);
        btmRegion.setFocusPainted(false);
        btmRegion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btmRegion.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btmRegion.setIconTextGap(10);
        btmRegion.setMargin(new java.awt.Insets(0, 14, 0, 14));
        btmRegion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btmRegionFocusGained(evt);
            }
        });
        btmRegion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmRegionActionPerformed(evt);
            }
        });

        btnEmployee.setBackground(new java.awt.Color(7, 71, 166));
        btnEmployee.setFont(new java.awt.Font("Open Sans", 0, 22)); // NOI18N
        btnEmployee.setForeground(new java.awt.Color(255, 255, 255));
        btnEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/itenas/pemdas/image/icons8_member_24px.png"))); // NOI18N
        btnEmployee.setText("Employee");
        btnEmployee.setBorder(null);
        btnEmployee.setBorderPainted(false);
        btnEmployee.setContentAreaFilled(false);
        btnEmployee.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEmployee.setFocusPainted(false);
        btnEmployee.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEmployee.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnEmployee.setIconTextGap(10);
        btnEmployee.setMargin(new java.awt.Insets(0, 14, 0, 14));
        btnEmployee.setPreferredSize(null);
        btnEmployee.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnEmployeeFocusGained(evt);
            }
        });
        btnEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeActionPerformed(evt);
            }
        });

        btnStore.setBackground(new java.awt.Color(7, 71, 166));
        btnStore.setFont(new java.awt.Font("Open Sans", 0, 22)); // NOI18N
        btnStore.setForeground(new java.awt.Color(255, 255, 255));
        btnStore.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/itenas/pemdas/image/icons8_Location_24px_1.png"))); // NOI18N
        btnStore.setText("Store");
        btnStore.setBorder(null);
        btnStore.setBorderPainted(false);
        btnStore.setContentAreaFilled(false);
        btnStore.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnStore.setDefaultCapable(false);
        btnStore.setFocusPainted(false);
        btnStore.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnStore.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnStore.setIconTextGap(10);
        btnStore.setMargin(new java.awt.Insets(0, 14, 0, 14));
        btnStore.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btnStoreFocusGained(evt);
            }
        });
        btnStore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStoreActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/itenas/pemdas/image/GooStore.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 5, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStore, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btmRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnStore, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btmRegion, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(347, Short.MAX_VALUE))
        );

        sideBar.add(jPanel4, java.awt.BorderLayout.CENTER);

        getContentPane().add(sideBar, java.awt.BorderLayout.LINE_START);
        sideBar.getAccessibleContext().setAccessibleDescription("");

        Home.setBackground(new java.awt.Color(255, 255, 255));
        Home.setMaximumSize(new java.awt.Dimension(1680, 1280));
        Home.setMinimumSize(new java.awt.Dimension(900, 650));
        Home.setPreferredSize(new java.awt.Dimension(900, 650));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setMinimumSize(new java.awt.Dimension(600, 700));
        jPanel7.setNextFocusableComponent(Home);
        jPanel7.setPreferredSize(new java.awt.Dimension(900, 1280));
        jPanel7.setLayout(new java.awt.BorderLayout(5, 5));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setMaximumSize(new java.awt.Dimension(1400, 300));
        jPanel5.setMinimumSize(new java.awt.Dimension(950, 100));
        jPanel5.setPreferredSize(new java.awt.Dimension(950, 120));

        jLabel2.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jLabel2.setText("Home");
        jLabel2.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addContainerGap(869, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel7.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setMaximumSize(new java.awt.Dimension(1980, 1280));
        jPanel6.setMinimumSize(new java.awt.Dimension(1250, 1280));
        jPanel6.setName(""); // NOI18N
        jPanel6.setNextFocusableComponent(jLabel6);
        jPanel6.setPreferredSize(new java.awt.Dimension(1000, 500));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 30, 30);
        flowLayout1.setAlignOnBaseline(true);
        jPanel6.setLayout(flowLayout1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 0, 0, 0, new java.awt.Color(7, 71, 166)));
        jPanel2.setPreferredSize(new java.awt.Dimension(1680, 140));

        jLabel4.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jLabel4.setText("Good Morning");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/itenas/pemdas/image/icons8_a_30px_2.png"))); // NOI18N
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel6.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel6.setText("Welcome to GooStore Home's ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(28, 28, 28)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.add(jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 0, 0, 0, new java.awt.Color(7, 71, 166)));
        jPanel3.setPreferredSize(new java.awt.Dimension(800, 335));

        jLabel7.setFont(new java.awt.Font("Open Sans", 1, 14)); // NOI18N
        jLabel7.setText("Sales Overview");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/itenas/pemdas/image/Asset 2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        jPanel6.add(jPanel3);
        jPanel3.getAccessibleContext().setAccessibleName("");

        jPanel7.add(jPanel6, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeLayout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
                .addContainerGap())
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(Home, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutActionPerformed

    }//GEN-LAST:event_btnAboutActionPerformed

    private void btnStoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStoreActionPerformed

    }//GEN-LAST:event_btnStoreActionPerformed

    private void btnStoreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnStoreFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_btnStoreFocusGained

    private void btnEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeActionPerformed

    }//GEN-LAST:event_btnEmployeeActionPerformed

    private void btnEmployeeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnEmployeeFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEmployeeFocusGained

    private void btmRegionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmRegionActionPerformed

    }//GEN-LAST:event_btmRegionActionPerformed

    private void btmRegionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btmRegionFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_btmRegionFocusGained

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed

    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnHomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btnHomeFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHomeFocusGained

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
            java.util.logging.Logger.getLogger(ViewHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Home;
    private javax.swing.JButton btmRegion;
    private javax.swing.JButton btnAbout;
    private javax.swing.JButton btnEmployee;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnStore;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel sideBar;
    // End of variables declaration//GEN-END:variables
}
