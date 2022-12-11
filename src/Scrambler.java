import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Scrambler {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("scrambler.dat"));
        while (sc.hasNextLine()) {
            doWord(sc.nextLine().trim());
        }
    }

    public static void doWord(String word) {
        List<String> solutions = recurse(word);
        Collections.sort(solutions);
        int maxIndex = 0;
        for (int index = 0; index < solutions.size(); index++) {
            if (Math.abs(solutions.get(index).compareTo(word)) > Math.abs(solutions.get(maxIndex).compareTo(word))) {
                maxIndex = index;
            }
        }
        System.out.println(word + " -> " + solutions.get(maxIndex));
    }

    public static List<String> recurse(String word) {
        if (word.length() < 2) {
            return Collections.singletonList(word);
        } else if (word.length() == 2) {
            String rev = "" + word.charAt(1) + word.charAt(0);
            return Arrays.asList(word, rev);
        }
        List<String> solutions = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            String without = word.substring(0, i) +
                    word.substring(Math.min(word.length(), i + 1));
            int finalI = i;
            solutions.addAll(recurse(without).stream().map(permutation -> word.charAt(finalI) + permutation).toList());
        }
        return solutions;
    }

}
