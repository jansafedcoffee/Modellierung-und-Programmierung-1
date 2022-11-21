package AufgabeZwei;

public class PythagoraeischeZahlentripel {
    private static int[] createIntArray(int minimum, int maximum) {
        int[] loesung = new int[maximum - minimum + 1];
        for (int i = 0; i <= loesung.length - 1; i++) {
            loesung[i] = minimum + i;
        }
        return loesung;
    }

    private static int[] quadriere(int[] ganzeZahlen) {
        int[] quadratZahlen = new int[ganzeZahlen.length];
        for (int i = 0; i < ganzeZahlen.length; i++) {
            quadratZahlen[i] = ganzeZahlen[i] * ganzeZahlen[i];
        }
        return quadratZahlen;
    }

    private static void arrayInhaltAusgeben(int[] quadratZahlen) {
        // Gib alle Zahlen des Arrays bis auf die letzte aus.
        for (int i = 0; i < quadratZahlen.length - 1; i++) {
            System.out.print(quadratZahlen[i] + ", ");
        }
        // Gib die letzte Zahl des Arrays in der selben Zeile aus.
        System.out.print(quadratZahlen[quadratZahlen.length - 1]);
        System.out.println();
    }


    private static boolean testeAufQuadratZahl(int zahl) {
        return Math.sqrt(zahl) % 1 == 0;
    }


    public static int pythagoraeischeZahlentripel(int minimum, int maximum) {
        int[] quadratZahlen = quadriere(createIntArray((int) Math.ceil(Math.sqrt(minimum)), (int) Math.floor(Math.sqrt(maximum))));
        arrayInhaltAusgeben(quadratZahlen);
        int anzahlTripel = 0;
        int differenz;
        for (int i = 0; i < quadratZahlen.length; i++) {
            for (int j = 0; j < quadratZahlen.length; j++) {
                if (j > i) {
                    differenz = quadratZahlen[j] - quadratZahlen[i];
                    if (testeAufQuadratZahl(differenz) && (differenz > quadratZahlen[i])) {
                        int a = (int) Math.sqrt(quadratZahlen[i]);
                        int b = (int) Math.sqrt(differenz);
                        int c = (int) Math.sqrt(quadratZahlen[j]);
                        System.out.println(a + "^2 + " + b + "^2 = " + c + "^2");
                        anzahlTripel++;
                    }
                }
            }
        }
        return anzahlTripel;
    }
}
