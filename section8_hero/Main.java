public class Main {
  public static void main(String[] args) {
    Cleric cleric = new Cleric();
    System.out.println(cleric.name);
    System.out.println("HP:" + cleric.hp + "/" + cleric.MAXHP);
    System.out.println("MP:" + cleric.mp + "/" + cleric.MAXMP);
    System.out.println("呉山は傷ついている。");
    cleric.selfAid();
    System.out.println("HP:" + cleric.hp + "/" + cleric.MAXHP);
    System.out.println("MP:" + cleric.mp + "/" + cleric.MAXMP);
    cleric.selfAid();
    System.out.println("HP:" + cleric.hp + "/" + cleric.MAXHP);
    System.out.println("MP:" + cleric.mp + "/" + cleric.MAXMP);
    cleric.pray(3);
    System.out.println("HP:" + cleric.hp + "/" + cleric.MAXHP);
    System.out.println("MP:" + cleric.mp + "/" + cleric.MAXMP);
    
  }
}