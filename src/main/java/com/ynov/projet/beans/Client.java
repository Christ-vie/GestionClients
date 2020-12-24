package com.ynov.projet.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.Data;
import lombok.ToString;






@Entity
@ToString
@Data
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true)

    private Integer id;
    private String nom;
    private String prenom;
    public Client() {

    }
    public Client(Integer id, String nom , String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;

    }
    public int getId() {
        return id;
    }
    public void SetId(Integer id) {
        this.id =id ;
    }
    public String getNom() {
        return nom;
    }
    public void SetNom(String nom) {
        this.nom = nom ;
    }

    public String getPrenom() {
        return prenom;
    }
    public void SetPrenom(String prenom) {
        this.prenom = prenom ;
    }


}
