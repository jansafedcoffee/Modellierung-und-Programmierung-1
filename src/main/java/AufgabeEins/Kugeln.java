package AufgabeEins;

public class Kugeln {
    public static void main(String [] args) {
        Kugel kugelEins = new Kugel(5);
        Kugel kugelZwei = new Kugel(7);
        Kugel kugelDrei = new Kugel(-21);

        Helper.printKugel(kugelEins);
        Helper.printKugel(kugelZwei);
        Helper.printKugel(kugelDrei);
    }
}
