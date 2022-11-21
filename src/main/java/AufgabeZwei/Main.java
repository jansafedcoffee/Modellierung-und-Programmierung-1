package AufgabeZwei;
public class Main {
    public static void main(String[] args) {
        int tripel;
        tripel = PythagoraeischeZahlentripel.pythagoraeischeZahlentripel(1, 1000);
        System.out.println("Anzahl Tripel im ersten Test: " + tripel);
        tripel = PythagoraeischeZahlentripel.pythagoraeischeZahlentripel(1001, 2000);
        System.out.println("Anzahl Tripel im zweiten Test: " + tripel);
    }


}