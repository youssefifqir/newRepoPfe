package ms1.ms2.ged.service.impl;

import ms1.ms2.ged.Dao.doc.DocumentFieldDao;
import ms1.ms2.ged.bean.doc.Document;
import ms1.ms2.ged.bean.doc.DocumentField;
import ms1.ms2.ged.bean.doc.Field;
import ms1.ms2.ged.service.facade.DocumentFieldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentFieldServiceImpl implements DocumentFieldService {
    @Autowired
    private DocumentFieldService documentFieldService;
    @Autowired
    private DocumentFieldDao documentFieldDao;


    @Override
    public DocumentField findByLibelle(String libelle) {
        return documentFieldDao.findByLibelle(libelle);
    }

    @Override
    public int deletelibelle(String libelle) {
        return documentFieldDao.deletelibelle(libelle);
    }

    @Override
    public DocumentField findByFieldAndDocument(Field field, Document document) {
        return documentFieldDao.findByFieldAndDocument(field, document);
    }










}
