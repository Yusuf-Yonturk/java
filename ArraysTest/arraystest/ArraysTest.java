package arraystest;

/**
 *
 * @author yusuf
 */
class Arrays {
  private String name = "";
  private String itemNo;
  private int quantity;
  private double price;

  public Arrays(String itemNo, String name, int quantity, double price) {
    this.itemNo = itemNo;
    this.name = name;
    this.quantity = quantity;
    this.price = price;

  }

  public String getName() {
    return name;
  }

  public String getItemNo() {
    return itemNo;
  }

  public int getQuantity() {
    return quantity;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public String toString() {
    return "\nItem No:" + getItemNo() + "\nName:" + getName() + "\nQuantity:" + getQuantity() + "\nPrice:" + getPrice();
  }
}

public class ArraysTest {

  public static void main(String[] args) {
    Arrays ar[] = new Arrays[3];
    ar[0] = new Arrays("25a-324D-s123", "Kalem", 134, 25.0);
    ar[1] = new Arrays("45a-213D-s322", "Silgi", 122, 15.0);
    ar[2] = new Arrays("35a-223D-s456", "Defter", 120, 65.0);

    for (Arrays s : ar)
      System.out.println(s);
  }

}
