package com.biniam.flight.service;

import com.biniam.flight.Dao.BookDao;
import com.biniam.flight.Domain.Book;
import com.biniam.flight.Domain.FlightClass;
import com.biniam.flight.Domain.Seat;

import java.util.Collection;
import java.util.Objects;
import java.util.stream.Collectors;

public class BookServiceImpl implements BookService {
    private final BookDao bookDao;

    public BookServiceImpl(BookDao bookDao) {
        this.bookDao = Objects.requireNonNull(bookDao,"book Should not be null");
    }

    @Override
    public void createBook(Book book) {
        bookDao.booking(book);

    }

    @Override
    public void cancelBooksById(Integer bookId) {
        bookDao.cancelBookById(bookId);

    }

    @Override
    public Collection<Book> readBookById(Integer  bookId) {
        return bookDao.readAllBooks().stream().filter(books->books.getBookId().equals(bookId)).collect(Collectors.toSet());

    }

    @Override
    public Collection<Book> readAllBooks() {
        return bookDao.readAllBooks();

    }


}
