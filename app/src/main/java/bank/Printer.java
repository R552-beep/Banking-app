package bank;

import java.util.List;

public class Printer {

  public void print(String item) {
    System.out.println(item);
  }
  
  public void print(List<String> items) {
    for (String item : items) {
        System.out.println(item);
    }
}
}
