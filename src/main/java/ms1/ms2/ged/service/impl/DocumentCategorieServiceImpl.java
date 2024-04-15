package ms1.ms2.ged.service.impl;

import ms1.ms2.ged.Dao.doc.DocumentCategorieDao;
import ms1.ms2.ged.bean.doc.DocumentCategorie;
import ms1.ms2.ged.service.facade.DocumentCategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DocumentCategorieServiceImpl implements DocumentCategorieService {

    @Autowired
    private DocumentCategorieService documentCategorieService;
    @Autowired
    private DocumentCategorieDao documentCategorieDao;


    @Override
    public DocumentCategorie findByLibelle(String libelle) {
        return documentCategorieDao.findByLibelle(libelle);
    }

    @Transactional
    @Override
    public int deleteByLibell(String libelle) {
        return documentCategorieDao.deleteByLibell(libelle);
    }

    @Override
    public DocumentCategorie findByCode(String code) {
        return documentCategorieDao.findByCode(code);
    }

    @Override
    public int deleteByCode(String code) {
        return documentCategorieDao.deleteByCode(code);
    }














}
