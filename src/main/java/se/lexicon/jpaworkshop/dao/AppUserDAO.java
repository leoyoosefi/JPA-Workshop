package se.lexicon.jpaworkshop.dao;

import se.lexicon.jpaworkshop.entities.AppUser;

import java.util.Collection;
import java.util.Optional;

public interface AppUserDAO {

    AppUser findById(int id);
    Collection<AppUser> findAll();
    AppUser create(AppUser appUser);
    AppUser update(AppUser appUser);
    void remove(AppUser appUser);




}
