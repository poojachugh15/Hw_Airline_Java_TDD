public enum CabinCrewMemberType {

    CAPTAIN(1),
    ATTENDANT(2);

    private final int rank;

    CabinCrewMemberType(int rank) {
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }
}
