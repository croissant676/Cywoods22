import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Jaireme {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("jaireme.dat"));
        int testCases = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < testCases; i++) {
            int lines = Integer.parseInt(scanner.nextLine());
            String keyword = scanner.nextLine();
            boolean isWord = false;
            for (int j = 1; j <= lines; j++) {
                String[] words = scanner.nextLine().split(" ");
                for (int c  = 1; c <= words.length; c++) {
                    String word = words[c - 1];
                    if (word.equals(keyword)) {
                        isWord = true;
                        System.out.println(j + " " + c);
                    }
                }
            }
            if (!isWord) {
                System.out.println("No word");
            }
        }
    }
}
