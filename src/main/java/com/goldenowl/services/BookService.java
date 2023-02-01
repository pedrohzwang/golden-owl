package com.goldenowl.services;

import com.goldenowl.entities.BookEntity;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class BookService {

    public List<BookEntity> findAll() {
        List<BookEntity> l = BookEntity.listAll();
        System.out.println(l);
        return l;
    }

    @Transactional
    public void save(BookEntity book) {
        book.persist();
    }
}
