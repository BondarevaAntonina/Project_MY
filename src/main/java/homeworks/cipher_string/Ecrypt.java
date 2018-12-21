package homeworks.cipher_string;

/**
 * Created by antoni on 20.12.2018.
 */
public class Ecrypt {

    public static void main(String[] args) {

        CryptographicWords cryptographicWords = new CryptographicWords();

        cryptographicWords.showEncryptedText("ЖИТЬ");

        cryptographicWords.showDecryptedText("102762211131759135214562");

    }
}
