/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author luisa
 */
public class Dossier {
    private int Id;
    private  String dateCreations;
    private  String nature_Examen;
    private  String Date_Examen;
    private  String Observations;
    private int codeP;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getDateCreations() {
        return dateCreations;
    }

    public void setDateCreations(String dateCreations) {
        this.dateCreations = dateCreations;
    }

    public String getNature_Examen() {
        return nature_Examen;
    }

    public void setNature_Examen(String nature_Examen) {
        this.nature_Examen = nature_Examen;
    }

    public String getDate_Examen() {
        return Date_Examen;
    }

    public void setDate_Examen(String Date_Examen) {
        this.Date_Examen = Date_Examen;
    }

    public String getObservations() {
        return Observations;
    }

    public void setObservations(String Observations) {
        this.Observations = Observations;
    }

    public int getCodeP() {
        return codeP;
    }

    public void setCodeP(int codeP) {
        this.codeP = codeP;
    }

    public Dossier(String dateCreations, String nature_Examen, String Date_Examen, String Observations, int codeP) {
        this.dateCreations = dateCreations;
        this.nature_Examen = nature_Examen;
        this.Date_Examen = Date_Examen;
        this.Observations = Observations;
        this.codeP = codeP;
    }

    public Dossier(int Id, String dateCreations, String nature_Examen, String Date_Examen, String Observations, int codeP) {
        this.Id = Id;
        this.dateCreations = dateCreations;
        this.nature_Examen = nature_Examen;
        this.Date_Examen = Date_Examen;
        this.Observations = Observations;
        this.codeP = codeP;
    }

    public Dossier() {
    }


}
