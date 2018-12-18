package homeworks.cipher_string;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by antoni on 18.12.2018.
 */
public class Decoder {

    public static void main(String[] args) {
        Map<String, String> chiperCodes = new HashMap<>();
        chiperCodes.put("А", "760,128,350,201");
        chiperCodes.put("Б", "101");
        chiperCodes.put("В", "210,106");
        chiperCodes.put("Г", "351");
        chiperCodes.put("Д", "129");
        chiperCodes.put("Е", "761,130,802,352");
        chiperCodes.put("Ж", "102");
        chiperCodes.put("З", "753");
        chiperCodes.put("И", "762,211,131");
        chiperCodes.put("К", "754,764");
        chiperCodes.put("Л", "132,354");
        chiperCodes.put("M", "755,742");
        chiperCodes.put("Н", "763,756,212");
        chiperCodes.put("О", "757,213,765,133,353");
        chiperCodes.put("П", "743,766");
        chiperCodes.put("Р", "134,532");
        chiperCodes.put("С", "800,767,105");
        chiperCodes.put("Т", "759,135,214");
        chiperCodes.put("У", "544");
        chiperCodes.put("Ф", "560");
        chiperCodes.put("Х", "768");
        chiperCodes.put("Ц", "545");
        chiperCodes.put("Ч", "215");
        chiperCodes.put("Ш", "103");
        chiperCodes.put("Щ", "752");
        chiperCodes.put("Ъ", "561");
        chiperCodes.put("Ы", "136");
        chiperCodes.put("Ь", "562");
        chiperCodes.put("Э", "750");
        chiperCodes.put("Ю", "570");
        chiperCodes.put("Я", "216,104");
        chiperCodes.put(" ", "751,769,758,801,849");

        String userInput = "104,801,768,765,215,544,849,102,762,759,562";

        StringBuilder result = new StringBuilder();

/*        for (String code : userInput.split(",")) {
        chiperCodes.entrySet().stream().filter(key -> key.getValue().contains(code)).forEach( t -> t.getKey());

        }*/

        for (String code : userInput.split(",")) {
            for(Map.Entry<String, String> item : chiperCodes.entrySet()) {
                if (item.getValue().contains(code)) {
                    result.append(item.getKey());
                }
            }
        }
        System.out.println(result);
    }
}
