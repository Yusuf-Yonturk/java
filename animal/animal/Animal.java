
package animal;

/**
 *
 * @author yusuf
 */
public class Animal {
  void sound() {
    System.out.println("Some sound!");
  }

  public static void main(String[] args) {

    Animal an = new Animal();
    Animal an1 = new Dog();

    an.sound();
    an1.sound();
  }

}

class Dog extends Animal {
  @Override
  void sound() {
    System.out.println("Bark!");
  }
}
