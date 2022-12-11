import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class joenathan {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("joenathan.dat"));
        while (scanner.hasNext()) {
            doLine(scanner.nextLine()
                    .toUpperCase(Locale.ROOT)
                    .replace("\n", "")
                    .replace("\r", "")
                    .replace("RED", "BROWN")
                    .replace("GREEN", "BROWN")
                    .replace("PURPLE", "BLUE")
                    .replace("ORANGE", "YELLOW")
                    .trim());
        }
    }

    public static void doLine(String line) {
        if (line.isEmpty()) {
            System.out.println();
            return;
        }
        Map<String, Integer> histogram = new TreeMap<>();
        for (String string : line.split(" ")) {
            if (histogram.containsKey(string)) {
                histogram.put(string, histogram.get(string) + 1);
            } else {
                histogram.put(string, 1);
            }
        }
        boolean first = true;
        for (Map.Entry<String, Integer> stringIntegerEntry : histogram.entrySet()) {
            if (!first) {
                System.out.print(" ");
            }
            System.out.print(stringIntegerEntry.getKey() + ": " + stringIntegerEntry.getValue());
            first = false;
        }
        System.out.println();
    }
}
