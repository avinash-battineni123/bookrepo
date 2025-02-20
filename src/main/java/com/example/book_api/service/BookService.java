package com.example.book_api.service;

import com.example.book_api.entity.Book;
import com.example.book_api.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {
    @Autowired
    BookRepository repo;

    public void insertBook(Book b)
    {
        repo.save(b);
    }
    public void updateBook(Book b)
    {
        repo.save(b);
    }
    public Optional<Book>retrieveBook(Long id)
    {
        return repo.findById(id);
    }
    public Iterable<Book>retriveAllBooks()
    {
        return repo.findAll();
    }
    public void deleteBook(Long id)
    {
         repo.deleteById(id);
    }
    public void deleteAllBooks()
    {
        repo.deleteAll();
    }

}
