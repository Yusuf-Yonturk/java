package bstree;

/**
 *
 * @author yusuf
 */

public class BSTree {

  public BSTree sol;
  public int veri;
  public BSTree sag;

  BSTree Ekle(BSTree kok, int deger) {

    if (kok == null) {
      BSTree dugum = new BSTree();
      dugum.veri = deger;
      dugum.sol = null;
      dugum.sag = null;
      return dugum;
    }

    if (deger < kok.veri)
      kok.sol = Ekle(kok.sol, deger);
    if (deger > kok.veri)
      kok.sag = Ekle(kok.sag, deger);

    return kok;
  }

  public BSTree Bul2(BSTree kok, int deger) {
    if (kok == null)
      return null;
    if (deger == kok.veri)
      return kok;
    if (deger < kok.veri)
      return Bul2(kok.sol, deger);
    if (deger > kok.veri)
      return Bul2(kok.sag, deger);
    return null;
  }

  public BSTree Min(BSTree kok) {
    BSTree p = kok;
    while (p.sol != null) {
      p = p.sol;
    }
    return p;
  }

  public BSTree Max(BSTree kok) {
    BSTree p = kok;
    while (p.sag != null) {
      p = p.sag;
    }
    return p;
  }

  void YazdirGuzel(BSTree kok, int bosluk) {
    if (kok == null)
      return;

    bosluk += 5;

    // Önce sağ çocuğu yazdır (ağaç sağdan sola yatık gözükecek)
    YazdirGuzel(kok.sag, bosluk);

    // Şu anki düğümü yazdır
    System.out.println();
    for (int i = 5; i < bosluk; i++)
      System.out.print(" ");
    System.out.println(kok.veri);

    // Sonra sol çocuğu yazdır
    YazdirGuzel(kok.sol, bosluk);
  }

  @Override
  public String toString() {
    return String.valueOf(veri);
  }

  public static void main(String[] args) {
    BSTree agac = new BSTree();
    BSTree kok = null;

    kok = agac.Ekle(kok, 5);
    kok = agac.Ekle(kok, 3);
    kok = agac.Ekle(kok, 7);
    kok = agac.Ekle(kok, 2);
    kok = agac.Ekle(kok, 4);

    BSTree bulunan = agac.Bul2(kok, 4);
    if (bulunan != null) {
      System.out.println("Bulundu: " + bulunan.veri);
    } else {
      System.out.println("Bulunamadı");
    }
    agac.YazdirGuzel(kok, 0);
    System.out.println("Min: " + agac.Min(kok));
    System.out.println("Min: " + agac.Max(kok));
  }

}
