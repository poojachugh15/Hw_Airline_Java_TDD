import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PilotTest {

    private Pilot pilot;
    private Rank rank;

    @Before
    public void Before(){
        pilot = new Pilot( "Robert", Rank.CAPTAIN, "KV2317" );
    }

    @Test
    public void canGetName() {
        assertEquals("Robert", pilot.getName() );
    }

    @Test
    public void canGetRank() {
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void canGetLicenseNumber() {
        assertEquals("KV2317", pilot.getLicenceNumber());
    }

    @Test
    public void canFlyPlane() {
        assertEquals("This flight is departing now" , pilot.flyPlane());
    }
}
