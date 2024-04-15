package ms1.ms2.ged.Dao.commun;
import ms1.ms2.ged.bean.commun.Client;
import ms1.ms2.ged.bean.commun.ClientCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public interface ClientDao extends JpaRepository<Client,Long> {


   Client findByFullName(String fullName);
   int deleteByFullName(String fullName);
   List<Client> findByClientCategory(ClientCategory clientCategory);
   int deleteByClientCategory(ClientCategory clientCategory);




















































}
