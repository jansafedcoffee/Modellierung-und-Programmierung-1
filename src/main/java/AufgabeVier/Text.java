package AufgabeVier;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Text {

    private final StringBuilder savedText;

    public Text() {
        savedText = new StringBuilder();
    }

    public void leseTextAusDatei(String dateiName) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(dateiName));
        ) {
            String line = bufferedReader.readLine();
            while (line != null) {
                savedText.append(line);
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

    public String toString() {
        return savedText.toString();
    }
}
