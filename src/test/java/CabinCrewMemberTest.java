import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    private CabinCrewMember cabinCrewMember;

    @Before
    public void before() {
        cabinCrewMember = new CabinCrewMember(Rank.ATTENDANT, "Maria");

    }

    @Test
    public void hasMemberName() {
        assertEquals("Maria", cabinCrewMember.getName() );

    }

    @Test
    public void hasCrewType() {
        assertEquals(Rank.ATTENDANT, cabinCrewMember.getRank());
    }

    @Test
    public void canRelayMessage() {
        assertEquals("Namaste! please prepare for gate departure.", cabinCrewMember.relayMessage());
    }
}
