package bank;

public class Account {
  private double balance;

  public Account() {
      this.balance = 0.00;
  }

  public double getBalance() {
      return this.balance;
  }
 
  public void deposit(double amount) {
    this.balance += amount;
  }
  
  public void withdraw(double amount) {
    if (this.balance < amount) {
      throw new IllegalArgumentException("Insufficient funds");
  }
    this.balance -= amount;
  }
}

