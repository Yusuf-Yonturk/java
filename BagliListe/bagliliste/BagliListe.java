
package bagliliste;

/**
 *
 * @author yusuf
 */

public class BagliListe {
  Node head = null;
  Node tail = null;

  void basaEkle(int data) {
    Node eleman = new Node(data);
    if (head == null) {
      head = eleman;
      tail = eleman;
    } else {
      eleman.next = head;
      head.prev = eleman;
      head = eleman;
    }

  }

  void sonaEkle(int data) {
    Node eleman = new Node(data);

    if (head == null) {
      head = eleman;
      tail = eleman;
    } else {
      tail.next = eleman;
      eleman.prev = tail;
      tail = eleman;

    }
  }

  void yazdir() {
    int i = 0;
    Node temp = head;
    if (head == null) {
      System.out.println("Liste bos");
    } else {
      while (temp != null) {
        i++;
        System.out.print(temp.data + "->");
        temp = temp.next;
      }
    }
  }

  void sondanYazdir() {
    if (head == null) {
      System.out.println("Liste Bos");
    }
    int j = 0;
    Node temp = tail;
    System.out.println("\n");
    while (temp != null) {
      System.out.print(temp.data + "->");
      temp = temp.prev;
    }
  }
}
