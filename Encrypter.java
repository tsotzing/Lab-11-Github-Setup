import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;

public class Encrypter {

    public String encrypt(File cipherText, int shiftKey) throws FileNotFoundException {
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        Reader text = new Reader();
        String cipher = text.read(cipherText);
        cipher = cipher.toLowerCase();
        String message = "";
        for (int i = 0; i < cipher.length(); i++) {
            int pos = alpha.indexOf(cipher.charAt(i));
            int val = (shiftKey + pos) % 26;
            char rep = alpha.charAt(val);
            message += rep;
        }
        return message;
    }


    public String decrypt(File cipherText, int shiftKey) throws FileNotFoundException {
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        Reader text = new Reader();
        String cipher = text.read(cipherText);
        cipher = cipher.toLowerCase() ;
        String message = "";
        for (int i = 0; i < cipher.length(); i++) {
            int pos = alpha.indexOf(cipher.charAt(i));
            int val = (pos - shiftKey) % 26;
            if (val < 0) {
                val = alpha.length() + val;
            }
            char rep = alpha.charAt(val);
            message += rep;
        }
        return message;
    }
}

