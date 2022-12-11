import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Hashbroun {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("hashbroun.dat"));
        int count = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < count; i++) {
            System.out.println("F".repeat(scanner.nextInt()));
            scanner.nextLine();
        }
    }
}
