package se.lexicon.jpaworkshop.dao;

import se.lexicon.jpaworkshop.entities.Details;

import java.util.Collection;

public interface DetailsDAO {

    Details findById(int id);
    Collection<Details> findAll();
    Details create(Details details);
    Details update(Details details);
    void remove(Details details);







}
