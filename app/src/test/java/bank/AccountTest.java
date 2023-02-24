package bank;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

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
  
  @Test
  public void testWithdraw() {
    Account account = new Account();
    account.deposit(100.0);
    account.withdraw(50.0);
    assertEquals(50.0, account.getBalance(), 0.0);
  }

  @Test 
  public void testWithdrawThrowsExceptionWhenInsufficientFunds() {
    Account account = new Account();
    account.deposit(50.0);
    assertThrows(IllegalArgumentException.class, () -> account.withdraw(100.0));
  }

}
