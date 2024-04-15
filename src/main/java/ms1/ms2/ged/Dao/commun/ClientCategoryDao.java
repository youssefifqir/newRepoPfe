package ms1.ms2.ged.Dao.commun;
import ms1.ms2.ged.bean.commun.ClientCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientCategoryDao extends JpaRepository<ClientCategory,Long> {


  ClientCategory findByCode(String code);
  int deleteByCode(String code);

   ClientCategory findByReference(String reference);
   int deleteByReference(String reference);
















}
