public class ScopeDemo {

  public static void main(String[] args) {
    int x;
    x = 10;
    if (true) {
      int y = 20;
      System.out.println("x and y: " + x + " " + y);
      x = y * 2;
      System.out.println(("x:" + x));
    }
    System.out.println("x is still:" + x);

    for (x = 0; x < 3; x++) {
      int y = 20;
      System.out.println("y is:" + y);
      y= 100;
      System.out.println("y is now:" + y);
    }
  }
}
