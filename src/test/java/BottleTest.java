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
        assertEquals(100, bottle.volume());
    }
    @Test

    public void canDrink () {
        bottle.drink();
        bottle.drink();
        assertEquals(80, bottle.volume());
    }

    @Test

    public void canEmpty() {
        bottle.empty();
        assertEquals(0, bottle.volume());
    }

    @Test

    public void canFillUp() {
        bottle.empty();
        bottle.fillUp();
        assertEquals(100, bottle.volume());
    }
}
