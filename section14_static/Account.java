public class Account {
  String accountNumber;
  int balance;

  public Account(String accountNumber, int balance) {
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  public String toString() {
    return "¥" + balance + "(口座番号：" + accountNumber + ")";
  }

  public boolean equals(Object o) {
    if (this == o) {return true; }
    if (o instanceof Account a) {
      if (this.accountNumber.equals(a.accountNumber)) {
        return true;
      }
    }
    return false;
  }
}