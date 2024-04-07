public class Quiz {
  public static void main(String[] args) {
    int ans = new java.util.Random().nextInt(10);
    for (int i = 0; i < 5; i++) {
      System.out.print("0~9の数字を入力してください");
      int num = new java.util.Scanner(System.in).nextInt();
      if (num == ans) {
        System.out.println("あたり！");
        break;
      } else {
        System.out.println("ちがいます");
      }
    }
    System.out.print("ゲームを終了します");
  }
}