import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

public class Tabuls {

    public static void main(String[] args) throws FileNotFoundException {
        Map<String, Map<String, Integer>> map = new TreeMap<>();
        Scanner sc = new Scanner(new File("tabuls.dat"));
        while (sc.hasNext()) {
            String[] line = sc.nextLine().split(" ");
            String p = line[0];
            String q = Arrays.stream(line[1].replace("-", " ").replace("_", " ").toLowerCase().split(" ")).map(x -> x.substring(0, 1).toUpperCase() + x.substring(1)).collect(Collectors.joining(" "));
            if (map.containsKey(p)) {
                if (map.get(p).containsKey(q))
                    map.get(p).put(q, map.get(p).get(q) + 1);
                else
                    map.get(p).put(q, 1);
            } else {
                Map<String, Integer> temp = new TreeMap<>();
                temp.put(q, 1);
                map.put(p, temp);
            }
        }
        List<String> list = map.keySet().stream().toList();
        for (int i  = 0; i <map.keySet().size(); i++) {
            String s = list.get(i);
            System.out.println(s + " has ordered:");
            for (String t : map.get(s).keySet()) {
                System.out.println("\tx" + map.get(s).get(t) + " " + t);
            }
            if (i < list.size() - 1)
                System.out.println();
        }
    }

    public static void capitalize(String s){

    }

}
