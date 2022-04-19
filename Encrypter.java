import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Encrypter {
    private char alphabet;
    private String message,cipher;
    private Reader text;


    public Encrypter() {
        this.message = "";
        this.cipher = " ";
        this.text = new Reader();

    }
    //encrypts the contents of the file
    public void encrypt(File cipherText, int shift) throws FileNotFoundException {
        try {
            cipher = text.read(cipherText);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < cipher.length(); i++) {
            alphabet = cipher.charAt(i);
            if (alphabet >= 'a' && alphabet <= 'z') {
                alphabet = (char) (alphabet + shift);
                if (alphabet > 'z') {
                    alphabet = (char) (alphabet + 'a' - 'z' - 1);
                }
                message = message + alphabet;
            }else if(alphabet >= 'A' && alphabet <= 'Z') {
                alphabet = (char) (alphabet + shift);
                if(alphabet > 'Z') {
                    alphabet = (char) (alphabet+'A'-'Z'-1);
                }
                message = message + alphabet;
            }else{
                message = message + alphabet;
            }
        }
        text.write(cipherText, message);
    }


    //decrypts the contents of the file
    public void decrypt(File cipherText, int shift) throws FileNotFoundException {
        text = new Reader();
        cipher = " ";
        message = "";
        try {
            cipher = text.read(cipherText);
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < cipher.length(); i++) {
            alphabet = cipher.charAt(i);
            if (alphabet >= 'a' && alphabet <= 'z') {
                alphabet = (char) (alphabet - shift);
                if (alphabet < 'a') {
                    alphabet = (char) (alphabet - 'a' + 'z' + 1);
                }
                message = message + alphabet;
            }else if(alphabet >= 'A' && alphabet <= 'Z'){
                alphabet = (char) (alphabet - shift);
                if (alphabet < 'A') {
                    alphabet = (char) (alphabet-'A'+'Z'+1);
                }
                message = message + alphabet;
            }else{
                message = message + alphabet;
            }
        }
        text.write(cipherText, message);
    }
}







