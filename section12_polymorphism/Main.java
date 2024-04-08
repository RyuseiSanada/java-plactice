public class Main {
  public static void main(String[] args) {

    Y[] ab = {new A(), new B()};

    for (Y i : ab) {
      i.b();
    }
  }
}