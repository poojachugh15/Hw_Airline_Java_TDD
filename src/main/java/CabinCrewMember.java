public class CabinCrewMember {

    private CabinCrewMemberType cabinCrewType;
    private String crewMemberName;

    public CabinCrewMember(CabinCrewMemberType cabinCrewType, String crewMemberName) {
        this.cabinCrewType = cabinCrewType;
        this.crewMemberName = crewMemberName;
    }

    public CabinCrewMemberType getCabinCrewType() {
        return cabinCrewType;
    }

    public String getCrewMemberName() {
        return crewMemberName;
    }
}
