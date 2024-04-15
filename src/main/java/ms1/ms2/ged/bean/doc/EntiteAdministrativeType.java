package ms1.ms2.ged.bean.doc;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity

public class EntiteAdministrativeType {

    @Id
    private Long id;
    private String code;
    private String libelle;

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

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
