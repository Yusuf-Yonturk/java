package abstractclass;

/**
 *
 * @author yusuf
 */
abstract class Shape {

  abstract public double perimeter();

  abstract public double area();
}

class Rectangle extends Shape {
  double length;
  double breadth;

  Rectangle(int l, int b) {
    length = b;
    breadth = b;
  }

  public double perimeter() {
    return 2 * (length * breadth);
  }

  public double area() {
    return length * breadth;
  }

}

class Circle extends Shape {
  double radius;

  public double perimeter() {
    return 2 * Math.PI * radius;
  }

  public double area() {
    return Math.PI * radius * radius;
  }
}

public class AbstractClass {

  public static void main(String[] args) {
    Shape s = new Rectangle(4, 5);
    Circle c = new Circle();

    c.radius = 5;

    System.out.println("Perimeter:" + s.perimeter());
    System.out.println("Area:" + s.area());
    System.out.println("\nPerimeter:" + c.perimeter());
    System.out.println("Area:" + c.area());

  }

}
