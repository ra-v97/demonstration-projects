public class Main {
    public static void main(String[] args) {
        System.out.println("Gra komputerowa");

        Gra gra = new Gra();
        gra.rozpocznijNowaGre();
        gra.wczytajPoziom(1);
        gra.zapiszGre();
    }
}

abstract class Postac {
    protected String nazwa;
    protected int poziomZycia;

    public abstract void atakuj();
}

class Gracz extends Postac {
    private String nick;

    public Gracz(String nazwa, String nick, int poziomZycia) {
        this.nazwa = nazwa;
        this.nick = nick;
        this.poziomZycia = poziomZycia;
    }

    @Override
    public void atakuj() {
        System.out.println(nick + " atakuje z siłą " + poziomZycia);
    }
}

interface ZarzadzanieGra {
    void rozpocznijNowaGre();
    void wczytajPoziom(int poziom);
    void zapiszGre();
}

class Gra implements ZarzadzanieGra {
    @Override
    public void rozpocznijNowaGre() {
        System.out.println("Rozpoczynanie nowej gry...");
    }

    @Override
    public void wczytajPoziom(int poziom) {
        System.out.println("Wczytywanie poziomu: " + poziom);
    }

    @Override
    public void zapiszGre() {
        System.out.println("Zapisywanie stanu gry...");
    }
}

/*
class abstract Postac
class Gracz extends Postac
Interfejs ZarzadzanieGra
class Gra implement ZarzadzanieGra 
zarządzanie inwentarzem, system walki, eksploracja świata gry itp.
*/