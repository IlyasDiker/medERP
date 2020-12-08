/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mederp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author ilyas
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        usernamefield = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        passfield = new javax.swing.JPasswordField();
        loginbtn = new javax.swing.JButton();
        errorfield = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("medERP | Login");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ERP");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 80, 340, 43);

        jLabel3.setFont(new java.awt.Font("Corporate A", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 204));
        jLabel3.setText("LS Medical Center");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 40, 340, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mederp/images/loginbg.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 490, 170);

        jLabel4.setText("Username");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(100, 190, 90, 16);
        getContentPane().add(usernamefield);
        usernamefield.setBounds(100, 210, 290, 40);

        jLabel5.setText("Password");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(100, 260, 90, 16);
        getContentPane().add(passfield);
        passfield.setBounds(100, 280, 290, 40);

        loginbtn.setText("Login");
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });
        getContentPane().add(loginbtn);
        loginbtn.setBounds(100, 340, 290, 40);

        errorfield.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(errorfield);
        errorfield.setBounds(100, 390, 290, 20);

        setSize(new java.awt.Dimension(489, 456));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
        String Username = usernamefield.getText().toString();
        String Password = passfield.getText().toString();
        
        String TABLE_NAME = "users";
        
        ResultSet rs = CNX.Select_request("SELECT * FROM "+TABLE_NAME+" WHERE username = '"+Username+"' and password = '"+Password+"'");
        
        try {
            if (rs.next()){
                int id = rs.getInt("id");
                JFrame mainapp = new mainapp(id);
                mainapp.setVisible(true);
                this.setVisible(false);
            }else {
                errorfield.setText("Wrong Username/Password combination !");
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        
        
                
                
    }//GEN-LAST:event_loginbtnActionPerformed

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
                if ("Mac Os".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel errorfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton loginbtn;
    private javax.swing.JPasswordField passfield;
    private javax.swing.JTextField usernamefield;
    // End of variables declaration//GEN-END:variables
}
