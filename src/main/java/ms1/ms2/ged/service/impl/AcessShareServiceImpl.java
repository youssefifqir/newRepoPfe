package ms1.ms2.ged.service.impl;

import ms1.ms2.ged.Dao.referentiel.AcessShareDao;
import ms1.ms2.ged.bean.referentiel.AcessShare;
import ms1.ms2.ged.service.facade.AcessShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcessShareServiceImpl implements AcessShareService {




    @Autowired
    private AcessShareDao acessShareDao;
    @Autowired
    private AcessShareService acessShareService;

    @Override
    public AcessShare findByLibelle(String libelle) {
        return acessShareDao.findByLibelle(libelle);
    }

    @Override
    public int deleteByLibelle(String libelle) {
        return acessShareDao.deleteByLibelle(libelle);
    }

    @Override
    public AcessShare findByCode(String code) {
        return acessShareDao.findByCode(code);
    }

    @Override
    public int deleteByCode(String code) {
        return acessShareDao.deleteByCode(code);
    }












}
