package ms1.ms2.ged.Dao.doc;

import ms1.ms2.ged.bean.doc.Document;
import ms1.ms2.ged.bean.doc.DocumentAcessShare;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocumentAcessShareDao extends JpaRepository<DocumentAcessShare,Long> {
  DocumentAcessShare  findByLibelle(String libelle);
   int deletelibelle(String libelle);
    List<DocumentAcessShare> findByDocument(Document document);
    int deleteByDocumentAcessShare(Document document);








































































}
