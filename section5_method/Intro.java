public class Intro {
  public static void main(String[] args) {
    introduceOneself("サナダ", 24, 165.0, '辰');
  }
  public static void introduceOneself(String name, int age, double height, char animal) {
    System.out.print("私の名前は" + name + "です。歳は" + age + "です。身長は" + height + "です。十二支は" + animal +"です。");
  }
}