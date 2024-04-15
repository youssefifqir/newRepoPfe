package ms1.ms2.ged.bean.doc;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity

public class DocumentCategorieFieldRule {
    @Id
    private Long id;
    private String code;
    private String libelle;
    private String expression;

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

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }
}