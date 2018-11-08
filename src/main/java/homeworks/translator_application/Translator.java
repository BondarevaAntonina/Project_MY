package homeworks.translator_application;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;


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

    private Map <String, Map <String, String>> map;

//    Map<String,String> mapL = new HashMap<>();

    public static final Path PATH = Paths.get("./ForTranslator");


    public static final String PATH_AND_FILE = "./ForTranslator/";


    public Translator() throws IOException {
        this.map = new HashMap <>();//rus_eng, "Привет", "Hello"
        fillMap();

    }


    private HashMap fillMapByLang(String langName) {
        HashMap <String, String> tmp = new HashMap <>();
        //взять фалик  langName
        //1 прямо поиск
        //2 перевернуты поиск
        //считать данные
        //записать данные в мапу

        return tmp;
    }

    private void fillMap() throws IOException {
        Files.newDirectoryStream(PATH).forEach(path -> {

            String fileName = path.toFile().getName();//add validate to equals fileName with enum's object

            String[] names = fileName.split("_"); //"rus"[0], "eng"[1]

            String refersName = names[1].concat("_").concat(names[0]);
            /*
             * rus_eng -> eng_rus
             * */
            HashMap <String, String> right = new HashMap <>();

            HashMap <String, String> refers = new HashMap <>();

            try {

                Files.readAllLines(path).stream().map(line -> line.trim().split(":")).forEach(words -> {//Hello:Привет

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

        String result = map.entrySet()
                .stream()
                .filter(e -> e
                        .getValue()
                        .containsKey(newWord))
                .findFirst()
                .get()
                .getValue()
                .get(newWord);

        System.out.println("Translate the word: " + newWord + " translation: " + result);
    }

    public void findLanguage(String language) throws Exception {

        boolean result = map.keySet().stream().anyMatch(key -> key.equals(language));

        if (!result) {
            map.put(language, new HashMap <>());
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

    public void createNewFile(String language) throws Exception {
        try {

            Path path = Paths.get(PATH_AND_FILE + language);
            Files.createFile(path);

            System.out.println("File has been created to" + path);

        } catch (IOException e) {

            e.printStackTrace();

            System.out.println(e.getMessage() + "\nFile has not been created");
        }
    }

    //добавлять новые языки
    public void addNewLanguage(String language) throws Exception {

        boolean result = map.keySet().stream().anyMatch(key -> key.equals(language));

        if (!result) {
            createNewFile(language);
            map.put(language, new HashMap<>());
        } else {
            System.out.println("Such a language exists");
            map.entrySet().
                    forEach(e -> {
                        System.out.println(e.getKey());
                    });
        }
    }

    private static void writeUsingFiles(String data, String language) {
        try {
            Files.write(Paths.get(PATH_AND_FILE + language), data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void addNewWordsToFile() {

        String data = "понимать : verstehen";
        String language = "DEU_RUS";
        writeUsingFiles(data, language);

/*        map.entrySet().
                forEach(e -> {
                    System.out.println(e.getKey());
                });*/

        map.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + entry.getValue());
        });

    }
}
