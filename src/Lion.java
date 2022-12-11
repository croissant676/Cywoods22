import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.Scanner;

public class Lion {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("lion.dat"));
        int count = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < count; i++) {
            int[] firstDateValues = {
                    scanner.nextInt(),
                    scanner.nextInt(),
                    scanner.nextInt()
            };
            LocalDate firstDate = LocalDate.of(firstDateValues[0], firstDateValues[1], firstDateValues[2]);
            int[] secondDateValues = {
                    scanner.nextInt(),
                    scanner.nextInt(),
                    scanner.nextInt()
            };
            LocalDate secondDate = LocalDate.of(secondDateValues[0], secondDateValues[1], secondDateValues[2]);
            System.out.printf("%,d", secondDate.toEpochDay() - firstDate.toEpochDay());
            System.out.println();
        }
    }
}
