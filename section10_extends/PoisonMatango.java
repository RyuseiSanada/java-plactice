public class PoisonMatango extends Matango {
  int remain = 2;
  public void specialAttack(Hero hero) {
    super.attack(hero);
    if (remain > 0) {
      System.out.println("さらに毒の胞子をばらまいた！");
      int poisonDamage = hero.hp / 5;
      System.out.println(hero.name +"はさらに" + poisonDamage + "ダメージ！");
      hero.hp -= poisonDamage;
    } 
  }
  public PoisonMatango(char id) {
    super(id);
  }
}