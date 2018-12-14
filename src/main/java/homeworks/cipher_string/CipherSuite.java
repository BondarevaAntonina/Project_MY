package homeworks.cipher_string;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by antoni on 11.12.2018.
 */
public class CipherSuite {

    Map<String, String> hm = new HashMap<String, String>();

    public CipherSuite() {
        this.hm = new HashMap <>();
        fillCipher();
    }

    public void fillCipher() {

        hm.put("А", "760");
        hm.put("А", "128");
        hm.put("А", "350");
        hm.put("А", "201");
        hm.put("Б", "101");
        hm.put("В", "210");
        hm.put("В", "106");
        hm.put("Г", "351");
        hm.put("Д", "129");
        hm.put("Е", "761");
        hm.put("Е", "130");
        hm.put("Е", "802");
        hm.put("Е", "352");
        hm.put("Ж", "102");
        hm.put("З", "753");
        hm.put("И", "762");
        hm.put("И", "211");
        hm.put("И", "131");
        hm.put("К", "754");
        hm.put("К", "764");
        hm.put("Л", "132");
        hm.put("Л", "354");
        hm.put("M", "755");
        hm.put("M", "742");
        hm.put("Н", "763");
        hm.put("Н", "756");
        hm.put("Н", "212");
        hm.put("О", "757");
        hm.put("О", "213");
        hm.put("О", "765");
        hm.put("О", "133");
        hm.put("О", "353");
        hm.put("П", "743");
        hm.put("П", "766");
        hm.put("Р", "134");
        hm.put("Р", "532");
        hm.put("С", "800");
        hm.put("С", "767");
        hm.put("С", "105");
        hm.put("Т", "759");
        hm.put("Т", "135");
        hm.put("Т", "214");
        hm.put("У", "544");
        hm.put("Ф", "560");
        hm.put("Х", "768");
        hm.put("Ц", "545");
        hm.put("Ч", "215");
        hm.put("Ш", "103");
        hm.put("Щ", "752");
        hm.put("Ъ", "561");
        hm.put("Ы", "136");
        hm.put("Ь", "562");
        hm.put("Э", "750");
        hm.put("Ю", "570");
        hm.put("Я", "216");
        hm.put("Я", "104");
        hm.put(" ", "751");
        hm.put("", "769");
        hm.put("", "758");
        hm.put("", "801");
        hm.put("", "849");
        for (String key : hm.keySet()) {

        }

    }

}
