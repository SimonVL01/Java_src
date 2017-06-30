package JAV820;

import java.io.*;
import java.nio.file.Files;

public class Oefening1_3 {
    public static void main(String[] args) {

        File f = new File("/Users/simon/Desktop/App-ontwikkeling_SimonVanleeuw/fotos/");
        File[] fileTotal = f.listFiles();

        for (int i = 0; i < fileTotal.length; i++) {
           if (fileTotal[i].isFile()) {
               try {
                   System.out.print(fileTotal[i].getName() + " " + (fileTotal[i].length() /100) + "\n");
                   System.out.println(Files.getOwner(fileTotal[i].toPath()));
               } catch (IOException e) {
                   System.out.println("Can't read the file.");
               }
           } else {
               System.out.println("Directory present");
           }

            }
        }
    }

