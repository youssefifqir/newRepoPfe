package ms1.ms2.ged.bean.doc;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
@Entity
public class DocumentCategorieField {


    @Id
    private Long id;
    private String ref; //ajouter
    @OneToOne
    private Field field;
    @OneToOne
    private DocumentCategorie documentCategorie;
    @ManyToOne
    private DocumentCategorieFieldRule documentCategorieFieldRule;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public DocumentCategorie getDocumentCategorie() {
        return documentCategorie;
    }

    public void setDocumentCategorie(DocumentCategorie documentCategorie) {
        this.documentCategorie = documentCategorie;
    }

    public DocumentCategorieFieldRule getDocumentCategorieFieldRule() {
        return documentCategorieFieldRule;
    }

    public void setDocumentCategorieFieldRule(DocumentCategorieFieldRule documentCategorieFieldRule) {
        this.documentCategorieFieldRule = documentCategorieFieldRule;
    }


















}
