package bank;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class PrinterTest {

    @Test
       public void testPrintString() {
       Printer printer = new Printer();
       String expectedOutput = "Hello, world!";
       ByteArrayOutputStream outContent = new ByteArrayOutputStream();
       System.setOut(new PrintStream(outContent));
       printer.print(expectedOutput);
       assertEquals(expectedOutput, outContent.toString().trim());
    }
  
}
