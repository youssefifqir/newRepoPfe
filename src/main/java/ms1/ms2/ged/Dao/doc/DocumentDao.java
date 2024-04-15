package ms1.ms2.ged.Dao.doc;
import ms1.ms2.ged.bean.doc.Document;
import ms1.ms2.ged.bean.doc.DocumentState;
import ms1.ms2.ged.bean.doc.DocumentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;



@Repository
public interface DocumentDao extends JpaRepository<Document,Long> {

   Document findByReference(String reference);
   int deleteByReference(String reference);
  List<Document> findByDocumentType(DocumentType documentType);
  int deleteByDocumentType(DocumentType documentType);

  List<Document>  findByDocumentState(DocumentState documentState);
  int deleteByDocumentState(DocumentState documentState);


































}
