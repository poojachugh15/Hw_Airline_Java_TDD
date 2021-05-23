import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    private CabinCrewMember cabinCrewMember;

    @Before
    public void before() {
        cabinCrewMember = new CabinCrewMember(Rank.ATTENDANT, "Ritesh Chugh");

    }

    @Test
    public void hasMemberName() {
        assertEquals("Ritesh Chugh", cabinCrewMember.getName() );

    }

    @Test
    public void hasCrewType() {
        assertEquals(Rank.ATTENDANT, cabinCrewMember.getRank());
    }
}
