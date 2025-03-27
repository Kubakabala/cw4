public class Main {
    public static void main(String[] args) {
        SystemRezerwacji system = new SystemRezerwacji();

        Wydarzenie koncert = new Wydarzenie("Koncert Symphony", 200.0);
        Wydarzenie teatr = new Wydarzenie("Hamlet", 90.0);
        system.dodajWydarzenie(koncert);
        system.dodajWydarzenie(teatr);

        Klient klient1 = new Klient("Tomasz", "Całus", "tom@example.com");
        Klient klient2 = new Klient("Milena", "Psikus", "mil@example.com");
        system.dodajKlienta(klient1);
        system.dodajKlienta(klient2);

        system.dokonajRezerwacji(klient1, koncert);
        system.dokonajRezerwacji(klient1, teatr);
        system.dokonajRezerwacji(klient2, koncert);

        System.out.println("Rezerwacje klienta Tomasz Całus:");
        klient1.wyświetlRezerwacje();

        Wydarzenie koncertRef = system.znajdźWydarzenie("Koncert Symphony");
        System.out.println("\nZmiana ceny koncertu na 150 zł");
        koncertRef.setCena(150.0);

        System.out.println("\nRezerwacje klienta Tomasz Całus po zmianie ceny:");
        klient1.wyświetlRezerwacje();

        System.out.println("\nRezerwacje klienta Milena Psikus po zmianie ceny:");
        klient2.wyświetlRezerwacje();

        System.out.println("\nTomasz anuluje rezerwację na teatr:");
        klient1.anulujRezerwację(teatr);
        klient1.wyświetlRezerwacje();

        System.out.println("\nDostępne miejsca na koncercie: " + koncert.getDostępneMiejsca()
                + " z " + koncert.getMaxLiczbaMiejsc());
    }
}
