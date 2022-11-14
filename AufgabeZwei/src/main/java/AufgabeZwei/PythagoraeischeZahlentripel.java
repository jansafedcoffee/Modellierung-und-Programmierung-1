package AufgabeZwei;


import javax.naming.PartialResultException;

public class PythagoraeischeZahlentripel {



    public static int pythagoraeischeZahlentripel(int minimum, int maximum) {
        System.out.println("Starte Methode");
        int[] quadratic = Calculations.quadriere(Calculations.createIntArray(minimum,maximum));
        System.out.println("Quadratisches Array");
        Calculations.arrayInhaltAusgeben(quadratic);
        int anzahlTripel = 0;
        double differenz;
        for(int i=0; i < quadratic.length; i++){
            for(int j=0; j < quadratic.length; j++) {
                if(j>i) {
                    differenz = quadratic[j] -quadratic[i];
                    if((Math.sqrt(differenz) % 1)==0 && (differenz > quadratic[i])) {
                        int sqrtOuter = (int) Math.sqrt(quadratic[i]);
                        int sqrtInner = (int) Math.sqrt(quadratic[j]);
                        System.out.println(sqrtOuter +"^2 + " +(int) Math.sqrt(differenz) +"^2 = "  + sqrtInner + "^2" );
                        anzahlTripel++;
                    }
                }
            }
        }
        return anzahlTripel;
    }
}
