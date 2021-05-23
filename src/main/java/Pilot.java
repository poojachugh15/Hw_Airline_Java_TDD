public class Pilot extends CabinCrewMember{


    private String licenceNumber;

    public Pilot( String crewMemberName, Rank rank, String licenceNumber) {
        super(rank, crewMemberName);
        this.licenceNumber = licenceNumber;
    }



    public String getLicenceNumber() {
        return licenceNumber;
    }

    public String departurePlane(){
        return "This flight is departing now";
    }
}
