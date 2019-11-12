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
        countNumberOfWordsInFile();
    }



    public static void countNumberOfWordsInFile() throws FileNotFoundException {

        String nameOfFile = "Story";

        String typedWord = "winter";

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

        for(int i = 1; i < map.size(); i++){
            if (entries.get(entries.size() - i - 1).getKey().equals(typedWord)) {
                String word = entries.get(entries.size() - i - 1).getKey()+ " has number = " +entries.get(entries.size() - i - 1).getValue();
                System.out.println("Word  '" + word  + "' " );
            }
        }
    }




}
