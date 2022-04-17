import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Encrypter {
    private final String alpha = "abcdefghijklmnopqrstuvwxyz";

    //encrypts the contents of the file
    public void encrypt(File cipherText, int shift) throws FileNotFoundException {
        Reader text = new Reader();
        String cipher = " ";
        try {
            cipher = text.read(cipherText);
        } catch (IOException e) {
            e.printStackTrace();
        }
        cipher = cipher.toLowerCase();
        String message = "";
        for (int i = 0; i < cipher.length(); i++) {
            int pos = alpha.indexOf(cipher.charAt(i));
            int val = (shift + pos) % 26;
            char rep = alpha.charAt(val);
            message += rep;
            text.write(cipherText, message);
            }

        }


    //decrypts the contents of the file
    public void decrypt(File cipherText, int shift) throws FileNotFoundException {
        Reader text = new Reader();
        String cipher = " ";
        try {
            cipher = text.read(cipherText);
        } catch (IOException e) {
            e.printStackTrace();
        }
        cipher = cipher.toLowerCase();
        String message = "";
        for (int i = 0; i < cipher.length(); i++) {
            int pos = alpha.indexOf(cipher.charAt(i));
            int val = (pos - shift) % 26;
            if (val < 0) {
                val = alpha.length() + val;
            }
            char rep = alpha.charAt(val);
            message += rep;
            text.write(cipherText, message);
            }

        }

    }





