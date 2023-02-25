package bank;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Transaction {
  private final LocalDate date;
  private final double credit;
  private final double debit;
  private final double balance;

  public Transaction(double credit, double debit, double balance) {
      this.date = LocalDate.now();
      this.credit = credit;
      this.debit = debit;
      this.balance = balance;
}

public String displayTemplate() {
  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
  String dateFormatted = this.date.format(formatter);
  return String.format("%s || %.2f || %.2f || %.2f", dateFormatted, this.credit, this.debit, this.balance);
}

}
