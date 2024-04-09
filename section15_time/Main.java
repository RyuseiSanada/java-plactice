import java.time.*;
import java.time.format.*;

public class Main {
  public static void main(String[] args) {
    LocalDateTime ldate = LocalDateTime.now();
    LocalDateTime ldate_after_100days = ldate.plusDays(100);
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
    System.out.print(ldate_after_100days.format(fmt));
  }
}