package com.biniam.flight.Dao;

import com.biniam.flight.Domain.Book;
import com.biniam.flight.Domain.Flight;

import java.util.Collection;
import java.util.Optional;

public interface BookDao {
    void booking(Book book);
    Optional<Book> readBookByBookId(int bookId);
    Collection<Book> readAllBooksByDate(String date);
    void cancelBookById(Integer bookId);
    void cancelAllBooks();
    Collection<Book> readAllBooks();
}
