package ms1.ms2.ged.Dao.doc;
import ms1.ms2.ged.bean.doc.DocumentState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentStateDao extends JpaRepository<DocumentState,Long> {


  DocumentState  findByLibelle(String libelle);
  int  deleteByLibelle(String libelle);




































}
