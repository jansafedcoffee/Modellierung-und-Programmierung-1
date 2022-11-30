package AufgabeDrei;

import static java.lang.String.format;

public class Wuerfel {

    private final double a;

    public Wuerfel(double a) {
        if(a < 0) {
            throw new GeometricObjectException("Parameter a < 0; Wert: " + a);
        }
        this.a = a;
    }

    public final double getA() {
        return this.a;
    }

    public final double getRaumdiagonale() {
        return Math.sqrt(3) * this.a;
    }

    public final double getVolumen() {
        return Math.pow(this.a, 3);
    }

    public final double getOberflaeche() {
        return 6 * Math.pow(this.a, 2);
    }

}
