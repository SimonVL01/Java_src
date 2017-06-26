package LesOefeningen.Files;

import java.io.*;

public class Io {
    public static void main(String[] args) {
        File f = new File("/Users/vdabcursist/Desktop/");
        System.out.println(f.length());
        f.delete();
    }
}
