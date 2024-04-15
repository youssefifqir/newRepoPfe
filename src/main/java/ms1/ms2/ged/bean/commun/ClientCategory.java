package ms1.ms2.ged.bean.commun;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class ClientCategory {


    @Id
    private Long id;
    private String reference;
    private String code;
    private int socialIndex;

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getSocialIndex() {
        return socialIndex;
    }

    public void setSocialIndex(int socialIndex) {
        this.socialIndex = socialIndex;
    }
}
