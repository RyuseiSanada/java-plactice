import java.text.SimpleDateFormat;
import java.util.*;

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

    //現在の100日後を西暦2024年09月24日で出力
    //現在の日時を取得
    Date now = new Date();
    //Calendarにセット
    Calendar c = Calendar.getInstance();
    c.setTime(now);
    //日を取得
    int day = c.get(Calendar.DAY_OF_MONTH);
    //100を足してCalendarにセット
    c.set(Calendar.DAY_OF_MONTH, day + 100);
    //Dateに変換
    Date day_after_100 = c.getTime();
    //formatで表示
    SimpleDateFormat f = new SimpleDateFormat("西暦yyyy年MM月dd日");
    System.out.println(f.format(day_after_100));
  }




}