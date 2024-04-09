public class Main {
  public static void main(String[] args) {
    Account a = new Account("4649", 100);
    System.out.println(a);

    Account b = new Account("4649", 300);
    System.out.println(a.equals(b));
  }
}