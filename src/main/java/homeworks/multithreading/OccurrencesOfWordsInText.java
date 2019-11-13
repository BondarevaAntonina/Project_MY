package homeworks.multithreading;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/**
 * Created by antoni on 11.11.2019.
 */
public class OccurrencesOfWordsInText extends Thread {

    public static final String FILE_PATH = "./Multithreading/";
    public static final String EXTENSION_TXT = ".txt";


    public static void countNumberOfWordsInFile() throws FileNotFoundException, InterruptedException {
        long startTime = System.currentTimeMillis();

        String nameOfFile = "Story";//move to const

        String typedWord = "winter";

        Path path = Paths.get(FILE_PATH, nameOfFile + EXTENSION_TXT);

        Scanner file = new Scanner(new File(String.valueOf(path))).useDelimiter("[^a-zA-Z]+");//Files

//        Files.readAllLines(path)

        HashMap<String, Integer> map = new HashMap<>();

        while (file.hasNext()) {
            String word = file.next().toLowerCase();
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        Integer integer = map.get(typedWord);

//        map.forEach((key, value) -> System.out.println());

        long stopTime = System.currentTimeMillis();
        System.out.println("Worker " + Thread.currentThread().getName() + " looking for a word \'winter\'"  + (stopTime - startTime));
    }

    public static void main(String[] args) throws IOException {

        String nameOfFile = "Story";//move to const

        String typedWord = "winter";

        Path path = Paths.get(FILE_PATH, nameOfFile + EXTENSION_TXT);

        String[] strings = new String(Files.readAllBytes(path)).split(" ");

        Arrays.stream(strings).filter(s -> s.equals(typedWord)).count();
    }

}
