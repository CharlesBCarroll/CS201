import junit.framework.TestCase;

public class CarTest extends TestCase {
    private Trip legalTrip;
    private Trip illegalTrip;
    private Car myCar;
    protected void setUp() throws Exception {
// a Trip that can be completed by Car
        legalTrip = new Trip(4);
        legalTrip.setHop(0, Terrain.AIRPORT);
        legalTrip.setHop(1, Terrain.ROAD);
        legalTrip.setHop(2, Terrain.ROAD);
        legalTrip.setHop(3, Terrain.MARINA);
// a Trip that cannot be completed by Car
// because it contains a hop through WATER
        illegalTrip = new Trip(5);
        illegalTrip.setHop(0, Terrain.AIRPORT);
        illegalTrip.setHop(1, Terrain.ROAD);
        illegalTrip.setHop(2, Terrain.ROAD);
        illegalTrip.setHop(3, Terrain.WATER); // Not possible by Car!
        illegalTrip.setHop(4, Terrain.MARINA);
        myCar = new Car(23);
    }
    public void testLegalTrip() throws Exception {
        assertTrue(legalTrip.isTripPossible(myCar));
    }
    public void testIllegalTrip() throws Exception {
        assertFalse(illegalTrip.isTripPossible(myCar));
    }
}