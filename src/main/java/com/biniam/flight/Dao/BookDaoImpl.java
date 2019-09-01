package com.biniam.flight.Dao;

import com.biniam.flight.Domain.Book;
import com.biniam.flight.Domain.Flight;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class BookDaoImpl implements BookDao {
    Map<Integer,Book> books=new HashMap<>();
    @Override
    public void booking(Book book) {
        if(books.containsKey(book.getBookId())){
            throw new RuntimeException("this book already exist");
        }
        books.put(book.getBookId(),book);

    }

    @Override
    public Optional<Book> readBookByBookId(int bookId) {
        return Optional.ofNullable(books.get(bookId));
    }

    @Override
    public Collection<Book> readAllBooksByDate(String date) {
        return books.values().stream().filter(book -> book.getFlight().getDate().equalsIgnoreCase(date)).collect(Collectors.toList());
    }
}
