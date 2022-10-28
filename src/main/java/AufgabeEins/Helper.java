package AufgabeEins;

public class Helper {

    public static void printKugel(Kugel kugel) {
        System.out.println("Kugel mit Radius = " + kugel.getRadius() +
                " | Durchmesser = " + kugel.getDurchmesser() +
                " | Volumen = " + kugel.getVolumen() +
                " | Oberflaeche = " + kugel.getOberflaeche());
    }
}
