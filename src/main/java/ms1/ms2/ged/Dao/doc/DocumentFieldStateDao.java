package ms1.ms2.ged.Dao.doc;

import ms1.ms2.ged.bean.doc.DocumentFieldState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentFieldStateDao extends JpaRepository<DocumentFieldState,Long> {

   DocumentFieldState findByCode(String code);
   int deleteByCode(String code);













}
