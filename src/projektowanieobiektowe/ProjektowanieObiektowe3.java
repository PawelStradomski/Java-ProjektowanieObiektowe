
package projektowanieobiektowe;
/**
 * 
 * @author pawelstradomski
 */

public class ProjektowanieObiektowe3 
{
    public static void main(String[] args) {
    
        Matematyka ABC = new Matematyka();
        double wynik = ABC.dodaj(5.5, 6);
        System.out.println(wynik);
        
        double wynik2 = Matematyka2.dodaj(55.5, 44.5);//met.static nie musimy pisac instancji np Matematyka2 ABC=New Matematyka();
        System.out.println(wynik2);
        
        System.out.println(Matematyka3.Pi); // met.static bezposrednie odwolanie
        
        Matematyka4 DEF = new Matematyka4();
        System.out.println(DEF.dodaj(100, 100));//Mozna bezposrednio wyslac bez rownania: np bez "int wynik = DEF.dodaj(100,100)
        
        
        
        
        
        
    }
    
}
class Matematyka
{
    double dodaj(double a, double b)
    {
        return a + b;
    }
    
}
class Matematyka2
{
    static double dodaj(double a, double b) //met.static bez pisania instancji
    {
        return a + b;
    }
}

class Matematyka3
{
    static double Pi = 3.14;
}

class Matematyka4
{
   int dodaj(int a, int b)
   {
       return a + b;
   }
}

