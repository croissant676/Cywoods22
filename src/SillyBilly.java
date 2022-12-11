import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class SillyBilly {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("sillybilly.dat"));
        int count = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < count; i++) {
            String opp = scanner.nextLine().split("vs. ")[1];
            if (scanner.nextLine().toUpperCase(Locale.ROOT).endsWith("LLY")) {
                System.out.println("SILLY BILLY WINS");
            } else {
                System.out.println(opp + " WINS");
            }
        }
    }
}
