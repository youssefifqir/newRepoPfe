package ms1.ms2.ged.Dao.doc;

import ms1.ms2.ged.bean.doc.DocumentCategorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentCategorieDao extends JpaRepository<DocumentCategorie,Long> {

   DocumentCategorie findByLibelle(String libelle);
   int deleteByLibell(String libelle);

    DocumentCategorie findByCode(String code);
    int deleteByCode(String code);














}
