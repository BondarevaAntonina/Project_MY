package homeworks.translator_application;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/**
 1) Создать приложение переводчик.
 Приложение должно позволять:
 - добавлять новые слова.
 - переводить предложение с одного из языков(Русский - Украинский, Украинский - Русский, Английский - Русский, Русский - Английский).
 - после ввода определять язык, на котором ввел юзер
 - добавлять новые языки
 После остановки программы сохранять словари.

 /*
 * Rus_Eng, Map<Привет : Hello>
 * Eng_Rus, Map<Hello : Привет>
 *
 * */

public class Translator {

    private Map<Languages, Map<String, String>> map;

    public static final Path PATH = Paths.get("./ForTranslator");

    public Translator() throws IOException {
        this.map = new HashMap <>();

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

                Files.readAllLines(path)
                        .stream()
                        .map(line -> line.split(":"))
                        .forEach(words -> {//Hello:Привет

                    right.put(words[0], words[1]);

                    refers.put(words[1], words[0]);
                });

            } catch (IOException e) {
                e.printStackTrace();
            }

            map.put(Languages.valueOf(fileName), right);

            map.put(Languages.valueOf(refersName), refers);
        });
    }

}
