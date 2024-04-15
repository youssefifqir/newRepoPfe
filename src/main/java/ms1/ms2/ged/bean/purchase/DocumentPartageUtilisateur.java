package ms1.ms2.ged.bean.purchase;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import ms1.ms2.ged.bean.referentiel.AcessShare;
import ms1.ms2.ged.bean.doc.Document;
import ms1.ms2.ged.bean.user.Utilisateur;

import java.time.LocalDateTime;
@Entity
public class DocumentPartageUtilisateur {


     @Id
     private Long id;
     @ManyToOne
     private Document document;
     @OneToOne
     private Utilisateur utilisateur;
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

     public Utilisateur getUtilisateur() {
          return utilisateur;
     }

     public void setUtilisateur(Utilisateur utilisateur) {
          this.utilisateur = utilisateur;
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
