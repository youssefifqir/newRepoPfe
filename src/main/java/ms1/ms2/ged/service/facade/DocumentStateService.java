package ms1.ms2.ged.service.facade;

import ms1.ms2.ged.bean.doc.DocumentState;

public interface DocumentStateService {




    DocumentState findByLibelle(String libelle);
    int  deleteByLibelle(String libelle);






}
