package ms1.ms2.ged.service.facade;

import ms1.ms2.ged.bean.doc.Document;
import ms1.ms2.ged.bean.doc.DocumentField;
import ms1.ms2.ged.bean.doc.Field;

public interface DocumentFieldService{



    DocumentField findByLibelle(String libelle);
    int deletelibelle(String libelle);
    DocumentField findByFieldAndDocument(Field field, Document document);











}
