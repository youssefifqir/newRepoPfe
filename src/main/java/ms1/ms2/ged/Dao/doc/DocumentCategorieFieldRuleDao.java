package ms1.ms2.ged.Dao.doc;
import ms1.ms2.ged.bean.doc.DocumentCategorieFieldRule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentCategorieFieldRuleDao extends JpaRepository<DocumentCategorieFieldRule,Long> {

    DocumentCategorieFieldRule findBylibelle(String libelle);
    int deleteBylibelle(String libelle);
    DocumentCategorieFieldRule findByCode(String code);
    int deleteByCode(String code);





























}
