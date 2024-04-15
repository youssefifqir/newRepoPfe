package ms1.ms2.ged.Dao.user;

import ms1.ms2.ged.bean.user.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurDao extends JpaRepository<Utilisateur,Long> {


  Utilisateur findByName(String name);
  int deleteByName(String name);











}
