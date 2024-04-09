public class Main {

  public static String stringConnect() {
    StringBuilder sb = new StringBuilder();
    for (int i = 1; i <= 100; i++) {
      sb.append(i + ",");
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    String s = stringConnect();
    String[] a = s.split(",");
    for (String num : a) {
      System.out.println(num);
    }

  }
}