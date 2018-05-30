import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SpaceCalculatorTest {


    SpaceCalculator spaceCalculator1;

    @Before
    public void setUp() throws Exception {
        spaceCalculator1 = new SpaceCalculator(1000000000);
    }



    @Test
    public void canGetAgeOnEarth() {
        assertEquals(31, spaceCalculator1.ageOnEarth(), 0.01);
    }

    @Test
    public void canGetAgeOnMercury() {
        assertEquals(131, spaceCalculator1.ageOnMercury(), 0.01);
    }
}
