package ms1.ms2.ged.service.impl;

import ms1.ms2.ged.Dao.doc.DocumentTypeDao;

import ms1.ms2.ged.bean.doc.DocumentType;
import ms1.ms2.ged.service.facade.DocumentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentTypeServiceImpl implements DocumentTypeService {

    @Autowired
    private DocumentTypeDao documentTypeDao;
    @Autowired
    private DocumentTypeService documentTypeService;


    @Override
    public DocumentType findByLibelle(String libelle) {
        return documentTypeDao.findByLibelle(libelle);
    }

    @Override
    public DocumentType findByCode(String code) {
        return documentTypeDao.findByCode(code);
    }

    @Override
    public int deleteByLibelle(String libelle) {
        return documentTypeDao.deleteByLibelle(libelle);
    }

    @Override
    public int deleteByCode(String code) {
        return documentTypeDao.deleteByCode(code);
    }







}
