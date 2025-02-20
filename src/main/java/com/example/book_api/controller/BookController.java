package com.example.book_api.controller;

import com.example.book_api.entity.Book;
import com.example.book_api.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class BookController {
    @Autowired
    BookService service;

    @PostMapping(value="/insert")
    public String insertBook(@RequestBody Book b)
    {
        service.insertBook(b);
        return "Book Inserted "+b.getId();
    }

    @PutMapping(value="/update")
    public String updateRecord(@RequestBody Book b)
    {
        service.updateBook(b);
        return "Book updated "+b.getId();
    }

    @GetMapping(value="/retrieve")
    public Optional<Book>retrieveBook(@RequestParam Long id)
    {
        return service.retrieveBook(id);
    }

    @GetMapping(value="/retrieveAll")
    public Iterable<Book>retriveall()
    {
        return service.retriveAllBooks();
    }

    @DeleteMapping(value="/delete")
    public String delete(@RequestParam Long id)
    {
        service.deleteBook(id);
        return "Book deleted"+id;
    }

    @DeleteMapping(value = "/deleteall")
    public String deleteAll()
    {
        service.deleteAllBooks();
        return "Books deleted";
    }

}
