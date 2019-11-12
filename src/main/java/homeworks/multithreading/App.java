package homeworks.multithreading;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by antoni on 11.11.2019.
 */
public class App {
    public static final String FILE_PATH = "./Multithreading/";
    public static final String EXTENSION_TXT = ".txt";

    public static void main(String[] args) throws FileNotFoundException {
        String word = "my";
        System.out.println("Word '" + word + "' has number " + countNumberOfWordsInFile(word, "I spent my winter holidays at home with my family"));
    }

    private static int countNumberOfWordsInFile(String word, String fileContent) throws FileNotFoundException {
        String nameOfFile = "Story";

        Path path = Paths.get(FILE_PATH,nameOfFile + EXTENSION_TXT);

        Scanner file = new Scanner(new File(String.valueOf(path))).useDelimiter("[^a-zA-Z]+");

        String text = file.nextLine();

        Matcher matcher = Pattern.compile(word).matcher(text);
        int resultCount = 0;
        while (matcher.find()) {
            resultCount++;
        }
        return resultCount;
    }
}
