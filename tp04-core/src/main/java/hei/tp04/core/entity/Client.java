package hei.tp04.core.entity;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    public long getId() {
        return id;
    }

    private String nom;

    private String prenom;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "client")
    private Set<Commande> commandes;


    public String getNom() {
        return nom;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }


    public String getPrenom() {
        return prenom;
    }


    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


    public Set<Commande> getCommandes() {
        return commandes;
    }


    public void setCommandes(Set<Commande> commandes) {
        this.commandes = commandes;
    }


    public Client() {
        super();
    }


    public Client(String nom, String prenom) {
        super();
        this.nom = nom;
        this.prenom = prenom;
    }


    @Override
    public String toString() {
        return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
    }
}
