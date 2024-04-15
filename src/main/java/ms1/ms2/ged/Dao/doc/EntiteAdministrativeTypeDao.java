package ms1.ms2.ged.Dao.doc;

import ms1.ms2.ged.bean.doc.DocumentType;
import ms1.ms2.ged.bean.doc.EntiteAdministrativeType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntiteAdministrativeTypeDao extends JpaRepository<EntiteAdministrativeType,Long> {
         EntiteAdministrativeType findByLibelle(String code);
         int findByCode(String code);














}
