/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controleur;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Patient;

/**
 *
 * @author luisa
 */
public class Patient_Actions { // AJOUTER UTILISATEUR
    public void ajouter(Patient p){
        //1.SE CONNECTER A LA BASE
        connexion_Base cb=new connexion_Base();
        cb.connect();
        
        //2.REQUETE SQL
        String rep="insert into Patient (nom,prenom,age sexe,adresse) values('"+p.getnom()+"','"+p.getprenom()+"','"+p.getage()+"','"+p.getsexe()+"''"+p.getadresse()+"'";
        
        //3.EXECUTER LA REQUETE
        cb.st.executeUpdate(rep);
        JOptionPane.showMessageDialog(null,"Enregistrement effectuer avec succes");
    }
    //MODIFIER Patient
    public static void modifier(Patient p){
        try {
            //1.SE CONNECTER A LA BASE
            connexion_Base cb=new connexion_Base();
            cb.connect();
            //2.REQUETE SQL
            String rep="update Patient set nom='"+p.getnom()+"',prenom='"+p.prenom()+"',age='"+p.getage()+"',sexe='"+p.getsexe()+"',='"+p.getadresse()+"',nom='"+p.getadresse()+"',where codeP='"+p.getcodeP()+"'";
            //EXECUTER
            cb.st.executeUpdate(rep);
        } catch (SQLException ex) {
            Logger.getLogger(Patient_Actions.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //SUPPRIMER patient
    
    public void supprimer(int id){
        //SE CONNECTER à la base
        connexion_Base cb=new connexion_Base();
        cb.connect();
        String codeP = null;
        //REQUETE
        String rep="'delete from Patient where codeP ='"+codeP+"'";
        //EXECUTER LA REQUETE
        cb.st.executeUpdate(rep);
        JOptionPane.showMessageDialog(null,"Suppression avec succés ");
    }
    
    
    
    //RECHERCHER patient
    //FONCTION 
    public Patient rechercher (int codeP){
        Pätient p=null;
        try {
            //SE CONNECTER
            connexion_Base cb=new connexion_Base();
            cb.connect();
            //REQUETE
            String rep="Select*from Patient where codeP='"+codeP+"'";
            //EXECUTER
            ResultSet rs=cb.st.executeQuery(rep);
            //verifier si on a trouver
            if(rs.next()){
                p.setId(rs.getInt("id"));
                p.setnom(rs.getString("nom"));
                p.setprenom(rs.getString("prenom"));
                p.setage(rs.getString("age"));
                p.setsexe(rs.getString("sexe"));
                p.setadresse(rs.getString("adresse"));
                p.setcodeP((rs.getint("codeP")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Patient_Actions.class.getName()).log(Level.SEVERE, null, ex);
        }     
                return p;
    }
    //lister des  patients
    public ResultSet liste(){
        try {
            ResultSet rs=null;
            //se connecter
            connexion_Base cb=new connexion_Base();
            cb.connect();
            //requete SQL
            String rep="select*from Patient";
            //executer
            rs=cb.st.executeQuery(rep);
            
            
              
         
        } catch (SQLException ex) {
            Logger.getLogger(Patient_Actions.class.getName()).log(Level.SEVERE, null, ex);
        }
       
      return rs;     
    }

    private static class connexion_Base {

        public connexion_Base() {
        }

        private void connect() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private class st {

            private static void executeUpdate(String rep) {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            public st() {
            }
        }
    }

    private static class Level {

        public Level() {
        }
    }

    private static class Pätient {

        public Pätient() {
        }
    }
    
}
