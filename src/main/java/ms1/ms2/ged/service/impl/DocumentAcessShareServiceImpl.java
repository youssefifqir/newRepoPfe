package ms1.ms2.ged.service.impl;

import ms1.ms2.ged.Dao.doc.DocumentAcessShareDao;
import ms1.ms2.ged.Dao.doc.DocumentDao;
import ms1.ms2.ged.Dao.referentiel.AcessShareDao;
import ms1.ms2.ged.bean.doc.Document;
import ms1.ms2.ged.bean.doc.DocumentAcessShare;
import ms1.ms2.ged.bean.referentiel.AcessShare;
import ms1.ms2.ged.service.facade.AcessShareService;
import ms1.ms2.ged.service.facade.DocumentAcessShareService;
import ms1.ms2.ged.service.facade.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class DocumentAcessShareServiceImpl implements DocumentAcessShareService {
    @Autowired
    private DocumentAcessShareService documentAcessShareService;
    @Autowired
    private DocumentAcessShareDao documentAcessShareDao;
    //document ,acessShare
    @Autowired
    private DocumentDao documentDao;
    @Autowired
    private DocumentService documentService;
    @Autowired
    private AcessShareDao acessShareDao;
    @Autowired
    private AcessShareService acessShareService;

     @Override
     public int save(DocumentAcessShare documentAcessShare){

         if (documentAcessShare==null){
             return  -1;
         }
         else if (documentAcessShare!=null && documentAcessShare.getAcessShare()==null ) {
             return -2;
         }
         String libelle=documentAcessShare.getAcessShare().getLibelle();
         AcessShare acessShare=acessShareService.findByLibelle(libelle);
         documentAcessShare.setAcessShare(acessShare);

         if(documentAcessShare!=null && documentAcessShare.getDocument()==null){
             return -3;
         }
         String reference=documentAcessShare.getDocument().getReference();
         Document document=documentService.findByReference(reference);
         documentAcessShare.setDocument(document);
         documentAcessShareDao.save(documentAcessShare);
         return 1;
     }
    @Override
    public DocumentAcessShare findByLibelle(String libelle) {
        return documentAcessShareDao.findByLibelle(libelle);
    }
    @Transactional
    @Override
    public int deletelibelle(String libelle) {
        return documentAcessShareDao.deletelibelle(libelle);
    }

    @Override
    public List<DocumentAcessShare> findByDocument(Document document) {
        return documentAcessShareDao.findByDocument(document);
    }

    @Override
    public int deleteByDocumentAcessShare(Document document) {
        return documentAcessShareDao.deleteByDocumentAcessShare(document);
    }
















}
