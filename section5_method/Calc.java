public class Calc {
  public static void main(String[] args) {
    double ansTriangle = calcTriangleArea(5, 10.0);
    double ansCircle = calcCircleArea(5.0);
    System.out.println("三角形:" + ansTriangle);
    System.out.println("円:" + ansCircle);
  }
  public static double calcTriangleArea(double bottom, double height) {
    return bottom * height / 2;
  }
  public static double calcCircleArea(double radius) {
    return radius * radius * 3.14;
  }
}