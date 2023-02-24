package bank;

import org.junit.Test;

public class PrinterTest {

    @Test
      public void testPrintString() {
          Printer printer = new Printer();
          String expectedOutput = "Hello, world!";
          assertEquals(expectedOutput, printer.print(expectedOutput));
      }
  
      
  
  }
