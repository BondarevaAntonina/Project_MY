package homeworks.translator_application;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
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
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("java", "джава");
        dictionary.put("drive", "управляет");
        dictionary.put("whole", "цэлый");
        dictionary.put("world", "мир");

        System.out.println("Input your line: ");
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String s = buf.readLine();

        String[] s2 = s.split(" ");
        for (String arr : s2) {

            Set<Map.Entry<String, String>> ent = dictionary.entrySet();
            for (Map.Entry<String, String> mapEnt : ent) {
                String s1 = mapEnt.getKey();
                if (s1.equals(arr)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(mapEnt.getValue()).append(" ");
                    System.out.print(sb.toString());

                }
            }
        }
    }
}
