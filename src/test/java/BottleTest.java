import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BottleTest {

    private Bottle bottle;

    @Before
        public void before () {
            this.bottle = new Bottle (100);
    }
    @Test

    public void hasVolume () {
        assertEquals(100, bottle.volume(), 0.01);
    }
    @Test

    public void canDrink () {
        assertEquals(90, bottle.drink(), 0.01);
    }

    @Test

    public void canEmpty() {
        assertEquals(0.00, bottle.empty(), 0.01);
    }
}
