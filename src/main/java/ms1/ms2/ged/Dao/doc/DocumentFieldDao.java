package ms1.ms2.ged.Dao.doc;

import ms1.ms2.ged.bean.doc.Document;
import ms1.ms2.ged.bean.doc.DocumentAcessShare;
import ms1.ms2.ged.bean.doc.DocumentField;
import ms1.ms2.ged.bean.doc.Field;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentFieldDao extends JpaRepository<DocumentField,Long> {



  DocumentField  findByLibelle(String libelle);
   int deletelibelle(String libelle);
   DocumentField findByFieldAndDocument(Field field, Document document);







































































}
