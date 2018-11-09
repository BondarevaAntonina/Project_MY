package homeworks.translator_application;

/**
 * 1) Создать приложение переводчик.
 * Приложение должно позволять:
 * - добавлять новые слова.
 * - переводить предложение с одного из языков(Русский - Украинский, Украинский - Русский, Английский - Русский, Русский - Английский).
 * - после ввода определять язык, на котором ввел юзер
 * - добавлять новые языки
 * После остановки программы сохранять словари.
 */
public class TranslatorTest {

    public static void main(String[] args) throws Exception {

        Translator translator = new Translator();

/*        // поиск слова
        translator.findWordInVocabulary("create");

        //после ввода определять язык, на котором ввел юзер
        translator.findLanguage("время ");*/

        //добавлять новые языки
        translator.addNewLanguage("DEU_RUS");

        translator.addNewWordsToFile("DEU_RUS","ab", "ты");

        translator.translationProffer("что ты делаешь");

        translator.writeUsingFiles();
    }
}
