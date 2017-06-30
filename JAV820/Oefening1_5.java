package JAV820;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;

public class Oefening1_5 {
    File src = new File("");
    File[] srcList = src.listFiles();

    public static void catcher(File i) throws IOException {
        BufferedReader bReader = null;
        FileReader fReader = null;

        try {

            String currentLine;
            bReader = new BufferedReader(new FileReader(i));

            while ((currentLine = bReader.readLine()) != null) {
                System.out.println(currentLine.toString());
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bReader != null)
                bReader.close();
            if (fReader != null) {
                fReader.close();
            }
        }
    }

    public static void checkFiles(File srcList[]) {
        for (int i = 0; i < srcList.length; i++) {
            if (srcList[i].isDirectory()) {
                System.out.println("\n" + srcList[i]);
                File[] newSrc = srcList[i].listFiles();
                checkFiles(newSrc);
            } else if (srcList[i].isFile()) {
                try {
                    System.out.println(srcList[i].getName());
                    catcher(srcList[i]);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }
    public static void main(String[] args) {
        File f = new File("/Users/simon/Desktop/Schriftelijke motivatie");
        File[] fList = f.listFiles();
        checkFiles(fList);


            }

    }
