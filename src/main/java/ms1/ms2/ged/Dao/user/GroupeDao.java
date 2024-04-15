package ms1.ms2.ged.Dao.user;

import ms1.ms2.ged.bean.user.Groupe;
import ms1.ms2.ged.bean.user.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupeDao extends JpaRepository<Groupe,Long> {


  Groupe findByCode(String code);
  int deleteByCode(String code);











}
