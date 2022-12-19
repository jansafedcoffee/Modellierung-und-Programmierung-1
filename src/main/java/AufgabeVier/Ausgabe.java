package AufgabeVier;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class Ausgabe {
    private final Map<String, Integer> wordFrequency;

    public Ausgabe(Map<String, Integer> wordFrequency) {
        this.wordFrequency = wordFrequency;
    }

    public void schreibeStatistik(String fileName) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File("statistik", fileName)));
            for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
                writer.write(entry.getKey() + " : " + entry.getValue());
                writer.newLine();
            }
            writer.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

    }
}
