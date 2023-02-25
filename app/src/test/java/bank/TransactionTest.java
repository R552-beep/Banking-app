package bank;

import static org.junit.Assert.assertEquals;

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

    @Test
    public void testDisplayTemplateForDebit() {
        Transaction transaction = new Transaction(0.0, 50.0, 100.0);
        LocalDate date = LocalDate.now();
        String expectedTemplate = String.format("%s || || 50.00 || 100.00", date.toString());
        assertEquals(expectedTemplate, transaction.displayTemplate());
    }

}
