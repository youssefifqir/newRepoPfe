package ms1.ms2.ged.bean.purchase;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import ms1.ms2.ged.bean.referentiel.AcessShare;
import ms1.ms2.ged.bean.user.Groupe;
import ms1.ms2.ged.bean.doc.Document;

import java.time.LocalDateTime;
@Entity


public class DocumentPartageGroupe {

    @Id
    private Long id;
    @OneToOne
    private Document document;
    @OneToOne
    private Groupe groupe;
    private LocalDateTime dateShare;
    @OneToOne
    private AcessShare acessShare;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public Groupe getGroupe() {
        return groupe;
    }

    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
    }

    public LocalDateTime getDateShare() {
        return dateShare;
    }

    public void setDateShare(LocalDateTime dateShare) {
        this.dateShare = dateShare;
    }

    public AcessShare getAcessShare() {
        return acessShare;
    }

    public void setAcessShare(AcessShare acessShare) {
        this.acessShare = acessShare;
    }
}
