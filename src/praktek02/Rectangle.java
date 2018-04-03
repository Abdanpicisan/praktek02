package praktek02;

import java.util.logging.Logger;

public class Rectangle {
     double panjang;
    double lebar;
    
    void cetakInfo(){
        System.out.println("==================");
        System.out.println("Panjang :"+panjang);
        System.out.println("Lebar   :"+lebar);
        System.out.println("==================");
    }

    public Rectangle() {
         panjang=5;
        lebar=2;
    }
 
    
    double hitungluas(){
        double luas;
        luas=panjang*lebar;
        return luas;
    }
    void cetakLuas(){
        System.out.println("Luasnya adalah :"+hitungluas());
    }
}
