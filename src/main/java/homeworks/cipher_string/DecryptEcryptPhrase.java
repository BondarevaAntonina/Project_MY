package homeworks.cipher_string;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by antoni on 18.12.2018.
 */
public class DecryptEcryptPhrase {
    private static Map<String, String> chiperCodes = new HashMap<>();

    public static void main(String[] args) {
        initChiperCodes();

//        String userEncryptInput = "104801768765215544849102762759562";
        String userEncryptInput = "104801768765215544849102762759562";
        String decryptPhrase= decryptPhrase(userEncryptInput);
        System.out.println("User encrypt input: " + userEncryptInput + ", decryptPhrase: " + decryptPhrase);

        String userDecryptInput = "СУПЕР";
        String encryptPhrase= encryptPhrase(userDecryptInput);
        System.out.println("User decrypt input: " + userDecryptInput + ", encryptPhrase: " + encryptPhrase);
    }

    private static String encryptPhrase(String decryptPhrase) {
        StringBuilder result = new StringBuilder();
        for (String code : splitPhrase(decryptPhrase)) {
            for(Map.Entry<String, String> item : chiperCodes.entrySet()) {
                if (item.getKey().equals(code)) {
                    result.append(getRandonCodePart(item.getValue()));
                }
            }
        }
        return result.toString();
    }

    private static String getRandonCodePart(String code) {
        if (code.length() == 3) {
            return code;
        }
        int randomNum = ThreadLocalRandom.current().nextInt(1, code.length() / 3);
        return code.split(",")[randomNum];
    }

    private static String decryptPhrase(String ecryptPhrase) {
        StringBuilder result = new StringBuilder();
        for (String code : splitDigits(ecryptPhrase)) {
            for(Map.Entry<String, String> item : chiperCodes.entrySet()) {
                if (item.getValue().contains(code)) {
                    result.append(item.getKey());
                }
            }
        }
        return result.toString();
    }

    private static String[] splitDigits(String str) {
        String[] arr = new String[str.length() / 3];
        int j = 0;
        for(int i = 0; i < str.length() / 3; i++) {
            arr[i] = str.substring(j, j + 3);
            j += 3;
        }
        return arr;
    }

    private static String[] splitPhrase(String str) {
        String[] arr = new String[str.length()];
        for(int i = 0; i < str.length(); i++) {
            arr[i] = str.substring(i, i + 1);
        }
        return arr;
    }

    private static void initChiperCodes() {
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
    }
}
