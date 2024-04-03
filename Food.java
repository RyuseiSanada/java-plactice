public class Food {
  public static void main(String[] args) {
    int isHungry = new java.util.Random().nextInt(2);
    String food = "ハンバーガー";
    System.out.println("こんにちは");
    if (isHungry == 0) {
      System.out.println("お腹がいっぱいです");
    } else {
      System.out.println("はらぺこです");
      System.out.println(food +"を食べます");
    }
  }
}