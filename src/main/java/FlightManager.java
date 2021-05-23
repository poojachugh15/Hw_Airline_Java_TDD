import java.util.ArrayList;

public class FlightManager {
    private Flight flight;
    private Plane plane;
    private double baggageWeight;
    private ArrayList<Passenger> passengers;
    private double allowanceMaxBagWeight;

    public FlightManager(Flight flight) {
        this.flight = flight;
        this.plane = flight.getPlane();
        this.baggageWeight = 40.00;
        this.passengers = flight.getPassengers();
        this.allowanceMaxBagWeight = plane.CalTotalWeight();
    }

    public Flight getFlight() {
        return flight;
    }

    public int getTotalBags() {
        int totalBags = 0;
        for (Passenger passenger : passengers) {
            totalBags += passenger.getNumberOfBags();
        }
        return totalBags;

    }

    public double totalBaggageWeight() {
        return this.baggageWeight * getTotalBags();
    }

    public double getTotalWeightAllowance() {
        int storeCapacity = plane.getStoreCapacity();
        double allowanceToPassenger = allowanceMaxBagWeight / storeCapacity;
        return allowanceToPassenger;
    }

    public double remainWeightCapacity() {
        return allowanceMaxBagWeight - totalBaggageWeight();
    }
}
