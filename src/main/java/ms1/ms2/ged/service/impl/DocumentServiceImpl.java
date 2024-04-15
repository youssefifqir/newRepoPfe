package ms1.ms2.ged.service.impl;

import ms1.ms2.ged.Dao.doc.DocumentCategorieDao;
import ms1.ms2.ged.Dao.doc.DocumentDao;
import ms1.ms2.ged.Dao.doc.DocumentFieldDao;
import ms1.ms2.ged.Dao.doc.DocumentTypeDao;
import ms1.ms2.ged.Dao.user.EntiteAdministrativeDao;
import ms1.ms2.ged.Dao.user.UtilisateurDao;
import ms1.ms2.ged.bean.doc.*;
import ms1.ms2.ged.bean.user.EntiteAdministrative;
import ms1.ms2.ged.bean.user.Utilisateur;
import ms1.ms2.ged.service.facade.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class DocumentServiceImpl implements DocumentService {

    @Autowired
    private DocumentDao documentDao;
    @Autowired
    private DocumentService documentService;
    @Autowired
    private DocumentTypeDao documentTypeDao;
    @Autowired
    private DocumentTypeService documentTypeService;
    @Autowired
    private DocumentStateService documentStateService;
    @Autowired
    private DocumentCategorieDao documentCategorieDao;
    @Autowired
    private DocumentCategorieService documentCategorieService;
    @Autowired
    private UtilisateurService utilisateurService;
    @Autowired
    private UtilisateurDao utilisateurDao;
    @Autowired
    private DocumentFieldService documentFieldService;
    @Autowired
    private DocumentFieldDao documentFieldDao;
    @Autowired
    private EntiteAdministrativeService entiteAdministrativeService;
    @Autowired
    private EntiteAdministrativeDao entiteAdministrativeDao;



    @Override
    public Document findByReference(String reference) {
        return documentDao.findByReference(reference);
    }
    @Transactional
    @Override
    public int deleteByReference(String reference) {
        return documentDao.deleteByReference(reference);
    }

    @Override
    public List<Document> findByDocumentType(DocumentType documentType) {
        return documentDao.findByDocumentType(documentType);
    }
    @Transactional
    @Override
    public int deleteByDocumentType(DocumentType documentType) {
        return documentDao.deleteByDocumentType(documentType);
    }

    @Override
    public List<Document> findByDocumentState(DocumentState documentState) {
        return documentDao.findByDocumentState(documentState);
    }
   @Transactional
    @Override
    public int deleteByDocumentState(DocumentState documentState) {
        return documentDao.deleteByDocumentState(documentState);
    }

    @Override
    public int save(Document document) {
        if(document==null) {
            return -1;
        }
        if (document != null && document.getDocumentType()==null) {
            return -2;

        }
        String code=document.getDocumentType().getCode();
     DocumentType documentType=documentTypeService.findByCode(code);
     document.setDocumentType(documentType);

      if (document != null && document.getDocumentState()==null) {
            return -3;

        }
     String libelle=document.getDocumentState().getLibelle();
     DocumentState documentState=documentStateService.findByLibelle(libelle);
     document.setDocumentState(documentState);

       if (document != null && document.getDocumentCategorie()==null) {
            return -4;

        }
     String Code=document.getDocumentCategorie().getCode();
     DocumentCategorie documentCategorie=documentCategorieService.findByCode(code);
     document.setDocumentCategorie(documentCategorie);

       if (document != null && document.getProprietaire()==null) {
            return -5;

        }
     String name=document.getProprietaire().getName();
     Utilisateur utilisateur=utilisateurService.findByName(name);
     document.setProprietaire(utilisateur);

      else if (document != null && document.getEntiteAdministrative()==null) {
            return -6;

        }

     String lib=document.getEntiteAdministrative().getLibelle();
     EntiteAdministrative entiteAdministrative=entiteAdministrativeService.findByLibelle(libelle);
     document.setEntiteAdministrative(entiteAdministrative);

     //how to save list of objects




















































    }













}
