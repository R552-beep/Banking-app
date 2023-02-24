package bank;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;


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

    @Test
      public void testPrintList() {
      Printer printer = new Printer();
      List<String> items = new ArrayList<>();
      items.add("Item 1");
      items.add("Item 2");
      items.add("Item 3");
      assertTrue(printer.print(items));
    } 
}
