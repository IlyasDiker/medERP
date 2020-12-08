/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mederp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import javafx.scene.control.ComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author ilyas
 */
public class clientform extends javax.swing.JInternalFrame {

    boolean isNewUser = true;
    ResultSet RSG;
    int userTarget;
    String TABLE_NAME = "clients";
    /**
     * Creates new form newclient
     */
    public clientform() {
        initComponents();
    }
   
    public clientform(int target) throws SQLException{
        initComponents();
        isNewUser = false;
        userTarget = target;
        
        title.setText("Update Client");
        adduserbtn.setText("Update Client");
        
        
        RSG = CNX.Select_request("SELECT * FROM "+TABLE_NAME+" WHERE id = "+target);
        if(RSG.next()) {
            usercinfield.setText(RSG.getString("cin"));
            nomfield.setText(RSG.getString("nom"));
            prenomfield.setText(RSG.getString("prenom"));
            sexcombo.setSelectedItem(RSG.getString("sex"));
            emailfield.setText(RSG.getString("email"));
            phonefield.setText(RSG.getString("phone"));
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

        jPanel1 = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        usercinfield = new javax.swing.JTextField();
        nomfield = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        prenomfield = new javax.swing.JTextField();
        Prenom = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sexcombo = new javax.swing.JComboBox<>();
        errorfield = new javax.swing.JLabel();
        adduserbtn = new javax.swing.JButton();
        emailfield = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        phonefield = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Client Form");

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        title.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("New Client");
        title.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(title)
                .addContainerGap(308, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(title)
                .addGap(20, 20, 20))
        );

        jLabel1.setText("CIN");

        jLabel3.setText("Nom");

        prenomfield.setToolTipText("");

        Prenom.setText("Prenom");

        jLabel5.setText("Email");

        jLabel4.setText("Sex");

        sexcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Not specified" }));
        sexcombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                sexcomboItemStateChanged(evt);
            }
        });

        errorfield.setForeground(new java.awt.Color(204, 0, 0));

        adduserbtn.setText(" Add new Client");
        adduserbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adduserbtnActionPerformed(evt);
            }
        });

        emailfield.setToolTipText("");

        jLabel6.setText("Phone");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(errorfield, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addComponent(prenomfield, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addComponent(Prenom)
                    .addComponent(nomfield, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(usercinfield)
                    .addComponent(jLabel1)
                    .addComponent(emailfield, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(sexcombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adduserbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addComponent(phonefield))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usercinfield, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexcombo, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(phonefield)
                    .addComponent(nomfield, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Prenom)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prenomfield, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adduserbtn)
                    .addComponent(emailfield, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(errorfield, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sexcomboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_sexcomboItemStateChanged
        //Polyvalent, Sage-femme, Technicien, Radio, Aide-soignant, Dermatologie, Neurologie
        //Medecin, Infirmier, Secretaire, Administrateur
        
    }//GEN-LAST:event_sexcomboItemStateChanged

    private void adduserbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adduserbtnActionPerformed
        String CIN = usercinfield.getText().trim();
        String Nom = nomfield.getText().trim();
        String Prenom = prenomfield.getText().trim();
        String Email = emailfield.getText().toString().trim();
        String Sex = sexcombo.getSelectedItem().toString();
        String Phone = phonefield.getText().toString().trim();
            

        if (CIN.isEmpty() || Nom.isEmpty() || Prenom.isEmpty() || Email.isEmpty() || Phone.isEmpty()){
            errorfield.setText("Please fill all the Fields");
        } else {        
            if (isNewUser){
                String Query = "INSERT INTO "+TABLE_NAME+"(nom, prenom, cin, phone, email, sex) "
                        + "VALUES ('"+Nom+"', '"+Prenom+"', '"+CIN+"', '"+Phone+"', '"+Email+"', '"+Sex+"')";
                boolean isDone = CNX.AMS_request(Query);
                if (isDone){
                    JOptionPane.showMessageDialog(null, "Client Created Successfully");
                    this.dispose();
                } else {
                    errorfield.setText("Can't add new Client to database");

                }
            } else {
                String Query = "UPDATE "+TABLE_NAME+" SET nom = '"+Nom+"', prenom = '"+Prenom+"', cin = '"+CIN+"', phone = '"+Phone+"', sex = '"+Sex+"', email ='"+Email+"'"
                        + " WHERE id = "+userTarget;
                boolean isDone = CNX.AMS_request(Query);
                if (isDone){
                    JOptionPane.showMessageDialog(null, "Client Updated Successfully");
                    this.dispose();
                } else {
                    errorfield.setText("Can't update Client in database");

                }
            }
        }
    }//GEN-LAST:event_adduserbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Prenom;
    private javax.swing.JButton adduserbtn;
    private javax.swing.JTextField emailfield;
    private javax.swing.JLabel errorfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nomfield;
    private javax.swing.JTextField phonefield;
    private javax.swing.JTextField prenomfield;
    private javax.swing.JComboBox<String> sexcombo;
    private javax.swing.JLabel title;
    private javax.swing.JTextField usercinfield;
    // End of variables declaration//GEN-END:variables
}
