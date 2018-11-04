package homeworks.translator_application;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;


/**
 * 1) Создать приложение переводчик.
 * Приложение должно позволять:
 * - добавлять новые слова.
 * - переводить предложение с одного из языков(Русский - Украинский, Украинский - Русский, Английский - Русский, Русский - Английский).
 * - после ввода определять язык, на котором ввел юзер
 * - добавлять новые языки
 * После остановки программы сохранять словари.
 * <p>
 * /*
 * Rus_Eng, Map<Привет : Hello>, <Как : How><Дела : "Are you?"> -> new String[]{}Привет как дела}
 * Eng_Rus, Map<Hello : Привет>
 */

public class Translator {

    private Map<LanguagesTrans, Map<String, String>> map;

    public static final Path PATH = Paths.get("./ForTranslator");

    public static final Path PATH_RUS_ENG = Paths.get("./ForTranslator/RUS_ENG");

    public Translator() throws IOException {
        this.map = new HashMap<>();//rus_eng, "Привет", "Hello"

        fillMap();
    }

    private void fillMap() throws IOException {
        Files.newDirectoryStream(PATH).forEach(path -> {

            String fileName = path.toFile().getName();//add validate to equals fileName with enum's object

            String[] names = fileName.split("_"); //"rus"[0], "eng"[1]

            String refersName = names[1].concat("_").concat(names[0]);
            /*
             * rus_eng -> eng_rus
             * */
            HashMap<String, String> right = new HashMap<>();

            HashMap<String, String> refers = new HashMap<>();

            try {

                Files.readAllLines(path).stream().map(line -> line.trim().split(":"))
                        .forEach(words -> {//Hello:Привет

                            String word = words[0];
                            String word1 = words[1];

                            right.put(word, word1);

                            refers.put(word1, word);
                        });

            } catch (IOException e) {
                e.printStackTrace();
            }

            map.put(LanguagesTrans.valueOf(fileName.trim()), right);

            map.put(LanguagesTrans.valueOf(refersName.trim()), refers);
        });

        System.out.println();

//        map.forEach((key, value) -> );
//        map.entrySet().forEach(entry -> entry.get);
    }

    public void writeTextToFile(String text) {//Files

        try (FileOutputStream fos = new FileOutputStream(String.valueOf(PATH_RUS_ENG))) {
            byte[] buffer = text.getBytes();

            fos.write(buffer, 0, buffer.length);
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        System.out.println("The file has been written");
    }

    public void addDictionary(LanguagesTrans lang) {

        map.put(lang, new HashMap<>());//IT_ENG, <>

    }


    public void languageDetection(String text) throws IOException {


    }

    public void findWordInVocabulary(String newWord) {

        String result = map
                .entrySet()
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

    public void findLanguage(String ln) throws Exception {
    /*    LanguagesTrans lang = map.entrySet().stream()
                .filter(k -> k.getValue().containsValue(ln)).findFirst().get().getKey();*/


        LanguagesTrans language = LanguagesTrans.valueOf(ln);

        boolean result = map.keySet().stream().anyMatch(key -> key == language);

        if (!result) {
            map.put(language, new HashMap<>());
        }

        System.out.println(map.entrySet()//anyMatch
                .stream()
                .filter(e -> e.getValue().containsValue(ln))
                .findFirst().get().getKey());

/*
            LanguagesTrans lang = map.keySet().stream().filter(t -> t.equals(ln)).findFirst().get();

            if (lang == null) {
                throw new Exception("User " + ln + " not found");
            }
            return lang;
*/
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Translator that = (Translator) o;

        return map.equals(that.map);
    }

    @Override
    public int hashCode() {
        return map.hashCode();
    }
}
