import  java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Hero h1 = new Hero("さなだ");
    Hero h2 = new Hero("くるみ");

    ArrayList<Hero> heros =  new ArrayList<Hero>();
    heros.add(h1);
    heros.add(h2);
    for (Hero hero : heros) {
      System.out.println(hero.getName());
    }
    
  }
}