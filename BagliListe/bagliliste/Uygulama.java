
package bagliliste;

/**
 *
 * @author yusuf
 */
public class Uygulama {

  public static void main(String[] args) {
    BagliListe liste = new BagliListe();

    liste.basaEkle(10);
    liste.sonaEkle(15);
    liste.sonaEkle(20);
    liste.sonaEkle(25);
    liste.yazdir();
    liste.sondanYazdir();
  }

}
