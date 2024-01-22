public class Main {
    public static void main(String[] args) {
        System.out.println("Przychodnia Lekarska");
    }
}
class Pracownik extends Osoba{}
class Lekarz extends Pracownik{}

abstract class Osoba{}

interface ZarzadzanieWizytami{
    void umowWizyte();
    void odwolajWizyte();
    void wyszukajWizyte ();
}
interface ZarzadzaniePacjentami{
    void dodajPacjenta();
    void usunPacjenta();
    void wyszukajPacjenta();
}
class Wizyta{}

class PrzychodniaLekarska implements ZarzadzanieWizytami,ZarzadzaniePacjentami{
    @Override
    public void umowWizyte(){
        System.out.println("Umawiamy wizyte: ");
    }
    public void odwolajWizyte(){
        System.out.println("Odwoluje wizyte: ");
    }
    public void wyszukajWizyte (){
        System.out.println("Wizyta nr: ");
    }
    public void dodajPacjenta(){
        System.out.println("Dodaj pacjenta: ");
    }
    public void usunPacjenta(){
        System.out.println("Usun pacjenta: ");
    }
    public void wyszukajPacjenta(){
        System.out.println("Wyszukaj pacjenta: ");
    }
}