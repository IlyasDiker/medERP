/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mederp;

import java.awt.Component;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import javax.swing.table.TableModel;

/**
 *
 * @author ilyas
 */
public class employees extends javax.swing.JInternalFrame {


    static TableModel tb;
    
    public static void filltable(){
        tb = CNX.FillTable("SELECT id, username, nom, prenom, role, specialite FROM users");
        UsersTable.setModel(tb);
    }
    
    /**
     * Creates new form employees
     */
    public employees() {
        initComponents();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        UsersTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        adduserbtn = new javax.swing.JButton();
        edituserbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        refreshbtn = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Manage Employees");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        UsersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        )
    );
    UsersTable.setFocusable(false);
    UsersTable.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            UsersTableMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(UsersTable);

    jPanel1.setBackground(new java.awt.Color(0, 102, 153));

    jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(255, 255, 255));
    jLabel2.setText("Manage Employees");
    jLabel2.setToolTipText("");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(34, 34, 34)
            .addComponent(jLabel2)
            .addContainerGap(341, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(20, 20, 20)
            .addComponent(jLabel2)
            .addGap(20, 20, 20))
    );

    adduserbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mederp/images/icons8-add.png"))); // NOI18N
    adduserbtn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            adduserbtnActionPerformed(evt);
        }
    });

    edituserbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mederp/images/icons8-edit.png"))); // NOI18N
    edituserbtn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            edituserbtnActionPerformed(evt);
        }
    });

    deletebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mederp/images/icons8-delete_bin.png"))); // NOI18N
    deletebtn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            deletebtnActionPerformed(evt);
        }
    });

    refreshbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mederp/images/icons8-refresh.png"))); // NOI18N
    refreshbtn.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            refreshbtnActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(layout.createSequentialGroup()
            .addGap(14, 14, 14)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(edituserbtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deletebtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(adduserbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(refreshbtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(adduserbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(edituserbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(refreshbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(16, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        filltable();
    }//GEN-LAST:event_formInternalFrameOpened

    private void refreshbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshbtnActionPerformed
        filltable();
    }//GEN-LAST:event_refreshbtnActionPerformed

    private void edituserbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edituserbtnActionPerformed
        
        try {
            // System.out.println(id);/
            int row = UsersTable.getSelectedRow();
            int id = Integer.parseInt((String) UsersTable.getValueAt(row, 0));
            mainapp.openformemployee(false, id);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Please select a user first");
            Logger.getLogger(employees.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_edituserbtnActionPerformed

    private void adduserbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adduserbtnActionPerformed
        try {
            mainapp.openformemployee(true, -1);
        } catch (SQLException ex) {
            Logger.getLogger(employees.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_adduserbtnActionPerformed

    private void UsersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsersTableMouseClicked

    }//GEN-LAST:event_UsersTableMouseClicked

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        int row = UsersTable.getSelectedRow();
        int id = Integer.parseInt((String) UsersTable.getValueAt(row, 0));
        String fullName = ((String) UsersTable.getValueAt(row, 2))+" "+((String) UsersTable.getValueAt(row, 3));
        // System.out.println(id);
        int selectedOption = JOptionPane.showConfirmDialog(null, 
                "Are you shure you want to delete user :"+fullName+" ?", 
                "Delete User", JOptionPane.YES_NO_OPTION);
        if (selectedOption == JOptionPane.YES_OPTION){
            boolean isDone = CNX.AMS_request("DELETE FROM users WHERE id = "+id);
            if (isDone){
                JOptionPane.showMessageDialog(null, "User Deleted Successfully");
            } else {
                JOptionPane.showMessageDialog(null, "You can't delete this user");
            }
            filltable();
        }
        
    }//GEN-LAST:event_deletebtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTable UsersTable;
    private javax.swing.JButton adduserbtn;
    private javax.swing.JButton deletebtn;
    private javax.swing.JButton edituserbtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshbtn;
    // End of variables declaration//GEN-END:variables
}
