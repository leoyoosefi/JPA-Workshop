package se.lexicon.jpaworkshop.dao;

import org.springframework.stereotype.Repository;
import se.lexicon.jpaworkshop.entities.AppUser;

import java.util.Collection;

@Repository
public class AppUserDAOImp implements AppUserDAO{


    @Override
    public AppUser findById(int id) {
        return null;
    }

    @Override
    public Collection<AppUser> findAll() {
        return null;
    }

    @Override
    public AppUser create(AppUser appUser) {
        return null;
    }

    @Override
    public AppUser update(AppUser appUser) {
        return null;
    }

    @Override
    public void remove(AppUser appUser) {

    }
}
