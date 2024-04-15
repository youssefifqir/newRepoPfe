package ms1.ms2.ged.bean.doc;
import jakarta.persistence.*;
import ms1.ms2.ged.bean.referentiel.AcessShare;

@Entity
public class DocumentAcessShare {

    @Id
    private Long id;
    //ajouter
    private String libelle;

    @ManyToOne
    private Document document;
    @ManyToOne
    private AcessShare acessShare;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public AcessShare getAcessShare() {
        return acessShare;
    }

    public void setAcessShare(AcessShare acessShare) {
        this.acessShare = acessShare;
    }
}
