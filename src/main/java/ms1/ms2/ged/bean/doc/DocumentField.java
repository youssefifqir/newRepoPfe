package ms1.ms2.ged.bean.doc;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class DocumentField {


    @Id
    private Long id;
    private String libelle;// ajouter
    @ManyToOne
    private Field field;
    @ManyToOne
    private Document document;
    private String value;
    @ManyToOne
    private DocumentFieldState documentFieldState;






    public String getLibelle() {
        return libelle;
    }
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public DocumentFieldState getDocumentFieldState() {
        return documentFieldState;
    }

    public void setDocumentFieldState(DocumentFieldState documentFieldState) {
        this.documentFieldState = documentFieldState;
    }

}
