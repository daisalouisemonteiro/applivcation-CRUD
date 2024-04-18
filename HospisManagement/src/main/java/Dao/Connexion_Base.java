/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luisa
 */
public class Connexion_Base {
      public Connection co=null;
    public Statement st=null;
    public void connect(){
        try {
            //1.driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connexion_Base.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            //2.selection de la base de données
            DriverManager.getConnection("jdbc:mysql://localhost/Connexion_Base","root","");
        } catch (SQLException ex) {
            Logger.getLogger(Connexion_Base.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            //création du statement
            co.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Connexion_Base.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}