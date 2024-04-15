package ms1.ms2.ged.Dao.doc;

import ms1.ms2.ged.bean.doc.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagDao extends JpaRepository<Tag,Long> {
         Tag findByLibelle(String code);
         int findByCode(String code);














}
