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
import javax.swing.JInternalFrame;

/**
 *
 * @author ilyas
 */
public class mainapp extends javax.swing.JFrame {
    
    // Global Variables
    static int userIndex;

    public static void openformemployee(boolean isNewUser, int id) throws SQLException {
        if (isNewUser) {
            JInternalFrame newemployeeframe = new userform();
            jDesktopPane1.add(newemployeeframe);
            newemployeeframe.setVisible(true);
        } else {
            JInternalFrame newemployeeframe2 = new userform(id);
            jDesktopPane1.add(newemployeeframe2);
            newemployeeframe2.setVisible(true);
        }
    }
    
    public static void openformclient(boolean isNewClient, int id) throws SQLException {
        if (isNewClient) {
            JInternalFrame newclientframe = new clientform();
            jDesktopPane1.add(newclientframe);
            newclientframe.setVisible(true);
        } else {
            JInternalFrame newclientframe2 = new clientform(id);
            jDesktopPane1.add(newclientframe2);
            newclientframe2.setVisible(true);
        }
    }
    
    ResultSet RSG;
    String TABLE_NAME = "users";
    // Global Internal Frames
    
    
    
    public mainapp(int id) {
        initComponents();
        userIndex = id;
        
        // add Internal frames
        
    }
    
    // GENERATED CODE HERE
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jSeparator1 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        accountsettings = new javax.swing.JMenuItem();
        Settings = new javax.swing.JMenuItem();
        Disconnect = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        gestionClients = new javax.swing.JMenu();
        addclient = new javax.swing.JMenuItem();
        manageclients = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        gestionCabinet = new javax.swing.JMenu();
        assurance = new javax.swing.JMenuItem();
        medicines = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        Administration = new javax.swing.JMenu();
        newemployee = new javax.swing.JMenuItem();
        manageemployee = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("medERP");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jDesktopPane1.setBackground(new java.awt.Color(0, 102, 153));
        jDesktopPane1.add(jSeparator1);

        jMenu2.setText("LS Medical Center");

        accountsettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mederp/images/icons8-edit.png"))); // NOI18N
        accountsettings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountsettingsActionPerformed(evt);
            }
        });
        jMenu2.add(accountsettings);

        Settings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mederp/images/icons8-settings.png"))); // NOI18N
        Settings.setText("Settings");
        Settings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SettingsActionPerformed(evt);
            }
        });
        jMenu2.add(Settings);

        Disconnect.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mederp/images/icons8-shutdown.png"))); // NOI18N
        Disconnect.setText("Disconnect");
        Disconnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisconnectActionPerformed(evt);
            }
        });
        jMenu2.add(Disconnect);

        jMenuBar1.add(jMenu2);

        jMenu1.setText("|");
        jMenuBar1.add(jMenu1);

        gestionClients.setText("Gestion Clients");
        gestionClients.setEnabled(false);

        addclient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mederp/images/icons8-add_user_male.png"))); // NOI18N
        addclient.setText("Add new Client");
        addclient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addclientActionPerformed(evt);
            }
        });
        gestionClients.add(addclient);

        manageclients.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mederp/images/icons8-conference.png"))); // NOI18N
        manageclients.setText("Manage Clients");
        manageclients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageclientsActionPerformed(evt);
            }
        });
        gestionClients.add(manageclients);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mederp/images/icons8-waiting_room_s.png"))); // NOI18N
        jMenuItem5.setText("Waiting Room");
        gestionClients.add(jMenuItem5);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mederp/images/icons8-calendar.png"))); // NOI18N
        jMenuItem6.setText("Appointments");
        jMenuItem6.setToolTipText("");
        gestionClients.add(jMenuItem6);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mederp/images/icons8-paper_money.png"))); // NOI18N
        jMenuItem4.setText("Facturation");
        gestionClients.add(jMenuItem4);

        jMenuBar1.add(gestionClients);

        gestionCabinet.setText("Gestion Cabinet");
        gestionCabinet.setEnabled(false);

        assurance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mederp/images/icons8-tips.png"))); // NOI18N
        assurance.setText("Insurances");
        assurance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assuranceActionPerformed(evt);
            }
        });
        gestionCabinet.add(assurance);

        medicines.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mederp/images/icons8-pills_s.png"))); // NOI18N
        medicines.setText("Medicines");
        medicines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicinesActionPerformed(evt);
            }
        });
        gestionCabinet.add(medicines);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mederp/images/icons8-treatment.png"))); // NOI18N
        jMenuItem1.setText("Medical Reports");
        gestionCabinet.add(jMenuItem1);

        jMenuBar1.add(gestionCabinet);

        Administration.setText("Administration");

        newemployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mederp/images/icons8-add_user_male.png"))); // NOI18N
        newemployee.setText("New Employee Account");
        newemployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newemployeeActionPerformed(evt);
            }
        });
        Administration.add(newemployee);

        manageemployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mederp/images/icons8-conference.png"))); // NOI18N
        manageemployee.setText("Manage Employees");
        manageemployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageemployeeActionPerformed(evt);
            }
        });
        Administration.add(manageemployee);

        jMenuBar1.add(Administration);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        setSize(new java.awt.Dimension(660, 509));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DisconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisconnectActionPerformed
        userIndex = -1;
        this.setVisible(false);
        JFrame login = new login();
        login.setVisible(true);
    }//GEN-LAST:event_DisconnectActionPerformed

    private void SettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SettingsActionPerformed
        
    }//GEN-LAST:event_SettingsActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        RSG = CNX.Select_request("SELECT * FROM "+TABLE_NAME+" WHERE id = "+userIndex);
        try {
            RSG.next();
            String Username = RSG.getString("username");
            String firstName = RSG.getString("nom");
            String lastName = RSG.getString("prenom");
            String role = RSG.getString("role");
            String fullName =  firstName + " " +lastName;
            
            //List of Roles : Medecin, Infirmier, Secretaire, Administrateur
            if (role.equals("Administrateur")) {
                Administration.setEnabled(true);
                gestionCabinet.setEnabled(true);
                gestionClients.setEnabled(true);
            } else if (role.equals("Infirmier")) {
                Administration.setEnabled(false);
                gestionCabinet.setEnabled(true);
                gestionClients.setEnabled(false);
            } else if (role.equals("Secretaire")) {
                Administration.setEnabled(false);
                gestionCabinet.setEnabled(false);
                gestionClients.setEnabled(true);
            } else if (role.equals("Medecin")) {
                Administration.setEnabled(false);
                gestionCabinet.setEnabled(true);
                gestionClients.setEnabled(true);
            }

            accountsettings.setText(fullName);
        } catch (SQLException ex) {
            Logger.getLogger(mainapp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void accountsettingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountsettingsActionPerformed
        JInternalFrame usersettingsframe = new usersettings();
        jDesktopPane1.add(usersettingsframe);
        usersettingsframe.setVisible(true);
    }//GEN-LAST:event_accountsettingsActionPerformed

    private void newemployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newemployeeActionPerformed
        JInternalFrame newemployeeframe = new userform();
        jDesktopPane1.add(newemployeeframe);
        newemployeeframe.setVisible(true);
    }//GEN-LAST:event_newemployeeActionPerformed

    private void manageemployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageemployeeActionPerformed
        JInternalFrame employeesframe = new employees();
        jDesktopPane1.add(employeesframe);
        employeesframe.setVisible(true);
    }//GEN-LAST:event_manageemployeeActionPerformed

    private void addclientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addclientActionPerformed
        JInternalFrame newclientframe = new clientform();
        jDesktopPane1.add(newclientframe);
        newclientframe.setVisible(true);
    }//GEN-LAST:event_addclientActionPerformed

    private void manageclientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageclientsActionPerformed
        JInternalFrame clientsframe = new clients();
        jDesktopPane1.add(clientsframe);
        clientsframe.setVisible(true);
    }//GEN-LAST:event_manageclientsActionPerformed

    private void assuranceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assuranceActionPerformed
        JInternalFrame assuranceframe = new insurance();
        jDesktopPane1.add(assuranceframe);
        assuranceframe.setVisible(true);
    }//GEN-LAST:event_assuranceActionPerformed

    private void medicinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicinesActionPerformed
        JInternalFrame medframe = new medicine();
        jDesktopPane1.add(medframe);
        medframe.setVisible(true);
    }//GEN-LAST:event_medicinesActionPerformed

    
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
            java.util.logging.Logger.getLogger(mainapp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainapp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainapp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainapp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainapp(-1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Administration;
    private javax.swing.JMenuItem Disconnect;
    private javax.swing.JMenuItem Settings;
    private javax.swing.JMenuItem accountsettings;
    private javax.swing.JMenuItem addclient;
    private javax.swing.JMenuItem assurance;
    private javax.swing.JMenu gestionCabinet;
    private javax.swing.JMenu gestionClients;
    public static javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenuItem manageclients;
    private javax.swing.JMenuItem manageemployee;
    private javax.swing.JMenuItem medicines;
    private javax.swing.JMenuItem newemployee;
    // End of variables declaration//GEN-END:variables
}
