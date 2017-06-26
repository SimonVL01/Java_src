package LesOefeningen.Files;

import java.io.*;

public class Alice {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader
                ("/Users/vdabcursist/Desktop/SimonVanleeuw_Files/1.Github/Practice/Foto's/Alice.txt"))) {
            String line;

            while((line = reader.readLine()) != null) {
                System.out.println(line.replaceAll(" ", "").toUpperCase());
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}

