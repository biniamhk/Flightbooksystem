package com.biniam.flight.service;

import com.biniam.flight.Domain.Book;

import java.util.Collection;

public interface BookService {
    void createBook(Book book);
    void cancelBooksById(Integer bookId);
    Collection<Book> readBookById(Integer bookId);
    Collection<Book> readAllBooks();

}
