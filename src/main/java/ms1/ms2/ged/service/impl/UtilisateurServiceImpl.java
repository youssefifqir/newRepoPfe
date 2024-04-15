package ms1.ms2.ged.service.impl;

import ms1.ms2.ged.Dao.user.UtilisateurDao;
import ms1.ms2.ged.bean.user.Utilisateur;
import ms1.ms2.ged.service.facade.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UtilisateurServiceImpl implements UtilisateurService {

    @Autowired
    private UtilisateurDao utilisateurDao;
    @Autowired
    private UtilisateurService utilisateurService;


    @Override
    public Utilisateur findByName(String name) {
        return utilisateurDao.findByName(name);
    }

   @Transactional
    @Override
    public int deleteByName(String name) {
        return utilisateurDao.deleteByName(name);
    }










}
