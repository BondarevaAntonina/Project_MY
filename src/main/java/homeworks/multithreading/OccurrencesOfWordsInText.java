package homeworks.multithreading;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/**
 * Created by antoni on 11.11.2019.
 */
public class OccurrencesOfWordsInText {

    public static final String FILE_PATH = "./Multithreading/";
    public static final String EXTENSION_TXT = ".txt";
    public static void main(String[] args) throws FileNotFoundException {

        String nameOfFile = "Story";

        Path path = Paths.get(FILE_PATH,nameOfFile + EXTENSION_TXT);

        Scanner file = new Scanner(new File(String.valueOf(path))).useDelimiter("[^a-zA-Z]+");

        HashMap<String, Integer> map = new HashMap<>();

        while (file.hasNext()){
            String word = file.next().toLowerCase();
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        ArrayList<Map.Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<String, Integer>>() {

            @Override
            public int compare(Map.Entry<String, Integer> a, Map.Entry<String, Integer> b) {
                return a.getValue().compareTo(b.getValue());
            }
        });

        for(int i = 1; i < map.size(); i++){
            if (entries.get(entries.size() - i - 1).getKey().contains("winter")) {
                String word = entries.get(entries.size() - i - 1).getKey()+ " " +entries.get(entries.size() - i - 1).getValue();
            System.out.println(word);

            }
        }
    }
}
