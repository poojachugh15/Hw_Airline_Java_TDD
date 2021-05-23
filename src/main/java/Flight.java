import java.util.ArrayList;

public class Flight {

    private ArrayList<CabinCrewMember> crewMember;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departure;
    private String departureTime;


    public Flight(ArrayList<CabinCrewMember> crewMember, Plane plane, String flightNumber, String destination, String departure, String departureTime) {
        this.crewMember = crewMember;
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departure = departure;
        this.departureTime = departureTime;

    }


    public ArrayList<CabinCrewMember> getCrewMember() {
        return crewMember;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int passengerCount() {
        return passengers.size();
    }

    public int getCountAvailableSeats() {
        int planeCapacity = plane.getStoreCapacity();
        int passengers = passengerCount();
        return planeCapacity - passengers;
    }

    public void addPassengers(Passenger passenger) {
            if (getCountAvailableSeats() >= 1) {
                passengers.add(passenger);


        }
    }

    public void removePassenger(Passenger passenger) {
        if (passengers.contains(passenger)) {
            passengers.remove(passenger);
        }
    }

    public int getCrewMemberCount() {
        return crewMember.size();
    }


}
