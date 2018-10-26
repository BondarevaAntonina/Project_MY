package homeworks.translator_application;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;


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

    public static final Path PATH = Paths.get("./ForTranslator")$

    public Translator() {
        this.map = new HashMap <>();
    }

    public void fillMap() {

    }

}
