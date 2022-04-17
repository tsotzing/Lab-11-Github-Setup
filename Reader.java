import java.io.*;
import java.util.Scanner;

public class Reader {

    // reads the file, transferring it to a String
    public String read(File ciphertext) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(ciphertext));
        String everything = "";
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            everything = sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            br.close();
        }
        System.out.println(everything);
        return everything ;
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

