package com.goldenowl.services;

import com.goldenowl.entities.BookEntity;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class BookService {

    public List<BookEntity> findAll() {
        return BookEntity.listAll();
    }

    @Transactional
    public void save(BookEntity book) {
        book.persist();
    }
}
