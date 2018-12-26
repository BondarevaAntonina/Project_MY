package homeworks.cipher_string;

/**
 * Created by antoni on 20.12.2018.
 */
public class Ecrypt {

    public static void main(String[] args) {

        CryptographicWords cryptographicWords = new CryptographicWords();

        cryptographicWords.showEncryptedText("каССа");

        cryptographicWords.showDecryptedText("754764760128350201800767105800767105760128350201");

    }
}
