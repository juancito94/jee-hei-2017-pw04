package hei.tp04.core.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Produit implements Comparable<Produit> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    public long getId() {
        return id;
    }

    private String nom;

    @ManyToOne
    private Commande commande;


    public String getNom() {
        return nom;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }


    public Commande getCommande() {
        return commande;
    }


    public void setCommande(Commande commande) {
        this.commande = commande;
    }


    public Produit() {
        super();
    }


    public Produit(String nom, Commande commande) {
        super();
        this.nom = nom;
        this.commande = commande;
    }


    @Override
    public int compareTo(Produit o) {
        return nom.compareTo(o.nom);
    }
}
