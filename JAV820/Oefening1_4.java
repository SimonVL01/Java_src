package JAV820;

//import org.apache.commons.io.FileUtils;

import java.io.IOException;
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;
import java.io.File;

public class Oefening1_4 {

    private static void copyFolder(File src, File dest) {
        if (src.isDirectory()) {
            if (!dest.exists()) {
               dest.mkdir();
                System.out.println("Directory created ::" + dest);
            }

            String files[] = src.list();

            for (String file: files) {
                File srcFile = new File(src, file);
                File destFile = new File(dest, file);

                copyFolder(srcFile, destFile);
            }
        }
        else {
            try {
                Files.copy(src.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
                System.out.println("File copied :: " + dest);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws IOException {

      /*  String source = "/Users/simon/Desktop/App-ontwikkeling_SimonVanleeuw/fotos";

        File srcDir = new File(source);

        String destination = "/Users/simon/Desktop/App-ontwikkeling_SimonVanleeuw";

        File destDir = new File(destination);

        try {
            FileUtils.copyDirectory(srcDir, destDir);
            System.out.println("The files are succesfully copied.");
        } catch (IOException e) {
            e.printStackTrace();
        } */

        File src = new File("/Users/simon/Desktop/App-ontwikkeling_SimonVanleeuw/fotos");
        File dest = new File("/Users/simon/Desktop/App-ontwikkeling_SimonVanleeuw");

        copyFolder(src, dest);
    }

}
