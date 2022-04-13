import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reader {
    public String read(File ciphertext) throws FileNotFoundException {
        Scanner input = new Scanner(ciphertext);
        String word = "";
        while (input.hasNext()) {
            word = input.next();
        }
        return word;
    }
}

