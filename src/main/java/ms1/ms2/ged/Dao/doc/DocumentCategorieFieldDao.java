package ms1.ms2.ged.Dao.doc;
import ms1.ms2.ged.bean.doc.DocumentCategorieField;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentCategorieFieldDao extends JpaRepository<DocumentCategorieField,Long> {


  DocumentCategorieField findByRef(String ref);
  int deleteByRef(String ref);




























}
