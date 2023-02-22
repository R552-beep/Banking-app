package bank;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AccountTest {

  @Test
  public void testNewAccountHasZeroBalance() {
    Account account = new Account();
    double expectedBalance = 0.00;
    assertEquals(expectedBalance, account.getBalance(), 0.001);
  }

  @Test
  public void testDeposit() {
    Account account = new Account();
    account.deposit(100.0);
    assertEquals(100.0,account.getBalance(), 0.0);
  } 

}
