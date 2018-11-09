package homeworks.translator_application;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/**
 * 1) Создать приложение переводчик.
 * Приложение должно позволять:
 * - добавлять новые слова.
 * - переводить предложение с одного из языков(Русский - Украинский, Украинский - Русский, Английский - Русский, Русский - Английский).
 * - после ввода определять язык, на котором ввел юзер DONE
 * - добавлять новые языки DONE
 * После остановки программы сохранять словари.
 * <p>
 * /*
 * Rus_Eng, Map<Привет : Hello>, <Как : How><Дела : "Are you?"> -> new String[]{}Привет как дела}
 * Eng_Rus, Map<Hello : Привет>
 */

public class Translator {

    public static final String TXT_EXTENSION = ".txt";
    private Map<String, Map<String, String>> map;

//    Map<String,String> mapL = new HashMap<>();

    public static final Path PATH = Paths.get("./ForTranslator");


    public static final String PATH_AND_FILE = "./ForTranslator/";


    public Translator() throws IOException {
        this.map = new HashMap<>();//rus_eng, "Привет", "Hello"
        fillMap();

    }

    private void fillMap() throws IOException {
        Files.newDirectoryStream(PATH).forEach(path -> {

            String name = path.toFile().getName();

            String fileName = name.substring(0, name.indexOf(TXT_EXTENSION));//add validate to equals fileName with enum's object

            String[] names = fileName.split("_"); //"rus"[0], "eng"[1]

            String refersName = names[1].concat("_").concat(names[0]);
            /*
             * rus_eng -> eng_rus
             * */
            HashMap<String, String> right = new HashMap<>();

            HashMap<String, String> refers = new HashMap<>();

            try {

                Files.readAllLines(path).stream().map(line ->
                        line
                                .replaceAll(" ", "")
                                .split(":"))
                        .forEach(words -> {//Hello:Привет

                            String word = words[0];
                            String word1 = words[1];

                            right.put(word, word1);

                            refers.put(word1, word);
                        });

            } catch (IOException e) {
                e.printStackTrace();
            }
            map.put(fileName.trim(), right);

            map.put(refersName.trim(), refers);

        });

        System.out.println();

    }

    public void findWordInVocabulary(String newWord) {

        String result = getTranslatedWord(newWord);

        System.out.println("Translate the word: " + newWord + " translation: " + result);
    }

    private String getTranslatedWord(String newWord) {
        String s = map.entrySet()
                .stream()
                .filter(e -> e
                        .getValue()
                        .containsKey(newWord))
                .findFirst()
                .get()
                .getValue()
                .get(newWord);

        return s;
    }


    public void findLanguage(String language) throws Exception {

        boolean result = map.keySet().stream().anyMatch(key -> key.equals(language));

        if (!result) {
            map.put(language, new HashMap<>());

        }

        System.out.println(map.entrySet()//anyMatch
                .stream()
                .filter(e -> e
                        .getValue()
                        .containsValue(language))
                .findFirst()
                .get()
                .getKey());

    }

    private void createNewFile(String language) {
        try {

            Path path = Paths.get(PATH_AND_FILE + language.concat(TXT_EXTENSION));

            Files.createFile(path);

            System.out.println("File has been created to" + path);

        } catch (IOException e) {

            e.printStackTrace();

            System.out.println(e.getMessage() + "\nFile has not been created");
        }
    }

    //добавлять новые языки
    public void addNewLanguage(String language) {

        boolean result = map.keySet().stream().anyMatch(key -> key.equals(language));

        if (result) {
            System.out.println("Such a language exists");

            return;
        }

        createNewFile(language);

        map.put(language, new HashMap<>());
    }


    public void writeUsingFiles() {

        map.forEach((key, value) -> {
            Path path = Paths.get(PATH_AND_FILE, key + TXT_EXTENSION);

            List<String> strings = value.entrySet()
                    .stream()
                    .map(entry -> entry.getKey().concat(" : ").concat(entry.getValue()))
                    .collect(Collectors.toList());

            try {
                Files.write(path, strings, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            } catch (IOException e) {
                e.printStackTrace();
            }

        });

    }

    public void addNewWordsToFile(String language, String from, String to) {

        addNewLanguage(language);

        map.get(language).put(from, to);

    }

    public void translationProffer(String sentence) {

        List<String> strings = Arrays.asList(sentence.split(" "));

        System.out.println();

        strings.forEach(s -> System.out.print(getTranslatedWord(s)));

    }
}

