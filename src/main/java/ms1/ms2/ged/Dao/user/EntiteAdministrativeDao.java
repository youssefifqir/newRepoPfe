package ms1.ms2.ged.Dao.user;

import ms1.ms2.ged.bean.doc.EntiteAdministrativeType;
import ms1.ms2.ged.bean.user.EntiteAdministrative;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EntiteAdministrativeDao extends JpaRepository<EntiteAdministrative,Long> {


   EntiteAdministrative findByCode(String code);
   int deleteByCode(String code);

   EntiteAdministrative findByLibelle(String libelle);
   int deleteByLibelle(String libelle);
 List<EntiteAdministrative> findByEntiteAdministrativeType(EntiteAdministrativeType entiteAdministrativeType);
 int  deleteByEntiteAdministrativeType(EntiteAdministrativeType entiteAdministrativeType);













}
