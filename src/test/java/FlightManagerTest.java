import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {
    private FlightManager flightManager;
    private CabinCrewMember crewMember;
    private ArrayList<CabinCrewMember> member;
    private Pilot pilot;
    private Plane plane;
    private String date;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;
    private Passenger passenger4;
    private Passenger passenger5;
    private Flight flight;

    @Before
    public void setUp()  {
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
        plane = new Plane(PlaneType.BOEING747);
        date = "25-07-2021";
        flight = new Flight(member, plane, "FR756", "GLA", "EDI", date);
        flightManager = new FlightManager(flight);
    }

    @Test
    public void canGetFlight() {
        assertEquals(flight, flightManager.getFlight());

    }

    @Test
    public void canCalculateNoOfBags() {
        flight.addPassengers(passenger1);
        flight.addPassengers(passenger2);
        assertEquals(4, flightManager.getTotalBags());
    }

    @Test
    public void canGetTotalWeight() {
        flight.addPassengers(passenger1);
        flight.addPassengers(passenger2);
        assertEquals(160.00, flightManager.totalBaggageWeight(), 0.01);

    }

    @Test
    public void canAllowTotalWeight() {
        assertEquals(4000.00, flightManager.getTotalWeightAllowance(), 0.01);
    }

    @Test
    public void canGetRemainWeightCapacity() {
        flight.addPassengers(passenger1);
        assertEquals(19920, flightManager.remainWeightCapacity(), 0.01);
    }
}
