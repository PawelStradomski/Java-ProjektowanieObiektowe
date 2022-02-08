
package projektowanieobiektowe;
/**
 * 
 * @author pawelstradomski
 */

public class ProjektowanieObiektowe4 {
    
    public static void main(String[] args) {
        
        Klient A = new Klient("Pawel");
        Klient B = new Klient("Krzysztof");
        Klient C = new Klient("Kasia");
        
        System.out.println(A.ID);
        System.out.println(B.ID);
        System.out.println(C.ID);
        System.out.println(Klient.nastepnyID);
        
    }
    
}
class Klient
{
    Klient (String imieKlient)
    {
        this.imieKlient = imieKlient;
        ID = nastepnyID;
        nastepnyID++;
    }
    String imieKlient;
    int ID;
    static int nastepnyID = 1;
}