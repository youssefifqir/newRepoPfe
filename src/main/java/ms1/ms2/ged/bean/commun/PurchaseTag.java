package ms1.ms2.ged.bean.commun;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import ms1.ms2.ged.bean.doc.Tag;
import ms1.ms2.ged.bean.purchase.Purchase;


@Entity

public class PurchaseTag {

    @Id
    private Long id;
    private String nom;
    @ManyToOne
    private Purchase purchase;
    @ManyToOne
    private Tag tag;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }

    public Tag getTag() {
        return tag;
    }

    public void setTag(Tag tag) {
        this.tag = tag;
    }
}

