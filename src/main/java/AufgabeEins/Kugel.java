package AufgabeEins;

import static java.lang.Math.pow;

public class Kugel {
    private final double radius;

    public Kugel(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return this.radius;
    }
    public double getDurchmesser() {
        return radius * 2;
    }
    public double getVolumen() {
        return (4 * Math.PI * pow(radius, 3))/3;
    }
    public double getOberflaeche() {
        return 4 * Math.PI * pow(radius, 2);
    }
}
