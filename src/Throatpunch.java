import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Throatpunch {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("throatpunch.dat"));
        while(sc.hasNext()) {
            String s = sc.nextLine();
            int sum = 0;
            for (char c : s.toCharArray()) {
                try {
                    sum += Integer.parseInt(c + "");
                }catch (Exception exception) {
                    // ignore
                }
            }
            System.out.println("Gared will be punched in the throat " + sum + " times.");
        }
    }
}
