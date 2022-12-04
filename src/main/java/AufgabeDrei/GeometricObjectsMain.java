package AufgabeDrei;

public class GeometricObjectsMain {

    public static void main(String[] args) {
        Kugel kugelEins = new Kugel(3.14);
        Kugel kugelZwei = new Kugel(275.836);
        Wuerfel wuerfelEins = new Wuerfel(3.14);
        Wuerfel wuerfelZwei = new Wuerfel(275.836);
        /* Try-catch Block nur zur Demonstration damit die main Funktion ausführbar ist und
        der Fehler an die Konsole ausgegeben werden kann. */
        try {
            new Wuerfel(-207.15);
        } catch (GeometricObjectException exception) {
            System.out.println(exception.getMessage());
        }

        GeometrischeObjekte geometrischeObjekte = new GeometrischeObjekte();
        geometrischeObjekte.add(kugelEins);
        geometrischeObjekte.add(kugelZwei);
        geometrischeObjekte.add(wuerfelEins);
        geometrischeObjekte.add(wuerfelZwei);

        System.out.println("Anzahl der Objekte: " + geometrischeObjekte.getAnzahl());
        geometrischeObjekte.ausgeben();

    }
}
