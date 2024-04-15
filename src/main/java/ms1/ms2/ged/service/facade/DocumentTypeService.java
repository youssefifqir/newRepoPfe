package ms1.ms2.ged.service.facade;

import ms1.ms2.ged.bean.doc.Document;
import ms1.ms2.ged.bean.doc.DocumentTag;
import ms1.ms2.ged.bean.doc.DocumentType;

import java.util.List;

public interface DocumentTypeService {




    DocumentType findByLibelle(String libelle);
    DocumentType findByCode(String code);
    int deleteByLibelle(String libelle);
    int deleteByCode(String code);






}
