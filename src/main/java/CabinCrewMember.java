public class CabinCrewMember {

    private Rank rank;
    private String crewMemberName;

    public CabinCrewMember(Rank rank, String crewMemberName) {
        this.rank = rank;
        this.crewMemberName = crewMemberName;
    }

    public Rank getRank() {
        return rank;
    }

    public String getName() {
        return crewMemberName;
    }
    public String relayMessage(){
        return "Namaste! please prepare for gate departure.";
    }
}
