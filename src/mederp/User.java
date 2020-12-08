/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mederp;

/**
 *
 * @author ilyas
 */
public class User {
    int id;
    String Username;
    String Nom;
    String Prenom;
    String Role;
    String Specialite;

    public User(int id, String Username, String Nom, String Prenom, String Role, String Specialite) {
        this.id = id;
        this.Username = Username;
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Role = Role;
        this.Specialite = Specialite;
    }
    
    public boolean pushToDB(){
        String Query = "INSERT INTO Users (username, nom, prenom, role, specialite)"+
                "VALUES ('"+this.Username+"', '"+this.Nom+"',  '"+this.Prenom+"', '"+this.Role+"', '"+this.Specialite+"')";
        boolean isDone = CNX.AMS_request(Query);
        return isDone;
    }
    
    
    
}
