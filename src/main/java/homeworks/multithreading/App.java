package homeworks.multithreading;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by antoni on 11.11.2019.
 */
public class App {
    public static void main(String[] args) {
        String word = "my";
        System.out.println("Word '" + word + "' has number " + countNumberOfWordsInFile(word, "I spent my winter holidays at home with my family"));
    }

    private static int countNumberOfWordsInFile(String word, String fileContent) {
        Matcher matcher = Pattern.compile(word).matcher(fileContent);
        int resultCount = 0;
        while (matcher.find()) {
            resultCount++;
        }
        return resultCount;
    }
}
