package caroverriding;

/**
 *
 * @author yusuf
 */
class Car {
  void start() {
    System.out.println("Car is start");
  }

  void accelerate() {
    System.out.println("Car is accelerate");
  }

  void changeGear() {
    System.out.println("Car's gear changed");
  }
}

class LuxuryCar extends Car {
  @Override
  void changeGear() {
    System.out.println("Automatic gear changed");
  }

  void openRoof() {
    System.out.println("Car's roof open");
  }
}

public class CarOverriding {

  public static void main(String[] args) {

    LuxuryCar c = new LuxuryCar();

    c.start();
    c.accelerate();
    c.changeGear();
    // c.openRoof();
  }

}
