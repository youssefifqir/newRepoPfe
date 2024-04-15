package ms1.ms2.ged.bean.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import ms1.ms2.ged.bean.purchase.GroupeUtilisateur;

import java.util.List;
@Entity

public class Groupe {

    @Id
    private Long id;
    private String code;
    private String libelle;
    @OneToOne
    private Utilisateur utilisateur;
    @OneToMany
    private List<GroupeUtilisateur> groupeUtilisateurs;

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

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public List<GroupeUtilisateur> getGroupeUtilisateurs() {
        return groupeUtilisateurs;
    }

    public void setGroupeUtilisateurs(List<GroupeUtilisateur> groupeUtilisateurs) {
        this.groupeUtilisateurs = groupeUtilisateurs;
    }
}
