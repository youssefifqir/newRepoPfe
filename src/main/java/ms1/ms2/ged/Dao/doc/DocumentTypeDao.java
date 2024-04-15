package ms1.ms2.ged.Dao.doc;

import ms1.ms2.ged.bean.doc.DocumentType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentTypeDao extends JpaRepository<DocumentType,Long> {


         DocumentType findByLibelle(String libelle);
            DocumentType findByCode(String code);
          int deleteByLibelle(String libelle);
          int deleteByCode(String code);
















}
