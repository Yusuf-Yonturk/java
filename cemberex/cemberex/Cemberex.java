package cemberex;

//import java.awt.PageAttributes;
//
//public class Cemberex {
//    private double radius;
//    private static int nesneSayisi = 0;
//    
//    Cemberex(){
//        this(0);
//    }
//    
//    Cemberex(double r)
//    {
//        setRadius(r);
//        nesneSayisi++;
//    }
//    
//    void setRadius(double r) throws IllegalArgumentException
//    {
//        if(r>=0) {this.radius=r;}
//        else
//        throw new IllegalArgumentException("Yaricap negatif olamaz.");
//        
//    }
//    
//    public double getRadius()
//    {
//        return radius;
//    }
//    
//    public static void main(String[] args) {
//        try{
//            Cemberex c1 = new Cemberex();
//        }
//        catch(IllegalArgumentException e) {
//            System.out.println("Hata Yakalandi: "+e.getMessage());
//        }
//    }
//}

class Cemberex {
  private double radius;
  int nesneSayisi = 0;

  void setRadius(double r) throws IllegalArgumentException {
    if (r >= 0) {
      this.radius = r;
    } else {
      throw new IllegalArgumentException("Yaricap negatif olamaz.");
    }
  }

  Cemberex() {
    this(0);
  }

  Cemberex(double r) {
    setRadius(r);
    nesneSayisi++;
  }

  public static void main(String[] args) {
    try {
      Cemberex c1 = new Cemberex();
      Cemberex c2 = new Cemberex();
      System.out.println("Nesne: " + c1.nesneSayisi);
    } catch (IllegalArgumentException ex) {
      System.out.println("Hata Yakalandi: " + ex.getMessage());
    }
  }
}
