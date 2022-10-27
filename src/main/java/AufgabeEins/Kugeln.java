package AufgabeEins;

public class Kugeln {

    public static void printKugel(Kugel kugel) {
        System.out.println("Kugel mit Radius = " + kugel.getRadius() +
                " | Durchmesser = " + kugel.getDurchmesser() +
                " | Volumen = " + kugel.getVolumen() +
                " | Oberflaeche = " + kugel.getOberflaeche());
    }

    public static void main(String [] args) {
        Kugel kugelEins = new Kugel(5);
        Kugel kugelZwei = new Kugel(7);
        Kugel kugelDrei = new Kugel(-21);

        printKugel(kugelEins);
        printKugel(kugelZwei);
        printKugel(kugelDrei);
    }
}
