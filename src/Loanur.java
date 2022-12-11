import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Loanur {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("loanur.dat"));
        int x = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < x; i++) {
            String[] friends = scanner.nextLine().split(" ");
            long friend = 0;
            long enemy = 0;
            for (int j = 1; j < friends.length; j += 2) {
                friend += Long.parseLong(friends[j]);
            }
            String[] enemies = scanner.nextLine().split(" ");
            for (int j = 1; j < enemies.length; j += 2) {
                enemy += Long.parseLong(enemies[j]);
            }
            if (enemy > friend) {
                System.out.println("Sigh... I guess I'm not that cool.");
            } else if (enemy < friend){
                System.out.println("Ha! I'm cooler than you loser!");
            } else {
                System.out.println("Neither of us even have room to talk.");
            }
        }
    }
}
