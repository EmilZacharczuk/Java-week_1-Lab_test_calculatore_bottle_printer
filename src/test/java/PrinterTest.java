import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PrinterTest {

    private Printer printer;

    @Before
        public void before () {
        this.printer = new Printer(20);

    }

    @Test
    public void hasSheetsLimit () {
        assertEquals(20, printer.sheetsLeft());
    }

    @Test
    public void printsCopies() {
        assertEquals(10, printer.printsCopies(2,5));
    }

    @Test
    public void
}
