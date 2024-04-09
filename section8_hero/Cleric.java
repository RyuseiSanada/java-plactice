public class Cleric {
  String name = "呉山";
  final static int MAXHP = 50;
  int hp = 20;
  final static int MAXMP = 10;
  int mp = 8;

  public void selfAid() {
    System.out.println(name + "のセルフエイド！");
    if (this.mp >= 5) {
      this.hp += 10;
      if(this.hp > this.MAXHP) {
        this.hp = 50;
      }
      this.mp -= 5;
    } else {
      System.out.println("しかし" + name + "はmpが足りない！");
    }
  }
  public void pray(int second) {
    System.out.println(name + "は祈りを捧げた...");
    int recoveryMp = second + new java.util.Random().nextInt(3);
    this.mp += recoveryMp;
    if (this.mp > this.MAXMP) {
      this.mp = 10;
    }
  }
}