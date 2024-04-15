package ms1.ms2.ged.bean.doc;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;
@Entity

public class DocumentCategorie {
    @Id
    private Long id;
    private String code;
    private String libelle;
    @OneToMany
    private List<DocumentCategorieField> documentCategorieFields;


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

    public List<DocumentCategorieField> getDocumentCategorieFields() {
        return documentCategorieFields;
    }

    public void setDocumentCategorieFields(List<DocumentCategorieField> documentCategorieFields) {
        this.documentCategorieFields = documentCategorieFields;
    }
}
