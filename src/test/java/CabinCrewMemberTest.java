import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    private CabinCrewMember cabinCrewMember;

    @Before
    public void before() {
        cabinCrewMember = new CabinCrewMember(CabinCrewMemberType.CAPTAIN, "Ritesh Chugh");

    }

    @Test
    public void hasMemberName() {
        assertEquals("Ritesh Chugh", cabinCrewMember.getCrewMemberName() );

    }

    @Test
    public void hasCrewType() {
        assertEquals(CabinCrewMemberType.CAPTAIN, cabinCrewMember.getCabinCrewType());
    }
}
