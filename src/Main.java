/*
 Classname --- m2HarryPotter
 Version info 1
 Copyright --- Klymenko Sergij ONPU
*/

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        String text = new String(Files.readAllBytes(Paths.get("D:\\Docs\\Books\\HarryPotterSorcerer.txt")));

        String cleanedText = text
                .replaceAll("\\.", "")
                .replaceAll(",", "")
                .replaceAll(";", "")
                .replaceAll(":", "")
                .replaceAll("\\(", "")
                .replaceAll("\\)", "")
                .replaceAll("\"", "")
                .replaceAll("\\?", "")
                .replaceAll("\\!", "")
                .replaceAll("\\n", "")     // delete perenosy
                .replaceAll("\\d", "")   // delete numbers
                .toLowerCase();

        String[] woortz = cleanedText.split(" ");

        //String[] distinct = new String[woortz.length];

        String distinctString = " ";

        for (int i=0; i < woortz.length; i++) {
            if ( !distinctString.contains(woortz[i]) ) {
                distinctString += woortz[i] + " ";
            }
        }

        String[] distinctArray = distinctString.split(" ");

        Arrays.sort(distinctArray);

        for (int i=0; i < woortz.length; i++) {
            System.out.println(distinctArray[i]);
        }

        String hw="Hello World!";
        int hash = hw.hashCode();
        System.out.println(hash);
    }
}
