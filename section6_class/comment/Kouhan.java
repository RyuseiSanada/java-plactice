package comment;

public class Kouhan {
  public static void callDeae() {
    System.out.println("えぇい、こしゃくな。くせ者だ！であえい！");
  }
  public static void showMondokoro() {
    System.out.println("飛車さん、角さん。もういいでしょう。");
    System.out.println("この紋所が目に入らぬか！");
    try {
      Thread.sleep(3000); // 10秒(1万ミリ秒)間だけ処理を止める
    } catch (InterruptedException e) {
    }
    Zenhan.doTogame();
  }
}