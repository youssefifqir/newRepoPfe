package ms1.ms2.ged.service.impl;

import ms1.ms2.ged.Dao.user.EntiteAdministrativeDao;
import ms1.ms2.ged.bean.doc.EntiteAdministrativeType;
import ms1.ms2.ged.bean.user.EntiteAdministrative;
import ms1.ms2.ged.service.facade.EntiteAdministrativeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EntiteAdministrativeServiceImpl implements EntiteAdministrativeService {

    @Autowired
    private EntiteAdministrativeDao entiteAdministrativeDao;
    @Autowired
    private EntiteAdministrativeService entiteAdministrativeService;




    @Override
    public EntiteAdministrative findByCode(String code) {
        return entiteAdministrativeDao.findByCode(code);
    }

    @Override
    public int deleteByCode(String code) {
        return entiteAdministrativeDao.deleteByCode(code);
    }

    @Override
    public EntiteAdministrative findByLibelle(String libelle) {
        return entiteAdministrativeService.findByLibelle(libelle);
    }
    @Transactional
    @Override
    public int deleteByLibelle(String libelle) {
        return entiteAdministrativeDao.deleteByLibelle(libelle);
    }

    @Override
    public List<EntiteAdministrative> findByEntiteAdministrativeType(EntiteAdministrativeType entiteAdministrativeType) {
        return entiteAdministrativeDao.findByEntiteAdministrativeType(entiteAdministrativeType);
    }

    @Override
    public int deleteByEntiteAdministrativeType(EntiteAdministrativeType entiteAdministrativeType) {
        return entiteAdministrativeDao.deleteByEntiteAdministrativeType(entiteAdministrativeType);
    }
}


