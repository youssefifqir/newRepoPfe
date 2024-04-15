package ms1.ms2.ged.bean.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import ms1.ms2.ged.bean.doc.EntiteAdministrativeType;
@Entity

public class EntiteAdministrative {

    @Id
    private Long id;
    private String code;
    private String description;
    private String libelle;
    @OneToOne
    private Utilisateur chef;
    @ManyToOne
    private EntiteAdministrativeType entiteAdministrativeType;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Utilisateur getChef() {
        return chef;
    }

    public void setChef(Utilisateur chef) {
        this.chef = chef;
    }

    public EntiteAdministrativeType getEntiteAdministrativeType() {
        return entiteAdministrativeType;
    }

    public void setEntiteAdministrativeType(EntiteAdministrativeType entiteAdministrativeType) {
        this.entiteAdministrativeType = entiteAdministrativeType;
    }
}
