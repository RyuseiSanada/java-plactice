public class Switch {
  public static void main(String[] args) {
    System.out.print("[メニュー] 1:検索 2:登録＞");
    int selected = new java.util.Scanner(System.in).nextInt();
    switch (selected) {
      case 1 -> {
        System.out.println("検索します");
      }
      case 2 -> {
        System.out.println("登録します");
      }
    } 
  }
}