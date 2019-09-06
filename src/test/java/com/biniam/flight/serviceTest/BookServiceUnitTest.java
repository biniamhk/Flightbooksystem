package com.biniam.flight.serviceTest;

import com.biniam.flight.Dao.BookDao;
import com.biniam.flight.Dao.BookDaoImpl;
import com.biniam.flight.Domain.Book;
import com.biniam.flight.Domain.BusinessClassFood;
import com.biniam.flight.Domain.Flight;
import com.biniam.flight.Domain.Passenger;
import com.biniam.flight.service.BookService;
import com.biniam.flight.service.BookServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BookServiceUnitTest {
    GenericXmlApplicationContext applicationContext = new GenericXmlApplicationContext("DaoTier.xml");
    private BookDao bookDao = applicationContext.getBean(BookDao.class);

    @Test
    public void TestCreatingBook() {
        bookDao.booking(Book.builder().withBookId(002).withFlight(Flight.builder().withFlightNo("1111").withOrigin("Stockholm")
                .withDestination("Paris").withBusinessClassPrice(10000f).withEconomyClassPrice(5000f).withDepartureTime("16:00")
                .withArrivalTime("20:00").withDate("20-11-2019").build())
                .withPassenger(Passenger.builder().withPassengerId("11").withPassengerName("eden").withEmail("biniamhk@gmail.com").build())
                .withBusinessClassFood(BusinessClassFood.builder().withFoodName("pasta").withFoodQty("1")
                .withDrink("beer").withFoodPrice(120f).build()).build());

        BookService bookService = new BookServiceImpl(bookDao);
        Assert.assertNotNull(bookService.readAllBooks());
        System.out.println(bookService.readAllBooks());
    }


}
