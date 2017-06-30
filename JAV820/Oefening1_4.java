package JAV820;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

public class Oefening1_4 {

    public static void main(String[] args) {

        String source = "/Users/simon/Desktop/App-ontwikkeling_SimonVanleeuw/fotos";

        File srcDir = new File(source);

        String destination = "/Users/simon/Desktop/App-ontwikkeling_SimonVanleeuw";

        File destDir = new File(destination);

        try {
            FileUtils.copyDirectory(srcDir, destDir);
            System.out.println("The files are succesfully copied.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
