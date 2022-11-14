package AufgabeZwei;

public class Calculations {
    public static int[] createIntArray(int minimum, int maximum) {
        int[] loesung = new int[maximum-minimum+1];
        for(int i=0; i <= loesung.length-1; i++)  {
            loesung[i] = minimum+i;
        }
        return loesung;
    }

    public static int[] quadriere (int[] array) {
        int[] quadrat = new int[array.length];
        for(int i = 0; i< array.length; i ++) {
            quadrat[i] = array[i] * array[i];
        }
        return quadrat;
    }

    public static void arrayInhaltAusgeben(int[] array) {
        for (int j : array) {
            System.out.print(j + ", ");
        }
        System.out.println();
    }



    public static boolean testeAufQuadratZahl(int num) {
        for(int i=0; i <= num; i++) {
            if(i*i == num) {
                return true;
            }
        }
        return false;
    }
}
