package ms1.ms2.ged.Dao.purchase;

import ms1.ms2.ged.bean.purchase.GroupeUtilisateur;
import ms1.ms2.ged.bean.purchase.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseDao extends JpaRepository<GroupeUtilisateur,Long> {


   Purchase findByReference(String reference) ;
   int deleteByReference(String reference);

































}
