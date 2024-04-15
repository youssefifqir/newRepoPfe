package ms1.ms2.ged.bean.commun;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.math.BigDecimal;
@Entity
public class Product {

    @Id
    private Long id;
    private String code;
    private String reference;
    private BigDecimal purchaseCost;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public BigDecimal getPurchaseCost() {
        return purchaseCost;
    }

    public void setPurchaseCost(BigDecimal purchaseCost) {
        this.purchaseCost = purchaseCost;
    }
}
