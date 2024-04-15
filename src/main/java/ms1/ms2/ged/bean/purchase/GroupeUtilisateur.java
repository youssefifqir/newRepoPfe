package ms1.ms2.ged.bean.purchase;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import ms1.ms2.ged.bean.user.Groupe;
import ms1.ms2.ged.bean.user.Utilisateur;
@Entity

public class GroupeUtilisateur {

     @Id
    private Long id;
     @ManyToOne
     private Groupe groupe;
     @OneToOne
     private Utilisateur utilisateur;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Groupe getGroupe() {
        return groupe;
    }

    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }
}
