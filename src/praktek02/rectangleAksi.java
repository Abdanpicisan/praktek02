
package praktek02;

public class rectangleAksi {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.panjang = 9;
        r1.lebar = 3;
        
         r1.cetakInfo();
          System.out.println("Luas rectangle ="+r1.hitungluas());
            r1.cetakLuas();
    }
  
}
