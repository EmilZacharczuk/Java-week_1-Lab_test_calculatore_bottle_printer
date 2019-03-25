import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PrinterTest {

    private Printer printer;

    @Before
        public void before () {
        this.printer = new Printer(30, 20);

    }

    @Test
    public void hasSheetsLimit () {
        assertEquals(30, printer.sheetsLeft());
    }


    @Test
    public void refillPaper() {
        printer.refillPaper(10);
        assertEquals(40, printer.sheetsLeft());
    }

    @Test
    public void canPrint() {
        assertEquals(true, printer.print(2,5));
    }
    @Test
    public void cannotPrint() {
        assertEquals(false, printer.print(21,1));
    }
    @Test
    public void checkTonerLevel() {
        printer.print(10, 1);
        assertEquals(10, printer.tonerVolume());
        printer.print(30,20);
        assertEquals(10, printer.tonerVolume());
    }
    @Test
    public void tonerLevelDown() {
        printer.print(10, 2);
        assertEquals(0, printer.tonerVolume());
    }
    @Test
    public void topUpToner() {
        printer.refillToner(20);
        assertEquals(40, printer.tonerVolume());
    }
}