import com.biniam.flight.Dao.AirplaneDao;
import com.biniam.flight.Dao.FlightDao;
import com.biniam.flight.Domain.Airplane;
import com.biniam.flight.Domain.Flight;
import com.biniam.flight.service.AirplaneService;
import com.biniam.flight.service.FlightService;
import org.springframework.context.support.GenericXmlApplicationContext;

import javax.swing.text.html.Option;
import java.util.Collection;
import java.util.Optional;

public class MainSpring {
    public static void main(String[] args) {

        GenericXmlApplicationContext applicationContext = new GenericXmlApplicationContext("FlightDaoTier.xml","AirplaneDaoTier.xml",
                "AirplaneServiceTier.xml",
                "FlightServiceTier.xml"
        );

        FlightDao flightDao = applicationContext.getBean(FlightDao.class);
        Optional<Flight> optional = flightDao.read("223");
        System.out.println("is present:  " + optional.isPresent());
        flightDao.createFlight(Flight.builder().withFlightNo("223").withOrigin("Stockholm")
                .withDestination("paris").withDepartureTime("20:00").withArrivalTime("00:45")
                .withDate("15-09-2019").withBusinessClassPrice(20000f).withEconomyClassPrice(5000f)
                .build());
        optional=flightDao.read("223");
        System.out.println("is present:  " + optional.isPresent());
        Collection<Flight>  flights=flightDao.readAllFlightsByOrigin("Stockholm");
        System.out.println("flight orgin is :\n"+flights);

        FlightService flightService = applicationContext.getBean(FlightService.class);
        FlightService flightService1=applicationContext.getBean(FlightService.class);
        System.out.println("Flight Number is  :"+flightService.getFlightByNumber("223"));
        System.out.println(flightService.equals(flightService1)+"\n===========================================");


        System.out.println("[Now we testing our spring to create airplane ]:");
        AirplaneDao airplaneDao=applicationContext.getBean(AirplaneDao.class);
        Optional<Airplane> optional1=airplaneDao.read("M773");
        System.out.println("is present :\t"+optional1.isPresent());
        airplaneDao.createPlane(Airplane.builder().withPlaneNo("M773").withModel("Boeing773").withNumberOfSeats(10).build());
        optional1=airplaneDao.read("M773");
        System.out.println("is present :\t"+optional.isPresent());
        Collection<Airplane> airplanes=airplaneDao.readAllAirplane();
        System.out.println(airplanes);

        AirplaneService airplaneService=applicationContext.getBean(AirplaneService.class);
        AirplaneService airplaneService1=applicationContext.getBean(AirplaneService.class);
        System.out.println("The number same plane models are : "+airplaneService.readAllAirplaneByModel("Boeing773")
                .stream().filter(planemodel->planemodel.getModel().equalsIgnoreCase("Boeing773")).count());
        System.out.println(airplaneService.equals(airplaneService1));

    }

}
