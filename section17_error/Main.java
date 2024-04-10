public class Main {
  public static void main(String[] args) {
    String s = null;
    try {
      s.length();
    } catch(NullPointerException e) {
      System.out.println("やっちまったな");
      e.printStackTrace();

    }
  
  }
}