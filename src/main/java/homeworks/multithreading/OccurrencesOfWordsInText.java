package homeworks.multithreading;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by antoni on 11.11.2019.
 */
public class OccurrencesOfWordsInText extends Thread {

    public static final String FILE_PATH = "./Multithreading/";
    public static final String EXTENSION_TXT = ".txt";


    public static void countNumberOfWordsInFile() throws FileNotFoundException, InterruptedException {

        String nameOfFile = "Story";

        String typedWord = "winter";

        Path path = Paths.get(FILE_PATH, nameOfFile + EXTENSION_TXT);

        Scanner file = new Scanner(new File(String.valueOf(path))).useDelimiter("[^a-zA-Z]+");

        HashMap <String, Integer> map = new HashMap <>();

        while (file.hasNext()) {
            String word = file.next().toLowerCase();
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        ArrayList <Map.Entry <String, Integer>> entries = new ArrayList <>(map.entrySet());

        for (int i = 1; i < map.size(); i++) {
            if (entries.get(entries.size() - i - 1).getKey().equals(typedWord)) {
                String word = entries.get(entries.size() - i - 1).getKey() + " , найдено слов = " + entries.get(entries.size() - i - 1).getValue();
                String time = readingTimeCalculation();
                System.out.println("Работник " + Thread.currentThread().getName() + " искал слово '" + word + "' , затратил времени " + time);
            }
        }
    }

    public static String readingTimeCalculation() throws InterruptedException {

        long startTime = System.currentTimeMillis();

        long total = 0;
        for (int i = 0; i < 10000000; i++) {
            total += i;
        }

        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;

        return String.valueOf(elapsedTime);
    }


}
