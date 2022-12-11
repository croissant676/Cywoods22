import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Beerds {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("beerds.dat"));
        List<String> arr = new ArrayList<>();
        while(sc.hasNext()){
            arr.add(sc.nextLine());
        }
        arr.stream().sorted(Comparator.comparingInt(x -> Integer.parseInt(x.split(" ")[1]))).forEach(System.out::println);
    }
}
