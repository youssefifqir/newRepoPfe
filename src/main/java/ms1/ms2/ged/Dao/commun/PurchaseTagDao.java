package ms1.ms2.ged.Dao.commun;
import   ms1.ms2.ged.bean.commun.PurchaseTag;
import ms1.ms2.ged.bean.purchase.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface PurchaseTagDao extends JpaRepository<PurchaseTag,Long> {

   PurchaseTag findByNom(String nom);
   int deleteByNom(String nom);
   List<PurchaseTag> findByPurchase(String purchase);
   int  deleteByPurchage(Purchase purchase);































































}
