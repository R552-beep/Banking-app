package bank;

import java.util.ArrayList;
import java.util.List;

public class Account {
  private double balance;
  private Printer printer;
  private List<String> statement;
  
  public Account() {
      this.balance = 0.00;
      this.printer = new Printer();
      this.statement = new ArrayList<>();
  }

  public double getBalance() {
      return this.balance;
  }
 
  public void deposit(double amount) {
    this.balance += amount;
    recordDeposit(amount, this.balance);
  }
  
  public void withdraw(double amount) {
    if (this.balance < amount) {
      throw new IllegalArgumentException("Insufficient funds");
    }
    this.balance -= amount;
    recordWithdrawal(amount, this.balance);
  }  

  public String printStatement() {
    printer.print("date || credit || debit || balance");
    printer.print(this.statement);
    return "Statement printed successfully";
}

  private void recordDeposit(double credit, double balance) {
  Transaction amount = new Transaction(credit, 0.00, balance);
  this.statement.add(amount.displayTemplate());
}

  private void recordWithdrawal(double debit, double balance) {
  Transaction amount = new Transaction(0.00, debit, balance);
  this.statement.add(amount.displayTemplate());
}
  
}

