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
        assertEquals(70, bottle.drink());
    }

    @Test

    public void canEmpty() {
        assertEquals(0, bottle.empty());
    }

    @Test

    public void canFillUp() {
        assertEquals(100, bottle.fillUp());
    }
}
