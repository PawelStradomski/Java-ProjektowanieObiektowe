
package projektowanieobiektowe;
/**
 * 
 * @author pawelstradomski
 */

public class ProjektowanieObiektowe1 {

    public static void main(String[] args) {

        Monitor dell = new Monitor(222, 333);

        System.out.println("dell.szerokosc =" + " " + dell.szerokosc);
        System.out.println("dell.wysokosc =" + " "+ dell.wysokosc);
        
        
    }
}

class Monitor
        
{
    Monitor()
    {
        System.out.println("wywolano konstruktor domyslny");
        szerokosc = 20;
        wysokosc = 30;
    }
    Monitor(int pierwszy, int drugi)
    {
        System.out.println("wywolano konstruktor z parametrami");
        szerokosc = pierwszy; //gdy wystepuje konflikt nazw mozna zast. "this."np this.szerokosc
        wysokosc = drugi;
    }
    int szerokosc;
    int wysokosc;
}
    

