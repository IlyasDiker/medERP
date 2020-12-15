/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mederp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ilyas
 */
public class CNX {
    public static Connection getConnection() throws SQLException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:8889/mederp", "root", "root");
            System.out.println("ERROR : Connected to DB 'medERP' successfully");
            return con;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CNX.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("ERROR : Can't Connect to DB");
        }
        return null;
    }
    
    public static ResultSet Select_request(String req){
        ResultSet rs;
        try{      
            Connection c = getConnection();
            Statement st= c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            rs= st.executeQuery(req);
            
            return rs;
        }catch(Exception e){
            System.err.println("ERROR : Can't Reach DB");
            e.printStackTrace();
            return null;
        }

    }
    
    public static boolean AMS_request(String req){
        try{
            Connection c = getConnection();
            Statement st= c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            int rowaffected = st.executeUpdate(req);
//            if (rowaffected >= 1){
//                return true;
//            }
//            else{
//                return false;
//            }
            return true;
        }catch(Exception e){
            System.err.println("ERROR : Can't Update DB");
            e.printStackTrace();
            return false;
        }
    }
    
    public static DefaultTableModel FillTable(String req){
        ResultSet rs= Select_request(req);
        try {
            DefaultTableModel m =new DefaultTableModel();
            int nbcol=rs.getMetaData().getColumnCount();
            String[] nomcol= new String[nbcol];
            for(int i=0;i<nbcol;i++){
                nomcol[i]=rs.getMetaData().getColumnName(i+1);
            }
            m.setColumnIdentifiers(nomcol);
            while(rs.next()){
                String [] donner =new String[nbcol];
                for(int i=0;i<nbcol;i++){
                    donner[i]=rs.getString(i+1);
                }
                m.addRow(donner);
            }
            return m;
        } catch (SQLException ex) {
            Logger.getLogger(CNX.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
