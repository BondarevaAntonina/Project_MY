package homeworks.translator_application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 1) Создать приложение переводчик.
 Приложение должно позволять:
 - добавлять новые слова.
 - переводить предложение с одного из языков(Русский - Украинский, Украинский - Русский, Английский - Русский, Русский - Английский).
 - после ввода определять язык, на котором ввел юзер
 - добавлять новые языки
 После остановки программы сохранять словари.

 */
public class TranslatorTest {

    public static void main(String[] args) throws Exception {

    Translator translator = new Translator();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any word or phrase: ");

        String phrase = sc.nextLine();

        translator.languageDetection(phrase);

//        translator.writeTextToFile("закрыть");

    }
}
