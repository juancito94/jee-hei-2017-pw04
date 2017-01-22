package hei.tp04.core.entity;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Commande implements Comparable<Commande> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    public long getId() {
        return id;
    }

    private boolean validee;

    @ManyToOne
    private Client client;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "commande")
    private Set<Produit> produits;


    public boolean isValidee() {
        return validee;
    }


    public void setValidee(boolean validee) {
        this.validee = validee;
    }


    public Client getClient() {
        return client;
    }


    public void setClient(Client client) {
        this.client = client;
    }


    public Set<Produit> getProduits() {
        return produits;
    }


    public void setProduits(Set<Produit> produits) {
        this.produits = produits;
    }


    public Commande() {
        super();
    }


    public Commande(Client client) {
        super();
        this.client = client;
    }


    @Override
    public int compareTo(Commande o) {
        return Long.compare(id, o.id);
    }
}
