public class Main {
  public static void main(String[] args) {
    Thief t1 = new Thief("さなだ", 100, 50);
    Thief t2 = new Thief("りゅうせい", 100);
    Thief t3 = new Thief("くるみ");

    System.out.println(t1.name + "/" + t1.hp + "/" + t1.mp);
    System.out.println(t2.name + "/" + t2.hp + "/" + t2.mp);
    System.out.println(t3.name + "/" + t3.hp + "/" + t3.mp);
  }
}