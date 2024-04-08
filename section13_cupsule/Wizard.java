public class Wizard {
  private int hp;
  private Wand wand;

  void heal(Wizard w) {
    int basePoint = 10;
    int recovPoint = (int)(basePoint + wand.getPower());
    w.setHp(w.getHp() + recovPoint);
    System.out.println(recovPoint + "回復");
  }

  void setHp(int hp) {
    this.hp = hp;
  }
  int getHp() {
    return this.hp;
  }
  void setWand(Wand wand) {
    this.wand = wand;
  }

}