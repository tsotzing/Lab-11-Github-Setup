import java.io.*;

public class Reader {
    private String word;
    private StringBuilder build;
    private BufferedReader buff;

    public Reader(){
        this.word = "";
        this.build = new StringBuilder();
    }

    // reads the file into a String
    public String read(File ciphertext) throws IOException {
        buff = new BufferedReader(new FileReader(ciphertext));
        word = " ";
        try {
            String line = buff.readLine();
            while (line != null) {
                build.append(line);
                build.append(System.lineSeparator());
                line = buff.readLine();
            }
            word  = build.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        buff.close();
        return word ;
    }


    //writes the ciphertext back into the  file
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

