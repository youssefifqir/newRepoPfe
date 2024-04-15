package ms1.ms2.ged.service.impl;

import ms1.ms2.ged.Dao.doc.DocumentStateDao;
import ms1.ms2.ged.bean.doc.DocumentState;
import ms1.ms2.ged.service.facade.DocumentStateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DocumentStateServiceImpl implements DocumentStateService {
    @Autowired
    private DocumentStateDao documentStateDao;
    @Autowired
    private DocumentStateService documentStateService;



    @Override
    public DocumentState findByLibelle(String libelle) {
        return documentStateDao.findByLibelle(libelle);
    }
    @Transactional
    @Override
    public int deleteByLibelle(String libelle) {
        return documentStateDao.deleteByLibelle(libelle);
    }

}
