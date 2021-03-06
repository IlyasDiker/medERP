/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mederp;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

/**
 *
 * @author ilyas
 */
public class appoinement extends javax.swing.JInternalFrame {

    TableModel tb;
    String TABLE_NAME = "appointments";
    ResultSet RSG;
    ResultSet ClientRS;

    
    public appoinement() {
        initComponents();
    }
    
    public void filltable(){
        tb = CNX.FillTable("SELECT * FROM "+TABLE_NAME+" order by datetimestamp ASC");
        aplist.setModel(tb);
        ClientRS = CNX.Select_request("Select * from clients");
  
        try {
            clientcombo.removeAllItems();
            while(ClientRS.next()){
                String id = ClientRS.getString("CIN");
                clientcombo.addItem(id);
            }
        } catch (SQLException ex) {
            Logger.getLogger(appoinement.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public String getCIN(String id) throws SQLException{
        ResultSet rs2 = CNX.Select_request("Select cin from clients where id = "+id);
        while(rs2.next()){
            String CIN = rs2.getString("cin");
            return CIN;
        }
        return null;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        clientcombo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        desc = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        datespinner = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        reffield = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        aplist = new javax.swing.JTable();
        refreshbtn = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        addbtn = new javax.swing.JButton();
        editbtn = new javax.swing.JButton();
        delbtn = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Appointements");
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

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        title.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Appointments");
        title.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(title)
                .addGap(20, 20, 20))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Selected Appointement"));
        jPanel2.setToolTipText("");

        jLabel1.setText("Client");

        jLabel2.setText("Date");

        desc.setRows(5);
        jScrollPane2.setViewportView(desc);

        jLabel4.setText("Desc");

        datespinner.setModel(new javax.swing.SpinnerDateModel());

        jLabel3.setText("Ref");
        jLabel3.setEnabled(false);

        reffield.setEditable(false);
        reffield.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reffield)
                    .addComponent(clientcombo, 0, 195, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(datespinner))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(reffield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clientcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(datespinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        aplist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        aplist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aplistMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(aplist);

        refreshbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mederp/images/icons8-refresh.png"))); // NOI18N
        refreshbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshbtnActionPerformed(evt);
            }
        });

        clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mederp/images/icons8-delete.png"))); // NOI18N
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        addbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mederp/images/icons8-add.png"))); // NOI18N
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        editbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mederp/images/icons8-edit.png"))); // NOI18N
        editbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbtnActionPerformed(evt);
            }
        });

        delbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mederp/images/icons8-delete_bin.png"))); // NOI18N
        delbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refreshbtn))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                            .addComponent(editbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(refreshbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(delbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        
        filltable();
        
    }//GEN-LAST:event_formInternalFrameOpened

    private void aplistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aplistMouseClicked
        int row = aplist.getSelectedRow();
        String id = (String) aplist.getValueAt(row, 0);
        ResultSet rs = CNX.Select_request("SELECT * FROM "+TABLE_NAME+" WHERE id = "+id);
        try {
            while(rs.next()){
                reffield.setText(id);
                clientcombo.setSelectedItem(getCIN(rs.getString("client")));
                datespinner.setValue(rs.getTimestamp("datetimestamp"));
                desc.setText(rs.getString("description"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(appoinement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_aplistMouseClicked

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        String ClientCIN = (String) clientcombo.getSelectedItem();
        SimpleDateFormat formater = new SimpleDateFormat("YYYY-MM-dd HH:mm");
        String apdate = formater.format(datespinner.getValue());
        String description = desc.getText();
        ResultSet rs = CNX.Select_request("SELECT id from clients where CIN = '"+ClientCIN+"'");
        String id;
        try {
            while(rs.next()){
                id = rs.getString("id");
                String Query = "INSERT INTO appointments(client, datetimestamp, description) "
                        + "VALUES ("+id+", '"+apdate+"', '"+description+"')";
                System.out.println(Query);
                boolean isDone = CNX.AMS_request(Query);
                if (isDone){
                    JOptionPane.showMessageDialog(null, "Appointment Created Successfully");
                    filltable();
                } else {
                    JOptionPane.showMessageDialog(null, "Can't Reach Database");
                }
            }
                
        } catch (SQLException ex) {
            Logger.getLogger(appoinement.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_addbtnActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        desc.setText("");
        clientcombo.setSelectedItem("");
        reffield.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void refreshbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshbtnActionPerformed
        filltable();
    }//GEN-LAST:event_refreshbtnActionPerformed

    private void editbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbtnActionPerformed
        String ClientCIN = (String) clientcombo.getSelectedItem();
        SimpleDateFormat formater = new SimpleDateFormat("YYYY-MM-dd HH:mm");
        String apdate = formater.format(datespinner.getValue());
        String description = desc.getText();
        ResultSet rs = CNX.Select_request("SELECT id from clients where CIN = '"+ClientCIN+"'");
        String id;
        String ref = reffield.getText();
        try {
            while(rs.next()){
                id = rs.getString("id");
                
                String Query = "UPDATE "+TABLE_NAME+" SET client = '"+id+"', datetimestamp = '"+apdate+"', description = '"+description+"'"
                        + " WHERE id = "+ref;
                boolean isDone = CNX.AMS_request(Query);
                if (isDone){
                    JOptionPane.showMessageDialog(null, "Appointment Updated Successfully");
                    filltable();
                } else {
                    JOptionPane.showMessageDialog(null, "Can't Update this Appointment");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(appoinement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_editbtnActionPerformed

    private void delbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delbtnActionPerformed
        int row = aplist.getSelectedRow();
        int id = Integer.parseInt((String) aplist.getValueAt(row, 0));
        // System.out.println(id);
        int selectedOption = JOptionPane.showConfirmDialog(null, 
                "Are you shure you want to delete appointment number :"+id+" ?", 
                "Delete Appointment", JOptionPane.YES_NO_OPTION);
        if (selectedOption == JOptionPane.YES_OPTION){
            boolean isDone = CNX.AMS_request("DELETE FROM "+TABLE_NAME+" WHERE id = "+id);
            if (isDone){
                JOptionPane.showMessageDialog(null, "Appointment Deleted Successfully");
            } else {
                JOptionPane.showMessageDialog(null, "You can't delete this Appointment");
            }
            filltable();
        }
    }//GEN-LAST:event_delbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JTable aplist;
    private javax.swing.JButton clear;
    private javax.swing.JComboBox<String> clientcombo;
    private javax.swing.JSpinner datespinner;
    private javax.swing.JButton delbtn;
    private javax.swing.JTextArea desc;
    private javax.swing.JButton editbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField reffield;
    private javax.swing.JButton refreshbtn;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
