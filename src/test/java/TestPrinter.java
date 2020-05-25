import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPrinter {

    Printer printer;

    @Before
    public void before(){printer = new Printer(20, 20);}

    @Test
    public void hasPaper(){
        assertEquals(20, printer.getPaper());}

    @Test
    public void hasToner(){assertEquals(20, printer.getToner());}

    @Test
    public void canPrint(){
        printer.print(5, 2);
        assertEquals(10, printer.getPaper());
        assertEquals(10, printer.getToner());
    }

    @Test
    public void notEnoughPaper(){assertEquals("Not enough Paper", printer.print(30, 1));}

}
