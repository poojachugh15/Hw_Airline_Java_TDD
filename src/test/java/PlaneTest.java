import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;

    @Before
    public void before(){
        plane= new Plane(PlaneType.BOEING747);
    }

    @Test
    public void canGetPlaneType() {
        assertEquals(PlaneType.BOEING747, plane.getPlaneType());
    }

    @Test
    public void canGetCapacity() {
        assertEquals(5, plane.getStoreCapacity());
    }

    @Test
    public void canGetWeight() {
        assertEquals(40.00, plane.getPlaneWeight(), 0.01);
    }

    @Test
    public void canGetTotalWeight() {
        assertEquals(20000, plane.CalTotalWeight(), 0.01);
    }
}
