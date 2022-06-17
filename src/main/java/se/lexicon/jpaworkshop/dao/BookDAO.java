package se.lexicon.jpaworkshop.dao;

import se.lexicon.jpaworkshop.entities.Book;

import java.util.Collection;

public interface BookDAO {

    Book findById(int id);
    Collection<Book> findAll();
    Book create(Book book);
    Book update(Book book);
    void remove(Book book);
}
