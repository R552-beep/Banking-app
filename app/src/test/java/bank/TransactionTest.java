package bank;

import java.time.LocalDate;

import org.junit.Test;

public class TransactionTest {
  @Test
    public void testDisplayTemplateForCredit() {
        Transaction transaction = new Transaction(100.0, 0.0, 100.0);
        LocalDate date = LocalDate.now();
        String expectedTemplate = String.format("%s || 100.00 || || 100.00", date.toString());
        assertEquals(expectedTemplate, transaction.displayTemplate());
    }
}
