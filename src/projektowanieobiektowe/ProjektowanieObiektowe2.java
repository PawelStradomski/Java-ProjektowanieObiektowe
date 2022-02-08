
package projektowanieobiektowe;
/**
 * 
 * @author pawelstradomski
 */


public class ProjektowanieObiektowe2 
{
    public static void main(String[] args) 
    {
        Test ABC = new Test();
        ABC.wypisz("Pawel");
        
        int wynik = ABC.dodaj(40, 50);
        System.out.println(wynik);
        
        double wynik2 = ABC.podziel(7, 5);
        System.out.println(wynik2);
        
        }
    
}
class Test
{
    void wypisz(String mojeImie)
    {
        System.out.println(mojeImie);
    }
    int dodaj(int a, int b)
    {
        return a + b;
    }
    double podziel(double a, double b)
    {
        if (b==0)
            return 0;
        return a / b;
    }
    
    
}
