package ms1.ms2.ged.Dao.doc;

import ms1.ms2.ged.bean.doc.Document;
import ms1.ms2.ged.bean.doc.DocumentTag;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DocumentTagDao extends JpaRepository<DocumentTag,Long> {

       List<DocumentTag> findByDocument(Document document);
       int deleteByDocument(Document document);

       DocumentTag findByLibelle(String libelle);
       int deleteByLibelle(String libelle);











}
