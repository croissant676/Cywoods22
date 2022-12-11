import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ChikHen {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("chikhen.dat"));
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            boolean chicken = false;
            String[] roster = scanner.nextLine().split(" ");
            for (String string : roster) {
                if (string.equals("Cluck")) {
                    chicken = true;
                    break;
                }
            }
            if (chicken) {
                System.out.println("Chicken");
            } else {
                System.out.println("Lunch time");
            }
        }
    }
}
