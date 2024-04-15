package ms1.ms2.ged.bean.purchase;

import jakarta.persistence.*;
import ms1.ms2.ged.bean.commun.Client;
import ms1.ms2.ged.bean.commun.PurchaseTag;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
@Entity

public class Purchase {

    @Id
    private Long id;
    private String reference;
    private LocalDateTime purchaseDate;
    private String image;
    private BigDecimal total;
    private String description;
    @OneToOne
    private Client client;
     @ManyToMany
    private List<PurchaseItem> purchaseItems;
     @ManyToMany
    private List<PurchaseTag>  purchaseTags;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public LocalDateTime getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDateTime purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<PurchaseItem> getPurchaseItems() {
        return purchaseItems;
    }

    public void setPurchaseItems(List<PurchaseItem> purchaseItems) {
        this.purchaseItems = purchaseItems;
    }

    public List<PurchaseTag> getPurchaseTags() {
        return purchaseTags;
    }

    public void setPurchaseTags(List<PurchaseTag> purchaseTags) {
        this.purchaseTags = purchaseTags;
    }
}
