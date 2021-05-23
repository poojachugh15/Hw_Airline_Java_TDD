import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private CabinCrewMember crewMember;
    private Pilot pilot;
    private ArrayList<CabinCrewMember> member;
    private String date;
    private Plane plane;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;
    private Passenger passenger4;
    private Passenger passenger5;
    private Flight flight;
    private String flightNumber;


    @Before
    public void before(){
        pilot = new Pilot("Robert", Rank.CAPTAIN, "KV2317");
        crewMember = new CabinCrewMember(Rank.ATTENDANT, "Maria");
        member = new ArrayList<>();
        member.add(crewMember);
        member.add(pilot);
        passenger1 = new Passenger("Neha", 2);
        passenger2 = new Passenger("Nidhi", 2);
        passenger3 = new Passenger("Parul", 2);
        passenger4 = new Passenger("Sanjay", 2);
        passenger5 = new Passenger("Arjun", 2);
        flightNumber = "FR756";
        plane = new Plane(PlaneType.BOEING747);
        date = "25-07-2021";
        flight = new Flight(member, plane, flightNumber, "GLA", "EDI", date);

        }

    @Test
    public void canGetFlightNo() {
        assertEquals("FR756", flight.getFlightNumber());
    }

    @Test
    public void canGetDestination() {
        assertEquals("GLA", flight.getDestination());
    }

    @Test
    public void canGetDeparture() {
        assertEquals("EDI", flight.getDeparture());
    }

    @Test
    public void canGetDepartureTime() {
        assertEquals("25-07-2021", flight.getDepartureTime());

    }

    @Test
    public void canGetPlane() {
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void canGetCrewMembers() {
        assertEquals(member, flight.getCrewMember());
    }

    @Test
    public void getCrewMemberCount() {
        assertEquals(2, flight.getCrewMemberCount());
    }

    @Test
    public void canPassengerCount() {
        assertEquals(0, flight.passengerCount());
    }

    @Test
    public void canCountAvailableSeats() {
        assertEquals(5, flight.getCountAvailableSeats());

    }

    @Test
    public void canAddPassengers() {
        flight.addPassengers(passenger1);
        flight.addPassengers(passenger2);
        flight.addPassengers(passenger3);
        assertEquals(2, flight.getCountAvailableSeats());
    }

    @Test
    public void cannotAddPassengers() {
        flight.addPassengers(passenger1);
        flight.addPassengers(passenger2);
        flight.addPassengers(passenger3);
        flight.addPassengers(passenger4);
        flight.addPassengers(passenger5);
        assertEquals(5, flight.passengerCount());
    }

    @Test
    public void canRemovePassenger() {
        flight.addPassengers(passenger1);
        flight.addPassengers(passenger2);
        flight.addPassengers(passenger3);
        flight.removePassenger(passenger1);
        assertEquals(3, flight.getCountAvailableSeats());



    }
}
