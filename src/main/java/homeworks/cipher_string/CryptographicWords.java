package homeworks.cipher_string;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by antoni on 21.12.2018.
 */
public class CryptographicWords {
    Map<String, List<Integer>> cipherCodes;

    public CryptographicWords() {
        this.cipherCodes = new HashMap<>();
        initChiperCodes();
    }

    private String encryptPhrase(String decryptPhrase) {
        StringBuilder result = new StringBuilder();

        /*Arrays.stream(splitPhrase(decryptPhrase)).forEach(l -> {
            cipherCodes.entrySet().stream().filter(entry -> entry.getKey().equals(l))
                    .forEach(f -> result.append(fillCipher(f.getValue())));

        });*/

        /*IntStream.range(0, decryptPhrase.length()).forEach(l -> {//0...5
            cipherCodes
                    .entrySet()
                    .stream()
                    .filter(entry -> entry.getKey().equals(String.valueOf(decryptPhrase.charAt(l))))
                    .forEach(f -> result.append(fillCipher(f.getValue())));

        });*/
        String text = decryptPhrase.toUpperCase();

        System.out.println("Result!==");

        IntStream.range(0, decryptPhrase.length()).forEach(l -> {//0...5
            cipherCodes
                    .entrySet()
                    .stream()
                    .filter(entry -> entry.getKey().equals(String.valueOf(text.charAt(l))))
                    .flatMap(f -> f.getValue().stream())
                    .forEach(System.out::print);

        });

        /*String text = decryptPhrase.toUpperCase();

        IntStream.range(0, text.length()).forEach(l -> {

            String key = String.valueOf(text.charAt(l));

            if (cipherCodes.containsKey(key)) {
                cipherCodes.get(key).forEach(System.out::print);
            }

        });*/

        return result.toString();
    }

    private String fillCipher(List<Integer> codes) {
        StringBuilder stringBuilder = new StringBuilder();

        for (Integer item : codes) {
            stringBuilder.append(item);
        }
        return stringBuilder.toString();
    }


    private String decryptPhrase(String ecryptPhrase) {
        StringBuilder result = new StringBuilder();

        String previousSymbol = "";

        Integer previousCode = 0;

        for (Integer code : splitDigits(ecryptPhrase)) {
            if (previousCode.equals(code)) {
                previousSymbol = "";
            }

            for (Map.Entry<String, List<Integer>> item : cipherCodes.entrySet()) {
                if (item.getValue().contains(code) && !previousSymbol.equalsIgnoreCase(item.getKey())) {
                    result.append(item.getKey());
                    previousSymbol = item.getKey();
                    previousCode = code;
                }
            }
/*            cipherCodes.entrySet().stream().filter(entry -> entry.getValue().contains(code) &&!previousSymbol.equalsIgnoreCase(entry.getKey())).
                    forEach(f -> result.append(f.getKey()), previousSymbol);*/

        }


        return result.toString();
    }

    private String decryptPhrase1(String ecryptPhrase) {
        StringBuilder result = new StringBuilder();

        String[] previousSymbol = {""};

        int[] previousCode = {0};

        for (int code : splitDigits(ecryptPhrase)) {
            if (previousCode[0] == code) {
                previousSymbol[0] = "";
            }

            cipherCodes.entrySet()
                    .stream()
                    .filter(entry -> entry.getValue().contains(code) && !previousSymbol[0].equalsIgnoreCase(entry.getKey())).
                    forEach(f -> {
                        String key = f.getKey();

                        result.append(key);

                        previousCode[0] = code;

                        previousSymbol[0] = key;
                    });

        }


        return result.toString();
    }

    private List<Integer> splitDigits(String encryption) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0, j = 0; i < encryption.length() / 3; i++, j += 3) {
            list.add(Integer.valueOf(encryption.substring(j, j + 3)));
        }

//        String[] strings = text.split("(?<=\\G.{3})");

        return list;
    }

    public void showEncryptedText(String userDecryptInput) {
        String encryptPhrase = encryptPhrase(userDecryptInput);

        System.out.println("User decrypt input: " + userDecryptInput + ", encryptPhrase: " + encryptPhrase);
    }

    public void showDecryptedText(String userEncryptInput) {
        String decryptPhrase = decryptPhrase(userEncryptInput);
        System.out.println("User encrypt input: " + userEncryptInput + ", decryptPhrase: " + decryptPhrase);
    }

    private void initChiperCodes() {
        cipherCodes.put("А", Arrays.asList(760, 128, 350, 201));
        cipherCodes.put("Б", Arrays.asList(101));
        cipherCodes.put("В", Arrays.asList(210, 106));
        cipherCodes.put("Г", Arrays.asList(351));
        cipherCodes.put("Д", Arrays.asList(129));
        cipherCodes.put("Е", Arrays.asList(761, 130, 802, 352));
        cipherCodes.put("Ж", Arrays.asList(102));
        cipherCodes.put("З", Arrays.asList(753));
        cipherCodes.put("И", Arrays.asList(762, 211, 131));
        cipherCodes.put("К", Arrays.asList(754, 764));
        cipherCodes.put("Л", Arrays.asList(132, 354));
        cipherCodes.put("M", Arrays.asList(755, 742));
        cipherCodes.put("Н", Arrays.asList(763, 756, 212));
        cipherCodes.put("О", Arrays.asList(757, 213, 765, 133, 353));//касса
        cipherCodes.put("П", Arrays.asList(743, 766));
        cipherCodes.put("Р", Arrays.asList(134, 532));
        cipherCodes.put("С", Arrays.asList(800, 767, 105));
        cipherCodes.put("Т", Arrays.asList(759, 135, 214));
        cipherCodes.put("У", Arrays.asList(544));
        cipherCodes.put("Ф", Arrays.asList(560));
        cipherCodes.put("Х", Arrays.asList(768));
        cipherCodes.put("Ц", Arrays.asList(545));
        cipherCodes.put("Ч", Arrays.asList(215));
        cipherCodes.put("Ш", Arrays.asList(103));
        cipherCodes.put("Щ", Arrays.asList(752));
        cipherCodes.put("Ъ", Arrays.asList(561));
        cipherCodes.put("Ы", Arrays.asList(136));
        cipherCodes.put("Ь", Arrays.asList(562));
        cipherCodes.put("Э", Arrays.asList(750));
        cipherCodes.put("Ю", Arrays.asList(570));
        cipherCodes.put("Я", Arrays.asList(216, 104));
        cipherCodes.put(" ", Arrays.asList(751, 769, 758, 801, 849));
    }
}
