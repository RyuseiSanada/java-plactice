public class Fortune {
  public static void main(String[] args){
    System.out.println("ようこそ占いの館へ");
    System.out.print("あなたの名前を入力してください＞");
    String name = new java.util.Scanner(System.in).nextLine();
    System.out.print("あなたの年齢を入力してください＞");
    String ageString = new java.util.Scanner(System.in).nextLine();
    int age = Integer.parseInt(ageString);
    int fortune = new java.util.Random().nextInt(4);
    fortune++;
    System.out.print(age + "歳の" + name +"さん、あなたの運気は" + fortune + "です");
  }
}