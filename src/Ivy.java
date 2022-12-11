import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ivy {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("ivy.dat"));
        List<String1> ivy = new ArrayList<>();
        List<String1> notIvy = new ArrayList<>();
        List<String> ivies = Arrays.asList("penn.edu", "yale.edu", "harvard.edu", "columbia.edu", "dartmouth.edu", "cornell.edu", "brown.edu", "princeton.edu");
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (!line.contains("@")) {
                notIvy.add(new String1(line));
                continue;
            }
            if (ivies.contains(line.split("@")[1])){
                ivy.add(new String1(line));
            } else {
                notIvy.add(new String1(line));
            }
        }
        ivy.stream().sorted().forEach(System.out::println);
        notIvy.stream().sorted().forEach(System.out::println);
    }


}

class String1 implements Comparable{

    public static String order = "portwefiylskdgmnjbvcxzaqhu";
    public String word;

    public String1(String s){
        word = s;
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof String1)) {
            return 0;
        }
        String1 o1 = (String1) o;
        int val = order.indexOf(word.substring(0, 1)) - order.indexOf(o1.word.substring(0, 1));
        if (val == 0) {
            return new String1(word.substring(1)).compareTo(new String1(o1.word.substring(1)));
        } else {
            return val;
        }
    }

    @Override
    public String toString() {
        return word;
    }
}
