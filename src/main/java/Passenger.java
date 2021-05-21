public class Passenger {

    private String passengerName;
    private int bags;

    public Passenger(String passengerName, int bags) {
        this.passengerName = passengerName;
        this.bags = bags;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public int getNumberOfBags() {
        return bags;
    }
}
