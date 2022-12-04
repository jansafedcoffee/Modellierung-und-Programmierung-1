package AufgabeDrei;

public class Wuerfel implements GeometricObject {

    private final double sideLength;

    public Wuerfel(double sideLength) {
        if (sideLength < 0) {
            throw new GeometricObjectException("Parameter Seiten Länge < 0; Wert: " + sideLength);
        }
        this.sideLength = sideLength;
    }

    public final double getSideLength() {
        return this.sideLength;
    }

    public final double getRaumdiagonale() {
        return Math.sqrt(3) * this.sideLength;
    }

    public final double getVolumen() {
        return Math.pow(this.sideLength, 3);
    }

    public final double getOberflaeche() {
        return 6 * Math.pow(this.sideLength, 2);
    }

    public void prettyPrint() {
        System.out.println("Würfel mit Seitenlänge = " + getSideLength() +
                " | Raumdiagonale = " + getRaumdiagonale() +
                " | Volumen = " + getVolumen() +
                " | Oberfläche = " + getOberflaeche());
    }

}
