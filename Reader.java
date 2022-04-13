import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {

    // reads the file, transferring it to a screen
    public String read(File ciphertext) throws FileNotFoundException {
        Scanner input = new Scanner(ciphertext);
        String word = "";
        while (input.hasNext()) {
            word = input.next();
        }
        return word;
    }


    //puts the ciphertext into a new file
    public void write(String message) {

    }
}

