public class Main {

  public static void stringConnect() {
    StringBuilder sb = new StringBuilder();
    for (int i = 1; i <= 100; i++) {
      sb.append(i);
      sb.append(",");
    }
    String s = sb.toString();
    String[] a = s.split(",");
    System.out.println(a);
  }

  public static void makeFileAddress(String folder, String file) {
    if (folder.matches("c:¥\\w+¥?") && file.matches("\\w+\\.\\w+")) {
      StringBuilder sb = new StringBuilder();
      if(folder.endsWith("¥")) {
        System.out.println(sb.append(folder).append(file).toString()); 
      } 
      else {
        System.out.println(sb.append(folder).append("¥").append(file).toString()); 
      }
    } 
    else {
      System.out.println("フォルダー、またはファイル名が不正です");
    }
  }

  public static void main(String[] args) {
    stringConnect();

    makeFileAddress("c:¥rightFolder¥", "sanada.tex");
    makeFileAddress("c:¥rightFolder", "sanachan.tex");
  }




}