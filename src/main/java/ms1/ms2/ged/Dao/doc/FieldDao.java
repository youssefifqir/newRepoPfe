package ms1.ms2.ged.Dao.doc;

import ms1.ms2.ged.bean.doc.Field;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FieldDao extends JpaRepository<Field,Long> {
         Field findByLibelle(String code);
         int findByCode(String code);














}
