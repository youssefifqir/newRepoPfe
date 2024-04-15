package ms1.ms2.ged.Dao.referentiel;

import ms1.ms2.ged.bean.referentiel.AcessManagement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AcessManagementDao extends JpaRepository<AcessManagement,Long> {
   AcessManagement findByLibelle(String libelle);
   int deleteByLibelle (String libelle);
    AcessManagement findByCode(String code);
    int deleteByCode(String code);





























}
