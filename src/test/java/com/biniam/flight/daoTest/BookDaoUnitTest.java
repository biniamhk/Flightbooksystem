package com.biniam.flight.daoTest;

import com.biniam.flight.Dao.BookDao;
import com.biniam.flight.Dao.BookDaoImpl;
import com.biniam.flight.Dao.FlightDao;
import com.biniam.flight.Domain.*;
import org.junit.Assert;
import org.junit.Test;

public class BookDaoUnitTest {
    @Test
    public void testCreatingBook() {
        BookDao bookDao = new BookDaoImpl();
        Book book1 = (Book.builder().withBookId(001).withFlight(Flight.builder().withFlightNo("1111").withOrigin("Stockholm")
                .withDestination("Paris").withBusinessClassPrice(10000f).withEconomyClassPrice(5000f).withDepartureTime("16:00")
                .withArrivalTime("20:00").withDate("20-11-2019").build())
                .withPassenger(Passenger.builder().withPassengerId("11").withPassengerName("eden").withEmail("biniamhk@gmail.com").build())
                .withBusinessClassFood(BusinessClassFood.builder().withFoodName("pasta").withFoodQty("1")
                        .withDrink("beer").withFoodPrice(120f).build()).build());
        bookDao.booking(book1);
        Assert.assertNotNull(bookDao.readBookByBookId(001));
        System.out.println(book1);
    }

    @Test
    public void testReadingBookedByDateAndCancellingBooks() {
        BookDao bookDao = new BookDaoImpl();
        bookDao.booking(Book.builder().withBookId(002).withFlight(Flight.builder().withFlightNo("1111").withOrigin("Stockholm")
                .withDestination("Paris").withBusinessClassPrice(10000f).withEconomyClassPrice(5000f).withDepartureTime("16:00")
                .withArrivalTime("20:00").withDate("20-11-2019").build())
                .withPassenger(Passenger.builder().withPassengerId("11").withPassengerName("eden").withEmail("biniamhk@gmail.com").build())
                .withBusinessClassFood(BusinessClassFood.builder().withFoodName("pasta").withFoodQty("1")
                        .withDrink("beer").withFoodPrice(120f).build()).build());
        bookDao.booking(Book.builder().withBookId(003).withFlight(Flight.builder().withFlightNo("1111").withOrigin("Stockholm")
                .withDestination("Paris").withBusinessClassPrice(10000f).withEconomyClassPrice(5000f).withDepartureTime("14:00")
                .withArrivalTime("20:00").withDate("11-12-2019").build())
                .withPassenger(Passenger.builder().withPassengerId("12").withPassengerName("noah").withEmail("noahhk@gamil.com").build())
                .withBusinessClassFood(BusinessClassFood.builder().withFoodName("lazana").withFoodQty("1")
                        .withDrink("beer").withFoodPrice(160f).build()).build());
        Assert.assertEquals(1, bookDao.readAllBooksByDate("11-12-2019").size());
        //Testing if we can cancel the values
        bookDao.cancelBookById(002);
        Assert.assertEquals(1,bookDao.readAllBooks().size());
    }
}
