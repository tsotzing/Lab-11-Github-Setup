import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Reader {

    // reads the file, transferring it to a String
    public String read(File ciphertext) throws FileNotFoundException {
        Scanner input = new Scanner(ciphertext);
        String word = "";
        while (input.hasNext()) {
            word = input.next();
        }
        return word;
    }


    //puts the ciphertext into a new file
    public void write(File cipherText, String message){
        try{
            FileWriter writer = new FileWriter(cipherText);
            writer.write(message);
            writer.close();
        }catch (IOException i){
            System.out.println("Sorry! try again");
        }


    }
}

