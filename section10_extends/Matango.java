public class Matango {
  char id;
  public void attack(Hero hero) {
    hero.hp -= 3;
    System.out.println(hero.name + "は3ポイントのダメージ！");
  }
  public Matango(char id) {
    this.id = id;
  }
}