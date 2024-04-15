package ms1.ms2.ged.Dao.referentiel;


import ms1.ms2.ged.bean.referentiel.AcessShare;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AcessShareDao extends JpaRepository<AcessShare,Long> {



   AcessShare findByLibelle(String libelle);
   int deleteByLibelle (String libelle);
    AcessShare findByCode(String code);
    int deleteByCode(String code);





























}
