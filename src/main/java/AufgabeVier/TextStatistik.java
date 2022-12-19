package AufgabeVier;

import java.io.File;

public class TextStatistik {

    public static void main(String[] args) {
        File file = new File("./text");
        for (String fileNames : file.list()) {
            Text text = new Text();
            text.leseTextAusDatei("./text/" + fileNames);
            Statistik statistik = new Statistik(text.toString());
            statistik.berechneStatistik();
            Ausgabe ausgabe = new Ausgabe(statistik.getWordFrequency());
            ausgabe.schreibeStatistik(fileNames.replaceAll(".txt", ".stat"));
        }


    }
}



