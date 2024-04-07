public class Main {
  public static void main(String[] args) {
    Hero hero = new Hero();
    PoisonMatango pm = new PoisonMatango('A');

    System.out.println(hero.name);
    System.out.println("HP:" + hero.hp + "/" + hero.MAXHP);

    System.out.println(pm.id + "が現れた！");

    pm.specialAttack(hero);
    System.out.println("HP:" + hero.hp + "/" + hero.MAXHP);
    pm.specialAttack(hero);
    System.out.println("HP:" + hero.hp + "/" + hero.MAXHP);
    pm.specialAttack(hero);
    System.out.println("HP:" + hero.hp + "/" + hero.MAXHP);
  }
}