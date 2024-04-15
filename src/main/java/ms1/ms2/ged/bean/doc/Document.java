package ms1.ms2.ged.bean.doc;
import jakarta.persistence.*;
import ms1.ms2.ged.bean.purchase.DocumentPartageGroupe;
import ms1.ms2.ged.bean.purchase.DocumentPartageUtilisateur;
import ms1.ms2.ged.bean.user.EntiteAdministrative;
import ms1.ms2.ged.bean.user.Utilisateur;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Document {

    @Id
    private Long id;
    private String reference;
    private LocalDateTime uploadDate;
    private String content;
    private Boolean folder;
    private BigDecimal size;
    @ManyToOne
    private DocumentType documentType;
    @ManyToOne
    private DocumentState documentState;
    @ManyToOne
    private DocumentCategorie documentCategorie;
    @ManyToMany
    //plusieurs documents ont plusieurs documentsFields
    private List<DocumentField>  documentFields;
    private String description;
    @ManyToOne
    private Utilisateur proprietaire;
    private Boolean archive;
    private Boolean versionne;
    @ManyToOne
    private EntiteAdministrative entiteAdministrative;
    //enetiteAdministrative c est une classe d association

    private EntiteAdministrative entiteAdministrativeProprietaire;
    @ManyToMany
    private List<DocumentPartageGroupe> documentPartageGroupes;
    @ManyToMany
    private List<DocumentPartageUtilisateur> documentPartageUtilisateurs;
    @ManyToMany
    private List<DocumentTag> documentTags;


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

    public LocalDateTime getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(LocalDateTime uploadDate) {
        this.uploadDate = uploadDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getFolder() {
        return folder;
    }

    public void setFolder(Boolean folder) {
        this.folder = folder;
    }

    public BigDecimal getSize() {
        return size;
    }

    public void setSize(BigDecimal size) {
        this.size = size;
    }

    public DocumentType getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
    }

    public DocumentState getDocumentState() {
        return documentState;
    }

    public void setDocumentState(DocumentState documentState) {
        this.documentState = documentState;
    }

    public DocumentCategorie getDocumentCategorie() {
        return documentCategorie;
    }

    public void setDocumentCategorie(DocumentCategorie documentCategorie) {
        this.documentCategorie = documentCategorie;
    }

    public List<DocumentField> getDocumentFields() {
        return documentFields;
    }

    public void setDocumentFields(List<DocumentField> documentFields) {
        this.documentFields = documentFields;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Utilisateur getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Utilisateur proprietaire) {
        this.proprietaire = proprietaire;
    }

    public Boolean getArchive() {
        return archive;
    }

    public void setArchive(Boolean archive) {
        this.archive = archive;
    }

    public Boolean getVersionne() {
        return versionne;
    }

    public void setVersionne(Boolean versionne) {
        this.versionne = versionne;
    }

    public EntiteAdministrative getEntiteAdministrative() {
        return entiteAdministrative;
    }

    public void setEntiteAdministrative(EntiteAdministrative entiteAdministrative) {
        this.entiteAdministrative = entiteAdministrative;
    }

    public EntiteAdministrative getEntiteAdministrativeProprietaire() {
        return entiteAdministrativeProprietaire;
    }

    public void setEntiteAdministrativeProprietaire(EntiteAdministrative entiteAdministrativeProprietaire) {
        this.entiteAdministrativeProprietaire = entiteAdministrativeProprietaire;
    }

    public List<DocumentPartageGroupe> getDocumentPartageGroupes() {
        return documentPartageGroupes;
    }

    public void setDocumentPartageGroupes(List<DocumentPartageGroupe> documentPartageGroupes) {
        this.documentPartageGroupes = documentPartageGroupes;
    }

    public List<DocumentPartageUtilisateur> getDocumentPartageUtilisateurs() {
        return documentPartageUtilisateurs;
    }

    public void setDocumentPartageUtilisateurs(List<DocumentPartageUtilisateur> documentPartageUtilisateurs) {
        this.documentPartageUtilisateurs = documentPartageUtilisateurs;
    }

    public List<DocumentTag> getDocumentTags() {
        return documentTags;
    }

    public void setDocumentTags(List<DocumentTag> documentTags) {
        this.documentTags = documentTags;
    }
}
