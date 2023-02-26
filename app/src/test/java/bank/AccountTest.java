package bank;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

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
  
  @Test
  public void testDepositAndWithdrawMultipleTimes() {
      Account account = new Account();
      account.deposit(100.0);
      account.withdraw(50.0);
      account.deposit(25.0);
      account.withdraw(75.0);
      assertEquals(0.0, account.getBalance(), 0.0);
  }
  @Test
  public void testPrintStatement() {
      ByteArrayOutputStream outContent = new ByteArrayOutputStream();
      System.setOut(new PrintStream(outContent));
  
      Account account = new Account();
  
      account.deposit(1000.00);
      account.withdraw(500.00);
      account.deposit(750.00);
  
      String expectedStatement = "date || credit || debit || balance\n" +
                                  "26/02/2023 || 1000.00 || 0.00 || 1000.00\n" +
                                  "26/02/2023 || 0.00 || 500.00 || 500.00\n" +
                                  "26/02/2023 || 750.00 || 0.00 || 1250.00\n";
      account.printStatement();
      String actualStatement = outContent.toString();
  
      assertEquals(expectedStatement, actualStatement);
  }    
}

