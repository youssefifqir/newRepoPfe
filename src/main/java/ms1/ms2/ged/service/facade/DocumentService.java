package ms1.ms2.ged.service.facade;

import ms1.ms2.ged.bean.doc.Document;
import ms1.ms2.ged.bean.doc.DocumentState;
import ms1.ms2.ged.bean.doc.DocumentType;

import java.util.List;

public interface DocumentService {

    Document findByReference(String reference);
    int deleteByReference(String reference);
    List<Document> findByDocumentType(DocumentType documentType);
    int deleteByDocumentType(DocumentType documentType);

    List<Document>  findByDocumentState(DocumentState documentState);
    int deleteByDocumentState(DocumentState documentState);
    int save(Document document);









}
