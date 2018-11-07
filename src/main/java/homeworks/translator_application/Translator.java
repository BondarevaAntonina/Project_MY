package homeworks.translator_application;

import java.io.File;
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
 * - после ввода определять язык, на котором ввел юзер
 * - добавлять новые языки
 * После остановки программы сохранять словари.
 * <p>
 * /*
 * Rus_Eng, Map<Привет : Hello>, <Как : How><Дела : "Are you?"> -> new String[]{}Привет как дела}
 * Eng_Rus, Map<Hello : Привет>
 */

public class Translator {

    private Map<String, Map<String, String>> map;

//    Map<String,String> mapL = new HashMap<>();

    public static final Path PATH = Paths.get("./ForTranslator");

    public static final Path PATH_RUS_ENG = Paths.get("./ForTranslator/RUS_ENG");

    public Translator() throws IOException {
        this.map = new HashMap<>();//rus_eng, "Привет", "Hello"
        fillMap();

    }


    private HashMap fillMapByLang(String langName) {
        HashMap<String, String> tmp = new HashMap<>();
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
            HashMap<String, String> right = new HashMap<>();

            HashMap<String, String> refers = new HashMap<>();

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

//            map.put(LanguagesTrans.valueOf(fileName.trim()), right);

//            map.put(LanguagesTrans.valueOf(refersName.trim()), refers);
        });

        System.out.println();

    }


}
