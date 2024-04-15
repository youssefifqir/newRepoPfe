package ms1.ms2.ged.service.facade;

import ms1.ms2.ged.bean.doc.Document;
import ms1.ms2.ged.bean.doc.DocumentAcessShare;

import java.util.List;

public interface DocumentAcessShareService {

    int save(DocumentAcessShare documentAcessShare);

    DocumentAcessShare findByLibelle(String libelle);
    int deletelibelle(String libelle);
    List<DocumentAcessShare> findByDocument(Document document);
    int deleteByDocumentAcessShare(Document document);
























}
