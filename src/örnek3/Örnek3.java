
package örnek3;


public class Örnek3 {

  
    public static void main(String[] args) {
        for(Otomobil otomobil : Otomobil.values()) {
    System.out.println(otomobil + " " + otomobil.getFiyat() + " bin TL");
    }
     
        }

public enum Otomobil{
    BMW(120),
    Mercedes(130),
    Ferrari(860),
    Fiat(70),
    Honda(55),
    Toyota(60),
    Gelly(30),
    Audi(80);
    
    private int fiyat;
 
    private Otomobil(int f) {
        fiyat = f;
    }
 
    public int getFiyat() {
        return fiyat;
    }
    }
        
}
