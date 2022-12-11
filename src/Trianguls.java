import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Trianguls {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("trianguls.dat"));
        int c = sc.nextInt();
        String str = sc.nextLine();
        str = str.substring(1);
        str = str.replace(" ", "");
        for (int i = 1; i <= c; i++) {
            System.out.println(str.substring(((i - 1) * i) / 2, ((i + 1) * i) / 2));
        }
    }
}
