import  java.util.*;

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
    
    Map<Hero, Integer> heros_defeat = new HashMap<Hero, Integer>();
    heros_defeat.put(h1, 10);
    heros_defeat.put(h2, 2);

    for (Hero hero : heros_defeat.keySet()) {
      System.out.println(hero.getName() + ":" + heros_defeat.get(hero));
    }
  }
}