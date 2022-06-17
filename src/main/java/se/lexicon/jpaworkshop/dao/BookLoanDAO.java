package se.lexicon.jpaworkshop.dao;

import se.lexicon.jpaworkshop.entities.BookLoan;

import java.util.Collection;

public interface BookLoanDAO {

    BookLoan findById(int id);
    Collection<BookLoan> findAll();
    BookLoan create(BookLoan book);
    BookLoan update(BookLoan book);
    void remove(BookLoan book);
}
