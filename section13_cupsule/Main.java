public class Main {
  public static void main(String[] args) {
    Wizard wiz = new Wizard();
    Wand wand = new Wand();

    wand.setPower(15);

    wiz.setHp(50);
    wiz.setWand(wand);
    wiz.heal(wiz);
  }
}