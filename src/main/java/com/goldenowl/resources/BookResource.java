package com.goldenowl.resources;

import com.goldenowl.entities.BookEntity;
import com.goldenowl.services.BookService;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/books")
public class BookResource {

    @Inject
    private BookService bookService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<BookEntity> findAll() {
        return bookService.findAll();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void save(BookEntity book) {
        bookService.save(book);
    }
}
