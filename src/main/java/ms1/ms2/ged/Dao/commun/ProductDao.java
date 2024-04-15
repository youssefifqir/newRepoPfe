package ms1.ms2.ged.Dao.commun;

import ms1.ms2.ged.bean.commun.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDao extends JpaRepository<Product,Long> {




    Product findByCode(String code);
    int deleteByCode(String code);
    Product findByReference(String reference);
    int deleteByReference(String reference);


















}
