import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dryrun {
    // Team 28
    @SuppressWarnings("SpellCheckingInspection")
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("dryrun.dat"));
        int value = scanner.nextInt();
        System.out.println(value);
        System.out.println("Seven Lakes High School");
        System.out.println("Advanced");
        System.out.println("Aayush Ishware");
        System.out.println("Aidan Lai");
        System.out.println("Kason Gu");
    }
}