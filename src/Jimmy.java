import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Jimmy {

    private static class Member {
        int value;
        boolean visited;

        public Member(String character) {
            switch (character) {
                case "V" -> value = 5;
                case "G" -> value = 1;
                case "S" -> value = -3;
            }
            this.visited = false;
        }

    }

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("jimmy.dat"));
        int count = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < count; i++) {
            scanner.nextLine();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            Member[][] array = new Member[x][y];
            for (int j = 0; j < y; j++) {
                String line = scanner.nextLine();
                Member[] array2 = new Member[x];
                for (int k = 0; k < line.length(); k++) {
                    String character = Character.toString(line.charAt(k));
                    if (character.equals("N")) continue;
                    array2[k] = new Member(character);
                }
                array[j] = array2;
            }
            for (int a = 0; a < x; a++) {
                for (int b = 0; b < y; b++) {
                    if (array[a][b] != null) {

                    }
                }
            }
        }
    }
}