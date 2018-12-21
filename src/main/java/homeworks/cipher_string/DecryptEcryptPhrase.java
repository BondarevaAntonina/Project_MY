package homeworks.cipher_string;

/**
 * Created by antoni on 18.12.2018.
 */

public class DecryptEcryptPhrase {
    //    private static Map<String, String> chiperCodes = new HashMap<>();
/*    private static Map <String, List <Integer>> chiperCodes = new HashMap <>();


    public static void main(String[] args) {
        initChiperCodes();

//        String userEncryptInput = "104801768765215544849102762759562";
        String userEncryptInput = "104801768765215544849102762759562";
        String decryptPhrase = decryptPhrase(userEncryptInput);
        System.out.println("User encrypt input: " + userEncryptInput + ", decryptPhrase: " + decryptPhrase);

        String userDecryptInput = "СУПЕР";
        String encryptPhrase = encryptPhrase(userDecryptInput);
        System.out.println("User decrypt input: " + userDecryptInput + ", encryptPhrase: " + encryptPhrase);
    }

    private static String encryptPhrase(String decryptPhrase) {
        StringBuilder result = new StringBuilder();
        for (String code : splitPhrase(decryptPhrase)) {
            for (Map.Entry <String, List <Integer>> item : chiperCodes.entrySet()) {
                if (item.getKey().equals(code)) {
//                    result.append(getRandonCodePart(item.getValue()));
                }
            }
        }


        Arrays.stream(splitPhrase(decryptPhrase)).forEach(l -> {
            chiperCodes.entrySet().stream().filter(entry -> entry.getKey().equals(l)).forEach(f -> result.append(f.getValue()));
        });


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
            for (Map.Entry <String, List <Integer>> item : chiperCodes.entrySet()) {
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
        for (int i = 0; i < str.length() / 3; i++) {
            arr[i] = str.substring(j, j + 3);
            j += 3;
        }
        return arr;
    }

    private static String[] splitPhrase(String str) {
        String[] arr = new String[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.substring(i, i + 1);
        }
        return arr;
    }

    private static void initChiperCodes() {//800767105544743766
        chiperCodes.put("А", Arrays.asList(760, 128, 350, 201));
        chiperCodes.put("Б", Arrays.asList(101));
        chiperCodes.put("В", Arrays.asList(210, 106));
        chiperCodes.put("Г", Arrays.asList(351));
        chiperCodes.put("Д", Arrays.asList(129));
        chiperCodes.put("Е", Arrays.asList(761, 130, 802, 352));
        chiperCodes.put("Ж", Arrays.asList(102));
        chiperCodes.put("З", Arrays.asList(753));
        chiperCodes.put("И", Arrays.asList(762, 211, 131));
        chiperCodes.put("К", Arrays.asList(754, 764));
        chiperCodes.put("Л", Arrays.asList(132, 354));
        chiperCodes.put("M", Arrays.asList(755, 742));
        chiperCodes.put("Н", Arrays.asList(763, 756, 212));
        chiperCodes.put("О", Arrays.asList(757, 213, 765, 133, 353));//касса
        chiperCodes.put("П", Arrays.asList(743, 766));
        chiperCodes.put("Р", Arrays.asList(134, 532));
        chiperCodes.put("С", Arrays.asList(800, 767, 105));
        chiperCodes.put("Т", Arrays.asList(759, 135, 214));
        chiperCodes.put("У", Arrays.asList(544));
        chiperCodes.put("Ф", Arrays.asList(560));
        chiperCodes.put("Х", Arrays.asList(768));
        chiperCodes.put("Ц", Arrays.asList(545));
        chiperCodes.put("Ч", Arrays.asList(215));
        chiperCodes.put("Ш", Arrays.asList(103));
        chiperCodes.put("Щ", Arrays.asList(752));
        chiperCodes.put("Ъ", Arrays.asList(561));
        chiperCodes.put("Ы", Arrays.asList(136));
        chiperCodes.put("Ь", Arrays.asList(562));
        chiperCodes.put("Э", Arrays.asList(750));
        chiperCodes.put("Ю", Arrays.asList(570));
        chiperCodes.put("Я", Arrays.asList(216, 104));
        chiperCodes.put(" ", Arrays.asList(751, 769, 758, 801, 849));
    }*/
}

