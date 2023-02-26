package bank;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.junit.Test;

public class TransactionTest {

@Test
    public void testDisplayTemplateForCredit() {
        Transaction transaction = new Transaction(100.0, 0.0, 100.0);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate now = LocalDate.now();
        String expected = String.format("%s || 100.00 || 0.00 || 100.00", now.format(formatter));
        assertEquals(expected, transaction.displayTemplate());
    }

    @Test
    public void testDisplayTemplateForDebit() {
        Transaction transaction = new Transaction(0.0, 50.0, 100.0);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate now = LocalDate.now();
        String expected = String.format("%s || 0.00 || 50.00 || 100.00", now.format(formatter));
        assertEquals(expected, transaction.displayTemplate());
    }

    @Test
    public void testDisplayTemplateForCreditAndDebit() {
        Transaction transaction = new Transaction(75.0, 50.0, 100.0);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate now = LocalDate.now();
        String expected = String.format("%s || 75.00 || 50.00 || 100.00", now.format(formatter));
        assertEquals(expected, transaction.displayTemplate());
    }

}
