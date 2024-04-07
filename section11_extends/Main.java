public class Main {
  public static void main(String[] args) {
    Book b = new Book("本です", 500, "青", "真田");
    b.setWeight(100.0);
    System.out.print(
      "タイトル:" + b.getName() + "/" +
      "価格:" + b.getPrice() + "/" +
      "色:" + b.getColor() + "/" +
      "作者:" + b.getIsbn() + "/" +
      "重さ:" + b.getWeight()
    );
  }
}